def call(String project, String ImageTage, String hubUser){

withCredentials([usernamePassword(
    credentialsId: 'Docker',
     passwordVariable: 'PASS', 
     usernameVariable: 'USER'
     )]) {
    
       sh "docker login -u '$USER' -p '$PASS'"
}    
 sh "docker image push ${hubUser}/${project}:${ImageTage}"
 sh "docker image push ${hubUser}/${project}:latest"

}