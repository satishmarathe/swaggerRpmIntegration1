package com.pets.api;

import com.pets.*;
import com.pets.api.PetApiService;
import com.pets.api.factories.PetApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.pets.Pet;

import java.util.List;
import com.pets.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/pet")


@io.swagger.annotations.Api(description = "the pet API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-18T07:54:23.219+05:30")
public class PetApi  {
   private final PetApiService delegate;

   public PetApi(@Context ServletConfig servletContext) {
      PetApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("PetApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (PetApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = PetApiServiceFactory.getPetApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/pets")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Gets All Pets", notes = "Gets all the pets", response = Pet.class, responseContainer = "List", tags={ "pet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Pet.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid status value", response = Pet.class, responseContainer = "List") })
    public Response findPetsByStatus(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.findPetsByStatus(securityContext);
    }
}
