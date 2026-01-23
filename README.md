## Allure tests 
Установка allure на ноутбук (используется node):
- ```npm install -g allure``` for allure 3 or for previous ``` npm install -g allure-commandline ```
- ```allure --version```
- To generate a report ```npx allure generate build/allure-results --clean```
- To open a report ```npx allure serve build/allure-results```
- ```Ctrl + Shift + O``` Обновить зависимости gradle в IntelliJ IDEA