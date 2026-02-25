## Allure tests 
Установка allure на ноутбук (используется node):
- ```npm install -g allure``` for allure 3 or for previous ``` npm install -g allure-commandline ```
- ```allure --version```
- To generate a report ```npx allure generate build/allure-results --clean```
- To open a report ```npx allure serve build/allure-results```
- ```Ctrl + Shift + O``` Обновить зависимости gradle в IntelliJ IDEA

## Module

- Добавили папку module
- Добавили модули в ```settings.gradle.kts```
- Добавили в ```app/build.gradle.kts``` строку подключения модуля ```implementation(project(":module")```
- Добавили ```wrapper/libs.versions.toml``` для зависимостей в ```module/build.gradle.kts```
- Запуск модулей ```java -cp "app/build/libs/app.jar:other/build/libs/other.jar" org.example.Main```
