FROM payara/micro
COPY MantenimientoWebData.war /opt/payara/deployments/MantenimientoWebData.war
FROM postgres
ADD mantenimiento.sql /docker-entrypoint.initdb.d/mantenimiento.sql
