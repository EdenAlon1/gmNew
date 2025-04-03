package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrs extends hrw {
    private final ffji a;
    private final hrw b;

    public hrs(long j, hsd hsdVar, ffji ffjiVar, hrw hrwVar) {
        super(j, hsdVar);
        this.a = ffjiVar;
        this.b = hrwVar;
        hrwVar.f();
    }

    @Override // defpackage.hrw
    public final /* bridge */ /* synthetic */ hrw b(ffji ffjiVar) {
        ffji p;
        ffji ffjiVar2 = this.a;
        long j = this.i;
        hsd hsdVar = this.h;
        p = hsj.p(ffjiVar, ffjiVar2, true);
        return new hrs(j, hsdVar, p, this.b);
    }

    @Override // defpackage.hrw
    public final void d() {
        if (this.j) {
            return;
        }
        if (this.i != this.b.v()) {
            y();
        }
        this.b.g();
        super.d();
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
    public final /* bridge */ /* synthetic */ void p(htm htmVar) {
        hsj.A();
        throw new ffbx();
    }

    @Override // defpackage.hrw
    public final boolean u() {
        return true;
    }

    @Override // defpackage.hrw
    public final void e() {
    }
}
