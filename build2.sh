/bin/rm -rf output

mkdir -p output/mlib

mkdir -p output/classes

#find first -name *.java
javac -d output/classes `find first -name *.java`
jar -c -f output/mlib/first.jar -C output/classes .
/bin/rm -rf output/classes

#find second -name *.java
javac -p output/mlib -d output/classes `find second -name *.java`
jar -c -f output/mlib/second.jar -C output/classes .
/bin/rm -rf output/classes