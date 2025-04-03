package defpackage;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhts extends ASN1Object {
    public byte[] a;
    public byte[] b;
    public fhtt c;
    private final int d;

    public fhts(ASN1Sequence aSN1Sequence) {
        int f = ASN1Integer.m(aSN1Sequence.h(0)).f();
        this.d = f;
        if (f != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.a = fics.c(ASN1OctetString.f(aSN1Sequence.h(1)).c);
        this.b = fics.c(ASN1OctetString.f(aSN1Sequence.h(2)).c);
        if (aSN1Sequence.e() == 4) {
            ASN1Encodable h = aSN1Sequence.h(3);
            this.c = h instanceof fhtt ? (fhtt) h : h != null ? new fhtt(ASN1Sequence.j(h)) : null;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(new ASN1Integer(this.d));
        aSN1EncodableVector.b(new DEROctetString(this.a));
        aSN1EncodableVector.b(new DEROctetString(this.b));
        fhtt fhttVar = this.c;
        if (fhttVar != null) {
            aSN1EncodableVector.b(new fhtt(fhttVar.b(), this.c.a()));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
