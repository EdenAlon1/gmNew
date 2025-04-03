package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emut implements Runnable {
    final /* synthetic */ SettableFuture a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ AtomicReference c;
    final /* synthetic */ errm d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;
    final /* synthetic */ dlpw g;

    public emut(SettableFuture settableFuture, Runnable runnable, AtomicReference atomicReference, errm errmVar, long j, long j2, dlpw dlpwVar) {
        this.a = settableFuture;
        this.b = runnable;
        this.c = atomicReference;
        this.d = errmVar;
        this.e = j;
        this.f = j2;
        this.g = dlpwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.a.isDone()) {
                return;
            }
            this.b.run();
            SettableFuture create = SettableFuture.create();
            this.c.set(create);
            if (this.a.isDone()) {
                return;
            }
            errm errmVar = this.d;
            long j = this.e;
            long j2 = this.f;
            long a = this.g.a();
            create.m(errmVar.schedule(this, a < j ? (j + j2) - a : j2 - ((a - j) % j2), TimeUnit.MILLISECONDS));
        } catch (Throwable th) {
            this.a.setException(th);
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}
