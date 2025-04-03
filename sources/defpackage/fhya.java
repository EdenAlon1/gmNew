package defpackage;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhya extends fhyt {
    @Override // defpackage.fhyt
    public final fhqo a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            return new fhud(fhyy.w(subjectPublicKeyInfo.a.a), ASN1OctetString.f(subjectPublicKeyInfo.a()).c);
        } catch (Exception unused) {
            return new fhud(fhyy.w(subjectPublicKeyInfo.a.a), subjectPublicKeyInfo.b.n());
        }
    }
}
