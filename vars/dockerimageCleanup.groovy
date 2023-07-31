def call(String project, String ImageTage, String hubUser){
    
    sh """
            docker rmi ${hubUser}/${project}:${ImageTage}   
             docker rmi  ${hubUser}/${project} ${hubUser}/${project}:latest   
    """
}