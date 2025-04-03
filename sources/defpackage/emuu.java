package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emuu {
    public static ListenableFuture a(Runnable runnable, long j, TimeUnit timeUnit, dlpw dlpwVar, errm errmVar) {
        long a = dlpwVar.a() + TimeUnit.MILLISECONDS.convert(0L, timeUnit);
        long convert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        SettableFuture create = SettableFuture.create();
        final AtomicReference atomicReference = new AtomicReference(null);
        errk schedule = errmVar.schedule(new emut(create, runnable, atomicReference, errmVar, a, convert, dlpwVar), 0L, timeUnit);
        while (!atomicReference.compareAndSet(null, schedule) && atomicReference.get() == null) {
        }
        create.b(new Runnable() { // from class: emus
            @Override // java.lang.Runnable
            public final void run() {
                ((Future) atomicReference.get()).cancel(false);
            }
        }, erpp.a);
        return create;
    }
}
