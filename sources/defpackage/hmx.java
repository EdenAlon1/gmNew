package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmx extends hmy {
    public int b;
    public int d;
    public int f;
    public hmq[] a = new hmq[16];
    public int[] c = new int[16];
    public Object[] e = new Object[16];

    private static final int f(int i, int i2) {
        return ffmk.f(i + ffmk.g(i, 1024), i2);
    }

    public final void a() {
        this.b = 0;
        this.d = 0;
        ffdo.d(this.e, null, 0, this.f);
        this.f = 0;
    }

    public final void b(hep hepVar, hjv hjvVar, hjj hjjVar, hmr hmrVar) {
        if (e()) {
            hmv hmvVar = new hmv(this);
            while (true) {
                hmq b = hmvVar.b();
                hen b2 = b.b(hmvVar);
                hep hepVar2 = hepVar;
                hjv hjvVar2 = hjvVar;
                hjj hjjVar2 = hjjVar;
                hmr hmrVar2 = hmrVar;
                try {
                    b.a(hmvVar, hepVar2, hjvVar2, hjjVar2, hmrVar2);
                    if (hmvVar.a < hmvVar.d.b) {
                        hmq b3 = hmvVar.b();
                        hmvVar.b += b3.b;
                        hmvVar.c += b3.c;
                        int i = hmvVar.a + 1;
                        hmvVar.a = i;
                        if (i >= hmvVar.d.b) {
                            break;
                        }
                        hepVar = hepVar2;
                        hjvVar = hjvVar2;
                        hjjVar = hjjVar2;
                        hmrVar = hmrVar2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public final void c(hmq hmqVar) {
        int i = this.b;
        hmq[] hmqVarArr = this.a;
        if (i == hmqVarArr.length) {
            hmq[] hmqVarArr2 = new hmq[ffmk.g(i, 1024) + i];
            System.arraycopy(hmqVarArr, 0, hmqVarArr2, 0, i);
            this.a = hmqVarArr2;
        }
        int i2 = this.d + hmqVar.b;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i2 > length) {
            int[] iArr2 = new int[f(length, i2)];
            ffdo.l(iArr, iArr2, 0, 0, length);
            this.c = iArr2;
        }
        int i3 = this.f + hmqVar.c;
        Object[] objArr = this.e;
        int length2 = objArr.length;
        if (i3 > length2) {
            Object[] objArr2 = new Object[f(length2, i3)];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.e = objArr2;
        }
        hmq[] hmqVarArr3 = this.a;
        int i4 = this.b;
        this.b = i4 + 1;
        hmqVarArr3[i4] = hmqVar;
        this.d += hmqVar.b;
        this.f += hmqVar.c;
    }

    public final boolean d() {
        return this.b == 0;
    }

    public final boolean e() {
        return this.b != 0;
    }
}
