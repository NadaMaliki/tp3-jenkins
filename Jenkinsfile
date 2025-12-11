pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/NadaMaliki/tp3-jenkins.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQubeLocal') {
                    sh 'mvn sonar:sonar'
                }
            }
        }

        stage('Test Reports') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }
}
