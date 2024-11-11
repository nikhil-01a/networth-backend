CREATE TABLE NW_USER (
    ID int IDENTITY(1,1) NOT NULL,
    USER_NAME varchar(100) COLLATE Latin1_General_CI_AS NULL,
    USER_TYPE varchar(100) COLLATE Latin1_General_CI_AS NULL,
    ROLES varchar(500) COLLATE Latin1_General_CI_AS NULL,
    AUTH varchar(500) COLLATE Latin1_General_CI_AS NULL,
    MOD_USR varchar(30) COLLATE Latin1_General_CI_AS DEFAULT suser_name() NULL,
    MOD_DAT datetime DEFAULT getdate() NULL,
    CRE_USR varchar(30) COLLATE Latin1_General_CI_AS DEFAULT suser_name() NULL,
    CRE_DAT datetime DEFAULT getdate() NULL,
    ACTIVE char(1) COLLATE Latin1_General_CI_AS NOT NULL,
    CONSTRAINT PK_NW_USER PRIMARY KEY (ID)
);