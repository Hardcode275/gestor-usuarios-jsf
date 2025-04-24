# 🧑‍💻 Proyecto: Gestor de Usuarios JSF

Este es un proyecto web desarrollado en Java EE utilizando JSF (JavaServer Faces) y PrimeFaces como framework visual. Permite registrar, listar y eliminar usuarios a través de una interfaz web sencilla.

---

## ⚙️ Tecnologías utilizadas

- Java EE 8 / Java 21 (JDK)
- JSF (JavaServer Faces) 2.3
- PrimeFaces 12
- Apache Maven
- Apache Tomcat (servidor web)
- Visual Studio Code

---

## 📂 Estructura básica del proyecto

```
src/
├── main/
│   ├── java/com/laboratorio/Usuario.java
│   ├── java/com/laboratorio/UsuarioBean.java
│   └── webapp/
│       ├── index.xhtml
│       ├── registro.xhtml
│       ├── listaUsuarios.xhtml
│       └── WEB-INF/web.xml
└── test/ (opcional)
```

---

## 🚀 Cómo iniciar el proyecto (modo local con Tomcat)

### 1. Compilar el proyecto

```bash
mvn clean install
```

> Genera un archivo `.war` dentro de la carpeta `target/`.

---

### 2. Copiar el WAR a Tomcat

```bash
# Copia el archivo WAR
cp target/gestor.war C:\xampp\tomcat\webapps\
```

> Asegúrate de que no haya una carpeta `gestor/` antes de iniciar Tomcat.

---

### 3. Iniciar Tomcat manualmente

```bash
cd C:\xampp\tomcat\bin
catalina.bat run
```

---

### 4. Acceder a la app

Una vez Tomcat esté en ejecución:

```
http://localhost:8081/gestor/registro.xhtml
```

---

## 📝 Notas

- Si el puerto 8081 está ocupado, puedes cambiarlo en `conf/server.xml`
- Si Tomcat no inicia por el puerto 8005, cambia ese también a otro (como 9005)
- Para ver logs en caso de error, revisa:
  ```
  C:\xampp\tomcat\logs\catalina.out
  ```

---

## 📌 Autor

- Desarrollado por: [Tu Nombre Aquí]
- Carnet: OG100122
