echo -----------------------------------------
echo .
set workspace=C:\Users\Cova\Documents\MIW\MIW_WS_FORJA\APAW-ECP2-COVA
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_131
echo .
cd %workspace%
echo ============ mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent verify --settings settings.xml ... ==================
echo . Se prepara cobertura
call mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent verify --settings settings.xml

echo ============ mvn sonar:sonar ... =======================================================
echo . Se analiza y sube a sonar cloud
call mvn sonar:sonar -X -Dsonar.organization=webkova-github -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=88fbd1ceed10d671992850c437110eb3f6cf5428 --settings settings.xml
pause

