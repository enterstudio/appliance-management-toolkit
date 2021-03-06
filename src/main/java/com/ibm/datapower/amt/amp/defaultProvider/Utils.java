/**
 * Copyright 2014 IBM Corp.
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
 **/
package com.ibm.datapower.amt.amp.defaultProvider;

import org.apache.xmlbeans.impl.util.Base64;

import com.ibm.datapower.amt.Constants;
/**
 * Implements utility functions used in the default provider AMP client.
 * Provides conversion to/from Base64 Encoding (see RFC 3548).
 * 
 */
//* @version $Id: Utils.java,v 1.2 2010/08/23 21:20:28 burket Exp $

public class Utils {
    
    public static final String COPYRIGHT_2009_2010 = Constants.COPYRIGHT_2009_2010;
    
    static final String SCM_REVISION = "$Revision: 1.2 $"; //$NON-NLS-1$

    public static String encodeBase64(byte[] inputArray){

        return new String(Base64.encode(inputArray));
    
    }

    public static byte[] decodeBase64(byte[] inputArray){

        return Base64.decode(inputArray);

    }
}
