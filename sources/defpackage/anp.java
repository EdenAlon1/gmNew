package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anp {
    public final Executor a;
    public final AtomicInteger b;

    public anp(Executor executor) {
        executor.getClass();
        this.a = executor;
        this.b = new AtomicInteger(0);
    }
}
