#!/usr/bin/env bash

APP_NAME = "greeting-webservice"
heroku container:release web -a $APP_NAME