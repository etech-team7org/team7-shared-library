def call(String repoUrl){
    pipeline {
       agent any 
       stages {
           stage("Tools initialization") {
               steps {
                   sh 'lsblk'
                   sh 'java -version'
               }
           }
           stage("Checkout Code") {
               steps {
                   git branch: 'main',
                          url: "${repoUrl}"
               }
           }
           stage("to-test-maven") {
               steps {
                   sh 'lscpu'
               }
           }
           stage('build'){
            steps{
                echo "demo diff app"
            }
           }
       }
    }  
}