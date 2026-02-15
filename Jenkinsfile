pipeline {
    agent any

    triggers {
        cron('H/2 * * * *')         // Build periodically every 2 minutes
        pollSCM('H/1 * * * *')      // Poll SCM every 1 minute
    }

    stages {

        stage('Clone Repository') {
            steps {
                git 'https://github.com/aparnadikshi/jenkins_pipeline_task.git'
            }
        }

        stage('Build') {
            steps {
                echo "Building the project..."
                sh 'echo "Build step executed" > build.txt'
            }
        }

        stage('Echo Build Status') {
            steps {
                echo "Build completed successfully!"
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
            echo 'Pipeline execution finished.'
        }
    }
}
