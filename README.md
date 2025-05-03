# AutoMark  

My university dissertation project. A tool designed for computer science university lecturers to automate marking student submissions.  

###### Use cases:  

Automatically generate test cases from a solution.  
Run an auto-generated test case on one or many submissions.  
- Generates a PDF with the results.  



# Getting Started 

This app runs from a docker image, so it cannot be run without first installing docker.  
This app is started via CLI, or can be started from docker desktop once the container has been created.  

Clone the repository, then **cd into the top level AutoMark directory**.  
> **NOTE:** It is important to be able to see the `shared/` directory when creating the container.  


### Bash Scripts  

For systems with the capability to run bash scripts, simply run `setup.sh` and then `run.sh`.  
This will:  
- Pull docker image from docker hub  
- Create a container  
- Start the container  
- Open a browser (if python is installed) and go to `http://localhost:5000`, which is where the server is hosted  

The commands used in these scripts can be found in `commands.txt`, or see below for manual instructions.  


### Manual Steps  

All commands can be found in `commands.txt` for copying and pasting.  
> These steps use `automark:1.0.0` within `Windows PowerShell` as an example, adjust as required.  

*Note:* automark`:`1.0.0 with a colon is the image name:tag, automark`-`1.0.0 with a hyphen is the container name.

1. Pull the docker image from docker hub  
> `docker pull liosu/automark:1.0.0`  

2. Create the container  
> `docker create -p 5000:5000 --name "automark-1.0.0" -v "$PWD\shared:/app/shared" -e PYTHONUNBUFFERED=1 liosu/automark:1.0.0`  

3. Run the container  
> `docker start automark-1.0.0`  

4. Stop the container  
> `docker stop automark-1.0.0`



# Usage

Once the container has been created, the app can be run from anywhere with the docker start command, or via docker desktop.  


###### Running via Terminal  

Using `docker start` automatically starts in detached mode, meaning the terminal is free to be used for other things or closed entirely. The container will keep running until the `docker stop` command is executed.  

To get **logs**, run `docker logs automark-1.0.0`.  
To get live logs, run with the `-a` tag, e.g. `docker start -a automark-1.0.0`.  
- With this tag, closing the terminal or pressing `CTRL+C` will stop the container.  


###### Running via Docker Desktop

Go to the `Containers` tab (in the top left). There you will see the container with the name `automark-1.0.0`.  
There is a play button on the right hand side, under `Actions`. Clicking this play button will launch the container and turn into a stop button, used to stop the container.  

Once running, open up any browser and navigate to `http://localhost:5000`.
