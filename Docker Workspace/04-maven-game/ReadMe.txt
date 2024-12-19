 sudo docker build -t maven-game:v1 .
 
 sudo docker run -p 8080:8080 --name maven-game-container --rm -d maven-game:v1
 