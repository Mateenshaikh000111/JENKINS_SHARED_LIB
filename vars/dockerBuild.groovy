def call(String project, String ImageTage, String hubUser){
    
    sh """
        sudo docker image build -t ${hubUser}/${project} .
        sudo docker image tag  ${hubUser}/${project} ${hubUser}/${project}:${ImageTage}   
        sudo docker image tag  ${hubUser}/${project} ${hubUser}/${project}:latest   
    """
}