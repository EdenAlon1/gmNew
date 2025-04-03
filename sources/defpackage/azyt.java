package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azyt implements Executor {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/DepthMeasuredDatabaseWriteExecutor");
    final Executor b;
    final AtomicInteger c = new AtomicInteger();
    public final azyq d;
    private final int e;

    public azyt(Executor executor, Optional optional, azyq azyqVar) {
        this.b = executor;
        this.e = ((Integer) optional.orElse(4)).intValue();
        this.d = azyqVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        final azys azysVar;
        engw n;
        int incrementAndGet = this.c.incrementAndGet();
        emxf.l(incrementAndGet > 0);
        azyq azyqVar = this.d;
        if (((Boolean) azyqVar.a.get()).booleanValue()) {
            azys azysVar2 = new azys();
            synchronized (azyqVar.c) {
                azyqVar.b.add(azysVar2);
            }
            azysVar = azysVar2;
        } else {
            azysVar = null;
        }
        if (incrementAndGet > this.e) {
            enru enruVar = a;
            ensk i = enruVar.i();
            i.Y(ente.a, "BugleDatabase");
            enrr enrrVar = (enrr) i;
            enrrVar.aa(ensy.FULL);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/DepthMeasuredDatabaseWriteExecutor", "execute", 69, "DepthMeasuredDatabaseWriteExecutor.java")).w("Deep work queue for database write!  queueDepth = %d currentTrace = %s", incrementAndGet, eleg.c());
            azyq azyqVar2 = this.d;
            if (((Boolean) azyqVar2.a.get()).booleanValue()) {
                azyp azypVar = new azyp(azyqVar2.d);
                try {
                    if (azypVar.a != null) {
                        synchronized (azyqVar2.c) {
                            n = engw.n(azyqVar2.b);
                        }
                        for (Map.Entry entry : ((Map) Collection.EL.stream(n).collect(Collectors.groupingBy(Function$CC.identity(), new Supplier() { // from class: azyn
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new HashMap();
                            }
                        }, Collectors.counting()))).entrySet()) {
                            String a2 = ((azys) entry.getKey()).a();
                            String str = ((azys) entry.getKey()).a;
                            Long l = (Long) entry.getValue();
                            ensk i2 = a.i();
                            i2.Y(ente.a, "BugleDatabase");
                            ((enrr) ((enrr) i2).h("com/google/android/apps/messaging/shared/datamodel/DepthMeasuredDatabaseWriteExecutor$DebugHelper", "writeQueuedDebugHelperDataToLogger", 165, "DepthMeasuredDatabaseWriteExecutor.java")).J("Enqueued count, stack, trace: %d\r\n%s\r\n%s", l, a2, str);
                        }
                    } else {
                        ensk i3 = enruVar.i();
                        i3.Y(ente.a, "BugleDatabase");
                        ((enrr) ((enrr) i3).h("com/google/android/apps/messaging/shared/datamodel/DepthMeasuredDatabaseWriteExecutor$DebugHelper", "writeQueuedDebugHelperDataToLogger", 141, "DepthMeasuredDatabaseWriteExecutor.java")).q("Skipping simultaneous debug logging.");
                    }
                    azypVar.close();
                } catch (Throwable th) {
                    try {
                        azypVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        axnw.h(elfo.f(new Runnable() { // from class: azym
            @Override // java.lang.Runnable
            public final void run() {
                azyt azytVar = azyt.this;
                Runnable runnable2 = runnable;
                azys azysVar3 = azysVar;
                try {
                    runnable2.run();
                } finally {
                    emxf.l(azytVar.c.decrementAndGet() >= 0);
                    azytVar.d.a(azysVar3);
                }
            }
        }, this.b));
    }
}
