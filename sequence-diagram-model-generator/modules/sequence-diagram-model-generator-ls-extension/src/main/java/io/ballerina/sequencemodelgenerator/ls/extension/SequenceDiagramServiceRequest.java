/*
 *  Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com) All Rights Reserved.
 *
 *  WSO2 LLC. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package io.ballerina.sequencemodelgenerator.ls.extension;

import io.ballerina.tools.text.LinePosition;
import io.ballerina.tools.text.LineRange;

/**
 * Represents the sequence diagram service request.
 *
 * @since 2201.8.5
 */
public class SequenceDiagramServiceRequest {
    private final String filePath;
    private final LinePosition startLine;
    private final LinePosition endLine;

    public SequenceDiagramServiceRequest(String filePath, LinePosition startLine, LinePosition endLine) {
        this.filePath = filePath;
        this.startLine = startLine;
        this.endLine = endLine;
    }

    public String getFilePath() {
        return filePath;
    }

    public LineRange getLineRange() {
        LineRange lineRange = LineRange.from(filePath, startLine, endLine);
        return lineRange;
    }
}
