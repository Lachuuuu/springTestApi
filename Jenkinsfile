pipeline {
    agent {
        label 'maven-agent'
    }

    stages {

        stage('Initialize') {
            steps {
                sh 'echo Setting up environment'
            }
        }

        stage('Build with Maven') {
            steps {
                script {
                    sh 'mvn clean install'
                }
            }
        }

    }
}