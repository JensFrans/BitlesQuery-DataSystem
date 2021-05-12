# BitlesQuery DataSystem 📬

_BitlesQuery, es un Software orientado a gestion de datos e informacion estudiantil en general, el mismo administra los datos mediante una base de datos local. Este cuenta con diversas funciones en si, desde gestion de Asignaturas hasta reportes generales o individuales de registros previos, todo esto de una forma sencilla e incluso eficaz._

## Comenzando 🚀

_Estas instrucciones te permitirán obtener una copia del proyecto o bien un ejecutable en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas._

Detalla como importar proyectos a **NetBeans** para conocer como desplegar el proyecto.


### Pre-requisitos 📋

_Antes de proceder con la instalacion de la **App** se debe de contar con el siguiente Software_

```
- Java SE 1.8.
- Xampp Server.
```

_En dado caso que se desee descargar el codigo base, debe de contar con un **IDE** especifico para **Java**, como puede ser_

```
- IDE Apache NetBeans (de preferencia).
- Eclipse.
- IntelliJ Idea.
```

### Instalación 🔧

_Por el momento no se cuenta con un instalador en general, sin embargo en los archivos del software se encuentra un ejecutable en una version estable(StableBTQ1.0)_

_En dado caso se explicara de forma sencillo como se deberia de importar el proyecto a **NetBeans IDE**, en caso de usar otro **IDE**, no deberia cambiar mucho..._

_Primero debera descargar el proyecto en un [comprimido](https://github.com/JensFrans/BitlesQuery-DataSystem/archive/refs/heads/master.zip), seguido de esto debera:_

```
- Descomprimirlo en el lugar de la descarga, una vez hecho esto lo 
  siguiente dependera del IDE que usara para desplegar el proyecto.
```

_Una vez con el proyecto en su equipo local, debera de moverlo a la carpeta correspodiente de **proyectos** de su **IDE**, en caso de **NetBeans IDE**:_

```
- Debera de copiar la carpeta del proyecto y dirigirse a sus documentos, 
  seguido de esto pegar dicha carpeta dentro de NetBeansProjects.
```
_Luego de copiar el proyecto en su raiz de proyectos, debera:_

```
- Abrir NetBeans IDE y esperar que se escaneen los archivos necesarios, luego 
  de esto debera importarlo desde el menu de archivos --> importar proyecto,
  con esto deberia bastar para tener ya el proyecto a su disposicion.
```
_Para finalizar debera de limpiar y construir de nuevo el proyecto:_

```
- Para esto debera ir al menu Run --> Clean and Build Project, y de esta forma
  tendra el proyecto totalmente limpio en su equipo local.
```

_Finalmente para darle uso bastara con correr el proyecto, siempre que genere un **Clean and Build** en la carpeta StableBTQ1.0 se generar un ejecutable con
los cambios realizados si llegase a realizar alguno..._

## Modding para usos generales en proyectos similares ⚙️ 

_Este software esta bajo La licencia GNU GPL (GNU General Public License 🔩)._

_Por lo tanto los usuarios son libres para usarlo, acceder al código fuente,
modificarlo y distribuir los cambios; siempre que redistribuyan el programa
completo (modificado o no modificado) bajo la misma licencia._

## Configuracion del Software final 📦

_Si desea obtener tan solo el software para su uso, debera configurar un unico aspecto antes de proceder con ciertas actividades en el mismo..._

_Entonces debera de obtener un comprimido de la ultima version del software, puede descargarlo observando los [tags en este repositorio](https://github.com/JensFrans/BitlesQuery-DataSystem/releases). Dentro de este se encuentra un ejecutable .jar y un archivo de configuracion de base de datos referente a los pasos a seguir para el funcionamiento del software._

_Primero debe de saber que este software funciona mediante una base de datos local, por lo tanto debe de instalar previamente Xampp Server para crear e importar dicha base de datos._

```
- Para esto simplemente debera de instalar Xampp Sever y habilitar los servicios de Apache y MySql

```
Luego de esto, debera de abrir PHPMyAdmin para la creacion de la base de datos

```
- Puede acceder a este sitio web local desde el propio panel de Xampp server o escribiendo directamente
la siguiente URL http://localhost/phpmyadmin/

```
Ahora crearemos la base de datos

```
- Este aspecto no tiene perdida, en la pagina web local de PHPMyAdmin justamente en el panel izquierdo donde se especificican 
las bases de datos existentes, se resalta una opcion llamada **Nueva** este es para crear una base de datos.

- Una vez haga click sobre este boton, cargara un portal donde debe siministrar el nombre de la base de datos, el cual sera 
" bd_ds " y seleccionara un cotejamiento UTF8_unicode_ci, para finalizar debe de hacer click en crear.

```

Por ultimo importaremos el archivo de configuracion de base de datos

```
- luego de crear la base de datos, en la parte superior de la pagina dara click en el boton de importar, se mostrara un menu con 
especificaciones, tan solo debe de hacer click en seleccionar archivo y buscar e abrir el archivo de configuracion hallado en el .rar antes descargado.

- Una vez seleccionado debera bajar hasta el pie de pagina y pulsar en el boton continuar, si tocar ningun otro aspecto de la pagina...

- La importacion tan solo dura unos segundos y con esto queda totalmente funcional la base de datos.

```
_Y de esta forma ya podra usar el Software en su totalidad, tan solo tendria que ejecutar el .jar encontrado en el comprimido..._

```
- Por el momento el ingreso al sistema del software esta restringido por usos de la institucion "E.T.C. Simón Rodríguez"

- En una futura version(v2.0), se integrar un usuario Administrador base para ingresar al mismo, de momento de conservara asi...

```

## Construido con 🛠️

BitlesQuery ha sido desarrollado con las siguientes herramientas de desarrollo:

* [Java 1.8](https://www.java.com/es/download/ie_manual.jsp) - Lenguaje de programacion usado.
* [Apache NetBeans IDE](https://netbeans.apache.org/) - Entorno de desarrollo orientado a java.
* [Xampp Server](https://www.apachefriends.org/es/index.html) - Manejador de bases de datos localmente.

## Contribucion 🖇️

Este proyecto a sido desarrollado en conjunto con compañeros de estudio como un proyecto socio-productivo de beneficio para la Institucion "E.T.C Simón Rodríguez".

## Wiki - Manual de Desarrollador 📖

Puedes encontrar mucho más de cómo utilizar este proyecto y manejar sus componentes en nuestra [Wiki](https://github.com/tu/proyecto/wiki)

## Versionado 📌

Pronto se estableceran tags para predifinir todas las versiones disponibles en estado **estable**, mira los [tags en este repositorio](https://github.com/JensFrans/BitlesQuery-DataSystem/releases).

## Autores ✒️

_Desarrollador y Diseñador de Interfaz UI_

* **JeanFranco Parra** - *Estudiante 📘* - [JensFrans](https://github.com/JensFrans)

## Licencia 📄

Este proyecto está bajo la Licencia (GNU General Public License 📑) - mira el archivo [LICENSE.md](LICENSE.md) para detalles


## Si este proyecto fue de tu interes no olvides compartirlo y dar a conocer tu experiencia con el 📢


* Esto es todo por el momento hasta la proxima! ☕


---
⌨️ con ❤️ por [JensFrans](https://github.com/JensFrans) 🙂
