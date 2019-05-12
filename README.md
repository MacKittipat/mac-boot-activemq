# Spring Active-MQ 

## Start Active-MQ

* https://hub.docker.com/r/rmohr/activemq

```
docker run -p 61616:61616 -p 8161:8161 rmohr/activemq
```

## Run with Topic

* Enable `spring.jms.pub-sub-domain=true`