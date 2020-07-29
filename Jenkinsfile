pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/vdespa-collab/java-rest-api-calculator.git'
                sh './mvnw clean compile'
                // bat '.\mvnw clean compolie'
            }
        }
    }
}