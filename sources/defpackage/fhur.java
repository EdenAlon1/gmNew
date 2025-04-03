package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhur extends fhup {
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;

    public fhur(fhuq fhuqVar, byte[] bArr, fhus fhusVar) {
        super(true, fhuqVar);
        fhuo fhuoVar = new fhuo(fhuqVar.d);
        this.c = fics.g(bArr, 0, 32);
        this.d = fics.g(bArr, 32, 64);
        this.e = fics.g(bArr, 64, 128);
        int i = (fhuoVar.c * fhuoVar.a) + 128;
        this.f = fics.g(bArr, 128, i);
        int i2 = (fhuoVar.b * fhuoVar.a) + i;
        this.g = fics.g(bArr, i, i2);
        this.h = fics.g(bArr, i2, (fhuoVar.b * 416) + i2);
        if (fhusVar != null) {
            this.i = fhusVar.b();
        } else {
            this.i = null;
        }
    }

    public fhur(fhuq fhuqVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        super(true, fhuqVar);
        this.c = fics.c(bArr);
        this.d = fics.c(bArr2);
        this.e = fics.c(bArr3);
        this.f = fics.c(bArr4);
        this.g = fics.c(bArr5);
        this.h = fics.c(bArr6);
        this.i = fics.c(bArr7);
    }
}
