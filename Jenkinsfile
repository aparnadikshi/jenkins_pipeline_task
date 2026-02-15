pipeline {
    agent any

    triggers {
        cron('H/2 * * * *')        // Runs every 2 minutes
        pollSCM('H/1 * * * *')     // Checks GitHub every 1 minute
    }

    stages {

        stage('Clone Repository') {
            steps {
                echo "Repository cloned automatically by Jenkins."
            }
        }

        stage('Build') {
            steps {
                echo "Compiling Java file..."
                sh 'javac Test.java'
                sh 'echo Build Successful > build.txt'
            }
        }

        stage('Echo Build Status') {
            steps {
                echo "Build Completed Successfully!"
            }
        }

        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: 'build.txt', fingerprint: true
            }
        }
    }

    post {
        always {
            echo "Pipeline Execution Finished."
        }
    }
}
