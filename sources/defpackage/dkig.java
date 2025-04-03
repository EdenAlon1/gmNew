package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkig implements dkii {
    private final dkib a;

    public dkig(dkib dkibVar) {
        this.a = dkibVar;
    }

    private final dkht c() {
        dkht b = this.a.b();
        b.e(true);
        b.q(true);
        b.n(true);
        b.f(true);
        b.j(true);
        b.k(true);
        b.m(true);
        b.Q();
        b.P();
        b.R();
        b.S();
        b.T();
        b.p(true);
        b.r(true);
        return b;
    }

    @Override // defpackage.dkii
    public final dkht a() {
        return c();
    }

    @Override // defpackage.dkii
    public final dkht b() {
        dkht c = c();
        c.n(false);
        return c;
    }
}
