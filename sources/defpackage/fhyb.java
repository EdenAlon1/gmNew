package defpackage;

import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhyb extends fhyt {
    @Override // defpackage.fhyt
    public final fhqo a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            return new fhuj(fhyy.x(subjectPublicKeyInfo.a.a), fhtk.a(subjectPublicKeyInfo.a()).b());
        } catch (Exception unused) {
            return new fhuj(fhyy.x(subjectPublicKeyInfo.a.a), subjectPublicKeyInfo.b.n());
        }
    }
}
