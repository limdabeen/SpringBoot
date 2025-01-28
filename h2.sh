dir=$(dirname "$0")
java -cp "$dir/h2-2.3.232.jar:$H2DRIVERS:$CLASSPATH" org.h2.tools.Console "$@"
java -cp "$H2DRIVERS:$H2JARS" org.h2.tools.Console "$@" -webPort 8085