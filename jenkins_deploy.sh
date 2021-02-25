#!/bin/sh
. /etc/profile

cd $WORKSPACE
docker build -t dockerdemoapplication1 .
#    docker run -d -t -p 18081:8080 --name dockerdemoapplication1 dockerdemoapplication1

# docker-compose 启动
docker-compose up -d

# docker stack deploy 启动
#docker stack deploy -c docker-compose.yml  dockerdemoapplication1
sleep 2