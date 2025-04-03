package defpackage;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhzh {
    public final int a;
    private final fhqa b;

    protected fhzh(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i) {
        this.b = fhze.b(aSN1ObjectIdentifier);
        this.a = i;
    }

    protected final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.a) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == 32) {
            return b(3, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong address length");
    }

    public final byte[] b(int i, byte[] bArr, byte[] bArr2) {
        byte[] j = fiai.j(i, this.a);
        this.b.e(j, 0, j.length);
        this.b.e(bArr, 0, bArr.length);
        this.b.e(bArr2, 0, bArr2.length);
        fhqa fhqaVar = this.b;
        boolean z = fhqaVar instanceof fhqk;
        int i2 = this.a;
        byte[] bArr3 = new byte[i2];
        if (z) {
            ((fhqk) fhqaVar).l(bArr3, 0, i2);
            return bArr3;
        }
        fhqaVar.a(bArr3, 0);
        return bArr3;
    }
}
