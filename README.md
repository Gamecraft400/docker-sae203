# Création du docker Find your memz

Nous allons vous présenté ici comment faire pour lancer notre conteneur qui fonctionne sous une image ```debian``` avec un serveur ```ngix```

## Instructions pour lancer l'application

- Vérifiez si docker est installé :
```shell
docker --version
```

- Cloner le référentiel :
 ```shell
git clone git@github.com:Gamecraft400/docker-sae203.git
```

- Aller au référentiel :
```shell
cd docker-sae203
```

- Construisez l'image décrite dans dockerfile avec docker build : 
```shell
docker build -t img-find-your-memz .
```
- Lancer le serveur web :
```shell
docker run --name findyourmemz -d -p 667:80 img-find-your-memz
```



- Vérifier que le conteneur associé est actif :
```shell
docker ps
```


- Finalement, arrêtez le conteneur avec la commande suivante (les dernières chiffres sont le code de hachage affiché par docker ps):
```shell
docker stop findyourmemz
```

- Encore, si on souhaite supprimer le conteneur, on peut taper :
```shell
docker rm findyourmemz
```
