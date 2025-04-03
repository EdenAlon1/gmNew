package defpackage;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhtn extends ASN1Object {
    public final byte[] a;
    public final byte[] b;

    public fhtn(ASN1Sequence aSN1Sequence) {
        this.a = fics.c(ASN1OctetString.f(aSN1Sequence.h(0)).c);
        this.b = fics.c(ASN1OctetString.f(aSN1Sequence.h(1)).c);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(new DEROctetString(this.a));
        aSN1EncodableVector.b(new DEROctetString(this.b));
        return new DERSequence(aSN1EncodableVector);
    }
}
