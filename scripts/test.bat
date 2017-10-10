@echo off
set workspace=C:\Users\Cova\Documents\MIW\MIW_WS_FORJA\Cova.Diez.SVC
::Las variables de entorno se pueden configurar directamente en Windows cuando se tienen los permisos necesarios
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_131
echo -----------------------------------------
echo . (C) MIW - UPM
echo -----------------------------------------
echo .
echo Workspace --- %workspace%
echo JAVA_HOME --- %JAVA_HOME%
echo M2_HOME   --- %M2_HOME%
echo .
cd %workspace%
echo ============ mvn clean test --settings settings.xml  (profile: develop) =====================================
echo .
call mvn clean test --settings settings.xml
pause

