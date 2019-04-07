------------------------------------------------------------------------------------------------------------
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
#5
To test the rest api :
http://localhost:9070/promoServices/v1/promotion/createSimple?{{brandSilo}}={{brandSilo}}&applicationId=123

------------------------------------------------------------------------------------------------------------
Changes from original :

#1
was : \src\test\java\au\com\westpac\inf\bnkng\evnt\arrngmntorigevnt\consumr\wrkflwevntmaint\vi\api\utiltest\
is  : \src\test\java\com\pets\vi\api\utiltest\

------------------------------------------------------------------------------------------------------------
Exception handling being introduced using reference of:
http://www.codingpedia.org/ama/error-handling-in-rest-api-with-jersey/

Good SO question :
https://stackoverflow.com/questions/583973/jax-rs-jersey-how-to-customize-error-handling?rq=1
https://stackoverflow.com/questions/15185299/jax-rs-jersey-exceptionmappers-user-defined-exception?noredirect=1&lq=1
https://stackoverflow.com/questions/3293599/jax-rs-using-exception-mappers?noredirect=1&lq=1
------------------------------------------------------------------------------------------------------------
Demonstratable o/p:

#1
This API example demonstrates how to generate error response in JSON 
It uses @Provider annotation AND ExceptionMapper ( Jersey class for exception handling ) 
IN our code we are testing by sending in Query param 'applicationId' = 123 
if 123 - then we have written code to throw this exception - AppException ( which extends Exception ) 
The JSON error response is like this :
{
    "status": 400,
    "code": 400,
    "message": "xyz msg",
    "link": "http://www.codingpedia.org",
    "developerMessage": "dev msg"
}
------------------------------------------------------------------------------------------------------------