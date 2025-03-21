package com.esper;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.servlet.engine.DefaultMicronautServlet;
import jakarta.inject.Named;

@Controller
public class PingController {

  /**
   * Workaround
   */
//  public PingController(@Named("micronaut") DefaultMicronautServlet servlet) {
//    System.out.println(servlet);
//  }

  @Get("/ping")
  public String ping() {
    return "pong";
  }
}
