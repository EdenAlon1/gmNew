package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlf {
    public hle a;
    public boolean b;
    public int e;
    public int h;
    private final hfm i;
    private int j;
    public final hgx c = new hgx();
    public boolean d = true;
    private final ArrayList k = new ArrayList();
    private int l = -1;
    public int f = -1;
    public int g = -1;

    public hlf(hfm hfmVar, hle hleVar) {
        this.i = hfmVar;
        this.a = hleVar;
    }

    public final hjq a() {
        return this.i.s;
    }

    public final void b() {
        if (this.b) {
            j(false);
            j(false);
            this.a.c();
            this.b = false;
        }
    }

    public final void c(hle hleVar, hpz hpzVar) {
        hle hleVar2 = this.a;
        if (hleVar.e()) {
            hmx hmxVar = hleVar2.a;
            hmxVar.c(hlj.a);
            hmw.b(hmxVar, 0, hleVar, 1, hpzVar);
        }
    }

    public final void d(Object obj) {
        i();
        this.k.add(obj);
    }

    public final void e(int i) {
        this.e += i - a().f;
    }

    public final void f() {
        i();
        if (hkw.b(this.k)) {
            hkw.a(this.k);
        } else {
            this.j++;
        }
    }

    public final void g() {
        int i = this.j;
        if (i > 0) {
            hmx hmxVar = this.a.a;
            hmxVar.c(hmo.a);
            hmxVar.c[hmxVar.d - hmxVar.a[hmxVar.b - 1].b] = i;
            this.j = 0;
        }
        if (hkw.b(this.k)) {
            hle hleVar = this.a;
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = arrayList.get(i2);
            }
            if (size != 0) {
                hmx hmxVar2 = hleVar.a;
                hmxVar2.c(hlo.a);
                hmw.a(hmxVar2, 0, objArr);
            }
            this.k.clear();
        }
    }

    public final void h() {
        j(false);
        k();
    }

    public final void i() {
        int i = this.h;
        if (i > 0) {
            int i2 = this.l;
            if (i2 >= 0) {
                g();
                hmx hmxVar = this.a.a;
                hmxVar.c(hme.a);
                int i3 = hmxVar.d - hmxVar.a[hmxVar.b - 1].b;
                int[] iArr = hmxVar.c;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.l = -1;
            } else {
                int i4 = this.g;
                int i5 = this.f;
                g();
                hmx hmxVar2 = this.a.a;
                hmxVar2.c(hlz.a);
                int i6 = hmxVar2.d - hmxVar2.a[hmxVar2.b - 1].b;
                int[] iArr2 = hmxVar2.c;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.f = -1;
                this.g = -1;
            }
            this.h = 0;
        }
    }

    public final void j(boolean z) {
        int i = z ? a().h : a().f;
        int i2 = i - this.e;
        if (i2 < 0) {
            hfp.j("Tried to seek backward");
        }
        if (i2 > 0) {
            hmx hmxVar = this.a.a;
            hmxVar.c(hlh.a);
            hmxVar.c[hmxVar.d - hmxVar.a[hmxVar.b - 1].b] = i2;
            this.e = i;
        }
    }

    public final void k() {
        hjq a;
        int i;
        if (a().c <= 0 || this.c.a(-2) == (i = (a = a()).h)) {
            return;
        }
        if (!this.b && this.d) {
            j(false);
            this.a.a.c(hlu.a);
            this.b = true;
        }
        if (i > 0) {
            hen g = a.g(i);
            this.c.d(i);
            j(false);
            hmx hmxVar = this.a.a;
            hmxVar.c(hlt.a);
            hmw.a(hmxVar, 0, g);
            this.b = true;
        }
    }

    public final void l(int i, int i2) {
        if (i2 > 0) {
            if (i < 0) {
                hfp.j(a.h(i, "Invalid remove index "));
            }
            if (this.l == i) {
                this.h += i2;
                return;
            }
            i();
            this.l = i;
            this.h = i2;
        }
    }

    public final void m() {
        this.a.a.c(hmh.a);
    }
}
