def call(){
    sh 'mvn test -Dmaven.test.skip=true'
}