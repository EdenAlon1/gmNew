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
public final class fhtk extends ASN1Object {
    private final byte[] a;

    public fhtk(byte[] bArr) {
        this.a = bArr;
    }

    public static fhtk a(Object obj) {
        if (obj instanceof fhtk) {
            return (fhtk) obj;
        }
        if (obj != null) {
            return new fhtk(ASN1Sequence.j(obj));
        }
        return null;
    }

    public final byte[] b() {
        return fics.c(this.a);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(new DEROctetString(this.a));
        return new DERSequence(aSN1EncodableVector);
    }

    public fhtk(ASN1Sequence aSN1Sequence) {
        this.a = fics.c(ASN1OctetString.f(aSN1Sequence.h(0)).c);
    }
}
