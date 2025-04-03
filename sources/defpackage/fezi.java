package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fezi {
    public final Provider c;
    public static final Logger a = Logger.getLogger(fezi.class.getName());
    private static final String[] d = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
    public static final fezi b = f();

    public fezi(Provider provider) {
        this.c = provider;
    }

    public static byte[] e(List list) {
        fhmt fhmtVar = new fhmt();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            fezj fezjVar = (fezj) list.get(i);
            if (fezjVar != fezj.HTTP_1_0) {
                fhmtVar.O(fezjVar.e.length());
                fhmtVar.aa(fezjVar.e);
            }
        }
        return fhmtVar.F();
    }

    private static fezi f() {
        Provider provider;
        int i;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i2 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                provider = null;
                break;
            }
            Provider provider2 = providers[i2];
            String[] strArr = d;
            int length2 = strArr.length;
            for (int i3 = 0; i3 < 5; i3++) {
                String str = strArr[i3];
                if (str.equals(provider2.getClass().getName())) {
                    a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Found registered provider {0}", str);
                    provider = provider2;
                    break loop0;
                }
            }
            i2++;
        }
        int i4 = 2;
        if (provider == null) {
            try {
                Provider provider3 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS", provider3);
                        sSLContext.init(null, null, null);
                        SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]).invoke(sSLContext.createSSLEngine(), new Object[0]);
                        return new fezf(provider3, SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
                    } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        return new fezi(provider3);
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException unused2) {
                    Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    return new fezg(cls.getMethod("put", SSLSocket.class, Class.forName(a.v("org.eclipse.jetty.alpn.ALPN", "$Provider"))), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName(a.v("org.eclipse.jetty.alpn.ALPN", "$ClientProvider")), Class.forName(a.v("org.eclipse.jetty.alpn.ALPN", "$ServerProvider")), provider3);
                }
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
        fezd fezdVar = new fezd(null, "setUseSessionTickets", Boolean.TYPE);
        fezd fezdVar2 = new fezd(null, "setHostname", String.class);
        fezd fezdVar3 = new fezd(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
        fezd fezdVar4 = new fezd(null, "setAlpnProtocols", byte[].class);
        try {
            Class<?> cls2 = Class.forName("android.net.TrafficStats");
            cls2.getMethod("tagSocket", Socket.class);
            cls2.getMethod("untagSocket", Socket.class);
        } catch (ClassNotFoundException | NoSuchMethodException unused3) {
        }
        if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
            try {
                fezi.class.getClassLoader().loadClass("android.net.Network");
            } catch (ClassNotFoundException e2) {
                a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid5", "Can't find class", (Throwable) e2);
                try {
                    fezi.class.getClassLoader().loadClass("android.app.ActivityOptions");
                } catch (ClassNotFoundException e3) {
                    a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid41", "Can't find class", (Throwable) e3);
                    i4 = 3;
                }
                i = i4;
            }
        }
        i = 1;
        return new feze(fezdVar, fezdVar2, fezdVar3, fezdVar4, provider, i);
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public int c() {
        return 3;
    }

    public void d(SSLSocket sSLSocket) {
    }

    public void b(SSLSocket sSLSocket, String str, List list) {
    }
}
