FROM payara/micro
RUN wget -O /opt/payara/postgresql-42.2.2.jar  https://jdbc.postgresql.org/download/postgresql-42.2.2.jar
ADD   ./MantenimientoWebData/target/MantenimientoWebData-1.0-SNAPSHOT.war  ./payara-micro/deployments/MantenimientoWebData-1.0-SNAPSHOT.war
ENTRYPOINT [java, -jar, payara-micro.jar, --addJars, postgresql-42.2.2.jar, postbootcommandfile, resources.txt, --deploy,MantenimientoWebData-1.0-SN$

FROM postgres:9.6.1-alpine
ADD mantenimientodb.sql /docker-entrypoint.initdb.d/mantenimientodb.sql
