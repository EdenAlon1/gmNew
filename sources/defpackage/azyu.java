package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azyu implements Executor {
    private final azzb a;

    public azyu(azzc azzcVar) {
        this.a = azzcVar.a(4);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
