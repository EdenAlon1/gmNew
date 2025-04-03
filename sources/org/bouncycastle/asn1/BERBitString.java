package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class BERBitString extends ASN1BitString {
    private final ASN1BitString[] c;

    public BERBitString(byte[] bArr, int i) {
        super(bArr, i);
        this.c = null;
    }

    static byte[] q(ASN1BitString[] aSN1BitStringArr) {
        int length = aSN1BitStringArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return aSN1BitStringArr[0].b;
        }
        int i = length - 1;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (aSN1BitStringArr[i3].b[0] != 0) {
                throw new IllegalArgumentException("only the last nested bitstring can have padding");
            }
            i2 += r6.length - 1;
        }
        byte[] bArr = aSN1BitStringArr[i].b;
        byte b = bArr[0];
        byte[] bArr2 = new byte[i2 + bArr.length];
        bArr2[0] = b;
        int i4 = 1;
        for (ASN1BitString aSN1BitString : aSN1BitStringArr) {
            byte[] bArr3 = aSN1BitString.b;
            int length2 = bArr3.length - 1;
            System.arraycopy(bArr3, 1, bArr2, i4, length2);
            i4 += length2;
        }
        return bArr2;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        if (!d()) {
            int length = this.b.length;
            int i = DLBitString.c;
            return ASN1OutputStream.b(z, length);
        }
        int i2 = true != z ? 3 : 4;
        if (this.c == null) {
            int length2 = this.b.length;
            if (length2 < 2) {
                return i2;
            }
            int i3 = DLBitString.c;
            int i4 = (length2 - 2) / 999;
            return i2 + (ASN1OutputStream.b(true, 1000) * i4) + ASN1OutputStream.b(true, this.b.length - (i4 * 999));
        }
        int i5 = 0;
        while (true) {
            ASN1BitString[] aSN1BitStringArr = this.c;
            if (i5 >= aSN1BitStringArr.length) {
                return i2;
            }
            i2 += aSN1BitStringArr[i5].a(true);
            i5++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        if (!d()) {
            byte[] bArr = this.b;
            int length = bArr.length;
            int i = DLBitString.c;
            aSN1OutputStream.k(z, 3, bArr, 0, length);
            return;
        }
        aSN1OutputStream.m(z, 35);
        aSN1OutputStream.f(128);
        ASN1BitString[] aSN1BitStringArr = this.c;
        if (aSN1BitStringArr != null) {
            aSN1OutputStream.n(aSN1BitStringArr);
        } else {
            byte[] bArr2 = this.b;
            int length2 = bArr2.length;
            if (length2 >= 2) {
                byte b = bArr2[0];
                int i2 = length2 - 1;
                while (i2 > 999) {
                    DLBitString.q(aSN1OutputStream, (byte) 0, this.b, length2 - i2, 999);
                    i2 -= 999;
                }
                DLBitString.q(aSN1OutputStream, b, this.b, length2 - i2, i2);
            }
        }
        aSN1OutputStream.f(0);
        aSN1OutputStream.f(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return this.c != null || this.b.length > 1000;
    }

    public BERBitString(ASN1BitString[] aSN1BitStringArr) {
        super(q(aSN1BitStringArr));
        this.c = aSN1BitStringArr;
    }
}
