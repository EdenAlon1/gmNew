package defpackage;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhye extends fhyt {
    @Override // defpackage.fhyt
    public final fhqo a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return new fhvj(fhyy.B(subjectPublicKeyInfo.a.a), ASN1OctetString.f(subjectPublicKeyInfo.a()).c);
    }
}
