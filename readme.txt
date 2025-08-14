Correcion del archivo de modelos:

1.  Se el agrega un @table(name + "") a curso.
2.  Agregarle la d a la I para que sea @Id
3.  Correcion del @GeneratedValue(strategy = GenerationType.IDENTITY)
4.  Agregar el @Column(name = "nombre", nullable = false, unique = false, length = 50)
para que se pueda apreciar en la base de datos.
5.  Quitar punto y como en @JoinColumn(name="fk_docente", referencedColumnName = "id");
y correcion de espacios en el codigo
6.  Correcion de sintaxis en el: Docente docente, agregandole un ; y el private
7.  Agregacion en el constructor de Docente y docente
8.  Generacion de get y set

Correcion del archivo de Docente:
1. Agregacion de y en @Entit
2. Agregacion de @Table(name = "docente")
3. Agregacion de @Id
4. Agregacion de @Column(name = "especialidad", nullable = false, unique = false, length = 30)
5. Creacion de CONSTRUCTORES
6. Get y Set de las Relaciones

Correcion del archivo de Usuario:
1. Agregacion de y en @Entit
2. Agregar IDENTITY
3. Quitar la @Colun(name = "id_usuario")
4. modifacion de @Column(nullable = false, length = 100)
5. Modificaion de los demas campos
6. Correcion de constructores
7. Agregacion de Get y Set
8. Se agrega la relación @OneToOne

Creacion del contenido del archivo TipoUsuario.java:
1. Creacion de: package com.example.Examen1Back2.modelos;
2. Creacion del enum
3. Creacion de la conexion de la base de datos

Modificacion del nombre de la base de datos: se modifico porque al momento de usarla y ver el archivo con sus requerimientos
decia un nombre en especifico y solo volvio a crear la base de datos y se cambio el nombre y la url de la conexion de la base de datos

en los demas se hizo una modificacion en la organizacion del codigo como espacios y necesarios y asi, para no llenar
de tantas lineas el codigo