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

package org.jetbrains.jet.jvm.compiler;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.jvm.compiler.AbstractCompileKotlinAgainstKotlinTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.GenerateTests}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/compileKotlinAgainstKotlin")
public class CompileKotlinAgainstKotlinTestGenerated extends AbstractCompileKotlinAgainstKotlinTest {
    public void testAllFilesPresentInCompileKotlinAgainstKotlin() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/compileKotlinAgainstKotlin"), "A.kt", true);
    }
    
    @TestMetadata("ClassObjectMember.A.kt")
    public void testClassObjectMember_A() throws Exception {
        doTest("compiler/testData/compileKotlinAgainstKotlin/ClassObjectMember.A.kt");
    }
    
    @TestMetadata("ConstructorVararg.A.kt")
    public void testConstructorVararg_A() throws Exception {
        doTest("compiler/testData/compileKotlinAgainstKotlin/ConstructorVararg.A.kt");
    }
    
    @TestMetadata("DefaultConstructor.A.kt")
    public void testDefaultConstructor_A() throws Exception {
        doTest("compiler/testData/compileKotlinAgainstKotlin/DefaultConstructor.A.kt");
    }
    
    @TestMetadata("ImportObject.A.kt")
    public void testImportObject_A() throws Exception {
        doTest("compiler/testData/compileKotlinAgainstKotlin/ImportObject.A.kt");
    }
    
    @TestMetadata("Simple.A.kt")
    public void testSimple_A() throws Exception {
        doTest("compiler/testData/compileKotlinAgainstKotlin/Simple.A.kt");
    }
    
}
