# Build
mvn clean package && docker build -t com.jarvis/demo .

# RUN

docker rm -f demo || true && docker run -d -p 8080:8080 -p 4848:4848 --name demo com.jarvis/demo 