pipeline {
    agent {
        label 'maven-agent'
    }

    stages {

        stage('Initialize') {
            steps {
                sh 'echo Setting up environment'
                publishChecks name: 'Initialize', status: 'IN_PROGRESS'
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

    post {
        success {
            script {
                publishChecks name: 'Maven Build', status: 'COMPLETED', conclusion: 'SUCCESS', output: [
                    title: 'Maven Build',
                    summary: 'Build completed successfully.'
                ]
            }
        }
        failure {
            script {
                publishChecks name: 'Maven Build', status: 'COMPLETED', conclusion: 'FAILURE', output: [
                    title: 'Maven Build',
                    summary: 'Build failed.'
                ]
            }
        }
    }
}