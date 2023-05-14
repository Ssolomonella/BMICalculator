pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sh './mvnw clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                sh './mvnw test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                sh './mvnw spring-boot:run'
            }
        }
    }
}