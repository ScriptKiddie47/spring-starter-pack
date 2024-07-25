// Declarative Pipeline

pipeline {
    agent {
        node {
            label 'jdk-17-gradle'
        }
    }
    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh '''
                java -version
                gradle -v
                gradle clean build
                echo "doing build stuff.."
                '''
            }
        }
        stage('Test') {
            environment {
                CLIENT_ID = credentials('client_id')
                CLIENT_SECRET = credentials('client_secret')
            }
            steps {
                echo 'Testing..'
                sh '''
                ls -al
                echo "doing test stuff.."
                '''
                sh 'java HealthCheck.java ${CLIENT_ID} ${CLIENT_SECRET}'
            }
        }
        stage('Deliver') {
            steps {
                echo 'Deliver....'
                sh '''
                echo "doing delivery stuff.."
                '''
            }
        }
    }
}
