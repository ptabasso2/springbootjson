# spring-boot-json


A simple Spring Boot application example using json as a logging format. This example is based on logback which is the default logging mechanism used with Spring Boot.
  

### _Preliminary tasks_


**Building the the spring application**

```
COMP10619:springbootjson pejman.tabassomi$ ./gradlew build
```


**Run the application**

  
```
COMP10619:springbootjson pejman.tabassomi$ java -jar build/libs/springbootjson.jar
```

Before running the application, make sure that port 8080 is not already in use. 
<br>If that is the case you will want to change the port used by the application<br>
using the `--server.port` option and set any open port as follows:<br>


```
COMP10619:springbootjson pejman.tabassomi$ java -jar build/libs/springbootjson.jar --server.port=8082
```


### _Run the tests_

Open a new terminal window and run the following curl command **multiple times**:

```
COMP10619:springbootjson pejman.tabassomi$ curl localhost:8080/test
test
```

