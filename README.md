
```markdown
# 🔍 GoogleSearchTest - Automatización de Búsquedas con Selenium y JUnit 5

Este proyecto contiene pruebas automatizadas que simulan búsquedas en **Google** y **Bing**, utilizando **Selenium WebDriver** y **JUnit 5**. El objetivo es validar que los motores de búsqueda responden correctamente y que el título de la página refleja la consulta realizada.

## 🧰 Tecnologías Utilizadas

- **Java 11+**
- **JUnit 5 (Jupiter)**
- **Selenium WebDriver**
- **WebDriverManager** (gestión automática del driver de Chrome)

## 📦 Estructura del Proyecto

```bash
src/
├── main/
│   ├── java/
│       └── cl.kibernumacademy/web
└── test/
    └── java/
        └── cl.kibernumacademy/web
            └── GoogleSearchTest.java
```

## 🚀 Cómo Ejecutar las Pruebas

1. Asegúrate de tener Google Chrome instalado.
2. Incluye las siguientes dependencias en tu `pom.xml` o `build.gradle`
3. Ejecuta la clase `GoogleSearchTest` desde tu IDE o mediante Maven/Gradle.

## ✅ Pruebas Incluidas

| Método de prueba            | Motor de búsqueda | Consulta realizada                        | Validación del título                 |
|-----------------------------|-------------------|-------------------------------------------|---------------------------------------|
| `buscarInformacionEnGoogle` | Google            | `"Automatización con Selenium WebDriver"` | Contiene `"selenium"` (en minúsculas) |
| `buscarInformacionEnBing`   | Bing              | `"OpenAI"`                                | Contiene `"OpenAI"`                   |

## 🔄 Ciclo de Vida de Pruebas

- `@BeforeEach`: Configura el driver de Chrome antes de cada prueba.
- `@AfterEach`: Cierra el navegador para liberar recursos.

## 📌 Notas

- Se utiliza `By.name("q")` para localizar el campo de búsqueda en ambos motores.
- Las pruebas verifican que el título de la página contenga la palabra clave buscada.
- WebDriverManager facilita la configuración del entorno sin necesidad de descargar manualmente el driver.

```
