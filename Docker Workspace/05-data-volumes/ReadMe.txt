Create/Build Image
    sudo docker build -t feedbackapp:v1.0 .

Create and run container without volume (problem)
    sudo docker run -p 8080:80 --name feedbackapp-container --rm  feedbackapp:v1.0 (by default runs in attached mode. to exit require to stop container)

Run the application. 
    http://host-ip:8080/
    http://4.246.189.7:8080/
    http://4.246.189.7:8080/feedback/hello.txt

    You will get the output but with little bug. To solve the problem we need to create volumn
    
To see all running container
    sudo docker ps

Stop container
    sudo docker stop container_id or container_name
    sudo docker stop feedbackapp-container

Create container with volume to store data (solution)
    sudo docker run -p 8080:80 --rm --name feedbackapp-container -v feedback:/app/feedback img_id
    sudo docker run -p 8080:80 --rm --name feedbackapp-container -v feedback:/app/feedback feedbackapp:v1.0
