package com.pets.api.factories;

import com.pets.api.PetApiService;
import com.pets.api.impl.PetApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-18T07:54:23.219+05:30")
public class PetApiServiceFactory {
    private final static PetApiService service = new PetApiServiceImpl();

    public static PetApiService getPetApi() {
        return service;
    }
}
