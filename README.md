# SD LYGANE

Interfaz multimedia para Samsung DeX, inspirada en la experiencia Smart TV.

## Estado

Este repositorio contiene una base inicial de Android nativo con Kotlin y Jetpack Compose. Todavía no reemplaza el escritorio de Samsung DeX ni bloquea la salida al sistema.

## Requisitos

- Android Studio compatible con Android Gradle Plugin 8.9.2
- JDK 17
- Android SDK 35
- Un dispositivo Android para pruebas; objetivo inicial: Samsung Galaxy S22 5G con Samsung DeX

## Abrir el proyecto

1. Descarga y descomprime `SD-LYGANE.zip`.
2. En Android Studio, selecciona **Open** y elige la carpeta `SD-LYGANE`.
3. Espera a que termine la sincronización de Gradle.
4. Ejecuta la app en el teléfono o emulador.

## Publicarlo en GitHub

1. Crea un repositorio vacío en GitHub llamado `SD-LYGANE`.
2. Sube el contenido de esta carpeta (no subas el ZIP dentro del repositorio).
3. No publiques `local.properties`, claves, contraseñas ni archivos privados.

## Funciones incluidas en esta base

- Pantalla principal estilo Smart TV.
- Diseño adaptable a ventanas grandes de Samsung DeX.
- Navegación inicial por secciones.
- Preparación para teclado, mouse y mando Bluetooth.
- Configuración para iniciar en pantalla completa en Samsung DeX.

## Próximas etapas

1. Probar el proyecto limpio en Android Studio.
2. Crear el catálogo de aplicaciones instaladas y su lanzamiento.
3. Añadir navegación y control de foco para mando.
4. Conservar el estado al volver de aplicaciones externas.
5. Probar y ajustar el modo inmersivo en DeX.

## Limitaciones conocidas

Una aplicación Android normal no puede sustituir el escritorio de DeX ni garantizar que el sistema nunca muestre sus barras o controles. SD LYGANE funciona como una aplicación de entretenimiento dentro de DeX.
