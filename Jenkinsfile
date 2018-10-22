node{
  checkout scm
  stage('Build'){
    echo 'Builing....'
    sh 'make' 
        archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true 
  }
  stage('Test'){
    echo 'Testing...'
  }
  stage('Deploy'){
    echo 'Deploying..'
  }
}
