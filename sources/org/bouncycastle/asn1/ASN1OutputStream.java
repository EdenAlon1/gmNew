package org.bouncycastle.asn1;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ASN1OutputStream {
    private final OutputStream a;

    public ASN1OutputStream(OutputStream outputStream) {
        this.a = outputStream;
    }

    static int a(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    static int b(boolean z, int i) {
        return (z ? 1 : 0) + a(i) + i;
    }

    static int c(int i) {
        if (i < 31) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 7;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public DEROutputStream d() {
        return new DEROutputStream(this.a);
    }

    public DLOutputStream e() {
        return new DLOutputStream(this.a);
    }

    final void f(int i) {
        this.a.write(i);
    }

    final void g(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }

    final void h(int i) {
        if (i < 128) {
            f(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i3 = i2 - 1;
            bArr[i3] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                int i4 = i2 - 2;
                bArr[i4] = (byte) ((5 - i3) | 128);
                g(bArr, i4, 6 - i3);
                return;
            }
            i2 = i3;
        }
    }

    public void i(ASN1Encodable[] aSN1EncodableArr) {
        for (ASN1Encodable aSN1Encodable : aSN1EncodableArr) {
            aSN1Encodable.p().b(this, true);
        }
    }

    final void j(boolean z, int i, byte[] bArr) {
        m(z, i);
        int length = bArr.length;
        h(length);
        g(bArr, 0, length);
    }

    final void k(boolean z, int i, byte[] bArr, int i2, int i3) {
        m(z, i);
        h(i3);
        g(bArr, i2, i3);
    }

    final void l(boolean z, int i, ASN1Encodable[] aSN1EncodableArr) {
        m(z, i);
        f(128);
        i(aSN1EncodableArr);
        f(0);
        f(0);
    }

    final void m(boolean z, int i) {
        if (z) {
            f(i);
        }
    }

    public void n(ASN1Primitive[] aSN1PrimitiveArr) {
        for (ASN1Primitive aSN1Primitive : aSN1PrimitiveArr) {
            aSN1Primitive.b(this, true);
        }
    }

    final void o(int i, int i2) {
        if (i2 < 31) {
            f(i | i2);
            return;
        }
        byte[] bArr = new byte[6];
        int i3 = 5;
        bArr[5] = (byte) (i2 & 127);
        while (true) {
            i3--;
            if (i2 <= 127) {
                bArr[i3] = (byte) (i | 31);
                g(bArr, i3, 6 - i3);
                return;
            } else {
                i2 >>>= 7;
                bArr[i3] = (byte) ((i2 & 127) | 128);
            }
        }
    }

    public void p(ASN1Primitive aSN1Primitive) {
        throw null;
    }
}
