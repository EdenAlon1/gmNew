package defpackage;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhme extends fhmb {
    private final fhmd a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fhme(java.net.URL r2, defpackage.fhgs r3) {
        /*
            r1 = this;
            fhmd r0 = new fhmd
            r0.<init>(r2, r3)
            r1.<init>(r0)
            r1.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhme.<init>(java.net.URL, fhgs):void");
    }

    @Override // defpackage.fhmb
    protected final fhge a() {
        fhmd fhmdVar = this.a;
        if (fhmdVar.f != null) {
            return fhmdVar.l;
        }
        throw new IllegalStateException("Connection has not yet been established");
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final HostnameVerifier getHostnameVerifier() {
        return this.a.a.t;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final SSLSocketFactory getSSLSocketFactory() {
        return this.a.a.a();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        fhmd fhmdVar = this.a;
        fhgr fhgrVar = new fhgr(fhmdVar.a);
        hostnameVerifier.getClass();
        if (!ffkj.e(hostnameVerifier, fhgrVar.r)) {
            fhgrVar.x = null;
        }
        fhgrVar.r = hostnameVerifier;
        fhmdVar.a = new fhgs(fhgrVar);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        if (sSLSocketFactory == null) {
            throw new IllegalArgumentException("sslSocketFactory == null");
        }
        fhmd fhmdVar = this.a;
        fhgr fhgrVar = new fhgr(fhmdVar.a);
        if (!ffkj.e(sSLSocketFactory, fhgrVar.n)) {
            fhgrVar.x = null;
        }
        fhgrVar.n = sSLSocketFactory;
        X509TrustManager b = fhlc.b.b(sSLSocketFactory);
        if (b != null) {
            fhgrVar.o = b;
            fhlc fhlcVar = fhlc.b;
            X509TrustManager x509TrustManager = fhgrVar.o;
            x509TrustManager.getClass();
            fhgrVar.t = fhlcVar.c(x509TrustManager);
            fhmdVar.a = new fhgs(fhgrVar);
            return;
        }
        Class<?> cls = sSLSocketFactory.getClass();
        throw new IllegalStateException("Unable to extract the trust manager on " + fhlc.b + ", sslSocketFactory is " + cls);
    }
}
