package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfuz implements cfva {
    private final Supplier a;
    private cfun b;

    public cfuz(Supplier supplier) {
        this.a = supplier;
    }

    private final cfun a() {
        cfun cfunVar;
        Object obj;
        synchronized (this.a) {
            if (this.b == null) {
                obj = this.a.get();
                ecwj ecwjVar = (ecwj) obj;
                this.b = new cfun(ecwjVar, ecwjVar.c());
            }
            cfunVar = this.b;
            cfunVar.getClass();
        }
        return cfunVar;
    }

    @Override // defpackage.cfva
    public final Object e() {
        return a().e();
    }

    @Override // defpackage.cfva
    public final Object f() {
        return a().c;
    }

    @Override // defpackage.cfva
    public final String j() {
        return a().j();
    }

    @Override // defpackage.cfva
    public final void k(Object obj) {
        throw null;
    }

    @Override // defpackage.cfva
    public final void l() {
        synchronized (this.a) {
            if (this.b != null) {
                a().l();
            }
        }
    }

    @Override // defpackage.cfva
    public final void m() {
        throw null;
    }
}
