#!/bin/bash

docker pull liosu/automark:1.0.0
docker create -p 5000:5000 --name "automark-1.0.0" -v "./shared:/app/shared" -e PYTHONUNBUFFERED=1 liosu/automark:1.0.0
