#!/usr/bin/env sh

##############################################################################
##
##  Gradle start up script for UN*X
##
##############################################################################

# Locate the wrapper jar file
WRAPPER_JAR="./gradle/wrapper/gradle-wrapper.jar"

# Execute the wrapper
exec java -jar "$WRAPPER_JAR" "$@"
