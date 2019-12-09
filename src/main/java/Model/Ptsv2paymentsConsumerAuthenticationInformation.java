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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsConsumerAuthenticationInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-09T12:23:03.938+05:30")
public class Ptsv2paymentsConsumerAuthenticationInformation {
  @SerializedName("cavv")
  private String cavv = null;

  @SerializedName("cavvAlgorithm")
  private String cavvAlgorithm = null;

  @SerializedName("eciRaw")
  private String eciRaw = null;

  @SerializedName("paresStatus")
  private String paresStatus = null;

  @SerializedName("veresEnrolled")
  private String veresEnrolled = null;

  @SerializedName("xid")
  private String xid = null;

  @SerializedName("ucafAuthenticationData")
  private String ucafAuthenticationData = null;

  @SerializedName("ucafCollectionIndicator")
  private String ucafCollectionIndicator = null;

  public Ptsv2paymentsConsumerAuthenticationInformation cavv(String cavv) {
    this.cavv = cavv;
    return this;
  }

   /**
   * Cardholder authentication verification value (CAVV).
   * @return cavv
  **/
  @ApiModelProperty(value = "Cardholder authentication verification value (CAVV).")
  public String getCavv() {
    return cavv;
  }

  public void setCavv(String cavv) {
    this.cavv = cavv;
  }

  public Ptsv2paymentsConsumerAuthenticationInformation cavvAlgorithm(String cavvAlgorithm) {
    this.cavvAlgorithm = cavvAlgorithm;
    return this;
  }

   /**
   * Algorithm used to generate the CAVV for Visa Secure or the UCAF authentication data for Mastercard Identity Check. 
   * @return cavvAlgorithm
  **/
  @ApiModelProperty(value = "Algorithm used to generate the CAVV for Visa Secure or the UCAF authentication data for Mastercard Identity Check. ")
  public String getCavvAlgorithm() {
    return cavvAlgorithm;
  }

  public void setCavvAlgorithm(String cavvAlgorithm) {
    this.cavvAlgorithm = cavvAlgorithm;
  }

  public Ptsv2paymentsConsumerAuthenticationInformation eciRaw(String eciRaw) {
    this.eciRaw = eciRaw;
    return this;
  }

   /**
   * Raw electronic commerce indicator (ECI).  For details, see &#x60;eci_raw&#x60; request field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return eciRaw
  **/
  @ApiModelProperty(value = "Raw electronic commerce indicator (ECI).  For details, see `eci_raw` request field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getEciRaw() {
    return eciRaw;
  }

  public void setEciRaw(String eciRaw) {
    this.eciRaw = eciRaw;
  }

  public Ptsv2paymentsConsumerAuthenticationInformation paresStatus(String paresStatus) {
    this.paresStatus = paresStatus;
    return this;
  }

   /**
   * Payer authentication response status.  For details, see &#x60;pares_status&#x60; request field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return paresStatus
  **/
  @ApiModelProperty(value = "Payer authentication response status.  For details, see `pares_status` request field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getParesStatus() {
    return paresStatus;
  }

  public void setParesStatus(String paresStatus) {
    this.paresStatus = paresStatus;
  }

  public Ptsv2paymentsConsumerAuthenticationInformation veresEnrolled(String veresEnrolled) {
    this.veresEnrolled = veresEnrolled;
    return this;
  }

   /**
   * Verification response enrollment status.  For details, see &#x60;veres_enrolled&#x60; request field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return veresEnrolled
  **/
  @ApiModelProperty(value = "Verification response enrollment status.  For details, see `veres_enrolled` request field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getVeresEnrolled() {
    return veresEnrolled;
  }

  public void setVeresEnrolled(String veresEnrolled) {
    this.veresEnrolled = veresEnrolled;
  }

  public Ptsv2paymentsConsumerAuthenticationInformation xid(String xid) {
    this.xid = xid;
    return this;
  }

   /**
   * Transaction identifier.  For details, see &#x60;xid&#x60; request field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return xid
  **/
  @ApiModelProperty(value = "Transaction identifier.  For details, see `xid` request field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getXid() {
    return xid;
  }

