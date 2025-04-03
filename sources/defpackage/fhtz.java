package defpackage;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhtz extends ASN1Object {
    private final byte[] a;
    private final byte[] b;

    private fhtz(ASN1Sequence aSN1Sequence) {
        if (!ASN1Integer.m(aSN1Sequence.h(0)).o(0)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.a = fics.c(DEROctetString.f(aSN1Sequence.h(1)).c);
        this.b = fics.c(DEROctetString.f(aSN1Sequence.h(2)).c);
    }

    public static fhtz a(Object obj) {
        if (obj != null) {
            return new fhtz(ASN1Sequence.j(obj));
        }
        return null;
    }

    public final byte[] b() {
        return fics.c(this.a);
    }

    public final byte[] c() {
        return fics.c(this.b);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(new ASN1Integer(0L));
        aSN1EncodableVector.b(new DEROctetString(this.a));
        aSN1EncodableVector.b(new DEROctetString(this.b));
        return new DERSequence(aSN1EncodableVector);
    }

    public fhtz(byte[] bArr, byte[] bArr2) {
        this.a = fics.c(bArr);
        this.b = fics.c(bArr2);
    }
}
