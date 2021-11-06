
#!/bin/bash



aws s3 cp s3://sree9030/buildacode/4/hello-4.war /tmp/
cp /tmp/hello-4.war var/lib/tomcat/webapps