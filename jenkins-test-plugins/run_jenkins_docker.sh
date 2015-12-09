#!/bin/bash

# If you re-use the local jenkins_home, run this script.

HOST_JENKINS_HOME=$PWD/jenkins_home
sudo docker run -d -p 9999:8080 -v $HOST_JENKINS_HOME:/var/jenkins_home -v $PWD/repos:/repos jenkins_test_plugins
