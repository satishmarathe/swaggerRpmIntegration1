package au.com.coles.promo.v1.api.factories;

import au.com.coles.promo.v1.api.HealthcheckApiService;
import au.com.coles.promo.v1.api.impl.HealthcheckApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-04-07T19:14:51.248+10:00")
public class HealthcheckApiServiceFactory {
    private final static HealthcheckApiService service = new HealthcheckApiServiceImpl();

    public static HealthcheckApiService getHealthcheckApi() {
        return service;
    }
}
