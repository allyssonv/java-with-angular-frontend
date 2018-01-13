FROM airhacks/glassfish
COPY ./target/demo.war ${DEPLOYMENT_DIR}
