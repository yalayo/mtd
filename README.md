## Run the main project
cd projects/main
clojure -M -m app.main.core

## Devops
Connect to the instance
ssh -i instance.key ubuntu@129.151.206.131

Connect to postgres container
docker exec -it prod-db /bin/bash

Create a database
psql -U user -d postgres
CREATE DATABASE "databasename";

Check the logs
docker logs app -f

# Connecto to the prod db
ssh -i some.key -L 5433:127.0.0.1:5432 ubuntu@ip

## Feature management
Open feature flags UI
ssh -i some.key -L 4000:127.0.0.1:9090 ubuntu@ip
Open http://localhost:4000/flags