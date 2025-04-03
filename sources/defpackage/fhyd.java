package defpackage;

import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhyd extends fhyt {
    @Override // defpackage.fhyt
    public final fhqo a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        byte[] n = subjectPublicKeyInfo.b.n();
        return new fhvf(fhyy.A(subjectPublicKeyInfo.a.a), fics.g(n, 1, n.length));
    }
}
