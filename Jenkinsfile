pipeline {
    agent {label 'maven'}
    environment {
		DOCKERHUB_CREDENTIALS=credentials('dockerhub_access')
	}
    stages{
        stage('GIT')
        {
            steps{
                echo 'Pull project from git';
                git branch: 'main',
                 credentialsId: 'dde8e7e2-7b16-4706-a43c-d1d3fe6b6911', 
                url : 'https://github.com/Hadj-Said-Ahmed/tpAchat.git';
            }
        }

        stage('Dockerhub login') {
	        steps {
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $dockerhub_access --password-stdin'
            }
         
		}

		stage('Deploy dokcer image') {

			steps {
				sh 'docker push ahmedhs1/tpachat'
			}
		}

        stage('Unit test')
        {
            steps{
                sh  'mvn clean test -Ptest'
            }
        }
        
         stage("Sonar") {
            steps {
                sh  'mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=ahmed'
            }
        }

        stage("Build") {
            steps {
                sh "mvn clean package -DskipTests"
            }
        }

         stage("Build image") {
            steps {
                sh "sudo docker build -t ahmedhs1/tpachat ."
            }
        }
        
         stage("Deploy artifact to nexus") {
            steps {
                sh "mvn clean deploy -Pprod"
            }
        }
        
       
 }
}