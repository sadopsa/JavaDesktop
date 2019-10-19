create table siswa(
NIS varchar2(5) not null,
Nama varchar2(30),
ALAMAT varchar2(30),
GENDER varCHAR2(5),
primary key(NIS));

create table guru(
NIP varchar2(5) not null,
Nama Varchar2(30),
ALAMAT varchar2(30),
GENDER varCHAR2(5),
primary key(NIP));

create table walikelas(
IDWK varchar2(10) not null,
NIP varchar2(5),
kelas varchar2(10),
Foreign key (NIP) REFERENCES GURU(NIP) ON DELETE CASCADE ,
PRIMARY KEY(IDWK));

create table kelas(
NO_KELAS varchar2(5) not null,
NAMA_KELAS varchar2(30),
IDWK varchar2(10),
NIS varchar2(5),
Foreign key(IDWK) REFERENCES WALIKELAS(IDWK) ON DELETE CASCADE,
FOREIGN KEY (NIS) REFERENCES SISWA(NIS) ON DELETE CASCADE,
PRIMARY KEY(NO_KELAS));

create table mapel(
NO_MAPEL varchar2(5) not null,
NAMA_MAPEL varchar2(30),
NIP varchar2(5),
Foreign key(NIP) REFERENCES GURU(NIP) ON DELETE CASCADE ,
PRIMARY KEY(NO_MAPEL));

create table nilai(
NO VARCHAR2(6) NOT NULL,
NIS varchar2(5),
NO_MAPEL varchar2(5),
NILAI int,
Foreign key(NIS) REFERENCES siswa(NIS) ON DELETE CASCADE ,
Foreign key(NO_MAPEL) REFERENCES MAPEL(NO_MAPEL) ON DELETE CASCADE ,
PRIMARY KEY(NO));

create table ekskul(
No varchar2(6) not null,
nama_ekskul varchar2 (30),
NIS VARCHAR2(5),
Foreign key (NIS) REFERENCES siswa(NIS) ON DELETE CASCADE,
PRIMARY KEY(No));


