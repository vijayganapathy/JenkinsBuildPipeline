	
	pipeline {
		agent any
	
		environment {
			IMAGE_NAME = "applicationOne"
			IMAGE_TAG = "applicationOne"
		}
	
		stages {
			stage('Checkout') {
				steps {
					git 'https://github.com/vijayganapathy/JenkinsBuildPipeline.git'
				}
			}
	
			stage('Build') {
				steps {
					sh 'mvn clean package -DskipTests'
				}
			}
	
			stage('Test') {
				steps {
					sh 'mvn test'
				}
			}
	
			stage('Docker Build') {
				steps {
					sh "docker build -t applicationOne"
				}
			}
	
			stage('Docker Run') {
				steps {
					sh "docker run -d -p 8080:8080 applicationOne"
				}
			}
		}
	
		post {
			success {
				echo '✅ Pipeline completed successfully!'
			}
			failure {
				echo '❌ Pipeline failed!'
			}
		}
	}
	
