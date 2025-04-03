package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dumx implements Executor {
    static final dumx a = new dumx();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dumg.a();
        runnable.run();
    }
}
