package defpackage;

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
public final class fhtj extends ASN1Object {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    private final int f;
    private fhtk g;

    public fhtj(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, fhtk fhtkVar) {
        this.f = 0;
        this.a = fics.c(bArr);
        this.b = fics.c(bArr2);
        this.c = fics.c(bArr3);
        this.d = fics.c(bArr4);
        this.e = fics.c(bArr5);
        this.g = fhtkVar;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(new ASN1Integer(this.f));
        aSN1EncodableVector.b(new DEROctetString(this.a));
        aSN1EncodableVector.b(new DEROctetString(this.b));
        aSN1EncodableVector.b(new DEROctetString(this.c));
        aSN1EncodableVector.b(new DEROctetString(this.d));
        aSN1EncodableVector.b(new DEROctetString(this.e));
        fhtk fhtkVar = this.g;
        if (fhtkVar != null) {
            aSN1EncodableVector.b(new fhtk(fhtkVar.b()));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public fhtj(ASN1Sequence aSN1Sequence) {
        int f = ASN1Integer.m(aSN1Sequence.h(0)).f();
        this.f = f;
        if (f == 0) {
            this.a = fics.c(ASN1OctetString.f(aSN1Sequence.h(1)).c);
            this.b = fics.c(ASN1OctetString.f(aSN1Sequence.h(2)).c);
            this.c = fics.c(ASN1OctetString.f(aSN1Sequence.h(3)).c);
            this.d = fics.c(ASN1OctetString.f(aSN1Sequence.h(4)).c);
            this.e = fics.c(ASN1OctetString.f(aSN1Sequence.h(5)).c);
            if (aSN1Sequence.e() == 7) {
                this.g = fhtk.a(aSN1Sequence.h(6));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("unrecognized version");
    }
}
