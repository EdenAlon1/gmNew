package defpackage;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhys extends fhyt {
    @Override // defpackage.fhyt
    public final fhqo a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            byte[] bArr = ASN1OctetString.f(subjectPublicKeyInfo.a()).c;
            return new fhxx(fhyy.J(subjectPublicKeyInfo.a.a), fics.g(bArr, 4, bArr.length));
        } catch (Exception unused) {
            return new fhxx(fhyy.J(subjectPublicKeyInfo.a.a), subjectPublicKeyInfo.b.n());
        }
    }
}
