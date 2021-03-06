/*
 * Copyright 2017 Banco Bilbao Vizcaya Argentaria, S.A..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bbva.arq.devops.ae.mirrorgate.service;

import com.bbva.arq.devops.ae.mirrorgate.core.dto.BuildDTO;
import com.bbva.arq.devops.ae.mirrorgate.core.dto.BuildStats;
import com.bbva.arq.devops.ae.mirrorgate.core.utils.BuildStatus;
import com.bbva.arq.devops.ae.mirrorgate.model.Build;
import java.util.List;
import java.util.Map;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Continuous Integration build service.
 */
public interface BuildService {

    /**
     * Get the last build of a repository
     *
     * @param repo Repository URL
     * @return A Build
     */
    List<Build> getAllBranchesLastByReposName(List<String> repo);

    /**
     * Create a build from a request
     *
     * @param request Build request type
     * @return Id of the new Build
     */
    String createOrUpdate(BuildDTO request);

    /**
     * Get a list of builds by repoName and with timestamp after specified
     *
     * @param repoName
     * @param timestamp
     * @return
     */
    Map<BuildStatus, BuildStats> getBuildStatusStatsAfterTimestamp(List<String> repoName, long timestamp);

    BuildStats getStatsFromRepos(List<String> repoName);

}
