package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface fhln {
    String a(SSLSocket sSLSocket);

    X509TrustManager b(SSLSocketFactory sSLSocketFactory);

    void c(SSLSocket sSLSocket, String str, List list);

    boolean d();

    boolean e(SSLSocket sSLSocket);

    boolean f(SSLSocketFactory sSLSocketFactory);
}
