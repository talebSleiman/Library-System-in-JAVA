DROP DATABASE IF EXISTS database301;

CREATE DATABASE IF NOT EXISTS database301;
USE database301;
# -----------------------------------------------------------------------------
#       TABLE : ADMIN
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS ADMIN
 (
   ID_ADMIN BIGINT(8) NOT NULL  ,
   FIRST_NAME VARCHAR(128) NOT NULL  ,
   LAST_NAME VARCHAR(128) NOT NULL  ,
   EMAIL CHAR(255) NOT NULL  ,
   PASSWORD CHAR(255) NOT NULL  ,
   GENDER CHAR(32) NOT NULL  ,
   ADDRESS CHAR(255) NOT NULL  
   , PRIMARY KEY (ID_ADMIN) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : ADHERANT
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS ADHERANT
 (
   ID_ADHERANT BIGINT(8) NOT NULL  ,
   FIRST_NAME VARCHAR(128) NOT NULL  ,
   LAST_NAME VARCHAR(128) NOT NULL  ,
   EMAIL CHAR(255) NOT NULL  ,
   PASSWORD CHAR(255) NOT NULL  ,
   GENDER CHAR(32) NOT NULL  ,
   ADDRESS CHAR(255) NOT NULL  
   , PRIMARY KEY (ID_ADHERANT) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : PERSONNEL
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS PERSONNEL
 (
   ID_PERSONNEL BIGINT(8) NOT NULL  ,
   FIRST_NAME VARCHAR(128) NOT NULL  ,
   LAST_NAME VARCHAR(128) NOT NULL  ,
   EMAIL CHAR(255) NOT NULL  ,
   PASSWORD CHAR(255) NOT NULL  ,
   GENDER CHAR(32) NOT NULL  ,
   ADDRESS CHAR(255) NOT NULL 
   , PRIMARY KEY (ID_PERSONNEL) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : MEDIA
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS MEDIA
 (
   ID_MEDIA BIGINT(8) NOT NULL  ,
   TYPE VARCHAR(128) NOT NULL  ,
   NAME VARCHAR(128) NOT NULL  ,
   NBR_COPY BIGINT(8) NOT NULL  
   , PRIMARY KEY (ID_MEDIA) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : RESERVER
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS RESERVER
 (
   ID_ADHERANT BIGINT(8) NOT NULL  ,
   ID_MEDIA BIGINT(8) NOT NULL  
   , PRIMARY KEY (ID_ADHERANT,ID_MEDIA) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : EMPRUNTER
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS EMPRUNTER
 (
   ID_ADHERANT BIGINT(8) NOT NULL  ,
   DATE_EMPRUNTER DATE NOT NULL  ,
   DATE_RETOURN DATE NOT NULL  ,
   ID_MEDIA BIGINT(8) NOT NULL  
   , PRIMARY KEY (ID_ADHERANT) 
 ) 
 comment = "";


# -----------------------------------------------------------------------------
#       CREATION DES REFERENCES DE TABLE
# -----------------------------------------------------------------------------


ALTER TABLE RESERVER 
  ADD FOREIGN KEY FK_RESERVER_ADHERANT (ID_ADHERANT)
      REFERENCES ADHERANT (ID_ADHERANT) ;


ALTER TABLE RESERVER 
  ADD FOREIGN KEY FK_RESERVER_MEDIA (ID_MEDIA)
      REFERENCES MEDIA (ID_MEDIA) ;


ALTER TABLE EMPRUNTER 
  ADD FOREIGN KEY FK_EMPRUNTER_ADHERANT (ID_ADHERANT)
      REFERENCES ADHERANT (ID_ADHERANT) ;


ALTER TABLE EMPRUNTER 
  ADD FOREIGN KEY FK_EMPRUNTER_MEDIA (ID_MEDIA)
      REFERENCES MEDIA (ID_MEDIA) ;

ALTER TABLE EMPRUNTER 
DROP PRIMARY KEY,
ADD PRIMARY KEY (`ID_ADHERANT`, `ID_MEDIA`);


INSERT INTO ADMIN (`ID_ADMIN`, `FIRST_NAME`, `LAST_NAME`, `EMAIL`, `PASSWORD`, `GENDER`, `ADDRESS`) VALUES ('1', 'Taleb', 'Sleiman', 'taleb4', '123456', 'M', 'Tripoli');


INSERT INTO PERSONNEL (`ID_PERSONNEL`, `FIRST_NAME`, `LAST_NAME`, `EMAIL`, `PASSWORD`, `GENDER`, `ADDRESS`) VALUES ('1', 'Mahmoud', 'Issa', 'mahmoud1', '0000', 'M', 'Tripoli');


INSERT INTO PERSONNEL (`ID_PERSONNEL`, `FIRST_NAME`, `LAST_NAME`, `EMAIL`, `PASSWORD`, `GENDER`, `ADDRESS`) VALUES ('2', 'Rim', 'Ali', 'rim1', '0000', 'F', 'Tripoli');


INSERT INTO ADHERANT (`ID_ADHERANT`, `FIRST_NAME`, `LAST_NAME`, `EMAIL`, `PASSWORD`, `GENDER`, `ADDRESS`) VALUES ('1', 'Hala', 'Ali', 'hala1', '0000', 'F', 'Beirut');


INSERT INTO ADHERANT (`ID_ADHERANT`, `FIRST_NAME`, `LAST_NAME`, `EMAIL`, `PASSWORD`, `GENDER`, `ADDRESS`) VALUES ('2', 'Joe', 'Tannous', 'joe1', '0000', 'M', 'Zgharta');

INSERT INTO MEDIA (`ID_MEDIA`, `TYPE`, `NAME`, `NBR_COPY`) VALUES ('1', 'BOOK', 'M1100', '20');


INSERT INTO MEDIA (`ID_MEDIA`, `TYPE`, `NAME`, `NBR_COPY`) VALUES ('2', 'BOOK', 'M1101', '20');


INSERT INTO MEDIA (`ID_MEDIA`, `TYPE`, `NAME`, `NBR_COPY`) VALUES ('3', 'BOOK', 'P1100', '20');


INSERT INTO MEDIA (`ID_MEDIA`, `TYPE`, `NAME`, `NBR_COPY`) VALUES ('4', 'BOOK', 'P1101', '20');
