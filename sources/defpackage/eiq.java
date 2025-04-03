package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eiq {
    public iga d;
    public final cxj e;
    public final cxj f;
    public long g;
    private final ffsk h;
    private final hho l;
    private final iaw m;
    private final hho i = new hic(false, hla.a);
    private final hho j = new hic(false, hla.a);
    private final hho k = new hic(false, hla.a);
    public final hho a = new hic(false, hla.a);
    public long b = 9223372034707292159L;
    public long c = 0;

    public eiq(ffsk ffskVar, iaw iawVar) {
        this.h = ffskVar;
        this.m = iawVar;
        Object obj = null;
        this.d = iawVar != null ? iawVar.a() : null;
        int i = 12;
        this.e = new cxj(new kaa(0L), dcp.g, obj, i);
        this.f = new cxj(Float.valueOf(1.0f), dcp.a, obj, i);
        this.l = new hic(new kaa(0L), hla.a);
        this.g = 9223372034707292159L;
    }

    public final long a() {
        return ((kaa) this.l.a()).a;
    }

    public final void b() {
        iga igaVar = this.d;
        e();
        if (f()) {
            if (igaVar != null) {
                igaVar.i(1.0f);
            }
            ffqy.d(this.h, null, null, new eil(this, null), 3);
        }
    }

    public final void c() {
        if (g()) {
            ffqy.d(this.h, null, null, new eim(this, null), 3);
        }
    }

    public final void d() {
        iaw iawVar;
        if (g()) {
            h();
            ffqy.d(this.h, null, null, new ein(this, null), 3);
        }
        if (e()) {
            this.j.b(false);
            ffqy.d(this.h, null, null, new eio(this, null), 3);
        }
        if (f()) {
            this.k.b(false);
            ffqy.d(this.h, null, null, new eip(this, null), 3);
        }
        i();
        this.b = 9223372034707292159L;
        iga igaVar = this.d;
        if (igaVar != null && (iawVar = this.m) != null) {
            iawVar.b(igaVar);
        }
        this.d = null;
    }

    public final boolean e() {
        return ((Boolean) this.j.a()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) this.k.a()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) this.i.a()).booleanValue();
    }

    public final void h() {
        this.i.b(false);
    }

    public final void i() {
        this.l.b(new kaa(0L));
    }
}
