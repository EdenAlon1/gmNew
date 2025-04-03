package defpackage;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhyu extends fhyt {
    @Override // defpackage.fhyt
    public final fhqo a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        fhtu a = fhtu.a(subjectPublicKeyInfo.a.b);
        if (a == null) {
            byte[] bArr = ASN1OctetString.f(subjectPublicKeyInfo.a()).c;
            fiaf fiafVar = new fiaf((fiac) fiac.a.get(Integer.valueOf(ficw.a(bArr, 0))));
            fiafVar.d = fiai.g(bArr);
            return new fiag(fiafVar);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier = a.b.a;
        fhtz a2 = fhtz.a(subjectPublicKeyInfo.a());
        fiaf fiafVar2 = new fiaf(new fiac(a.a, fhyy.v(aSN1ObjectIdentifier)));
        fiafVar2.c = fiai.g(a2.b());
        fiafVar2.b = fiai.g(a2.c());
        return new fiag(fiafVar2);
    }
}
