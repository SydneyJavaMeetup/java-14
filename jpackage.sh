mvn clean package
rm -rf installer
mkdir installer
mv target/java-14-1.0-SNAPSHOT.jar installer/java14animals.jar
mv target/lib/* installer/

rm -rf Java14Animals.app
jpackage \
    --type app-image \
    -i installer \
    -n Java14Animals \
    --main-class com.mycodefu.java14.AnimalsUI \
    --main-jar java14animals.jar \
    --java-options "--enable-preview"

