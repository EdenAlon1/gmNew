package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtcg {
    public static final Duration a;
    public static final long b;
    public final fgcm c;
    public final fgdj d;
    private final ffsk e;
    private ffud f;

    static {
        Duration g = ernk.g(1);
        a = g;
        b = ffpw.j(ffpy.e(g.getSeconds(), ffpz.d), ffpy.d(g.getNano(), ffpz.a));
    }

    public dtcg(ffsk ffskVar) {
        ffskVar.getClass();
        this.e = ffskVar;
        fgcm a2 = fgdm.a(Duration.ZERO);
        this.c = a2;
        this.d = new fgco(a2);
    }

    public final void a() {
        this.c.f(Duration.ZERO);
    }

    public final void b() {
        this.c.f(Duration.ZERO);
        this.f = ffqy.d(this.e, null, null, new dtcf(this, null), 3);
    }

    public final void c() {
        ffud ffudVar = this.f;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        this.f = null;
    }
}
