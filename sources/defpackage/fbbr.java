package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class fbbr implements fbbt {
    private final AtomicBoolean b = new AtomicBoolean();
    public final fbbq a = new fbbq();

    protected fbbr() {
    }

    @Override // defpackage.fbbm
    public final ListenableFuture d() {
        if (this.b.compareAndSet(false, true)) {
            this.a.m(e());
        }
        return this.a;
    }

    protected abstract ListenableFuture e();

    @Override // defpackage.fbbt
    public final fbbm f() {
        return new fbbp(this);
    }

    @Override // defpackage.fbbt
    public final fbbm g(fbbu fbbuVar) {
        fbbp fbbpVar = new fbbp(this);
        fbbpVar.a.b(new fbbo(fbbpVar, fbbuVar), erpp.a);
        return fbbpVar;
    }

    @Override // defpackage.fbbt
    public final void h(boolean z) {
        this.b.set(true);
        this.a.d(z);
    }
}
