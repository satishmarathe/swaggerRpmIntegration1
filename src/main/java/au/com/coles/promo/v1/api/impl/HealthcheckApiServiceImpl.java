package au.com.coles.promo.v1.api.impl;

import au.com.coles.promo.v1.api.*;
import au.com.coles.promo.v1.*;

import au.com.coles.promo.v1.HealthcheckStatus;

import java.util.List;
import au.com.coles.promo.v1.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-04-07T19:14:51.248+10:00")
public class HealthcheckApiServiceImpl extends HealthcheckApiService {
    @Override
    public Response getHealthCheckStatus(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
