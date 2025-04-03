package defpackage;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhyv extends fhyt {
    @Override // defpackage.fhyt
    public final fhqo a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        fhtv a = fhtv.a(subjectPublicKeyInfo.a.b);
        if (a == null) {
            byte[] bArr = ASN1OctetString.f(subjectPublicKeyInfo.a()).c;
            fhzx fhzxVar = new fhzx((fhzu) fhzu.a.get(Integer.valueOf(ficw.a(bArr, 0))));
            fhzxVar.d = fiai.g(bArr);
            return new fhzy(fhzxVar);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier = a.c.a;
        fhtz a2 = fhtz.a(subjectPublicKeyInfo.a());
        fhzx fhzxVar2 = new fhzx(new fhzu(a.a, a.b, fhyy.v(aSN1ObjectIdentifier)));
        fhzxVar2.c = fiai.g(a2.b());
        fhzxVar2.b = fiai.g(a2.c());
        return new fhzy(fhzxVar2);
    }
}
