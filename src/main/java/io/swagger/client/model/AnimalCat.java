/**
 * Swagger-Codegen
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2017-03-10T06:49:33Z
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.client.model;

import io.swagger.client.model.Animal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class AnimalCat  {
  
  @SerializedName("name")
  private String name = null;
  public enum HuntingSkillEnum {
     lazy,  aggressive, 
  };
  @SerializedName("huntingSkill")
  private HuntingSkillEnum huntingSkill = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public HuntingSkillEnum getHuntingSkill() {
    return huntingSkill;
  }
  public void setHuntingSkill(HuntingSkillEnum huntingSkill) {
    this.huntingSkill = huntingSkill;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimalCat animalCat = (AnimalCat) o;
    return (name == null ? animalCat.name == null : name.equals(animalCat.name)) &&
        (huntingSkill == null ? animalCat.huntingSkill == null : huntingSkill.equals(animalCat.huntingSkill));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (huntingSkill == null ? 0: huntingSkill.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimalCat {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  huntingSkill: ").append(huntingSkill).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
