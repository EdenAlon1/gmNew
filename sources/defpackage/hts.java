package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hts extends hrw {
    public ffji a;
    public final long b;
    private final hrw c;
    private final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hts(hrw hrwVar, ffji ffjiVar, boolean z) {
        super(0L, hsd.a);
        ffji k;
        ffji ffjiVar2 = hsj.a;
        this.c = hrwVar;
        this.d = z;
        this.a = hsj.p(ffjiVar, (hrwVar == null || (k = hrwVar.k()) == null) ? hsj.i.a : k, false);
        this.b = hqk.a();
    }

    private final hrw a() {
        hrw hrwVar = this.c;
        return hrwVar == null ? hsj.i : hrwVar;
    }

    @Override // defpackage.hrw
    public final hrw b(ffji ffjiVar) {
        ffji p;
        hrw a;
        p = hsj.p(ffjiVar, this.a, true);
        a = hsj.a(a().b(null), p, true);
        return a;
    }

    @Override // defpackage.hrw
    public final void d() {
        hrw hrwVar;
        D();
        if (!this.d || (hrwVar = this.c) == null) {
            return;
        }
        hrwVar.d();
    }

    @Override // defpackage.hrw
    public final void e() {
        a().e();
    }

    @Override // defpackage.hrw
    public final /* bridge */ /* synthetic */ void f() {
        hsw.a();
        throw new ffbx();
    }

    @Override // defpackage.hrw
    public final /* bridge */ /* synthetic */ void g() {
        hsw.a();
        throw new ffbx();
    }

    @Override // defpackage.hrw
    public final /* synthetic */ ffji k() {
        return this.a;
    }

    @Override // defpackage.hrw
    public final ffji m() {
        return null;
    }

    @Override // defpackage.hrw
    public final void p(htm htmVar) {
        a().p(htmVar);
    }

    @Override // defpackage.hrw
    public final boolean u() {
        return a().u();
    }

    @Override // defpackage.hrw
    public final long v() {
        return a().v();
    }

    @Override // defpackage.hrw
    public final hsd x() {
        return a().x();
    }
}
