From mysql

ENV MYSQL_ROOT_PASWORD ="root"
ENV MYSQL_DATABASE = "User_details"

COPY ./src/main/resources/data.sql /docker-entrypoint-init.d/ 