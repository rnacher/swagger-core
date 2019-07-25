package io.swagger.v3.jaxrs2.resources.rs;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.tags.Tag;

@Path("resources")
@Tag(name = "resource")
public interface TicketRNRAnnotatedInterface<T extends Number> {
  @POST
  Response postResource(List<T> payload);
}
