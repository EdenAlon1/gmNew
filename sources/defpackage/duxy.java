package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class duxy {
    public final Runnable a;

    public duxy(Runnable runnable) {
        this.a = runnable;
    }

    public abstract void a(Executor executor);

    public abstract void d();
}
