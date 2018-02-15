@echo off

:: java运行参数设置
set "CURRENT_DIR=%~dp0"
set "JAVA_OPTS=-Xms512m -Xmx1g"
set "LIB_DIR=%CURRENT_DIR%\lib"
set "JAR_FILE=%LIB_DIR%\my-boot-0.0.1-SNAPSHOT.jar"
set "APP_CFG=%CURRENT_DIR%\application.yml"

java %JAVA_OPTS% ^
-jar -Dspring.config.location=%APP_CFG% %JAR_FILE% ^

pause &