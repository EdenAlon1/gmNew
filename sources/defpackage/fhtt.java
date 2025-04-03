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
public final class fhtt extends ASN1Object {
    private final byte[] a;
    private final byte[] b;

    public fhtt(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final byte[] a() {
        return fics.c(this.b);
    }

    public final byte[] b() {
        return fics.c(this.a);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(new DEROctetString(this.a));
        aSN1EncodableVector.b(new DEROctetString(this.b));
        return new DERSequence(aSN1EncodableVector);
    }

    public fhtt(ASN1Sequence aSN1Sequence) {
        this.a = fics.c(ASN1OctetString.f(aSN1Sequence.h(0)).c);
        this.b = fics.c(ASN1OctetString.f(aSN1Sequence.h(1)).c);
    }
}
