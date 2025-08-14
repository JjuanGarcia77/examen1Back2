Documentación del Proyecto – Examen1Back2
. Descripción del Proyecto:

El proyecto Examen1Back2 es una aplicación Spring Boot que gestiona información de usuarios, docentes y cursos, utilizando JPA/Hibernate para la persistencia de datos y MySQL como base de datos.
El objetivo principal es permitir crear, consultar, actualizar y eliminar registros de manera estructurada, garantizando integridad de datos y relaciones entre entidades.

2. Errores corregidos y cambios realizados
.Archivo Curso.java:

1. Se agregó @Table(name = "curso") para mapear la entidad correctamente en la base de datos.
2. Se corrigió @Id (antes estaba mal escrito).
3. Se ajustó @GeneratedValue(strategy = GenerationType.IDENTITY) para autogenerar el ID.
4. Se añadió @Column(name = "nombre", nullable = false, unique = false, length = 50) para que el nombre del curso
sea visible en la BD.
5. Se corrigió @JoinColumn(name="fk_docente", referencedColumnName = "id") eliminando el punto y coma extra
y ajustando los espacios.
6. Se corrigió la sintaxis de Docente docente agregando private y el ;.
7. Se agregaron los campos en el constructor de Curso.
8. Se generaron métodos get y set para todos los atributos.

.Archivo Docente.java:

1. Se corrigió @Entity agregando la letra faltante.
2. Se agregó @Table(name = "docente").
3. Se añadió @Id correctamente.
4. Se añadió @Column(name = "especialidad", nullable = false, unique = false, length = 30).
5. Se crearon constructores completos.
6. Se generaron métodos get y set, incluyendo las relaciones con otras entidades.

.Archivo Usuario.java:

1. Se corrigió @Entity.
2. Se agregó @GeneratedValue(strategy = GenerationType.IDENTITY) para el ID.
3. Se eliminó la anotación incorrecta @Column(name = "id_usuario").
4. Se ajustó @Column(nullable = false, length = 100) y los demás campos.
5. Se corrigieron los constructores.
6. Se agregaron métodos get y set.
7. Se añadió la relación @OneToOne con otras entidades.

.Archivo TipoUsuario.java:

1. Se creó el paquete com.example.Examen1Back2.modelos.
2. Se definió un enum TipoUsuario para los roles de usuario.
3. Se configuró la conexión a la base de datos según la nueva estructura.

.Base de datos:

1. Se creó una nueva base de datos por cambios en la estructura y nombre de tablas.
2. Se actualizaron los URL y credenciales de conexión en application.properties.
3. Se utilizó git revert para regresar los cambios problemáticos y mantener la integridad
de la información anterior.

3. Guía paso a paso para la conexión a la base de datos

1. Crear la base de datos en MySQL:

2. CREATE DATABASE examen1back2;


Crear usuario y asignar permisos:

CREATE USER 'usuario'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON examen1back2.* TO 'usuario'@'localhost';
FLUSH PRIVILEGES;


Configurar application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/examen1back2
spring.datasource.username=usuario
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


Ejecutar la aplicación Spring Boot. Esto creará automáticamente las tablas según las entidades.

4. Recomendaciones para evitar errores futuros

1. Verificar siempre la ortografía de las anotaciones (@Entity, @Id, @Column).
2. Mantener consistencia en nombres de tablas y columnas.
3. Generar get y set de manera automática para evitar errores de acceso a campos.
4. Revisar la sintaxis de @JoinColumn y otras relaciones antes de ejecutar la aplicación.
5. Usar control de versiones (git) para revertir cambios problemáticos sin perder información.
6. Documentar cada cambio en un archivo de registro de modificaciones.