package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class BEROctetString extends ASN1OctetString {
    private final ASN1OctetString[] d;

    public BEROctetString(byte[] bArr, ASN1OctetString[] aSN1OctetStringArr) {
        super(bArr);
        this.d = aSN1OctetStringArr;
    }

    static byte[] h(ASN1OctetString[] aSN1OctetStringArr) {
        int length = aSN1OctetStringArr.length;
        if (length == 0) {
            return b;
        }
        if (length == 1) {
            return aSN1OctetStringArr[0].c;
        }
        int i = 0;
        for (ASN1OctetString aSN1OctetString : aSN1OctetStringArr) {
            i += aSN1OctetString.c.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (ASN1OctetString aSN1OctetString2 : aSN1OctetStringArr) {
            byte[] bArr2 = aSN1OctetString2.c;
            int length2 = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i2, length2);
            i2 += length2;
        }
        return bArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        int i = true != z ? 3 : 4;
        if (this.d == null) {
            int length = this.c.length;
            int i2 = length / 1000;
            int h = i + (DEROctetString.h(1000) * i2);
            int i3 = length - (i2 * 1000);
            return i3 > 0 ? h + DEROctetString.h(i3) : h;
        }
        int i4 = 0;
        while (true) {
            ASN1OctetString[] aSN1OctetStringArr = this.d;
            if (i4 >= aSN1OctetStringArr.length) {
                return i;
            }
            i += aSN1OctetStringArr[i4].a(true);
            i4++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.m(z, 36);
        aSN1OutputStream.f(128);
        ASN1OctetString[] aSN1OctetStringArr = this.d;
        if (aSN1OctetStringArr == null) {
            int i = 0;
            while (true) {
                int length = this.c.length;
                if (i >= length) {
                    break;
                }
                int min = Math.min(length - i, 1000);
                aSN1OutputStream.k(true, 4, this.c, i, min);
                i += min;
            }
        } else {
            aSN1OutputStream.n(aSN1OctetStringArr);
        }
        aSN1OutputStream.f(0);
        aSN1OutputStream.f(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return true;
    }

    public BEROctetString(ASN1OctetString[] aSN1OctetStringArr) {
        this(h(aSN1OctetStringArr), aSN1OctetStringArr);
    }
}
