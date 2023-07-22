def call(String project, String ImageTage, String hubUser){
    
    sh """
        docker image build -t ${hubUser}/${project} .
        docker image tag  ${hubUser}/${project} ${hubUser}/${project}:${ImageTage}   
        docker image tag  ${hubUser}/${project} ${hubUser}/${project}:latest   
    """
}