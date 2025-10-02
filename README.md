# SPRING-REST-API

## Test
```bash
$ curl http://localhost:8080/div\?a\=3\&b\=0
```
<img width="739" height="94" alt="image" src="https://github.com/user-attachments/assets/261a7039-6b0e-486b-b878-bbc277877f46" />


## Build
```bash
$ ./gradlew bootJar
```

## Run
```bash
$ java -j build/libs/hello-<VERISION>.jar
```

## Dockerizing
- https://spring.io/guides/gs/spring-boot-docker
- openJDK 17
```bash
# 빌드
$ ./gradlew clean bootJar
$ sudo docker build --build-arg JAR_FILE=build/libs/\*.jar -t surimleeee/hello-api:0.3.0 .
