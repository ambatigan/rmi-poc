# rmi-poc

Run 'mvn clean install' in both the directories viz., rmi-server and rmi-client; Corresponding jars will be formed under the target folder
Command to run the server, for example -
java -jar RMIServer-0.0.1-SNAPSHOT.jar 192.168.195.19
Console output:
creating socket to host : 192.168.195.19on port 1099
creating socket to host : 192.168.195.19on port 8000
Server has been Started....


Command to run the client to connect to the above server -
java -jar RMIClient-0.0.1-SNAPSHOT.jar 192.168.195.19 hello
Console output:
hello! This is from server
