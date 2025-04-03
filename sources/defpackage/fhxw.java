package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhxw extends fhxr {
    final fhxp c;
    public final fhxo d;

    public fhxw(fhxv fhxvVar, byte[] bArr) {
        super(true, fhxvVar);
        int a = fhxvVar.a();
        int i = a * 4;
        if (bArr.length != i) {
            throw new IllegalArgumentException("private key encoding does not match parameters");
        }
        int i2 = a + a;
        this.c = new fhxp(fics.g(bArr, 0, a), fics.g(bArr, a, i2));
        int i3 = a * 3;
        this.d = new fhxo(fics.g(bArr, i2, i3), fics.g(bArr, i3, i));
    }

    public final byte[] a() {
        fhxp fhxpVar = this.c;
        byte[] bArr = fhxpVar.a;
        byte[] bArr2 = fhxpVar.b;
        fhxo fhxoVar = this.d;
        return fics.d(new byte[][]{bArr, bArr2, fhxoVar.a, fhxoVar.b});
    }

    public fhxw(fhxv fhxvVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, fhxvVar);
        this.c = new fhxp(bArr, bArr2);
        this.d = new fhxo(bArr3, bArr4);
    }
}
