[![Custom Badge](https://img.shields.io/badge/-This_README_is_available_in_English-blue?style=for-the-badge&logo=data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIGhlaWdodD0iMjRweCIgdmlld0JveD0iMCAtOTYwIDk2MCA5NjAiIHdpZHRoPSIyNHB4IiBmaWxsPSIjZTNlM2UzIj48cGF0aCBkPSJtNDc2LTgwIDE4Mi00ODBoODRMOTI0LTgwaC04NGwtNDMtMTIySDYwM0w1NjAtODBoLTg0Wk0xNjAtMjAwbC01Ni01NiAyMDItMjAycS0zNS0zNS02My41LTgwVDE5MC02NDBoODRxMjAgMzkgNDAgNjh0NDggNThxMzMtMzMgNjguNS05Mi41VDQ4NC03MjBINDB2LTgwaDI4MHYtODBoODB2ODBoMjgwdjgwSDU2NHEtMjEgNzItNjMgMTQ4dC04MyAxMTZsOTYgOTgtMzAgODItMTIyLTEyNS0yMDIgMjAxWm00NjgtNzJoMTQ0bC03Mi0yMDQtNzIgMjA0WiIvPjwvc3ZnPg==)](./README_EN.md)
# Proyecto: CronO<sub>2</sub>
## Descripción
Este repositorio está basado en mi proyecto desarrollado como trabajo final del ciclo formativo FPII DAM.
El proyecto consiste en el desarrollo de una aplicación móvil en sistema operativo Android para el cálculo del tiempo restante de administración de oxígeno con botellas utilizadas en servicios de emergencias sanitarias.  
**El contenido sigue en desarrollo y puede no estar completamente optimizado o libre de errores.**

En algunos escenarios en que los profesionales sanitarios pueden contar con un inventario variado de botellas y manómetros sin un código de formato estandarizado. Además, los manómetros pueden mostrar la presión en distintas unidades de medida, lo que dificulta la estimación del oxígeno restante.
La aplicación pretende hacer posible una previsión para la variedad de unidades de medida y formatos que pueden encontrarse de forma que puedan garantizar el abastecimiento durante el transcurso de su servicio.

## Tecnologías utilizadas
![Static Badge](https://img.shields.io/badge/android-black?style=for-the-badge&logo=Android)![Static Badge](https://img.shields.io/badge/Java-black?style=for-the-badge&logo=openjdk)![Static Badge](https://img.shields.io/badge/kotlin-black?style=for-the-badge&logo=Kotlin)

## Estado del Proyecto
**Este proyecto está en constante evolución**, ya que sigo aprendiendo y mejorando mis habilidades. El código aún está en desarrollo y optimización, por lo que algunas funcionalidades pueden estar incompletas o en revisión.
- La aplicación puede ser utilizada como conversor rápido entre unidades de presión.
- Guía rápida de usuario implementada en la misma aplicación, de fácil acceso.
- Interfaz gráfica limpia, coherente y estable que entrega toda la información que el usuario necesita para utilizar la aplicación sin cambiar de pantalla.
- Texto en inglés y en español mediante internacionalización.
- Los test que comparan el resultado del cálculo de tiempo de esta aplicación con las tablas de referencia proporcionadas por proveedores de botellas de oxígeno arrojan resultados muy variados dependiendo del fabricante. Los cálculos presentan variaciones significativas según el fabricante. Al buscar un margen de error inferior al 5%, los resultados de precisión oscilan entre un 6% y un 100% de acierto. Se requiere un análisis adicional para mejorar la fiabilidad.

## Instalación y uso
De momento la aplicación se encuentra únicamente en este repositorio.

1. Clona este repositorio
2. Ábrelo en Android Studio
3. Compila y ejecuta en un emulador (desde API 24) o dispositivo físico

## Capturas de pantalla
![Flujo 1](images/flujo1.png)
![Flujo 2](images/flujo2.png)
![Flujo 3](images/flujo3.png)

## Mejoras previstas
- Implementar mediante canvas una imagen de manómetro cuya aguja pueda arrastrarse.
- Añadir elementos que permitan personalizar los parámetros iniciales de las botellas según fabricante.
- Aumentar los atributos de DataStoreManager para añadir configuraciónes personalizadas (modo nocturno, valores por defecto de botellas...)

## Notas
-  **Uso personal:** El código aquí compartido es principalmente para aprendizaje y experimentación.
-  **No apto para producción:** Este repositorio no está destinado a ser utilizado en un entorno de producción ni para otros proyectos sin previa revisión.
-  **No utilizar como única fuente de información para asegurar abastecimiento de material médico.** Este proyecto es un ejercicio con fin educativo para programación y no contiene todavía la información necesaria para el usuario final objetivo al que pretende dirigirse.


---
¡Gracias por visitar CronO<sub>2</sub>! Estoy en un proceso continuo de aprendizaje, así que cualquier sugerencia o comentario es bienvenido.