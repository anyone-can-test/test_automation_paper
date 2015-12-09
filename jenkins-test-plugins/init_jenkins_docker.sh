#!/bin/bash


# Copy the initial data to jenkins_home
HOST_JENKINS_HOME=$PWD/jenkins_home
rm -rf $HOST_JENKINS_HOME
mkdir $HOST_JENKINS_HOME
cp -r jenkins_home_init_data/* $HOST_JENKINS_HOME


# run command
sudo docker run -d -p 9999:8080 -v $HOST_JENKINS_HOME:/var/jenkins_home -v $PWD/repos:/repos jenkins_test_plugins
