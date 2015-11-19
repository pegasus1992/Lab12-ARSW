% Escuela Colombiana de Ingeniería
% Arquitecturas de Software
% Noviembre 2015

Pruebas de Carga con JMeter & Java VisualVM
===========================================

Repositorio
-----------

Clone el proyecto disponible en
[spring-jmeter-profiling](https://github.com/), cree un repositorio en
su cuenta de Github y redireccione el repositorio clonado a su
repositorio en Github. 

Revisión
--------

* Ejecute la aplicación, y revise la funcionalidad del API incluido en
  el mismo, accediendo a la URL
  [/products](http://localhost:8080/products).

* Revise cómo se representan los objetos de tipo ‘producto’ en formato
  jSON, y verifique que al agregar nuevos productos haciendo POST
  mediante el comando CURL, aparezcan al consultarlos en el browser
  (mediante el método GET).

* Teniendo en cuenta el ejercicio en el punto anterior, siga las
  indicaciones de la guía disponible en [Art of testing][ArtOfTesting]
  para la configuración de un banco de pruebas con [JMeter][JMeter]
  para un API REST, aplicándolo al proyecto.

*  Configure el banco de pruebas para verificar como varían los tiempos
   de respuesta frente a diferentes escenarios:

     a. 10 usuarios concurrentes.

     b. 50 usuarios concurrentes.

     c. 100 usuarios concurrentes.

* Ejecute las pruebas y analice los resultados, escriba su analisis en
  archivo de texto *analisis.txt* dentro del proyecto.

* Ahora, antes de realizar un nuevo conjunto de pruebas, use el
  perfilador provisto por java, mediante el comando:
```bash
$ jvisualvm
```

* Revise cómo se comporta la memoria a la vez que se corre el banco de
  pruebas de jMeter.  Qué conclusión puede sacar, respecto a la
  capacidad de la aplicación?, cómo evaluaría el atributo de calidad
  de confiabilidad (Reliability)? Agregue sus conclusiones en el
  archivo de texto.


[JMeter]: http://jmeter.apache.org/
[ArtOfTesting]: http://artoftesting.com/performanceTesting/restAPIJMeter.html
