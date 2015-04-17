sample-slf4j-fluentd
====

This is a sample web application using FluentLogger as slf4j logger implementation.
It is demonstration of sending log-data using fluentd on Java EE REST API application.
You can switch log destination to Treasure Data, ElasticSearch and so on without changing application codes :)

This sample web application is implemented by Java 8 and Java EE 7. And tested on Java SE Development Kit 8, Update 31 and GlassFish 4.1.

## Requirement

* Fluentd
* Java SE Development Kit 8
* Maven *3.2.2* or later (Maven 3.2.1 occurs exception)

## Usage

### Prepare fluentd agent

Install fluentd and configure in_foward plugin listening on port 24224. (or edit src/main/resources/logback.xml)

It uses `glassfish.log` as fluentd tag.

### Build and run

    mvn clean package embedded-glassfish:run

### Access to REST API

    curl http://localhost:8080/api/uuid

So you can see log output like `[INFO] Generated UUID is bf7f4e33-f95d-43fb-aa5c-20890dd08cba` on console.
And fluentd will receive same log via in_forward plugin.

## Licence

[MIT](https://github.com/nagaseyasuhito/sample-slf4j-fluentd/blob/master/LICENSE)

## Author

[nagaseyasuhito](https://github.com/nagaseyasuhito)

## See also

[logback-more-appenders](https://github.com/sndyuk/logback-more-appenders)
