/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.protocols.smpp.encoding;

import java.io.UnsupportedEncodingException;

import org.mobicents.protocols.smpp.encoding.ASCIIEncoding;
import org.testng.annotations.Test;

/**
 * @version $Id:$
 */
@Test
public class ASCIIEncodingTest extends BaseAlphabetEncodingTest<ASCIIEncoding> {
    private static final String ALPHABET = 
        "\t\n\r!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWX"
        + "YZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";

    private static final int[] BYTES = {
        0x9, 0xa, 0xd, 0x21, 0x22, 0x23, 0x24, 0x25,
        0x26, 0x27, 0x28, 0x29, 0x2a, 0x2b, 0x2c, 0x2d,
        0x2e, 0x2f, 0x30, 0x31, 0x32, 0x33, 0x34, 0x35,
        0x36, 0x37, 0x38, 0x39, 0x3a, 0x3b, 0x3c, 0x3d,
        0x3e, 0x3f, 0x40, 0x41, 0x42, 0x43, 0x44, 0x45,
        0x46, 0x47, 0x48, 0x49, 0x4a, 0x4b, 0x4c, 0x4d,
        0x4e, 0x4f, 0x50, 0x51, 0x52, 0x53, 0x54, 0x55,
        0x56, 0x57, 0x58, 0x59, 0x5a, 0x5b, 0x5c, 0x5d,
        0x5e, 0x5f, 0x60, 0x61, 0x62, 0x63, 0x64, 0x65,
        0x66, 0x67, 0x68, 0x69, 0x6a, 0x6b, 0x6c, 0x6d,
        0x6e, 0x6f, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75,
        0x76, 0x77, 0x78, 0x79, 0x7a, 0x7b, 0x7c, 0x7d,
        0x7e, 
    };
    
    @Override
    protected TestData getArrayToDecode() {
        return new TestData(ALPHABET, BYTES);
    }

    @Override
    protected ASCIIEncoding getEncodingToTest() throws UnsupportedEncodingException {
        return new ASCIIEncoding();
    }

    @Override
    protected TestData getFullySupportedStringToEncode() {
        return new TestData(BYTES, ALPHABET);
    }

    @Override
    protected TestData getPartiallySupportedStringToEncode() {
        String string = "Unsupported character: \u00e9";
        int[] expectedBytes = new int[] {
                85, 110, 115, 117, 112, 112, 111, 114,
                116, 101, 100, 32, 99, 104, 97, 114,
                97, 99, 116, 101, 114, 58, 32, 63,
        };
        return new TestData(expectedBytes, string);
    }
}
