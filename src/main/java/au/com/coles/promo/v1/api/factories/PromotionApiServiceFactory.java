package au.com.coles.promo.v1.api.factories;

import au.com.coles.promo.v1.api.PromotionApiService;
import au.com.coles.promo.v1.api.impl.PromotionApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-04-07T19:14:51.248+10:00")
public class PromotionApiServiceFactory {
    private final static PromotionApiService service = new PromotionApiServiceImpl();

    public static PromotionApiService getPromotionApi() {
        return service;
    }
}
