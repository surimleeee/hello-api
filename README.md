# HELLO-API

## Test
```bash
$ curl http://localhost:8080/hello/add\?a\=0\&b\=1 | jq
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100     1    0     1    0     0     53      0 --:--:-- --:--:-- --:--:--    55
1
```
```bash
$  curl "http://localhost:8080/hello/add?a=0&b=1" | jq
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100     1    0     1    0     0    184      0 --:--:-- --:--:-- --:--:--   200
1
```

<img width="388" height="129" alt="image" src="https://github.com/user-attachments/assets/0c5563ee-25e0-4294-94cf-b2a250b99c92" />



## Build
```bash
$ ./gradlew clean bootJar
```

## Check jar file
```bash
$ tree build/libs
```

## Run
```bash
$ java -jar build/lib/spring-rest-api-<VERSION>.jar
```

## Remote Run
```bash
# scp -i <KEY.pem> start.sh ubuntu@<SERVER_IP>:~/app/hello-api

$ ssh -i <KEY.pem> ubuntu@<SERVER_IP> \
"cd /home/ubuntu/app/hello-api;pwd;./start.sh"
```

## Remote Stop 
```bash
# scp -i <KEY.pem> stop.sh ubuntu@<SERVER_IP>:~/app/hello-api

$ ssh -i <KEY.pem> ubuntu@<SERVER_IP> \
"cd /home/ubuntu/app/hello-api;pwd;./stop.sh"
```

## Dockerizing
- https://spring.io/guides/gs/spring-boot-docker
- openJDK 17
```bash
# 빌드
$ ./gradlew clean bootJar
$ sudo docker build --build-arg JAR_FILE=build/libs/\*.jar \
-t surimleeee/spring-rest-api:0.3.0 .

# Run
# sudo docker run -d -p 8030:8080 --name srq030 datamario24/spring-rest-api:0.3.0

$ sudo docker images | grep spring-rest-api
datamario24/spring-rest-api   0.3.0           df8b2c938eac   43 seconds ago   347MB

$ sudo docker push datamario24/spring-rest-api:0.3.0



$ sudo docker status
```
