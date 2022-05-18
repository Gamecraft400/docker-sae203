# Utiliser l'image debia officielle comme image parent
FROM debian:latest

# Installer des services et des packages
RUN  apt-get update && \
    apt-get -y install  \
    apache2

# Copier les fichiers de l'hôte vers l'image
COPY ./html /var/www/html
COPY git clone git@github.com:Gamecraft400/docker-sae203.git ./


# Exposer le port 80
EXPOSE 80

# Lancer le service apache au démarrage du conteneur
CMD ["/usr/sbin/apache2ctl","-DFOREGROUND"]