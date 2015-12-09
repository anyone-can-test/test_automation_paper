FROM jenkins

ENV http_proxy http://172.21.81.28:6588
ENV https_proxy http://172.21.81.28:6588

USER root
RUN apt-get update
RUN apt-get install -y git
RUN apt-get install -y maven


# The user should be jenkins after the root work.
USER jenkins

#
VOLUME /repos


# Add plugins.
COPY plugins.txt /usr/share/jenkins/plugins.txt
RUN /usr/local/bin/plugins.sh /usr/share/jenkins/plugins.txt


# /var/jenkins_home is volume (https://github.com/jenkinsci/docker/blob/02721aab9775f4f26fb23cbf204d1eb5b23d07ea/Dockerfile). So can't add files.
