package defpackage;

import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhlm implements fhln {
    private fhln a;
    private final fhlj b;

    public fhlm(fhlj fhljVar) {
        this.b = fhljVar;
    }

    private final synchronized fhln g(SSLSocket sSLSocket) {
        if (this.a == null && this.b.a(sSLSocket)) {
            Class<?> cls = sSLSocket.getClass();
            Class<?> cls2 = cls;
            while (cls2 != null && !ffkj.e(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    Objects.toString(cls);
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type ".concat(String.valueOf(cls)));
                }
            }
            cls2.getClass();
            this.a = new fhlk(cls2);
        }
        return this.a;
    }

    @Override // defpackage.fhln
    public final String a(SSLSocket sSLSocket) {
        fhln g = g(sSLSocket);
        if (g != null) {
            return g.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.fhln
    public final /* synthetic */ X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        return null;
    }

    @Override // defpackage.fhln
    public final void c(SSLSocket sSLSocket, String str, List list) {
        fhln g = g(sSLSocket);
        if (g != null) {
            g.c(sSLSocket, str, list);
        }
    }

    @Override // defpackage.fhln
    public final boolean d() {
        return true;
    }

    @Override // defpackage.fhln
    public final boolean e(SSLSocket sSLSocket) {
        return this.b.a(sSLSocket);
    }

    @Override // defpackage.fhln
    public final /* synthetic */ boolean f(SSLSocketFactory sSLSocketFactory) {
        return false;
    }
}
