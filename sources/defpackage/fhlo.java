package defpackage;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhlo extends fhlk {
    private final Class b;
    private final Class c;

    public fhlo(Class cls, Class cls2, Class cls3) {
        super(cls);
        this.b = cls2;
        this.c = cls3;
    }

    @Override // defpackage.fhlk, defpackage.fhln
    public final X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        Object j = fhhl.j(sSLSocketFactory, this.c, "sslParameters");
        j.getClass();
        X509TrustManager x509TrustManager = (X509TrustManager) fhhl.j(j, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager == null ? (X509TrustManager) fhhl.j(j, X509TrustManager.class, "trustManager") : x509TrustManager;
    }

    @Override // defpackage.fhlk, defpackage.fhln
    public final boolean f(SSLSocketFactory sSLSocketFactory) {
        return this.b.isInstance(sSLSocketFactory);
    }
}