  public void setXid(String xid) {
    this.xid = xid;
  }

  public Ptsv2paymentsConsumerAuthenticationInformation ucafAuthenticationData(String ucafAuthenticationData) {
    this.ucafAuthenticationData = ucafAuthenticationData;
    return this;
  }

   /**
   * Universal cardholder authentication field (UCAF) data.  For details, see &#x60;ucaf_authentication_data&#x60; request field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return ucafAuthenticationData
  **/
  @ApiModelProperty(value = "Universal cardholder authentication field (UCAF) data.  For details, see `ucaf_authentication_data` request field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getUcafAuthenticationData() {
    return ucafAuthenticationData;
  }

  public void setUcafAuthenticationData(String ucafAuthenticationData) {
    this.ucafAuthenticationData = ucafAuthenticationData;
  }

  public Ptsv2paymentsConsumerAuthenticationInformation ucafCollectionIndicator(String ucafCollectionIndicator) {
    this.ucafCollectionIndicator = ucafCollectionIndicator;
    return this;
  }

   /**
   * Universal cardholder authentication field (UCAF) collection indicator.  For details, see &#x60;ucaf_collection_indicator&#x60; request field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  #### CyberSource through VisaNet The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCR7 - Position: 5 - Field: Mastercard Electronic Commerce Indicators—UCAF Collection Indicator 
   * @return ucafCollectionIndicator
  **/
  @ApiModelProperty(value = "Universal cardholder authentication field (UCAF) collection indicator.  For details, see `ucaf_collection_indicator` request field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  #### CyberSource through VisaNet The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP01 TCR7 - Position: 5 - Field: Mastercard Electronic Commerce Indicators—UCAF Collection Indicator ")
  public String getUcafCollectionIndicator() {
    return ucafCollectionIndicator;
  }

  public void setUcafCollectionIndicator(String ucafCollectionIndicator) {
    this.ucafCollectionIndicator = ucafCollectionIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsConsumerAuthenticationInformation ptsv2paymentsConsumerAuthenticationInformation = (Ptsv2paymentsConsumerAuthenticationInformation) o;
    return Objects.equals(this.cavv, ptsv2paymentsConsumerAuthenticationInformation.cavv) &&
        Objects.equals(this.cavvAlgorithm, ptsv2paymentsConsumerAuthenticationInformation.cavvAlgorithm) &&
        Objects.equals(this.eciRaw, ptsv2paymentsConsumerAuthenticationInformation.eciRaw) &&
        Objects.equals(this.paresStatus, ptsv2paymentsConsumerAuthenticationInformation.paresStatus) &&
        Objects.equals(this.veresEnrolled, ptsv2paymentsConsumerAuthenticationInformation.veresEnrolled) &&
        Objects.equals(this.xid, ptsv2paymentsConsumerAuthenticationInformation.xid) &&
        Objects.equals(this.ucafAuthenticationData, ptsv2paymentsConsumerAuthenticationInformation.ucafAuthenticationData) &&
        Objects.equals(this.ucafCollectionIndicator, ptsv2paymentsConsumerAuthenticationInformation.ucafCollectionIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cavv, cavvAlgorithm, eciRaw, paresStatus, veresEnrolled, xid, ucafAuthenticationData, ucafCollectionIndicator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsConsumerAuthenticationInformation {\n");
    
    sb.append("    cavv: ").append(toIndentedString(cavv)).append("\n");
    sb.append("    cavvAlgorithm: ").append(toIndentedString(cavvAlgorithm)).append("\n");
    sb.append("    eciRaw: ").append(toIndentedString(eciRaw)).append("\n");
    sb.append("    paresStatus: ").append(toIndentedString(paresStatus)).append("\n");
    sb.append("    veresEnrolled: ").append(toIndentedString(veresEnrolled)).append("\n");
    sb.append("    xid: ").append(toIndentedString(xid)).append("\n");
    sb.append("    ucafAuthenticationData: ").append(toIndentedString(ucafAuthenticationData)).append("\n");
    sb.append("    ucafCollectionIndicator: ").append(toIndentedString(ucafCollectionIndicator)).append("\n");
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

