# Calculadora Estadística

## 📈Descripción

La calculadora estadística nos permite calcular la media y la desviación estándar de un set de datos ingresados por el usuario.

### Ubicación

La calculadora se puede encontrar en la siguiente página web: [Calculadora Estadística][statsCalculator]

### Cómo utilizar el programa

Al abrir el sitio web nos encontraremos con una pantalla como esta:

![Pantalla Principal](/img/PantallaPrincipal.jpg)

Esta pantalla contiene un campo de mensajes por parte de la aplicación, un campo para el ingreso de números y un botón de envío de datos. Debemos escribir los números de los cuales deseamos calcular la **Media** y la **Desviación Estándar** en el campo marcado como "Números", estos números irán separados por coma y su separador decimal es el punto. Una vez ingresados los números presionamos el botón *SUBMIT* y si el formato de los datos es correcto, en la parte inferior de la calculadora aparecerán los resultados retornados. Si el formato de los datos es incorrecto la calculadora lo detectará y enviará un mensaje de error al respecto.

## 📥Cómo obtener el proyecto

### Prerequisitos

Asegúrese de tener git instalado en su máquina, lo puede hacer desde la [página oficial][gitLink].

### Descarga del proyecto

Clone el proyecto utilizando el siguiente comando:

```
git clone https://github.com/danielrincon-m/AREP_LAB1.git
```

## 🧪Correr las pruebas unitarias

### Prerequisitos

Un IDE que soporte proyectos Java, o una instalación de Maven en su sistema, puebe obtenerlo desde
la [página oficial.][mvnLink]

### Ejecución de pruebas

Las pruebas pueden ser ejecutadas desde la sección de pruebas de su IDE o si tiene maven puede navegar a la carpeta
principal del proyecto y ejecutar el comando

```
mvn test
```

## 🌎Documentación del código fuente

La documentación del proyecto puede ser encontrada en la carpeta [docs](/docs).

También puede ser generada con Maven, clonando el proyecto y ejecutando el siguiente comando:

```
mvn javadoc:javadoc
```

## 📄Documento de diseño

El documento de diseño del programa puede ser encontrado [aquí](Lab2_AREP.pdf).

## 🛠️Herramientas utilizadas

* [IntelliJ IDE](https://www.jetbrains.com/es-es/idea/download/) - IDE de desarrollo
* [Maven](https://maven.apache.org/) - Manejo de Dependencias
* [JUnit](https://junit.org/junit4/) - Pruebas unitarias
* [GitHub](https://github.com/) - Repositorio de código

## 🧔Autor

**Daniel Felipe Rincón Muñoz:** *Planeación y desarrollo del proyecto* -
[Perfil de GitHub](https://github.com/danielrincon-m)

## 🚀Licencia

Este proyecto se encuentra licenciado bajo **GNU General Public License** - consulte el archivo [LICENSE.md](LICENSE.md)
para más detalles.

<!-- 
## Acknowledgments 

* Hat tip to anyone whose code was used
* Inspiration
* etc
-->

[gitLink]: https://git-scm.com/downloads
[statsCalculator]: https://statscalculator.herokuapp.com/calculator/
[mvnLink]: https://maven.apache.org/download.cgi
