package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsy {
    public CharSequence a;
    public Bitmap b;
    public Layout.Alignment c;
    public Layout.Alignment d;
    public int e;
    public float f;
    public int g;
    public float h;
    public float i;
    public int j;
    public float k;
    private float l;
    private int m;
    private int n;
    private float o;
    private boolean p;
    private int q;

    public lsy() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.l = -3.4028235E38f;
        this.m = Integer.MIN_VALUE;
        this.e = Integer.MIN_VALUE;
        this.f = -3.4028235E38f;
        this.g = Integer.MIN_VALUE;
        this.n = Integer.MIN_VALUE;
        this.o = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = -3.4028235E38f;
        this.p = false;
        this.q = -16777216;
        this.j = Integer.MIN_VALUE;
    }

    public final lsz a() {
        return new lsz(this.a, this.c, this.d, this.b, this.l, this.m, this.e, this.f, this.g, this.n, this.o, this.h, this.i, this.p, this.q, this.j, this.k);
    }

    public final void b() {
        this.p = false;
    }

    public final void c(float f, int i) {
        this.l = f;
        this.m = i;
    }

    public final void d(float f, int i) {
        this.o = f;
        this.n = i;
    }

    public final void e(int i) {
        this.q = i;
        this.p = true;
    }

    public lsy(lsz lszVar) {
        this.a = lszVar.t;
        this.b = lszVar.w;
        this.c = lszVar.u;
        this.d = lszVar.v;
        this.l = lszVar.x;
        this.m = lszVar.y;
        this.e = lszVar.z;
        this.f = lszVar.A;
        this.g = lszVar.B;
        this.n = lszVar.G;
        this.o = lszVar.H;
        this.h = lszVar.C;
        this.i = lszVar.D;
        this.p = lszVar.E;
        this.q = lszVar.F;
        this.j = lszVar.I;
        this.k = lszVar.J;
    }
}
