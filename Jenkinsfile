pipeline {
    agent any
    triggers {
      githubPush()
   }
    environment {
        DOCKER_IMAGE_NAME = 'simple-calculator'
        GITHUB_REPO_URL = 'https://github.com/shivam-65/SPE-Mini-Project.git'
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Checkout the code from the GitHub repository
                    git branch: 'main', url: "${GITHUB_REPO_URL}"
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    // Build Docker image
                    docker.build("${DOCKER_IMAGE_NAME}", '.')
                }
            }
        }

        stage('Push Docker Images') {
            steps {
                script{
                    docker.withRegistry('', 'DockerHubCred') {
                    sh 'docker push ${DOCKER_IMAGE_NAME}'
                    }
                 }
            }
        }

}
 post {
        success {
            echo 'Build and deployment successful!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
