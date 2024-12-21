kubectl create secret generic mysecret \
  --from-literal=MYSQL_ROOT_PASSWORD=Password123 \
  --from-literal=MYSQL_PASSWORD=Password1234 \
  --from-literal=MYSQL_DATABASE=studentdb \
  --from-literal=MYSQL_USER=makarand