package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnn implements dpp {
    public ffix a;
    public ffji b;
    public final float[] c;
    public boolean d;
    public dqs e;
    public final ffix f;
    public final dpc g;
    public final dif h;
    public final ffmf i;
    public final hjz j;
    public final hjz k;
    public final hjz l;
    public final hjz m;
    public final hjz n;
    public final hjz o;
    private final hho p;
    private final hjx q;
    private final hjx r;
    private final hjx s;

    public gnn() {
        this(0.0f, null, new ffmf(0.0f, 1.0f));
    }

    @Override // defpackage.dpp
    public final Object a(dhy dhyVar, ffjm ffjmVar, ffgu ffguVar) {
        Object a = ffsl.a(new gnk(this, dhyVar, ffjmVar, null), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    public final float b() {
        return gnj.a(((Number) this.i.c()).floatValue(), ((Number) this.i.b()).floatValue(), ffmk.e(d(), ((Number) this.i.c()).floatValue(), ((Number) this.i.b()).floatValue()));
    }

    public final float c() {
        return this.r.c();
    }

    public final float d() {
        return this.q.c();
    }

    public final int e() {
        return this.m.c();
    }

    public final int f() {
        return this.l.c();
    }

    public final int g() {
        return this.j.c();
    }

    public final void h(float f) {
        float max;
        float min;
        if (this.e == dqs.a) {
            max = Math.max(this.k.c() - (e() / 2.0f), 0.0f);
            min = Math.min(e() / 2.0f, max);
        } else {
            max = Math.max(g() - (f() / 2.0f), 0.0f);
            min = Math.min(f() / 2.0f, max);
        }
        this.r.i(c() + f + this.s.c());
        j(0.0f);
        float c = c();
        ffmf ffmfVar = this.i;
        float f2 = gnj.a;
        float b = gnj.b(min, max, c, ((Number) ffmfVar.c()).floatValue(), ((Number) this.i.b()).floatValue());
        if (b == d()) {
            return;
        }
        ffji ffjiVar = this.b;
        if (ffjiVar != null) {
            ffjiVar.invoke(Float.valueOf(b));
        } else {
            k(b);
        }
    }

    public final void i(boolean z) {
        this.p.b(Boolean.valueOf(z));
    }

    public final void j(float f) {
        this.s.i(f);
    }

    public final void k(float f) {
        float e = ffmk.e(f, ((Number) this.i.c()).floatValue(), ((Number) this.i.b()).floatValue());
        ((Number) this.i.c()).floatValue();
        ((Number) this.i.b()).floatValue();
        float f2 = gnj.a;
        this.q.i(e);
    }

    public final boolean l() {
        return ((Boolean) this.p.a()).booleanValue();
    }

    public gnn(float f, ffix ffixVar, ffmf ffmfVar) {
        this.a = ffixVar;
        this.i = ffmfVar;
        this.q = new hhw(f);
        float f2 = gnj.a;
        this.c = new float[0];
        this.j = new hhy(0);
        this.k = new hhy(0);
        this.l = new hhy(0);
        this.m = new hhy(0);
        this.n = new hhy(0);
        this.o = new hhy(0);
        this.e = dqs.b;
        this.p = new hic(false, hla.a);
        this.f = new gnm(this);
        this.r = new hhw(gnj.b(((Number) ffmfVar.c()).floatValue(), ((Number) ffmfVar.b()).floatValue(), f, 0.0f, 0.0f));
        this.s = new hhw(0.0f);
        this.g = new gnl(this);
        this.h = new dif();
    }
}
