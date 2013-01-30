/*
 * Copyright 2010-2013 JetBrains s.r.o.
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

package org.jetbrains.jet.lang.resolve.lazy;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.lang.resolve.lazy.AbstractLazyResolveDescriptorRendererTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.GenerateTests}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/renderer")
public class LazyResolveDescriptorRendererTestGenerated extends AbstractLazyResolveDescriptorRendererTest {
    public void testAllFilesPresentInRenderer() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/renderer"), "kt", true);
    }
    
    @TestMetadata("Classes.kt")
    public void testClasses() throws Exception {
        doTest("compiler/testData/renderer/Classes.kt");
    }
    
    @TestMetadata("Enum.kt")
    public void testEnum() throws Exception {
        doTest("compiler/testData/renderer/Enum.kt");
    }
    
    @TestMetadata("ErrorType.kt")
    public void testErrorType() throws Exception {
        doTest("compiler/testData/renderer/ErrorType.kt");
    }
    
    @TestMetadata("FunctionTypes.kt")
    public void testFunctionTypes() throws Exception {
        doTest("compiler/testData/renderer/FunctionTypes.kt");
    }
    
    @TestMetadata("GlobalFunctions.kt")
    public void testGlobalFunctions() throws Exception {
        doTest("compiler/testData/renderer/GlobalFunctions.kt");
    }
    
    @TestMetadata("GlobalProperties.kt")
    public void testGlobalProperties() throws Exception {
        doTest("compiler/testData/renderer/GlobalProperties.kt");
    }
    
    @TestMetadata("InheritedMembersVisibility.kt")
    public void testInheritedMembersVisibility() throws Exception {
        doTest("compiler/testData/renderer/InheritedMembersVisibility.kt");
    }
    
    @TestMetadata("KeywordsInNames.kt")
    public void testKeywordsInNames() throws Exception {
        doTest("compiler/testData/renderer/KeywordsInNames.kt");
    }
    
    @TestMetadata("TupleTypes.kt")
    public void testTupleTypes() throws Exception {
        doTest("compiler/testData/renderer/TupleTypes.kt");
    }
    
}
