pipeline {
    agent any

    triggers {
        cron('H/2 * * * *')
        pollSCM('H/1 * * * *')
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
                bat 'javac Test.java'
                bat 'echo Build Successful > build.txt'
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
