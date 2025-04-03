package defpackage;

import java.security.cert.CertificateException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhrg extends CertificateException {
    private final Throwable a;

    public fhrg(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
