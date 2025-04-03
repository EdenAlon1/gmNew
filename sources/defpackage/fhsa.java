package defpackage;

import java.security.cert.CertificateEncodingException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhsa extends CertificateEncodingException {
    private final Throwable a;

    public fhsa(Throwable th) {
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
