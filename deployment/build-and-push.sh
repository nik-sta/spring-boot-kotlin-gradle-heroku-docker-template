#!/bin/bash

docker build -t registry.heroku.com/$APP_NAME/web -f deployment/Dockerfile .
echo "$HEROKU_TOKEN" | docker login -u _ --password-stdin registry.heroku.com
docker push registry.heroku.com/$APP_NAME/web