#!/bin/sh

PRG="$0"

while [ -h "$PRG" ] ; do
  ls=`ls -ld "$PRG"`
  link=`expr "$ls" : '.*-> \(.*\)$'`
  if expr "$link" : '/.*' > /dev/null; then
    PRG="$link"
  else
    PRG=`dirname "$PRG"`/"$link"
  fi
done


PRGDIR=`dirname "$PRG"`

# java运行参数设置
JAVA_OPTS=" -server -Xms1g -Xmx2g"
LIB_DIR=$PRGDIR/lib
PATTERN_CFG=$PRGDIR/application.yml
JAR_FILE=$LIB_DIR/my-boot-0.0.1-SNAPSHOT.jar

java %JAVA_OPTS% \
-jar -Dspring.config.location=%APP_CFG% %JAR_FILE%