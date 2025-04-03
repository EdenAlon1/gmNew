package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qbb implements Executor {
    final /* synthetic */ qbc a;

    public qbb(qbc qbcVar) {
        this.a = qbcVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.c.post(runnable);
    }
}
