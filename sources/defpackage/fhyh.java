package defpackage;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhyh extends fhyt {
    @Override // defpackage.fhyt
    public final fhqo a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        byte[] bArr = ASN1OctetString.f(subjectPublicKeyInfo.a()).c;
        if (ficw.a(bArr, 0) == 1) {
            return fhvz.a(fics.g(bArr, 4, bArr.length));
        }
        if (bArr.length == 64) {
            bArr = fics.g(bArr, 4, 64);
        }
        return fhvs.a(bArr);
    }
}
