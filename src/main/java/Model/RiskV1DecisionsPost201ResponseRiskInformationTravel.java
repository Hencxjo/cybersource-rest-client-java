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
import Model.RiskV1DecisionsPost201ResponseRiskInformationTravelActualFinalDestination;
import Model.RiskV1DecisionsPost201ResponseRiskInformationTravelFirstDeparture;
import Model.RiskV1DecisionsPost201ResponseRiskInformationTravelFirstDestination;
import Model.RiskV1DecisionsPost201ResponseRiskInformationTravelLastDestination;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RiskV1DecisionsPost201ResponseRiskInformationTravel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-09T12:23:03.938+05:30")
public class RiskV1DecisionsPost201ResponseRiskInformationTravel {
  @SerializedName("actualFinalDestination")
  private RiskV1DecisionsPost201ResponseRiskInformationTravelActualFinalDestination actualFinalDestination = null;

  @SerializedName("firstDeparture")
  private RiskV1DecisionsPost201ResponseRiskInformationTravelFirstDeparture firstDeparture = null;

  @SerializedName("firstDestination")
  private RiskV1DecisionsPost201ResponseRiskInformationTravelFirstDestination firstDestination = null;

  @SerializedName("lastDestination")
  private RiskV1DecisionsPost201ResponseRiskInformationTravelLastDestination lastDestination = null;

  public RiskV1DecisionsPost201ResponseRiskInformationTravel actualFinalDestination(RiskV1DecisionsPost201ResponseRiskInformationTravelActualFinalDestination actualFinalDestination) {
    this.actualFinalDestination = actualFinalDestination;
    return this;
  }

   /**
   * Get actualFinalDestination
   * @return actualFinalDestination
  **/
  @ApiModelProperty(value = "")
  public RiskV1DecisionsPost201ResponseRiskInformationTravelActualFinalDestination getActualFinalDestination() {
    return actualFinalDestination;
  }

  public void setActualFinalDestination(RiskV1DecisionsPost201ResponseRiskInformationTravelActualFinalDestination actualFinalDestination) {
    this.actualFinalDestination = actualFinalDestination;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationTravel firstDeparture(RiskV1DecisionsPost201ResponseRiskInformationTravelFirstDeparture firstDeparture) {
    this.firstDeparture = firstDeparture;
    return this;
  }

   /**
   * Get firstDeparture
   * @return firstDeparture
  **/
  @ApiModelProperty(value = "")
  public RiskV1DecisionsPost201ResponseRiskInformationTravelFirstDeparture getFirstDeparture() {
    return firstDeparture;
  }

  public void setFirstDeparture(RiskV1DecisionsPost201ResponseRiskInformationTravelFirstDeparture firstDeparture) {
    this.firstDeparture = firstDeparture;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationTravel firstDestination(RiskV1DecisionsPost201ResponseRiskInformationTravelFirstDestination firstDestination) {
    this.firstDestination = firstDestination;
    return this;
  }

   /**
   * Get firstDestination
   * @return firstDestination
  **/
  @ApiModelProperty(value = "")
  public RiskV1DecisionsPost201ResponseRiskInformationTravelFirstDestination getFirstDestination() {
    return firstDestination;
  }

  public void setFirstDestination(RiskV1DecisionsPost201ResponseRiskInformationTravelFirstDestination firstDestination) {
    this.firstDestination = firstDestination;
  }

  public RiskV1DecisionsPost201ResponseRiskInformationTravel lastDestination(RiskV1DecisionsPost201ResponseRiskInformationTravelLastDestination lastDestination) {
    this.lastDestination = lastDestination;
    return this;
  }

   /**
   * Get lastDestination
   * @return lastDestination
  **/
  @ApiModelProperty(value = "")
  public RiskV1DecisionsPost201ResponseRiskInformationTravelLastDestination getLastDestination() {
    return lastDestination;
  }

  public void setLastDestination(RiskV1DecisionsPost201ResponseRiskInformationTravelLastDestination lastDestination) {
    this.lastDestination = lastDestination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1DecisionsPost201ResponseRiskInformationTravel riskV1DecisionsPost201ResponseRiskInformationTravel = (RiskV1DecisionsPost201ResponseRiskInformationTravel) o;
    return Objects.equals(this.actualFinalDestination, riskV1DecisionsPost201ResponseRiskInformationTravel.actualFinalDestination) &&
        Objects.equals(this.firstDeparture, riskV1DecisionsPost201ResponseRiskInformationTravel.firstDeparture) &&
        Objects.equals(this.firstDestination, riskV1DecisionsPost201ResponseRiskInformationTravel.firstDestination) &&
        Objects.equals(this.lastDestination, riskV1DecisionsPost201ResponseRiskInformationTravel.lastDestination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualFinalDestination, firstDeparture, firstDestination, lastDestination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1DecisionsPost201ResponseRiskInformationTravel {\n");
    
    sb.append("    actualFinalDestination: ").append(toIndentedString(actualFinalDestination)).append("\n");
    sb.append("    firstDeparture: ").append(toIndentedString(firstDeparture)).append("\n");
    sb.append("    firstDestination: ").append(toIndentedString(firstDestination)).append("\n");
    sb.append("    lastDestination: ").append(toIndentedString(lastDestination)).append("\n");
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

