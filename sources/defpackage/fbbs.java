package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class fbbs extends fbbr implements Executor, eroh {
    private final fbbf b;
    private final fbcd c;
    private final fbbf d;
    private volatile fbcc e = null;

    protected fbbs(fbbf fbbfVar, fbcd fbcdVar, fbbf fbbfVar2) {
        this.b = fbbfVar;
        this.c = fbcdVar;
        this.d = fbbfVar2;
    }

    @Override // defpackage.eroh
    @Deprecated
    public final ListenableFuture a(Object obj) {
        this.e.d();
        try {
            return b(obj);
        } finally {
            this.e.c();
        }
    }

    protected abstract ListenableFuture b(Object obj);

    protected abstract ListenableFuture c();

    @Override // defpackage.fbbr
    protected final ListenableFuture e() {
        this.e = ((fbch) this.b.b()).a(this.c);
        this.e.f();
        ListenableFuture g = erny.g(c(), this, this);
        this.e.a(g);
        return g;
    }

    @Override // java.util.concurrent.Executor
    @Deprecated
    public final void execute(Runnable runnable) {
        this.e.e();
        ((Executor) this.d.b()).execute(runnable);
    }
}
