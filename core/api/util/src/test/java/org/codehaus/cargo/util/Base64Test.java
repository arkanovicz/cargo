/*
 * ========================================================================
 *
 * Codehaus CARGO, copyright 2004-2011 Vincent Massol, 2012-2018 Ali Tokmen.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ========================================================================
 */
package org.codehaus.cargo.util;

import java.security.MessageDigest;

import junit.framework.TestCase;

/**
 * Unit tests for {@link Base64}.
 */
public class Base64Test extends TestCase
{
    /**
     * Test Base64 encoding.
     */
    public void testEncode()
    {
        assertEquals("SGVsbG8gV29ybGQ=", Base64.encode("Hello World"));
    }
    
    /**
     * Test encoding a byte array derived from a SHA-256 calculation.
     * 
     * @throws Exception
     *             should not happen
     */
    public void testSHA256Encoding() throws Exception
    {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        Base64.encode(digest.digest("password".getBytes()));
    }
}
