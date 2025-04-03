package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elfn {
    private final elfq a;

    public elfn(elfq elfqVar) {
        this.a = elfqVar;
    }

    public final elfl a(Callable callable, Executor executor) {
        return elfl.g(this.a.a(callable, executor));
    }

    public final elfl b(erog erogVar, Executor executor) {
        return elfl.g(this.a.b(erogVar, executor));
    }

    public final elfl c(Runnable runnable, Executor executor) {
        return elfl.g(this.a.a.c(eldl.l(runnable), executor));
    }
}
