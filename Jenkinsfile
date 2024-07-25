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
            steps {
                echo 'Testing..'
                sh '''
                ls -al
                java HealthCheck.java Hello There WonderFull People 1 2 3
                echo "doing test stuff.."
                '''
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
