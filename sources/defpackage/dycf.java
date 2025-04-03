package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dycf {
    private final erqp a;

    public dycf(erqp erqpVar) {
        this.a = erqpVar;
    }

    public final ListenableFuture a(Callable callable, Executor executor) {
        return this.a.a(eldl.m(callable), executor);
    }

    public final ListenableFuture b(erog erogVar, Executor executor) {
        return this.a.b(eldl.c(erogVar), executor);
    }
}
