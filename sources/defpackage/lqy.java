package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqy {
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public byte[] f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;
    public Boolean k;
    public Integer l;
    public Integer m;
    public Integer n;
    public Integer o;
    public Integer p;
    public Integer q;
    public CharSequence r;
    public CharSequence s;
    public CharSequence t;
    public Integer u;
    public Integer v;
    public CharSequence w;
    public CharSequence x;
    public Integer y;
    public engw z;

    public lqy(lqz lqzVar) {
        this.a = lqzVar.b;
        this.b = lqzVar.c;
        this.c = lqzVar.d;
        this.d = lqzVar.e;
        this.e = lqzVar.f;
        this.f = lqzVar.g;
        this.g = lqzVar.h;
        this.h = lqzVar.i;
        this.i = lqzVar.j;
        this.j = lqzVar.k;
        this.k = lqzVar.l;
        this.l = lqzVar.n;
        this.m = lqzVar.o;
        this.n = lqzVar.p;
        this.o = lqzVar.q;
        this.p = lqzVar.r;
        this.q = lqzVar.s;
        this.r = lqzVar.t;
        this.s = lqzVar.u;
        this.t = lqzVar.v;
        this.u = lqzVar.w;
        this.v = lqzVar.x;
        this.w = lqzVar.y;
        this.x = lqzVar.z;
        this.y = lqzVar.A;
        this.z = lqzVar.B;
    }

    public final void a(byte[] bArr, int i) {
        if (this.f != null) {
            Integer valueOf = Integer.valueOf(i);
            int i2 = lvf.a;
            if (!Objects.equals(valueOf, 3) && Objects.equals(this.g, 3)) {
                return;
            }
        }
        this.f = (byte[]) bArr.clone();
        this.g = Integer.valueOf(i);
    }

    public lqy() {
        int i = engw.d;
        this.z = enou.a;
    }
}
