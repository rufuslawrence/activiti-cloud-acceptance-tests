/*
 * Copyright 2018 Alfresco, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.cloud.qa.service;

import org.activiti.cloud.qa.model.modeling.Group;
import org.activiti.cloud.qa.rest.feign.FeignRestDataClient;

/**
 * Modeling groups service
 */
public interface ModelingGroupsService extends FeignRestDataClient<ModelingGroupsService, Group> {

    String PATH = "/v1/groups";

    @Override
    default Class<ModelingGroupsService> getType() {
        return ModelingGroupsService.class;
    }

    static ModelingGroupsService build(String baseUrl) {
        return FeignRestDataClient
                .builder()
                .target(ModelingGroupsService.class,
                        baseUrl + PATH);
    }
}
