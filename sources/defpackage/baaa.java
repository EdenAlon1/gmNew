package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baaa implements Executor {
    private final azzb a;

    public baaa(azzc azzcVar) {
        this.a = azzcVar.a(2);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
