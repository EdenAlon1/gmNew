package defpackage;

import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djgu extends dkji {
    public final SettableFuture a = SettableFuture.create();
    private final dkkj b;

    public djgu(dkkj dkkjVar) {
        this.b = dkkjVar;
        if (dkkjVar.a == dkho.RUNNING) {
            i();
        } else if (dizg.F() && dkkjVar.q()) {
            h(500, "Session already stopped");
        } else {
            dkkjVar.aF(this);
        }
    }

    private final void d() {
        this.b.aU(this);
        djgv f = djgw.f();
        f.b(dkjw.e);
        this.a.set(f.a());
    }

    @Override // defpackage.dkji, defpackage.dkhd
    public final void e() {
        d();
    }

    @Override // defpackage.dkji, defpackage.dkhd
    public final void f() {
        d();
    }

    @Override // defpackage.dkji, defpackage.dkhd
    public final void g(dkqs dkqsVar) {
        d();
    }

    @Override // defpackage.dkji, defpackage.dkhd
    public final void h(int i, String str) {
        this.b.aU(this);
        djgv f = djgw.f();
        f.b(this.b.S);
        this.a.set(f.a());
    }

    @Override // defpackage.dkji, defpackage.dkhd
    public final void i() {
        this.b.aU(this);
        djgv f = djgw.f();
        f.c(this.b);
        this.a.set(f.a());
    }

    @Override // defpackage.dkji, defpackage.dkhd
    public final void k() {
        d();
    }

    @Override // defpackage.dkji, defpackage.dkhd
    public final void l(dkqs dkqsVar) {
        d();
    }
}
