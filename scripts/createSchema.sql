-- Script to create SRDEMO schema owner
-- Note that the actual schema owner is passed in as a parameter
-- to allow for multiple instances on a shared sever

-- $Id: createSchema.sql,v 1.2 2005/12/22 22:46:41 duncan Exp $

DROP USER &&1 CASCADE;

CREATE USER &&1 IDENTIFIED BY &&2
 DEFAULT TABLESPACE users
 TEMPORARY TABLESPACE temp
 QUOTA UNLIMITED ON users;

GRANT connect, resource TO &&1;

