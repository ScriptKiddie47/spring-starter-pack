// Declarative Pipeline

pipeline {
    agent {
        node {
            label 'jdk-17-gradle'
        }
    }
    triggers {
        pollSCM '*/5 * * * *'
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh '''
                echo "doing build stuffssssss.."
                '''
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh '''
                echo "doing test stuffssssss.."
                '''
            }
        }
        stage('Deliver') {
            steps {
                echo 'Deliver....'
                sh '''
                echo "doing delivery stuffsssssssss.."
                '''
            }
        }
    }
}
