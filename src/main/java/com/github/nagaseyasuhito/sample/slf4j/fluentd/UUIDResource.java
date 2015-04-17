package com.github.nagaseyasuhito.sample.slf4j.fluentd;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("uuid")
public class UUIDResource {
	private static final Logger log = LoggerFactory.getLogger(UUIDResource.class);

	@Inject
	private UUIDService uuidService;

	@GET
	public String get() {
		String uuid = this.uuidService.generate();
		log.info("Generated UUID is {}", uuid);

		return uuid;
	}
}
