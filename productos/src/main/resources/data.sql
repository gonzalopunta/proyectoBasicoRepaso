-- create table producto (id bigint not null, nombre varchar(255), precio double not null, unidades_en_stock integer not null, primary key (id))

--DROP TABLE IF EXISTS CATEGORIA;
--DROP TABLE IF EXISTS PRODUCTO;

--CREATE TABLE CATEGORIA(ID INT, NOMBRE VARCHAR(255));

INSERT INTO CATEGORIA (ID, NOMBRE)
VALUES (NEXTVAL('hibernate_sequence'), 'Pasta');
INSERT INTO CATEGORIA (ID, NOMBRE)
VALUES (NEXTVAL('hibernate_sequence'), 'Carne');
INSERT INTO CATEGORIA (ID, NOMBRE)
VALUES (NEXTVAL('hibernate_sequence'), 'Pescados');
INSERT INTO CATEGORIA (ID, NOMBRE)
VALUES (NEXTVAL('hibernate_sequence'), 'Lacteos');
INSERT INTO CATEGORIA (ID, NOMBRE)
VALUES (NEXTVAL('hibernate_sequence'), 'Frutas');
INSERT INTO CATEGORIA (ID, NOMBRE)
VALUES (NEXTVAL('hibernate_sequence'), 'Verduras');


--CREATE TABLE PRODUCTO (ID INTEGER, NOMBRE_PRODUCTO VARCHAR(255), PRECIO FLOAT);

INSERT INTO PRODUCTO (ID, NOMBRE_PRODUCTO, PRECIO)
VALUES (NEXTVAL('hibernate_sequence'), 'Macarrones de lentejas', 2.56);
INSERT INTO PRODUCTO (ID, NOMBRE_PRODUCTO, PRECIO)
VALUES (NEXTVAL('hibernate_sequence'), 'Manzanas', 2.56);
INSERT INTO PRODUCTO (ID, NOMBRE_PRODUCTO, PRECIO)
VALUES (NEXTVAL('hibernate_sequence'), 'Macarrones', 2.56);
INSERT INTO PRODUCTO (ID, NOMBRE_PRODUCTO, PRECIO)
VALUES (NEXTVAL('hibernate_sequence'), 'lentejas', 2.56);
INSERT INTO PRODUCTO (ID, NOMBRE_PRODUCTO, PRECIO)
VALUES (NEXTVAL('hibernate_sequence'), 'croquetas', 2.56);
INSERT INTO PRODUCTO (ID, NOMBRE_PRODUCTO, PRECIO)
VALUES (NEXTVAL('hibernate_sequence'), 'Croquetas de puchero', 2.56);