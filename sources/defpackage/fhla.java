package defpackage;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhla extends fhlc {
    public static final boolean a;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r0.intValue() >= 9) goto L13;
     */
    static {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto Ld
            java.lang.Integer r0 = defpackage.ffpc.g(r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1d
            int r0 = r0.intValue()
            r3 = 9
            if (r0 < r3) goto L1b
            goto L26
        L1b:
            r1 = r2
            goto L26
        L1d:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1b
            r0.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L1b
        L26:
            defpackage.fhla.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhla.<clinit>():void");
    }

    @Override // defpackage.fhlc
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (!ffkj.e(applicationProtocol, "")) {
                    return applicationProtocol;
                }
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }

    @Override // defpackage.fhlc
    public final X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }

    @Override // defpackage.fhlc
    public final void d(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) fhlb.a(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }
}
