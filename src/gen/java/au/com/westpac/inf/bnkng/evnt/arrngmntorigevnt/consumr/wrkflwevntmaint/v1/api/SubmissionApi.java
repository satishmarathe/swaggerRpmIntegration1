package au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.api;

import au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.*;
import au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.api.SubmissionApiService;
import au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.api.factories.SubmissionApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.WorkActivityRequest;
import au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.InlineResponse400;

import java.util.List;
import au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/submission")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the submission API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-01-20T11:21:55.950+11:00")
public class SubmissionApi  {
   private final SubmissionApiService delegate = SubmissionApiServiceFactory.getSubmissionApi();

    @POST
    @Path("/{submissionId}/workActivityTasks")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create Work Activity", notes = "Create Work Activity", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "API Key")
    }, tags={ "Create Work Activity", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "OK DOK", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "_Bad Request_  Possible errors  | Error Code | Error Message | Error Description | | ---------- | ------------- | ----------------- | | 8001       | Invalid input | Parameter missing {0} | ", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "_Resource NOT Found_  Possible errors  | Error Code | Error Message | Error Description | | ---------- | ------------- | ----------------- | | 8005       | Submission not found | SubmissionId not found in provider system | ", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "_Internal Server Error_  Possible errors  | Error Code | Error Message | Error Description | | ---------- | ------------- | ----------------- | | 10001       | ISE | Unknown error | | 10002       | ISE | Unknown error {0} | | 10300       | ISE | Unknown error | | 10301       | ISE | Unknown error | | 10302       | ISE | Unknown error | ", response = void.class) })
    public Response createWorkActivity(@ApiParam(value = "Unique message identifier" ,required=true)@HeaderParam("x-messageId") String xMessageId
,@ApiParam(value = "Used to trace a request" ,required=true)@HeaderParam("x-appCorelationId") String xAppCorelationId
,@ApiParam(value = "consumers organization" ,required=true, allowableValues="ABC, XYZ")@HeaderParam("x-organizationId") String xOrganizationId
,@ApiParam(value = "System Id of application" ,required=true)@HeaderParam("x-originatingSystemId") String xOriginatingSystemId
,@ApiParam(value = "something" ,required=true, allowableValues="Everyone, Other")@HeaderParam("x-consumerType") String xConsumerType
,@ApiParam(value = "channel identification",required=true, allowableValues="POODLE, MANGY") @QueryParam("brandSilo") String brandSilo
,@ApiParam(value = "Unique application identifier",required=true) @QueryParam("applicationId") String applicationId
,@ApiParam(value = "SubmissionId associated with work activity",required=true) @PathParam("submissionId") String submissionId
,@ApiParam(value = "Request object that contains payload" ,required=true) WorkActivityRequest workActivityRequest
,@ApiParam(value = "user auth" )@HeaderParam("x-authorization") String xAuthorization
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createWorkActivity(xMessageId,xAppCorelationId,xOrganizationId,xOriginatingSystemId,xConsumerType,brandSilo,applicationId,submissionId,workActivityRequest,xAuthorization,securityContext);
    }
}
