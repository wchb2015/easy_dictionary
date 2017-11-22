#!/usr/bin/env bash

LOG_DIR=/data/log/dict

SCRIPTS_DIR=`dirname "$0"`
PROJECT_DIR=`cd $SCRIPTS_DIR && pwd`
DT=`date +"%Y%m%d_%H%M%S"`

MEM_OPTS="-Xms200m -Xmx200m -Xmn100m"
GC_OPTS="$GC_OPTS -XX:+UseConcMarkSweepGC -XX:+UseParNewGC -XX:CMSInitiatingOccupancyFraction=60 -XX:CMSTriggerRatio=70 -XX:+ParallelRefProcEnabled"
GC_OPTS="$GC_OPTS -Xloggc:${LOG_DIR}/gc_logs/gc_${DT}.log"
GC_OPTS="$GC_OPTS -XX:+PrintGCDateStamps -XX:+PrintGCDetails"
GC_OPTS="$GC_OPTS -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=${PROJECT_DIR}/tmp/heapdump_${DT}.hprof"
START_OPTS="$START_OPTS -Djava.io.tmpdir=$PROJECT_DIR/tmp/"
START_OPTS="$START_OPTS -Duser.dir=$PROJECT_DIR"

#run java
mkdir -p "$PROJECT_DIR/tmp/"
mkdir -p "$LOG_DIR/gc_logs/"

echo start application!!!!!
nohup java -server $MEM_OPTS $GC_OPTS   $START_OPTS  -jar ../../../../target/dictionary-0.0.1-SNAPSHOT.jar &
