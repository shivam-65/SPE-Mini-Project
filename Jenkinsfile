pipeline {
    agent any
    triggers {
      githubPush()
   }
    environment {
        DOCKER_IMAGE_NAME = 'spe_mini_project'
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
                    dockerImage = docker.build("shivampadaliya/spe_mini_project:latest", '.')
                }
            }
        }

        stage('Push Docker Images') {
            steps {
                script{
                    docker.withRegistry('', 'DockerHubCred') {
                        dockerImage.push()
                    }
                 }
            }
        }

        stage('Run Ansible Playbook') {
                steps {
                    script {
                      withEnv(["ANSIBLE_HOST_KEY_CHECKING=False"]) {
                        ansiblePlaybook(
                            playbook: 'deploy.yml',
                            inventory: 'inventory'
                        )
                    }
                }
        }
    }

}
post {
        success {
            mail to: 'shivampadaliya1@gmail.com',
                 subject: "Application Deployment SUCCESS: Build ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                 body: "The build was successful!"
        }
        failure {
            mail to: 'shivampadaliya1@gmail.com',
                 subject: "Application Deployment FAILURE: Build ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                 body: "The build failed."
        }
        always {
            cleanWs()
        }
      }
}
