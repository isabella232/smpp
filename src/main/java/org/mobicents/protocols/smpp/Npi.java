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

package org.mobicents.protocols.smpp;

/**
 * Numbering plan indicator constants.
 * @version $Id: Npi.java 452 2009-01-15 16:56:36Z orank $
 * @since 0.4.0
 */
public class Npi {
    public static final int UNKNOWN = 0;
    public static final int E164 = 1;
    public static final int ISDN = E164;
    public static final int X121 = 3;
    public static final int TELEX = 4;
    public static final int LAND_MOBILE = 6;
    public static final int NATIONAL = 8;
    public static final int PRIVATE = 9;
    public static final int ERMES = 10;
    public static final int IP = 13;
    public static final int RESERVED_EXTN = 15;
    public static final int WAP_CLIENT_ID = 18;
}
