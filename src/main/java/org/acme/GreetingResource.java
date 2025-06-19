package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;

@Path("/hello")
public class GreetingResource {
    @CheckedTemplate
    static class Templates {
        public static native TemplateInstance withoutLayout();

        public static native TemplateInstance withLayout();

    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("hello1")
    public TemplateInstance hello1() {
        return Templates.withoutLayout();
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("hello2")
    public TemplateInstance hello2() {
        return Templates.withLayout();
    }

}
