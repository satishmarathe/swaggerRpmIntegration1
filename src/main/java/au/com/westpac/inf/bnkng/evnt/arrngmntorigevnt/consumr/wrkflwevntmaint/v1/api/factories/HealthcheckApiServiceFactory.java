package au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.api.factories;

import au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.api.HealthcheckApiService;
import au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1.api.impl.HealthcheckApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-01-20T11:21:55.950+11:00")
public class HealthcheckApiServiceFactory {
    private final static HealthcheckApiService service = new HealthcheckApiServiceImpl();

    public static HealthcheckApiService getHealthcheckApi() {
        return service;
    }
}
