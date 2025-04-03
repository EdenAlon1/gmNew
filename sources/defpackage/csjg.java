package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class csjg {
    private final Executor a;

    public csjg(Executor executor) {
        this.a = executor;
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}
