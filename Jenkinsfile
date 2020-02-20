node {
   stage('Preparation') {
      git 'https://github.com/jvallejodiaz/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
   stage('Deploy') {
         sh "git push https://git.heroku.com/fast-everglades-94239.git"
      }
}