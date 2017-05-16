REM Main build Script for the SRDemo schema, objects and demo data 
REM To be run from SQL*Plus conected as a DBA
REM Note you can also run this SQL install from ANT

REM Schema Owner SRDEMO is parameterized to allow for simpler workshop / 
REM classroom setup where only one shared server is available
REM $Id: build.sql,v 1.5 2005/12/22 22:46:41 duncan Exp $

SET FEEDBACK 1
SET NUMWIDTH 10
SET LINESIZE 132
SET TRIMSPOOL ON
SET TAB OFF
SET PAGESIZE 999
SET ECHO OFF

SPOOL SRDemo_Install.log

REM Define the changable data
DEFINE DEMO_SCHEMA = SRDEMO
DEFINE DEMO_SCHEMA_PASSWORD = ORACLE

REM Create the schema owner - this can fail if the 
REM Script has alreadt been run, but that's OK as the first 
REM Step of the createSchemaObjects is to drop the existing objects just in case

@@createSchema &&DEMO_SCHEMA &&DEMO_SCHEMA_PASSWORD

REM  connect to user account and invoke the scripts that create schema objects.

CONNECT &&DEMO_SCHEMA/&&DEMO_SCHEMA_PASSWORD

@@createSchemaObjects

REM Add the triggers needed for the ADF BC version of the Demo
@@createSequenceTriggers

REM Add the sample data to the tables

@@populateSchemaTables

REM And Commit all that

commit;

REM Report Back 
Prompt What OBJECTS were created?
column object_name format a30
column object_type format a30

select   object_type,
         object_name 
from     user_objects 
group by object_type, object_name
order by object_type desc, object_name
/

Prompt ------------------------------------------------------
Prompt 
Prompt Are there any INVALID OBJECTS?

select 	 object_type,
         object_name 
from     user_objects 
where    status='INVALID'
group by object_type, object_name
order by object_type desc, object_name
/

Prompt Disconnecting....
disconnect

spool off


