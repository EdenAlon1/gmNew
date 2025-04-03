package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lei implements ldt {
    public static final leh a = new leb();
    public static final leh b = new lec();
    public static final leh c = new led();
    public static final leh d = new lee();
    public static final leh e = new lef();
    public static final leh f = new ldz();
    public float g;
    float h;
    boolean i;
    final Object j;
    final lej k;
    public boolean l;
    public float m;
    public float n;
    public float o;
    public final ArrayList p;
    public final ArrayList q;
    private long r;

    public lei(lek lekVar) {
        this.g = 0.0f;
        this.h = Float.MAX_VALUE;
        this.i = false;
        this.l = false;
        this.m = Float.MAX_VALUE;
        this.n = -3.4028235E38f;
        this.r = 0L;
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.j = null;
        this.k = new lea(lekVar);
        this.o = 1.0f;
    }

    private static void e(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // defpackage.ldt
    public final void a(long j) {
        long j2 = this.r;
        if (j2 == 0) {
            this.r = j;
            b(this.h);
            return;
        }
        long j3 = j - j2;
        this.r = j;
        float f2 = ldy.a().g;
        boolean c2 = c(f2 == 0.0f ? 2147483647L : (long) (j3 / f2));
        float min = Math.min(this.h, this.m);
        this.h = min;
        float max = Math.max(min, this.n);
        this.h = max;
        b(max);
        if (c2) {
            this.l = false;
            ldy a2 = ldy.a();
            a2.a.remove(this);
            int indexOf = a2.b.indexOf(this);
            if (indexOf >= 0) {
                a2.b.set(indexOf, null);
                a2.f = true;
            }
            this.r = 0L;
            this.i = false;
            for (int i = 0; i < this.p.size(); i++) {
                if (this.p.get(i) != null) {
                    pah pahVar = (pah) this.p.get(i);
                    float f3 = this.h;
                    pai paiVar = pahVar.a;
                    if (f3 < 1.0f) {
                        long h = paiVar.h();
                        par g = ((paz) paiVar.h).g(0);
                        par parVar = g.o;
                        g.o = null;
                        paiVar.h.y(-1L, paiVar.a);
                        paiVar.h.y(h, -1L);
                        paiVar.a = h;
                        Runnable runnable = paiVar.g;
                        if (runnable != null) {
                            runnable.run();
                        }
                        paiVar.h.p.clear();
                        if (parVar != null) {
                            parVar.t(parVar, paq.b, true);
                        }
                    } else {
                        par parVar2 = paiVar.h;
                        parVar2.t(parVar2, paq.b, false);
                    }
                }
            }
            e(this.p);
        }
    }

    final void b(float f2) {
        this.k.b(this.j, f2);
        for (int i = 0; i < this.q.size(); i++) {
            if (this.q.get(i) != null) {
                ((pai) this.q.get(i)).k(this.h);
            }
        }
        e(this.q);
    }

    public abstract boolean c(long j);

    public final void d(float f2) {
        this.h = f2;
        this.i = true;
    }

    public lei(Object obj, lej lejVar) {
        this.g = 0.0f;
        this.h = Float.MAX_VALUE;
        this.i = false;
        this.l = false;
        this.m = Float.MAX_VALUE;
        this.n = -3.4028235E38f;
        this.r = 0L;
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.j = obj;
        this.k = lejVar;
        float f2 = 0.1f;
        if (lejVar != c && lejVar != d && lejVar != e) {
            if (lejVar == f) {
                f2 = 0.00390625f;
            } else {
                f2 = 0.002f;
                if (lejVar != a && lejVar != b) {
                    f2 = 1.0f;
                }
            }
        }
        this.o = f2;
    }
}
