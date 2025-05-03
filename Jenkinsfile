pipeline {
    agent {
        label 'maven-agent'
    }

    stages {
        stage('Build with Maven') {
            steps {
                script {
                    sh 'mvn clean install'
                }
            }
        }
    }
}