Se requiere desarrollar un sistema en Spring Boot para gestionar la generación de archivos
de configuración para diferentes tipos de aplicaciones (por ejemplo, aplicaciones web, móviles y de escritorio),
donde cada tipo de aplicación puede requerir distintos formatos de archivo (como JSON, YAML o XML).
El sistema debe permitir extender fácilmente tanto los tipos de aplicación como los formatos de archivo
sin modificar las clases existentes.


Abstracción: el tipo de aplicación (Web, Móvil, Escritorio) define qué configuración necesita.
Implementación: el formato de archivo (JSON, YAML, XML) define cómo se guarda esa configuración.