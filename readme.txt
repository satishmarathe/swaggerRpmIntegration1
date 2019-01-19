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


------------------------------------------------------------------------------------------------------------
Changes from original :

#1
was : \src\test\java\au\com\westpac\inf\bnkng\evnt\arrngmntorigevnt\consumr\wrkflwevntmaint\vi\api\utiltest\
is  : \src\test\java\com\pets\vi\api\utiltest\