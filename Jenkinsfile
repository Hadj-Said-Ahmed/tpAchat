pipeline {
    agent {label 'maven'}
    stages{
        stage('GIT')
        {
            steps{
                echo 'Pull project from git';
                git branch: 'main',
                url : 'https://github.com/Hadj-Said-Ahmed/tpAchat.git';
            }
        }

        stage('Unit test')
        {
            steps{
                sh  'mvn clean test -Ptest'
            }
        }

        stage('Sonar test')
        {
            steps{
            sh  'mvn verify sonar:sonar -Dsonar.login=admin -Dsonar.password=ahmed'
            }
        }

        stage('MVN CLEAN'){
            steps {
                sh 'mvn clean'
            }
         }
        stage('MVN COMPILE')
        {
            steps {
                sh 'mvn compile'
            }
        }
        stage('Build package')
        {
            steps {
                sh 'mvn clean package -Pprod'
            }
        }
        stage('Build docker_image')
        {
            steps{
                sh 'docker build -t tpachat .'
            }
        }

        stage('deploy nexus')
        {
            steps{
                sh 'mvn  deploy'
            }
        }                                              
       
 }
}