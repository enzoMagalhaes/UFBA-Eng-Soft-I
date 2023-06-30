#!/bin/bash

# Check if a folder is provided as a parameter
if [ -z "$1" ]; then
    echo "Please provide the folder path as a parameter."
    exit 1
else
    folder=$1
fi

if [ -z "$2" ]; then
    # Default main_program name if no parameter is provided
    program="Program"
else
    # Use the provided main_program name
    program="$2"
fi


# Compile all Java files
javac "${folder}"/atividade/refactored/*.java

# Check if compilation was successful
if [ $? -eq 0 ]; then
    # Run the main_program class
    java "${folder}".atividade.refactored."${program}"
else
    echo "Compilation failed."
fi
