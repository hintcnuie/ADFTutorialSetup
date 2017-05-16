-- Optional Script to create table triggers for allocating sequence numbers
-- $Id: createSequenceTriggers.sql,v 1.1 2005/12/22 22:46:41 duncan Exp $

CREATE OR REPLACE
TRIGGER ASSIGN_SVR_ID BEFORE INSERT ON SERVICE_REQUESTS
FOR EACH ROW
BEGIN
 IF :NEW.SVR_ID IS NULL OR :NEW.SVR_ID < 0 THEN
   SELECT SERVICE_REQUESTS_SEQ.NEXTVAL
     INTO :NEW.SVR_ID
     FROM DUAL;
   END IF;
END;
/

CREATE OR REPLACE
TRIGGER ASSIGN_PRODUCT_ID BEFORE INSERT ON PRODUCTS
FOR EACH ROW
BEGIN
 IF :NEW.PROD_ID IS NULL OR :NEW.PROD_ID < 0 THEN
   SELECT PRODUCTS_SEQ.NEXTVAL
     INTO :NEW.PROD_ID
     FROM DUAL;
 END IF;
END;
/

CREATE OR REPLACE
TRIGGER ASSIGN_USER_ID BEFORE INSERT ON USERS
FOR EACH ROW
BEGIN
 IF :NEW.USER_ID IS NULL OR :NEW.USER_ID < 0 THEN
   SELECT USERS_SEQ.NEXTVAL
     INTO :NEW.USER_ID
     FROM DUAL;
 END IF;
END;
/
