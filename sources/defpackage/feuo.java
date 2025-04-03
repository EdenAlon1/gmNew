package defpackage;

import io.grpc.Status;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feuo implements fevd {
    public final fdyg a;
    private final Executor b;
    private final Executor c;
    private final fevc d;
    private fevd e;

    public feuo(Executor executor, Executor executor2, fevc fevcVar, fdyg fdygVar) {
        this.b = executor;
        this.c = executor2;
        this.d = fevcVar;
        this.a = fdygVar;
    }

    @Override // defpackage.fevd
    public final void a(Status status) {
        int i = ffbo.a;
        if (!status.f()) {
            Throwable th = status.t;
            if (th == null) {
                Status withDescription = Status.c.withDescription("RPC cancelled");
                febj febjVar = fdzz.a;
                th = new feaa(withDescription);
            }
            this.c.execute(new feuj(this.a, th));
        }
        this.b.execute(new feuk(this, status));
    }

    @Override // defpackage.fevd
    public final void b() {
        int i = ffbo.a;
        this.b.execute(new feul(this));
    }

    public final fevd c() {
        fevd fevdVar = this.e;
        if (fevdVar != null) {
            return fevdVar;
        }
        throw new IllegalStateException("listener unset");
    }

    @Override // defpackage.fevr
    public final void d(fevq fevqVar) {
        int i = ffbo.a;
        this.b.execute(new feum(this, fevqVar));
    }

    @Override // defpackage.fevr
    public final void e() {
        int i = ffbo.a;
        this.b.execute(new feun(this));
    }

    public final void f(Throwable th) {
        this.d.e(Status.d.withDescription("Application error processing RPC").d(th), new febo());
    }

    final void g(fevd fevdVar) {
        fevdVar.getClass();
        emxf.m(this.e == null, "Listener already set");
        this.e = fevdVar;
    }
}
