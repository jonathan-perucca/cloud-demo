#!/usr/bin/env bash
mvn clean package
cf push under-cloud-demo -p target/cloud-demo-*.jar