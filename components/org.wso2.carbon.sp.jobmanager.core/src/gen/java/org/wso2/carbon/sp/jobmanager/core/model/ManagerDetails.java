/*
 *  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package org.wso2.carbon.sp.jobmanager.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaMSF4JServerCodegen",
                            date = "2018-02-05T14:14:09.496Z")
public class ManagerDetails {
    @JsonProperty("host")
    private String host = null;

    @JsonProperty("port")
    private Integer port = null;

    @JsonProperty("haStatus")
    private String haStatus = null;

    public ManagerDetails host(String host) {
        this.host = host;
        return this;
    }

    /**
     * Get host
     *
     * @return host
     **/
    @ApiModelProperty(required = true, value = "")
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public ManagerDetails port(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get port
     *
     * @return port
     **/
    @ApiModelProperty(required = true, value = "")
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public ManagerDetails haStatus(String haStatus) {
        this.haStatus = haStatus;
        return this;
    }

    /**
     * Get haStatus
     *
     * @return haStatus
     **/
    @ApiModelProperty(required = true, value = "")
    public String getHaStatus() {
        return haStatus;
    }

    public void setHaStatus(String haStatus) {
        this.haStatus = haStatus;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ManagerDetails managerDetails = (ManagerDetails) o;
        return Objects.equals(this.host, managerDetails.host) &&
                Objects.equals(this.port, managerDetails.port) &&
                Objects.equals(this.haStatus, managerDetails.haStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, port, haStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManagerDetails {\n");

        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    haStatus: ").append(toIndentedString(haStatus)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

