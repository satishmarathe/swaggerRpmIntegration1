package au.com.coles.promo.v1.api;

import au.com.coles.promo.v1.api.*;
import au.com.coles.promo.v1.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import au.com.coles.promo.v1.SimplePromoRequest;
import au.com.coles.promo.v1.InlineResponse400;

import java.util.List;
import au.com.coles.promo.v1.api.NotFoundException;
import au.com.coles.promo.v1.api.impl.exception.AppException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-04-07T19:14:51.248+10:00")
public abstract class PromotionApiService {
    public abstract Response createSimplePromo(String xAppCorelationId,String applicationId,SimplePromoRequest simplePromotionRequest,String xAuthorization,SecurityContext securityContext) throws AppException,NotFoundException;
}
