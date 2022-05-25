FROM debian:latest

# Installer des services et des packages
RUN  apt-get update && \
    apt-get -y install  \
    nginx                \
    git

# Copier les fichiers de l'hÃ´te vers l'image

RUN git clone https://github.com/Gamecraft400/docker-sae203.git
RUN cp -r /docker-sae203/html /var/www/


# Exposer le port 80
EXPOSE 80

# Lancer le service apache au dÃ©marrage du conteneur
CMD ["nginx", "-g", "daemon off;"]
