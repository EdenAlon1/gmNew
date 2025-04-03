package org.bouncycastle.asn1;

import defpackage.fics;
import defpackage.ficz;
import java.math.BigInteger;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ASN1Integer extends ASN1Primitive {
    static final ASN1UniversalType a = new ASN1UniversalType(ASN1Integer.class) { // from class: org.bouncycastle.asn1.ASN1Integer.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive a(DEROctetString dEROctetString) {
            return new ASN1Integer(dEROctetString.c);
        }
    };
    public final byte[] b;
    public final int c;

    public ASN1Integer(long j) {
        this.b = BigInteger.valueOf(j).toByteArray();
        this.c = 0;
    }

    public static int e(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        int max = Math.max(i, length - 4);
        int i3 = i2 & bArr[max];
        while (true) {
            max++;
            if (max >= length) {
                return i3;
            }
            i3 = (i3 << 8) | (bArr[max] & PrivateKeyType.INVALID);
        }
    }

    static int g(byte[] bArr) {
        int length = bArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            }
            i = i2;
        }
        return i;
    }

    public static ASN1Integer m(Object obj) {
        if (obj == null || (obj instanceof ASN1Integer)) {
            return (ASN1Integer) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
        try {
            return (ASN1Integer) a.c((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: ".concat(String.valueOf(e.toString())));
        }
    }

    public static ASN1Integer n(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1Integer) a.d(aSN1TaggedObject, z);
    }

    static boolean r(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || ficz.b("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return ASN1OutputStream.b(z, this.b.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.j(z, 2, this.b);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1Integer) {
            return Arrays.equals(this.b, ((ASN1Integer) aSN1Primitive).b);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return false;
    }

    public final int f() {
        byte[] bArr = this.b;
        int length = bArr.length;
        int i = this.c;
        if (length - i <= 4) {
            return e(bArr, i, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    public final long h() {
        byte[] bArr = this.b;
        int length = bArr.length;
        int i = this.c;
        if (length - i > 8) {
            throw new ArithmeticException("ASN.1 Integer out of long range");
        }
        int max = Math.max(i, length - 8);
        long j = bArr[max];
        while (true) {
            max++;
            if (max >= length) {
                return j;
            }
            j = (j << 8) | (bArr[max] & 255);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return fics.a(this.b);
    }

    public final BigInteger i() {
        return new BigInteger(1, this.b);
    }

    public final BigInteger j() {
        return new BigInteger(this.b);
    }

    public final boolean o(int i) {
        byte[] bArr = this.b;
        int length = bArr.length;
        int i2 = this.c;
        return length - i2 <= 4 && e(bArr, i2, -1) == i;
    }

    public final boolean q(BigInteger bigInteger) {
        return bigInteger != null && e(this.b, this.c, -1) == bigInteger.intValue() && j().equals(bigInteger);
    }

    public final String toString() {
        return j().toString();
    }

    public ASN1Integer(BigInteger bigInteger) {
        this.b = bigInteger.toByteArray();
        this.c = 0;
    }

    public ASN1Integer(byte[] bArr) {
        if (!r(bArr)) {
            this.b = bArr;
            this.c = g(bArr);
            return;
        }
        throw new IllegalArgumentException("malformed integer");
    }
}
