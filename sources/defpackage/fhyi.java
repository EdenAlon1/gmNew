package defpackage;

import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhyi extends fhyt {
    @Override // defpackage.fhyt
    public final fhqo a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        ASN1Primitive a = subjectPublicKeyInfo.a();
        fhtp fhtpVar = a != null ? new fhtp(ASN1Sequence.j(a)) : null;
        return new fice(fhtpVar.a, fhtpVar.b, fhtpVar.c, fhyy.b(fhtpVar.d.a));
    }
}
