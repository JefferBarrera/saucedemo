# Reto saucedemo.com

## Comandos git utilizados para versionar el codigo

## Prerequisitos
- Crear repositorio en Github
- Configurar git con la informacion necesaria de tus credenciales

```bash
git config --global user.name "JefferBarrera"
git config --global user.email "jeffer.barrera.c@gmail.com"
```

## Comandos git

- Inicializar repositorio ``git init``
- Agregar archivos al repositorio para darles seguimiento ``git add .``
- Realizar un commit de los archivos previamente agregados con mensaje personalizado ``git commit -m "Solucion Reto Sophos"``
- Cambiar nombre de rama principal ``git branch -M main``
- Configurar el repositorio remoto con la url dada por Github ``git remote add origin https://github.com/JefferBarrera/saucedemo.git``
- Subir cambios al repositorio remoto ``git push -u origin main``

***Con estos pasos podra desde inicializar hasta subir cambios a un repositorio remoto***

___

**Comandos agrupados para ejecucion en bloque**

```bash
git init
git add .
git commit -m "Solucion Reto Sophos"
git branch -M main
git remote add origin https://github.com/JefferBarrera/saucedemo.git
git push -u origin main
```