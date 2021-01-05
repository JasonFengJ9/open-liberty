/*******************************************************************************
 * Copyright (c) 2020 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package test.wssecfvt.sha2sig;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2013-03-08T14:54:04.831-06:00
 * Generated source version: 2.6.2
 *
 */
@WebService(targetNamespace = "http://sha2sig.wssecfvt.test", name = "Sha2SigAlg")
@XmlSeeAlso({ test.wssecfvt.sha2sig.types.ObjectFactory.class })
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Sha2SigAlg {

    @WebResult(name = "responseString", targetNamespace = "http://sha2sig.wssecfvt.test/types", partName = "getVersionReturn")
    @WebMethod
    public test.wssecfvt.sha2sig.types.ResponseString invoke(
                                                             @WebParam(partName = "getVersion", name = "requestString",
                                                                       targetNamespace = "http://sha2sig.wssecfvt.test/types") test.wssecfvt.sha2sig.types.RequestString getVersion);
}