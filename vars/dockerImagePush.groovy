// def call(String project, String ImageTage, String hubUser){

// withCredentials([usernamePassword(
//     credentialsId: 'Docker',
//      passwordVariable: 'PASS', 
//      usernameVariable: 'USER'
//      )]) {
    
//        sh "docker login -u '$USER' -p '$PASS'"
// }    
//  sh "docker image push ${hubUser}/${project}:${ImageTage}"
//  sh "docker image push ${hubUser}/${project}:latest"

// }



def call(String aws_account_id, String region, String ecr_repoName){

    sh """
       aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com
       docker push ${aws_account_id}.dkr.ecr.${region} .amazonaws.com/${ecr_repoName}:latest
      """


}
