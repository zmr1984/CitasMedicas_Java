# Sistema de Citas Médicas

## Descripción

Sistema desarrollado en Java para la administración básica de citas médicas.

La aplicación permite registrar pacientes, doctores, crear citas médicas y consultar la información almacenada mediante archivos CSV.

El proyecto fue desarrollado como parte de una evidencia académica de Programación Orientada a Objetos utilizando Java, Git y GitHub para el control de versiones.

---

# Instalación y Configuración

## Requisitos

* Java JDK 17 o superior
* IntelliJ IDEA Community Edition o Ultimate
* Git (opcional)

## Clonar el repositorio

```bash
git clone https://github.com/zmr1984/CitasMedicas_Java.git
```

## Abrir el proyecto

1. Abrir IntelliJ IDEA.
2. Seleccionar **Open**.
3. Buscar la carpeta del proyecto.
4. Esperar a que IntelliJ cargue la configuración.

## Ejecutar el proyecto

1. Abrir la clase:

```text
src/Main.java
```

2. Ejecutar el método:

```java
public static void main(String[] args)
```

3. La aplicación mostrará el menú principal en consola.

---

# Uso del Programa

Al iniciar la aplicación se muestra el siguiente menú:

```text
==================================
 SISTEMA DE CITAS MÉDICAS
==================================

1. Registrar paciente
2. Registrar doctor
3. Crear cita
4. Ver pacientes
5. Ver doctores
6. Ver citas
7. Salir
```

## Registrar Paciente

Permite capturar:

* ID del paciente
* Nombre
* Edad
* Teléfono

La información se almacena en:

```text
db/pacientes.csv
```

## Registrar Doctor

Permite capturar:

* ID del doctor
* Nombre
* Especialidad

La información se almacena en:

```text
db/doctores.csv
```

## Crear Cita

Permite capturar:

* Folio de cita
* ID del paciente
* ID del doctor
* Fecha
* Hora

La información se almacena en:

```text
db/citas.csv
```

## Consultar Información

La aplicación permite consultar:

* Pacientes registrados
* Doctores registrados
* Citas registradas

Los datos son leídos directamente desde los archivos CSV.

---

# Estructura del Proyecto

```text
CitasMedicas
│
├── src
│   ├── Main.java
│   ├── Paciente.java
│   ├── Doctor.java
│   ├── Cita.java
│   └── ArchivoCSV.java
│
├── db
│   └── .gitignore
│
└── README.md
```

---

# Continuidad de Datos

La aplicación utiliza archivos CSV para almacenar la información.

Si los archivos no existen, son generados automáticamente al iniciar la aplicación.

---

# Control de Versiones

El proyecto utiliza Git y GitHub siguiendo una estrategia basada en ramas:

* master
* develop
* configuracion_inicial
* crear_paciente
* crear_doctor
* crear_cita
* continuidad_csv
* menu_principal
* registrar_paciente

Cada funcionalidad fue desarrollada en una rama independiente y posteriormente integrada a la rama develop.

---

# Créditos

Desarrollado por:

**Zurisadai Morales Ramos**

Tecnologías utilizadas:

* Java
* IntelliJ IDEA
* Git
* GitHub

---

# Licencia

Proyecto desarrollado con fines académicos y educativos.
Se permite su uso como referencia para actividades de aprendizaje relacionadas con Programación Orientada a Objetos y manejo de archivos en Java.
