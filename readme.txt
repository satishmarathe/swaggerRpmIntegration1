#1
To run the project and deploy and start on jetty use the following maven command :
clean install jetty:run
------------------------------------------------------------------------------------------------------------
#2
To run only tests 
mvn surefire:test
------------------------------------------------------------------------------------------------------------
#3
if you want to run just one test
mvn -Dtest=NameOfTest surefire:test
------------------------------------------------------------------------------------------------------------
#4
To generate code from swagger yaml file:
Use the command:
java -jar swagger-codegen-cli-2.2.1.jar generate -c swagger-codegen-options.json -l jaxrs -i swagger.yml



------------------------------------------------------------------------------------------------------------
Changes from original :

#1
was : \src\test\java\au\com\westpac\inf\bnkng\evnt\arrngmntorigevnt\consumr\wrkflwevntmaint\vi\api\utiltest\
is  : \src\test\java\com\pets\vi\api\utiltest\