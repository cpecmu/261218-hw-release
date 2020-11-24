#!/bin/bash
set -e

if [ -z "$2" ]
then
  echo "usage: $0 <hw-number> <filename>"
  echo "example: $0 hw1 PeakFinder"
  exit
fi

cd hw
javac -sourcepath src -d classes src/cpecmu/cpe218/sp2021/$1/submit/$2Impl.java
java -classpath classes cpecmu/cpe218/sp2021/$1/submit/$2Impl
echo done
