# Pruebas automatizadas de Front End Web 
Repositorio que contiene las pruebas automatizadas asociadas al flujo correspondiente al descripto en el nombre del mismo.

## Tecnologías :electric_plug:
* JDK 16.0.2
* Maven 3.10.1
* Playwright 1.51.0

## Configurations ⚙️

Clonar el repositorio
```bash
git clone <ssh url>
```

Es necesario tener instalado Java JDK y Maven 
```bash 
brew install maven
```
 
<br>así como las variables de entorno configuradas en el sistema operativo: `JAVA_HOME`.
<br>A continuación, descargar todas las dependencias necesarias.
```bash 
mvn clean install
```

Ejecutar todas las pruebas
```bash
mvn clean test
```

generar el reporte Allure (Para esto debe tener instalado Allure en la terminal)
```bash
allure generate --clean allure-results -o report
```