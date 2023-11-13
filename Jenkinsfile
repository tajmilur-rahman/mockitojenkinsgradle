pipeline {
    agent any

    tools {
        jdk 'JDK 8'
        gradle 'Gradle 4.6'
    }
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