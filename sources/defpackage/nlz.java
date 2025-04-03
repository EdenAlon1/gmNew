package defpackage;

import android.text.Layout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nlz {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public nls r;
    public String t;
    public String u;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final int a() {
        int i = this.h;
        if (i == -1 && this.i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.i == 1 ? 2 : 0);
    }

    public final void b(int i) {
        this.d = i;
        this.e = true;
    }

    public final void c(int i) {
        this.b = i;
        this.c = true;
    }

    public final void d(nlz nlzVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (nlzVar != null) {
            if (!this.c && nlzVar.c) {
                c(nlzVar.b);
            }
            if (this.h == -1) {
                this.h = nlzVar.h;
            }
            if (this.i == -1) {
                this.i = nlzVar.i;
            }
            if (this.a == null && (str = nlzVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = nlzVar.f;
            }
            if (this.g == -1) {
                this.g = nlzVar.g;
            }
            if (this.n == -1) {
                this.n = nlzVar.n;
            }
            if (this.o == null && (alignment2 = nlzVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = nlzVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = nlzVar.q;
            }
            if (this.j == -1) {
                this.j = nlzVar.j;
                this.k = nlzVar.k;
            }
            if (this.r == null) {
                this.r = nlzVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = nlzVar.s;
            }
            if (this.t == null) {
                this.t = nlzVar.t;
            }
            if (this.u == null) {
                this.u = nlzVar.u;
            }
            if (!this.e && nlzVar.e) {
                b(nlzVar.d);
            }
            if (this.m != -1 || (i = nlzVar.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
