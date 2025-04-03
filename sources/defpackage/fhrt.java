package defpackage;

import java.security.cert.CRLException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhrt extends CRLException {
    private final Throwable a;

    public fhrt(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }

    public fhrt(Throwable th) {
        this.a = th;
    }
}
