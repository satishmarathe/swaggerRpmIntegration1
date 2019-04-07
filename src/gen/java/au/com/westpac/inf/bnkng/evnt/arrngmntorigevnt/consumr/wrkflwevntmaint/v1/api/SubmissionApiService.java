package au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.api;

import au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.api.*;
import au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.WorkActivityRequest;
import au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.InlineResponse400;

import java.util.List;
import au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.api.NotFoundException;
import au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.api.tasty.AppException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-01-20T11:21:55.950+11:00")
public abstract class SubmissionApiService {
    public abstract Response createWorkActivity(String xMessageId,String xAppCorelationId,String xOrganizationId,String xOriginatingSystemId,String xConsumerType,String brandSilo,String applicationId,String submissionId,WorkActivityRequest workActivityRequest,String xAuthorization,SecurityContext securityContext) 
    		throws AppException,NotFoundException;
}
