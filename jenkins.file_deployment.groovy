//declarative pipeline

pipeline {
agent any 
    stages{
        stage("download from artifacts"){
            steps {

                aws s3 cp s3://sree9030/buildacode/4/hello-4.war /tmp/
                  sh  "cp /tmp/hello-4.war /var/lib/tomcat/webapps"


            scp -i /tmp/sree.pem deployment.sh ec2-user@172.31.81.105:/tmp/
            ssh -i /tmp/sree.pem ec2-user@172.31.81.105 ""
            }
        }


    }
}