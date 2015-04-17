package com.github.nagaseyasuhito.sample.slf4j.fluentd;

import java.util.UUID;

public class UUIDService {
	public String generate() {
		return UUID.randomUUID().toString();
	}
}
