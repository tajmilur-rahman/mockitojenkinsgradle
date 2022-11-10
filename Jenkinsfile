pipeline {
    agent any

    stages {
        stage('Build'){
            steps {
                echo 'Building Commission Project'
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                sh './gradlew test'
            }
            post {
                always {
                    junit "build/test-results/**/TEST*.xml"
                }
            }
        }
    }
}