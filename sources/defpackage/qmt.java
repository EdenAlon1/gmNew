package defpackage;

import java.security.cert.X509Certificate;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qmt extends qmu {
    private final byte[] a;

    public qmt(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.a = bArr;
    }

    @Override // defpackage.qmu, java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.a;
    }
}
