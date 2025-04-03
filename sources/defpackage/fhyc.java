package defpackage;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhyc extends fhyt {
    static fhus b(fhuq fhuqVar, ASN1BitString aSN1BitString) {
        try {
            ASN1Primitive v = ASN1Primitive.v(aSN1BitString.n());
            if (!(v instanceof ASN1Sequence)) {
                return new fhus(fhuqVar, ASN1OctetString.f(v).c);
            }
            ASN1Sequence j = ASN1Sequence.j(v);
            return new fhus(fhuqVar, ASN1OctetString.f(j.h(0)).c, ASN1OctetString.f(j.h(1)).c);
        } catch (Exception unused) {
            return new fhus(fhuqVar, aSN1BitString.n());
        }
    }

    @Override // defpackage.fhyt
    public final fhqo a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return b(fhyy.y(subjectPublicKeyInfo.a.a), subjectPublicKeyInfo.b);
    }
}
