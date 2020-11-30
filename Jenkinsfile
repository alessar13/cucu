pipeline {
    agent {
        docker {
            image 'maven:3.6.1'
        }
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    checkout scm
                }
            }
        }

        stage('Clean') {
            when {
                expression { params.clean }
            }
            steps {
                dir(BUNDLE) {
                    sh "mvn -ntp clean"
                }
            }
        }
        stage('Hello') {
            steps {
                sh " echo 'Hello, World!' "
            }
        }
    }

    post {
        success {
            slackSend(
                    teamDomain: "cbs.slack.com",
                    channel: "lex",
                    tokenCredentialId: "slack_token",
                    color: "good",
                    message: "The pipeline ${currentBuild.fullDisplayName} completed successfully.")
        }

        failure {
            slackSend(
                    teamDomain: "cbs.slack.com",
                    channel: "lex",
                    tokenCredentialId: "slack_token",
                    color: "good",
                    message: "The pipeline ${currentBuild.fullDisplayName} has failed!.")
        }
    }
}