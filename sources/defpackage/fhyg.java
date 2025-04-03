package defpackage;

import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhyg extends fhyt {
    @Override // defpackage.fhyt
    public final fhqo a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        fhux z = fhyy.z(subjectPublicKeyInfo.a.a);
        try {
            ASN1Primitive a = subjectPublicKeyInfo.a();
            fhtn fhtnVar = a != null ? new fhtn(ASN1Sequence.j(a)) : null;
            return new fhuz(z, fics.c(fhtnVar.a), fics.c(fhtnVar.b));
        } catch (Exception unused) {
            return new fhuz(z, subjectPublicKeyInfo.b.n());
        }
    }
}
