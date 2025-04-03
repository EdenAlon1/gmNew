package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhuy extends fhuw {
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;

    public fhuy(fhux fhuxVar, byte[] bArr) {
        super(true, fhuxVar);
        fhuv fhuvVar = new fhuv(fhuxVar.e);
        this.c = fics.g(bArr, 0, fhuvVar.b);
        int i = fhuvVar.b;
        this.f = fics.g(bArr, i, (fhuvVar.a + i) - 32);
        int i2 = i + (fhuvVar.a - 32);
        int i3 = i2 + 32;
        this.g = fics.g(bArr, i2, i3);
        int i4 = i2 + 64;
        this.d = fics.g(bArr, i3, i4);
        this.e = fics.g(bArr, i4, i2 + 96);
    }
}
