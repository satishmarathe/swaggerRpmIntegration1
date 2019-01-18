package com.pets.api;

import com.pets.api.*;
import com.pets.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import com.pets.Pet;

import java.util.List;
import com.pets.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-18T07:54:23.219+05:30")
public abstract class PetApiService {
    public abstract Response findPetsByStatus(SecurityContext securityContext) throws NotFoundException;
}
