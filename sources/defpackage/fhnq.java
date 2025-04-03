package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhnq {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public fhnq f;
    public fhnq g;

    public fhnq() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final fhnq a() {
        fhnq fhnqVar = this.f;
        fhnq fhnqVar2 = fhnqVar != this ? fhnqVar : null;
        fhnq fhnqVar3 = this.g;
        fhnqVar3.getClass();
        fhnqVar3.f = fhnqVar;
        fhnq fhnqVar4 = this.f;
        fhnqVar4.getClass();
        fhnqVar4.g = fhnqVar3;
        this.f = null;
        this.g = null;
        return fhnqVar2;
    }

    public final fhnq b() {
        this.d = true;
        return new fhnq(this.a, this.b, this.c, true);
    }

    public final void c(fhnq fhnqVar, int i) {
        if (!fhnqVar.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = fhnqVar.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (fhnqVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = fhnqVar.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = fhnqVar.a;
            ffdo.i(bArr, bArr, 0, i4, i2);
            i2 = fhnqVar.c - fhnqVar.b;
            fhnqVar.c = i2;
            fhnqVar.b = 0;
        }
        byte[] bArr2 = this.a;
        byte[] bArr3 = fhnqVar.a;
        int i5 = this.b;
        ffdo.i(bArr2, bArr3, i2, i5, i5 + i);
        fhnqVar.c += i;
        this.b += i;
    }

    public final void d(fhnq fhnqVar) {
        fhnqVar.g = this;
        fhnqVar.f = this.f;
        fhnq fhnqVar2 = this.f;
        fhnqVar2.getClass();
        fhnqVar2.g = fhnqVar;
        this.f = fhnqVar;
    }

    public fhnq(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }
}
