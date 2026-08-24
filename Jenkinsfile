pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'docker run --rm -v "$WORKSPACE:/app" -w /app maven:3.9.9-eclipse-temurin-21 mvn clean package -DskipTests'
            }
        }
        stage('Build Image') {
            steps {
                sh 'docker build -t team-skeleton .'
            }
        }
        stage('Smoke Test') {
            steps {
                sh 'docker run --rm team-skeleton'
            }
        }
    }
}
