# 📚 Proyecto – Examen1Back2

---
## 1. Descripción General:

**Examen1Back2** es una aplicación desarrollada en **Spring Boot** para la gestión académica de **usuarios, docentes y cursos**.
Integra **JPA/Hibernate** para persistencia y **MySQL** como base de datos, asegurando integridad y consistencia de los datos.

El proyecto permite:

- Crear, consultar, actualizar y eliminar registros de manera eficiente.
- Mantener relaciones coherentes entre entidades (docentes asociados a cursos, usuarios vinculados a roles).
- Facilitar integraciones futuras con **REST APIs** o aplicaciones front-end.

### Arquitectura:

- **Modelo/Entidad:** Define estructura de datos y relaciones.
- **Repositorio (Repository):** Operaciones CRUD sobre las entidades.
- **Servicio (Service Layer):** Lógica de negocio.
- **Controlador (Controller):** Gestión de solicitudes REST.
- **Configuración BD:** Conexión con MySQL y generación automática de tablas.

---

## 2. Cambios realizados y correcciones de errores:

| Archivo | Error detectado | Solución aplicada |
|---------|----------------|----------------|
| `Curso.java` | `@Id` mal escrito | Corrección a `@Id` y uso de `@GeneratedValue(strategy = GenerationType.IDENTITY)` |
| `Curso.java` | `@Table` faltante | Agregado `@Table(name = "curso")` para mapear tabla correctamente |
| `Curso.java` | `@Column` no definido para nombre | Agregado `@Column(name = "nombre", nullable=false, unique=false, length=50)` |
| `Curso.java` | `@JoinColumn` con punto y coma | Eliminado error de sintaxis y corregidos espacios |
| `Curso.java` | Visibilidad de atributos | Agregado `private` y `;` en `Docente docente` |
| `Curso.java` | Constructores incompletos | Añadidos campos al constructor y generados métodos `get` y `set` |
| `Docente.java` | `@Entity` mal escrito | Corregido a `@Entity` |
| `Docente.java` | Tabla no definida | Agregado `@Table(name = "docente")` |
| `Docente.java` | Columnas y relaciones | Añadido `@Column(name="especialidad", nullable=false, length=30)` y métodos `get` y `set` |
| `Usuario.java` | `@Column` incorrecto | Eliminada anotación `@Column(name="id_usuario")` y ajustados otros campos |
| `Usuario.java` | ID no autogenerado | Agregado `@GeneratedValue(strategy = GenerationType.IDENTITY)` |
| `Usuario.java` | Constructores incompletos | Corregidos y añadidos métodos `get` y `set` |
| `Usuario.java` | Relación faltante | Añadido `@OneToOne` con otras entidades |
| `TipoUsuario.java` | No existía | Creado paquete, enum `TipoUsuario` y configuración de conexión BD |

> Se restauró parte de la información con `git revert` para mantener integridad histórica de cambios.

---

## 3. Guía para conexión a la Base de Datos:

<details>
<summary>Ver pasos de configuración</summary>

1. **Crear base de datos en MySQL**
```sql
Dar el nombre y copiarlo en la url en el archivo application.properties;

---

## 4. Configurar application.properties:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/examen1back2
spring.datasource.username=usuario
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

---
## 5. Ejecutar la aplicación Spring Boot:

      Esto generará automáticamente las tablas según las entidades definidas.

## 6. Verificar en MySQL

      Confirmar que las tablas docente, curso, usuario y tipo_usuario existen y sus relaciones son correctas.

      </details>

---

##7. Buenas prácticas y recomendaciones

✅ Ortografía de anotaciones: Errores en @Entity, @Id, @Column generan fallos.

✅ Consistencia de nombres: Tablas, columnas y atributos deben coincidir.

✅ Getters y Setters: Acceso controlado a atributos garantiza encapsulamiento.

✅ Revisión de relaciones: Validar @OneToOne, @OneToMany y @ManyToOne.

✅ Control de versiones: Git permite revertir cambios problemáticos sin perder información.

✅ Documentación continua: Mantener un CHANGELOG.md para registrar cada modificación.

✅ Pruebas unitarias: Validar constructores, getters/setters y relaciones antes de integrar.

✅ Integridad de datos: Cada cambio en la BD debe reflejarse en pruebas para evitar inconsistencias.