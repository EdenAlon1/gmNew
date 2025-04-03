package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class ejcj implements Executor {
    public final /* synthetic */ ejcn a;
    public final /* synthetic */ Executor b;

    public /* synthetic */ ejcj(ejcn ejcnVar, Executor executor) {
        this.a = ejcnVar;
        this.b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        final Executor executor = this.b;
        this.a.b.execute(new Runnable() { // from class: ejcl
            @Override // java.lang.Runnable
            public final void run() {
                executor.execute(runnable);
            }
        });
    }
}
