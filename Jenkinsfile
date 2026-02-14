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
            // Updated to be more flexible and handle empty results if tests fail
            junit testResults: '**/target/surefire-reports/*.xml', allowEmptyResults: true
            
            // This makes your actual JAR file downloadable from the Jenkins UI
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
    }
}