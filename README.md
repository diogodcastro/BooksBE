# Build
mvn clean package && docker build -t com.ctw/books .

# RUN

docker rm -f books || true && docker run -d -p 8080:8080 -p 4848:4848 --name books com.ctw/books 