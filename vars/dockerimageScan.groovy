def call(String project, String ImageTage, String hubUser){
    
    sh """
            trivy image ${hubUser}/${project}:latest > scan.txt  
            cat scan.txt 
    """
}