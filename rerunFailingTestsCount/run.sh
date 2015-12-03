#!/bin/bash

mvn -Dsurefire.rerunFailingTestsCount=2 test
