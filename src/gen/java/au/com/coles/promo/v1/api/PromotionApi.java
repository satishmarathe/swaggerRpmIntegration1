package au.com.coles.promo.v1.api;

import au.com.coles.promo.v1.*;
import au.com.coles.promo.v1.api.PromotionApiService;
import au.com.coles.promo.v1.api.factories.PromotionApiServiceFactory;
import au.com.coles.promo.v1.api.impl.exception.AppException;
import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import au.com.coles.promo.v1.SimplePromoRequest;
import au.com.coles.promo.v1.InlineResponse400;

import java.util.List;
import au.com.coles.promo.v1.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/promotion")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the promotion API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-04-07T19:14:51.248+10:00")
public class PromotionApi  {
   private final PromotionApiService delegate = PromotionApiServiceFactory.getPromotionApi();

    @POST
    @Path("/createSimple")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create Simple Promo", notes = "Create Simple Promo", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "API Key")
    }, tags={ "Create Simple Promotion", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "OK", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "_Bad Request_  Possible errors  | Error Code | Error Message | Error Description | | ---------- | ------------- | ----------------- | | 8001       | Invalid input | Parameter missing {0} | ", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "_Resource NOT Found_  Possible errors  | Error Code | Error Message | Error Description | | ---------- | ------------- | ----------------- | | 8005       | Submission not found | SubmissionId not found in provider system | ", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "_Internal Server Error_  Possible errors  | Error Code | Error Message | Error Description | | ---------- | ------------- | ----------------- | | 10001       | ISE | Unknown error | | 10002       | ISE | Unknown error {0} | | 10300       | ISE | Unknown error | | 10301       | ISE | Unknown error | | 10302       | ISE | Unknown error | ", response = void.class) })
    public Response createSimplePromo(@ApiParam(value = "Used to trace a request" ,required=true)@HeaderParam("x-appCorelationId") String xAppCorelationId
,@ApiParam(value = "Unique application identifier",required=true) @QueryParam("applicationId") String applicationId
,@ApiParam(value = "Request object that contains SimplePromo payload" ,required=true) SimplePromoRequest simplePromotionRequest
,@ApiParam(value = "user auth" )@HeaderParam("x-authorization") String xAuthorization
,@Context SecurityContext securityContext)
    throws AppException,NotFoundException {
        return delegate.createSimplePromo(xAppCorelationId,applicationId,simplePromotionRequest,xAuthorization,securityContext);
    }
}
