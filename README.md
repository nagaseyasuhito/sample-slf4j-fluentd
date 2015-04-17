sample-slf4j-fluentd
====

This is a sample web application using FluentLogger as slf4j logger.
It is demonstration of sending log-data to everywhere supported on fluentd.
You can switch log destination to Treasure Data, ElasticSearch and so on without application changing :)

This sample web application is implemented by Java 8 and Java EE 7. And tested on Java SE Development Kit 8, Update 31 and GlassFish 4.1.

## Requirement

* Fluentd
* Java SE Development Kit 8
* Maven 3

## Usage

### Prepare fluentd agent

Install fluentd and configure in_foward plugin listening on port 24224.

### Build and deploy

    mvn clean verify

### Access to REST API

    curl http://localhost:8080/sample-slf4j-fluentd/api/uuid

## Licence

[MIT](https://github.com/nagaseyasuhito/sample-slf4j-fluentd/blob/master/LICENSE)

## Author

[nagaseyasuhito](https://github.com/nagaseyasuhito)

## See also

[logback-more-appenders](https://github.com/sndyuk/logback-more-appenders)
