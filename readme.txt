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