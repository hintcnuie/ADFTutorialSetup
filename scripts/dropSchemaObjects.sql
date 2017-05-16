-- Provided for manual Cleanup of the SRDemo Schema without dropping the user
-- Normally the user is dropped before recreating it automatically
-- $Id: dropSchemaObjects.sql,v 1.2 2005/12/22 22:46:41 duncan Exp $

Spool drop_schema_objects.log

DROP INDEX SVR_PRD_FK_I;
DROP INDEX SVR_CREATED_BY_USR_FK_I;
DROP INDEX SVR_ASSIGNED_TO_FK_I;
DROP INDEX EXA_PRD_FK_I;
DROP INDEX EXA_USR_FK_I;
DROP INDEX SVH_SVR_FK_I;
DROP INDEX SVH_USR_FK_I;

DROP SEQUENCE USERS_SEQ;
DROP SEQUENCE PRODUCTS_SEQ;
DROP SEQUENCE SERVICE_REQUESTS_SEQ;

DROP TABLE SERVICE_HISTORIES;
DROP TABLE SERVICE_REQUESTS;
DROP TABLE EXPERTISE_AREAS;
DROP TABLE PRODUCTS;
DROP TABLE USERS;

spool off
