/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import Model.TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbedded;
import Model.TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TmsV1InstrumentIdentifiersPaymentInstrumentsGet200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-18T15:21:09.334+05:30")
public class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200Response {
  @SerializedName("_links")
  private TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks links = null;

  @SerializedName("object")
  private String object = null;

  @SerializedName("offset")
  private String offset = null;

  @SerializedName("limit")
  private String limit = null;

  @SerializedName("count")
  private String count = null;

  @SerializedName("total")
  private String total = null;

  @SerializedName("_embedded")
  private TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbedded embedded = null;

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200Response links(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseLinks links) {
    this.links = links;
  }

   /**
   * &#39;Shows the response is a collection of objects.&#39;  Valid values: - collection 
   * @return object
  **/
  @ApiModelProperty(example = "collection", value = "'Shows the response is a collection of objects.'  Valid values: - collection ")
  public String getObject() {
    return object;
  }

   /**
   * The offset parameter supplied in the request.
   * @return offset
  **/
  @ApiModelProperty(example = "20", value = "The offset parameter supplied in the request.")
  public String getOffset() {
    return offset;
  }

   /**
   * The limit parameter supplied in the request.
   * @return limit
  **/
  @ApiModelProperty(example = "1", value = "The limit parameter supplied in the request.")
  public String getLimit() {
    return limit;
  }

   /**
   * The number of Payment Instruments returned in the array.
   * @return count
  **/
  @ApiModelProperty(example = "1", value = "The number of Payment Instruments returned in the array.")
  public String getCount() {
    return count;
  }

   /**
   * The total number of Payment Instruments associated with the Instrument Identifier in the zero-based dataset.
   * @return total
  **/
  @ApiModelProperty(example = "39", value = "The total number of Payment Instruments associated with the Instrument Identifier in the zero-based dataset.")
  public String getTotal() {
    return total;
  }

  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200Response embedded(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbedded getEmbedded() {
    return embedded;
  }

  public void setEmbedded(TmsV1InstrumentIdentifiersPaymentInstrumentsGet200ResponseEmbedded embedded) {
    this.embedded = embedded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsV1InstrumentIdentifiersPaymentInstrumentsGet200Response tmsV1InstrumentIdentifiersPaymentInstrumentsGet200Response = (TmsV1InstrumentIdentifiersPaymentInstrumentsGet200Response) o;
    return Objects.equals(this.links, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200Response.links) &&
        Objects.equals(this.object, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200Response.object) &&
        Objects.equals(this.offset, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200Response.offset) &&
        Objects.equals(this.limit, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200Response.limit) &&
        Objects.equals(this.count, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200Response.count) &&
        Objects.equals(this.total, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200Response.total) &&
        Objects.equals(this.embedded, tmsV1InstrumentIdentifiersPaymentInstrumentsGet200Response.embedded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, object, offset, limit, count, total, embedded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsV1InstrumentIdentifiersPaymentInstrumentsGet200Response {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
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

