node {
    
        def docker=tool name: 'Docker_Jenkins', type: 'dockerTool'
        def dockerCMD = "$docker/bin/docker"     
    
        stage ('Code Checkout') {
            git credentialsId: 'nilesh303_github', url: 'https://github.com/nilesh303/Golden_Gate_DTD_DevOps_Engineer.git'
            }

        stage ('Code Package') { 
            def mavenHome = tool name: 'maven_auto_install' , type: 'maven'
            def mavenCMD = "${mavenHome}/bin/mvn"
            sh "${mavenCMD} -Dmaven.test.failure.ignore=true clean package"
            }
        
        stage('Docker Image Build') {
            sh "${dockerCMD} build -t nilesh401/golden_gate_dtd_devops_engineer:0.3 ."
            }
            
        stage('Docker Image Run')  {
//            sh "${dockerCMD} run -di -p 8181:8080 nilesh401/golden_gate_dtd_devops_engineer:0.3"
        }
        
        stage('Docker login')  {
            withCredentials([string(credentialsId: 'nilesh401', variable: 'nilesh401')]) {
             sh "${dockerCMD} login docker.io"                
            }    
        }


        stage('Docker Image Push')  {
            withCredentials([string(credentialsId: 'nilesh401', variable: 'nilesh401')]) {
             sh "${dockerCMD} push nilesh401/golden_gate_dtd_devops_engineer:0.3"                
            }    
        }
        
        stage ('Push to Cloud Foundry') { 
            withCredentials([usernamePassword(credentialsId: 'PCF', passwordVariable: 'pass', usernameVariable: 'user')]) {
            sh "cf login -a https://api.run.pivotal.io -u '${user}' -p '${pass}' -o nileshkumar.chhallani -s development"
        }
            sh "cf push spring_boot_image --docker-image nilesh401/golden_gate_dtd_devops_engineer:0.3"
        }    
    }
