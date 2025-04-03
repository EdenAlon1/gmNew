package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sco {
    public final Object a = new Object();
    public final List b = new ArrayList();
    public boolean c;

    final ListenableFuture a(final ListenableFuture listenableFuture, final emyl emylVar) {
        return kfg.a(new kfd() { // from class: scm
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                final ListenableFuture listenableFuture2 = listenableFuture;
                kfbVar.a(new Runnable() { // from class: sck
                    @Override // java.lang.Runnable
                    public final void run() {
                        ListenableFuture.this.cancel(false);
                    }
                }, erpp.a);
                final emyl emylVar2 = emylVar;
                Runnable runnable = new Runnable() { // from class: scl
                    @Override // java.lang.Runnable
                    public final void run() {
                        kfb.this.c((Throwable) emylVar2.get());
                    }
                };
                sco scoVar = sco.this;
                synchronized (scoVar.a) {
                    if (scoVar.c) {
                        runnable.run();
                    } else {
                        scoVar.b.add(runnable);
                    }
                }
                erqt.r(listenableFuture2, new scn(scoVar, kfbVar, runnable), erpp.a);
                return "FailureSignal.propagate";
            }
        });
    }

    public final void b(Runnable runnable) {
        synchronized (this.a) {
            boolean z = true;
            if (!this.b.remove(runnable) && !this.c) {
                z = false;
            }
            emyw.a(z);
        }
    }

    final void c() {
        engw n;
        synchronized (this.a) {
            this.c = true;
            n = engw.n(this.b);
            this.b.clear();
        }
        int size = n.size();
        for (int i = 0; i < size; i++) {
            ((Runnable) n.get(i)).run();
        }
    }
}
