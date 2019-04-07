package au.com.coles.promo.v1.api.impl;

import au.com.coles.promo.v1.api.*;
import au.com.coles.promo.v1.*;

import au.com.coles.promo.v1.SimplePromoRequest;
import au.com.coles.promo.v1.InlineResponse400;

import java.util.List;
import au.com.coles.promo.v1.api.NotFoundException;
import au.com.coles.promo.v1.api.impl.exception.AppException;


import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-04-07T19:14:51.248+10:00")
public class PromotionApiServiceImpl extends PromotionApiService {
    @Override
    public Response createSimplePromo(String xAppCorelationId, String applicationId, SimplePromoRequest simplePromotionRequest, String xAuthorization, SecurityContext securityContext) 
    		throws AppException,NotFoundException {
    	final String METHOD_NAME = "createWorkActivity";
    	final long START_TIME = System.currentTimeMillis();
    	
    	//LoggerService.logInfo(CLASS_NAME, METHOD_NAME, corelationId, message, args);
        //return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    	if(applicationId.trim().equalsIgnoreCase("404")) {
    		throw new WebApplicationException(Response.Status.NOT_FOUND);
    	}else if(applicationId.trim().equalsIgnoreCase("403")) {
    		throw new WebApplicationException(Response.Status.FORBIDDEN);
    	}else if(applicationId.trim().equalsIgnoreCase("502")) {
    		throw new WebApplicationException(Response.Status.BAD_GATEWAY);
    	}else if(applicationId.trim().equalsIgnoreCase("400")) {
    		throw new AppException(Response.Status.BAD_REQUEST.getStatusCode(), 400, "xyz msg", "dev msg" , "http://www.codingpedia.org");
    	}else {
    		return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    	}
    }
}
