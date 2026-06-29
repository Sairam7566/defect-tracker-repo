pipeline {
    agent any

    tools {
        maven 'Maven-3'
        jdk 'JDK-11'
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out source code from GitHub...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building the project with Maven...'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running unit tests...'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging the application...'
                sh 'mvn package -DskipTests'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying defect-tracker version 1.0-SNAPSHOT...'
                echo 'Deployment complete.'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully. All stages passed.'
        }
        failure {
            echo 'Pipeline failed. Please review the stage logs above.'
        }
        always {
            echo 'Pipeline finished. Cleaning up workspace.'
            cleanWs()
        }
    }
}