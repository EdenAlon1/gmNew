package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrt extends hrw {
    private final ffji a;
    private int b;

    public hrt(long j, hsd hsdVar, ffji ffjiVar) {
        super(j, hsdVar);
        this.a = ffjiVar;
        this.b = 1;
    }

    @Override // defpackage.hrw
    public final hrw b(ffji ffjiVar) {
        ffji p;
        hsj.w(this);
        ffji ffjiVar2 = this.a;
        long j = this.i;
        hsd hsdVar = this.h;
        p = hsj.p(ffjiVar, ffjiVar2, true);
        return new hrs(j, hsdVar, p, this);
    }

    @Override // defpackage.hrw
    public final void d() {
        if (this.j) {
            return;
        }
        g();
        super.d();
    }

    @Override // defpackage.hrw
    public final void f() {
        this.b++;
    }

    @Override // defpackage.hrw
    public final void g() {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            y();
        }
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
