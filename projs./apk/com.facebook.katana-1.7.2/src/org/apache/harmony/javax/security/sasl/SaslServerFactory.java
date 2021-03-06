// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SaslServerFactory.java

package org.apache.harmony.javax.security.sasl;

import java.util.Map;
import org.apache.harmony.javax.security.auth.callback.CallbackHandler;

// Referenced classes of package org.apache.harmony.javax.security.sasl:
//            SaslException, SaslServer

public interface SaslServerFactory
{

    public abstract SaslServer createSaslServer(String s, String s1, String s2, Map map, CallbackHandler callbackhandler)
        throws SaslException;

    public abstract String[] getMechanismNames(Map map);
}
