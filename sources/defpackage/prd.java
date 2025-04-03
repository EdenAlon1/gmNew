package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prd {
    public static final ListenableFuture a(final Executor executor, final ffix ffixVar) {
        return kfg.a(new kfd() { // from class: prc
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                kfbVar.a(new Runnable() { // from class: pra
                    @Override // java.lang.Runnable
                    public final void run() {
                        atomicBoolean.set(true);
                    }
                }, poy.a);
                final ffix ffixVar2 = ffixVar;
                executor.execute(new Runnable() { // from class: prb
                    @Override // java.lang.Runnable
                    public final void run() {
                        kfb kfbVar2 = kfbVar;
                        ffix ffixVar3 = ffixVar2;
                        if (atomicBoolean.get()) {
                            return;
                        }
                        try {
                            kfbVar2.b(ffixVar3.invoke());
                        } catch (Throwable th) {
                            kfbVar2.c(th);
                        }
                    }
                });
                return ffcu.a;
            }
        });
    }
}
