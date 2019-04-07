package au.com.coles.promo.v1;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Simple Promotion payload
 **/

/**
 * Simple Promotion payload
 */
@ApiModel(description = "Simple Promotion payload")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-04-07T19:14:51.248+10:00")
public class SimplePromoRequest   {
  private String promoId = null;

  private String promoDescription = null;

  /**
   * Type of Promotion
   */
  public enum PromoTypeEnum {
    SIMPLE("SIMPLE"),
    
    BUYGET("BUYGET"),
    
    THRESHOLD("THRESHOLD");

    private String value;

    PromoTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  private PromoTypeEnum promoType = null;

  public SimplePromoRequest promoId(String promoId) {
    this.promoId = promoId;
    return this;
  }

   /**
   * type of task
   * @return promoId
  **/
  @ApiModelProperty(value = "type of task")
  public String getPromoId() {
    return promoId;
  }

  public void setPromoId(String promoId) {
    this.promoId = promoId;
  }

  public SimplePromoRequest promoDescription(String promoDescription) {
    this.promoDescription = promoDescription;
    return this;
  }

   /**
   * Promotion Details
   * @return promoDescription
  **/
  @ApiModelProperty(value = "Promotion Details")
  public String getPromoDescription() {
    return promoDescription;
  }

  public void setPromoDescription(String promoDescription) {
    this.promoDescription = promoDescription;
  }

  public SimplePromoRequest promoType(PromoTypeEnum promoType) {
    this.promoType = promoType;
    return this;
  }

   /**
   * Type of Promotion
   * @return promoType
  **/
  @ApiModelProperty(value = "Type of Promotion")
  public PromoTypeEnum getPromoType() {
    return promoType;
  }

  public void setPromoType(PromoTypeEnum promoType) {
    this.promoType = promoType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimplePromoRequest simplePromoRequest = (SimplePromoRequest) o;
    return Objects.equals(this.promoId, simplePromoRequest.promoId) &&
        Objects.equals(this.promoDescription, simplePromoRequest.promoDescription) &&
        Objects.equals(this.promoType, simplePromoRequest.promoType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promoId, promoDescription, promoType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimplePromoRequest {\n");
    
    sb.append("    promoId: ").append(toIndentedString(promoId)).append("\n");
    sb.append("    promoDescription: ").append(toIndentedString(promoDescription)).append("\n");
    sb.append("    promoType: ").append(toIndentedString(promoType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

