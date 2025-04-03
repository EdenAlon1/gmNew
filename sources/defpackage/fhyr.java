package defpackage;

import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhyr extends fhyt {
    @Override // defpackage.fhyt
    public final fhqo a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return new fhxn(subjectPublicKeyInfo.b.m(), fhyy.c(fhtr.a(subjectPublicKeyInfo.a.b)));
    }
}
