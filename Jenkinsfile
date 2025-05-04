pipeline {
    agent {
        label 'maven-agent'
    }

    stages {

        stage('Initialize') {
            steps {
                githubNotify context: 'jenkins/build', status: 'PENDING', description: 'Build started'
            }
        }

        stage('Build with Maven') {
            steps {
                script {
                    sh 'mvn clean install'
                }
            }
        }

        post {
            success {
                githubNotify context: 'jenkins/build', status: 'SUCCESS', description: 'Build succeeded'
            }
            failure {
                githubNotify context: 'jenkins/build', status: 'FAILURE', description: 'Build failed'
            }
            unstable {
                githubNotify context: 'jenkins/build', status: 'FAILURE', description: 'Build unstable'
            }
        }

    }
}