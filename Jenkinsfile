pipeline {
    agent any
    tools {
        maven "M398"
    }
    stages {
        stage('Echo Version') {
            steps {
                bat 'mvn -version'
            }
        }
        stage('Build & Test') {
            steps {
                git branch: 'main', url: 'https://github.com/Divyakottargi/jenkins-hello-world.git'
                bat 'mvn clean install'
            }
        }
    }
    post {
        always {
            // THIS IS THE PART JENKINS IS MISSING
            junit '**/target/surefire-reports/*.xml'
            echo 'Recording Test Results...'
        }
    }
}