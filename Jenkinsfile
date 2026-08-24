pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }
        stage('Checkout') {
            steps {
                checkout scm
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
