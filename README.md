# Calculadora de media y desviación estándar
Este proyecto calcula la media y la desviación estándar de un conjunto de n números reales almacenados 
en un archivo de texto. Esto se logra mediante la implementación de una lista enlazada y todos sus 
componentes.

## ¿Cómo empezar?
Las siguientes instrucciones lo guían para tener una copia de este proyecto en su máquina local y su
correcto funcionamiento, para propósitos de desarrollo y pruebas.

### Requerimientos
Las siguientes herramientas son necesarias para que este proyecto funcione correctamente en su máquina:
- [Java 8](https://www.java.com/es/)
- [Maven](https://maven.apache.org/download.cgi)
- [GIT](https://git-scm.com/downloads)
  
### Instalación
Para que el proyecto esté listo para su uso, ejecute las siguientes instrucciones en el intérprete de 
comandos de su sistema operativo:

1. Diríjase al directorio donde desea guardar el programa
2. Abra el intérprete de comandos de su sistema operativo en dicho directorio y escriba los siguientes 
   comandos:
    - Clonar este repositorio:
        ```
        git clone https://github.com/federico29/AREP-LAB01.git
        ```
    - Compilar y empaquetar el código:
        ```
        mvn package
        ```

## Ejecutar pruebas
Para ejecutar las pruebas de este programa, abra el intérprete de comandos de su sistema operativo en 
el directorio del repositorio y escriba el siguiente comando:
```
mvn test
```

## Ejecutar el programa
Para ejecutar el programa, abra el intérprete de comandos de su sistema operativo en el directorio del 
repositorio y escriba el siguiente comando:
```
java -cp target/miprimera-app-1.0-SNAPSHOT.jar edu.escuelaing.arep.app.App
```
Puede modificar el archivo ***input.txt*** y escribir el conjunto de números del cual desea conocer la 
media y la desviación estándar.

## Construido con
- Maven
- Java 8
- GIT

## Autor
- Federico Barrios Meneses - Estudiante de Ingeniería de Sistemas.

## Licencia
Este proyecto está bajo la Licencia GNU General Public License - ver 
[LICENSE.txt](https://github.com/federico29/AREP-LAB01/blob/master/LICENSE.txt) para más detalles.
