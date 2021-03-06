/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
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

package org.optaplanner.persistence.common.api.domain.solution;

import java.io.File;
import java.util.Arrays;

import org.optaplanner.core.api.domain.solution.Solution;
import org.optaplanner.core.impl.testdata.domain.TestdataEntity;
import org.optaplanner.core.impl.testdata.domain.TestdataSolution;
import org.optaplanner.core.impl.testdata.domain.TestdataValue;

public class TestdataSolutionFileIO implements SolutionFileIO {

    @Override
    public String getInputFileExtension() {
        return "txt";
    }

    @Override
    public String getOutputFileExtension() {
        return "txt";
    }

    @Override
    public Solution read(File inputSolutionFile) {
        TestdataSolution solution = new TestdataSolution("s1");
        solution.setValueList(Arrays.asList(new TestdataValue("v1")));
        solution.setEntityList(Arrays.asList(new TestdataEntity("e1")));
        return solution;
    }

    @Override
    public void write(Solution solution, File outputSolutionFile) {
        // Do nothing
    }

}
