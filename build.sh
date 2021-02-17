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


#find third -name *.java
javac -p output/mlib -d output/classes `find third -name *.java`
jar -c -f output/mlib/third.jar -C output/classes .
/bin/rm -rf output/classes
#java -p output/mlib -m ro.andramorutan.thirdModule/ro.andramorutan.thirdpackage.ThirdMain;



javac -p output/mlib -d output/classes `find forth -name *.java`
jar -c -f output/mlib/forth.jar -C output/classes .
/bin/rm -rf output/classes
#java -p output/mlib -m ro.andramorutan.forthModule/ro.andramorutan.forthpackage.ForthMain;


javac -p output/mlib -d output/classes `find fifth -name *.java`
jar -c -f output/mlib/fifth.jar -C output/classes .
/bin/rm -rf output/classes

javac -p output/mlib -d output/classes `find sixth -name *.java`
jar -c -f output/mlib/sixth.jar -C output/classes .
/bin/rm -rf output/classes

java -p output/mlib -m ro.andramorutan.sixthModule/ro.andramorutan.sixthpackage.SixthMain