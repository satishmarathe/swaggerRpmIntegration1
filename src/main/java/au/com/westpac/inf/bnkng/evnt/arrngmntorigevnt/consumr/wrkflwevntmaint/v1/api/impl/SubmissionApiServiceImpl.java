package au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.api.impl;

import au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.api.*;
import au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.*;

import au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.WorkActivityRequest;
import au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.InlineResponse400;

import java.util.List;
import au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.api.NotFoundException;
import au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.api.tasty.AppException;
import au.com.westpac.wdp.common.loggerservice.LoggerService;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.WebApplicationException; 
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-01-20T11:21:55.950+11:00")
public class SubmissionApiServiceImpl extends SubmissionApiService {
	
	final String CLASS_NAME = "SubmissionApiServiceImpl";
    @Override
    public Response createWorkActivity(String xMessageId, String xAppCorelationId, String xOrganizationId, String xOriginatingSystemId, String xConsumerType, String brandSilo, 
    		String applicationId, String submissionId, WorkActivityRequest workActivityRequest, String xAuthorization, SecurityContext securityContext) throws AppException,NotFoundException {
        // do some magic!
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
    	}else if(applicationId.trim().equalsIgnoreCase("123")) {
    		throw new AppException(Response.Status.BAD_REQUEST.getStatusCode(), 400, "xyz msg", "dev msg" , "http://www.codingpedia.org");
    	}else {
    		return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    	}
    	
    }
}
