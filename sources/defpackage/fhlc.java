package defpackage;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhlc {
    private static final Logger a;
    public static volatile fhlc b;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
    
        if (java.lang.Integer.parseInt(r0) >= 9) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    static {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhlc.<clinit>():void");
    }

    public static /* synthetic */ void m(fhlc fhlcVar, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        fhlcVar.l(str, i, null);
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        try {
            Class<?> cls = Class.forName("sun.security.ssl.SSLContextImpl");
            cls.getClass();
            Object j = fhhl.j(sSLSocketFactory, cls, "context");
            if (j == null) {
                return null;
            }
            return (X509TrustManager) fhhl.j(j, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (RuntimeException e) {
            if (!ffkj.e(e.getClass().getName(), "java.lang.reflect.InaccessibleObjectException")) {
                throw e;
            }
            return null;
        }
    }

    public fhlu c(X509TrustManager x509TrustManager) {
        return new fhls(f(x509TrustManager));
    }

    public boolean e(String str) {
        return true;
    }

    public fhlw f(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new fhlt((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void g(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.getClass();
        socket.connect(inetSocketAddress, i);
    }

    public void h(String str, Object obj) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        l(str, 5, (Throwable) obj);
    }

    public Object i() {
        if (a.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public final SSLSocketFactory k(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.getClass();
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            socketFactory.getClass();
            return socketFactory;
        } catch (GeneralSecurityException e) {
            e.toString();
            throw new AssertionError("No System TLS: ".concat(e.toString()), e);
        }
    }

    public final void l(String str, int i, Throwable th) {
        a.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        simpleName.getClass();
        return simpleName;
    }

    public void j(SSLSocket sSLSocket) {
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
    }
}
