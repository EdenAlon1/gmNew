package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nie {
    public final ndu a;
    public niv d;
    public nia e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final String j;
    public boolean k;
    public final niu b = new niu();
    public final luv c = new luv();
    private final luv l = new luv(1);
    private final luv m = new luv();

    public nie(ndu nduVar, niv nivVar, nia niaVar, String str) {
        this.a = nduVar;
        this.d = nivVar;
        this.e = niaVar;
        this.j = str;
        e(nivVar, niaVar);
    }

    public final int a() {
        int i = !this.k ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
        return d() != null ? i | 1073741824 : i;
    }

    public final int b(int i, int i2) {
        luv luvVar;
        nit d = d();
        if (d == null) {
            return 0;
        }
        int i3 = d.d;
        if (i3 != 0) {
            luvVar = this.b.n;
        } else {
            byte[] bArr = d.e;
            int i4 = lvf.a;
            luv luvVar2 = this.m;
            int length = bArr.length;
            luvVar2.I(bArr, length);
            luvVar = this.m;
            i3 = length;
        }
        boolean c = this.b.c(this.f);
        boolean z = c || i2 != 0;
        luv luvVar3 = this.l;
        luvVar3.a[0] = (byte) ((true != z ? 0 : 128) | i3);
        luvVar3.K(0);
        this.a.n(this.l, 1, 1);
        this.a.n(luvVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!c) {
            this.c.G(8);
            luv luvVar4 = this.c;
            byte[] bArr2 = luvVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i2;
            bArr2[4] = (byte) ((i >> 24) & PrivateKeyType.INVALID);
            bArr2[5] = (byte) ((i >> 16) & PrivateKeyType.INVALID);
            bArr2[6] = (byte) ((i >> 8) & PrivateKeyType.INVALID);
            bArr2[7] = (byte) (i & PrivateKeyType.INVALID);
            this.a.n(luvVar4, 8, 1);
            return i3 + 9;
        }
        int i5 = i3 + 1;
        luv luvVar5 = this.b.n;
        int n = luvVar5.n();
        luvVar5.L(-2);
        int i6 = (n * 6) + 2;
        if (i2 != 0) {
            this.c.G(i6);
            byte[] bArr3 = this.c.a;
            luvVar5.F(bArr3, 0, i6);
            int i7 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i7 >> 8) & PrivateKeyType.INVALID);
            bArr3[3] = (byte) (i7 & PrivateKeyType.INVALID);
            luvVar5 = this.c;
        }
        this.a.n(luvVar5, i6, 1);
        return i5 + i6;
    }

    public final long c() {
        return !this.k ? this.d.c[this.f] : this.b.f[this.h];
    }

    public final nit d() {
        if (!this.k) {
            return null;
        }
        nia niaVar = this.b.a;
        int i = lvf.a;
        int i2 = niaVar.a;
        nit nitVar = this.b.m;
        if (nitVar == null) {
            nitVar = this.d.a.b(i2);
        }
        if (nitVar == null || !nitVar.a) {
            return null;
        }
        return nitVar;
    }

    public final void e(niv nivVar, nia niaVar) {
        this.d = nivVar;
        this.e = niaVar;
        lqb lqbVar = new lqb(nivVar.a.g);
        lqbVar.a(this.j);
        this.a.i(new lqc(lqbVar));
        f();
    }

    public final void f() {
        niu niuVar = this.b;
        niuVar.d = 0;
        niuVar.p = 0L;
        niuVar.q = false;
        niuVar.k = false;
        niuVar.o = false;
        niuVar.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.k = false;
    }

    public final boolean g() {
        this.f++;
        if (!this.k) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }
}
