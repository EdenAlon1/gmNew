package defpackage;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhyp extends fhyt {
    @Override // defpackage.fhyt
    public final fhqo a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return new fhxi(fhyy.I(subjectPublicKeyInfo.a.a), ASN1OctetString.f(ASN1Sequence.j(subjectPublicKeyInfo.a()).h(0)).c);
    }
}
