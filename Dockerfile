FROM airhacks/glassfish
COPY ./target/books.war ${DEPLOYMENT_DIR}
