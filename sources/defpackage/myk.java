package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class myk implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ lts b;

    public myk(Executor executor, lts ltsVar) {
        this.a = executor;
        this.b = ltsVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
