node {
   stage('Preparation') {
      git 'https://github.com/jvallejodiaz/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}