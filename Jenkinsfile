pipeline {
    agent any

    environment {
        MAVEN_HOME = "/usr/share/maven"
        DOCKER_IMAGE = "amanve7/scientific-calculator:latest"
        JAR_FILE = "target/scientific-calculator-1.0-SNAPSHOT.jar"
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'master', url: 'https://github.com/Amanve77/Scientific-Calculator.git'
            }
        }

        stage('Build with Maven') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Verify JAR File') {
            steps {
                script {
                    if (!fileExists(env.JAR_FILE)) {
                        error "JAR file not found!"
                    } else {
                        echo "JAR file found: ${env.JAR_FILE}"
                    }
                }
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $DOCKER_IMAGE .'
            }
        }

        stage('Push to Docker Hub') {
            steps {
                withDockerRegistry([credentialsId: 'docker-hub-credentials', url: 'https://index.docker.io/v1/']) {
                    sh 'docker push $DOCKER_IMAGE'
                }
            }
        }
        stage('Deploy with Ansible') {
            steps {
                sh 'ansible-playbook -i inventory deploy.yml'
            }
        }
    }
    post {
        success {
            echo "Pipeline executed successfully!"
        }
        failure {
            echo "Pipeline failed."
        }
    }
}
