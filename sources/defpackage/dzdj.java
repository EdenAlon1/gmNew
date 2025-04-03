package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzdj implements erqj {
    final /* synthetic */ dzja a;
    final /* synthetic */ dzfx b;
    final /* synthetic */ dzpt c;
    final /* synthetic */ dzdk d;

    public dzdj(dzdk dzdkVar, dzja dzjaVar, dzfx dzfxVar, dzpt dzptVar) {
        this.a = dzjaVar;
        this.b = dzfxVar;
        this.c = dzptVar;
        this.d = dzdkVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dzhl r = dzhm.r();
        r.g(19);
        r.n(this.a.c().f());
        r.o(this.a.d().E());
        r.p(this.b.a);
        r.d(this.c);
        this.d.c.b(r.a());
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        dzhl r = dzhm.r();
        r.g(20);
        r.n(this.a.c().f());
        r.o(this.a.d().E());
        r.p(this.b.a);
        r.d(this.c);
        this.d.c.b(r.a());
    }
}
