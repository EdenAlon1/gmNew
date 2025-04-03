package defpackage;

import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bff implements bfl {
    final llg a = new llg();
    private final Map b = new HashMap();

    public final void a(Object obj) {
        this.a.j(new bfe(obj));
    }

    @Override // defpackage.bfl
    public final ListenableFuture b() {
        return kfg.a(new kfd() { // from class: bfb
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                ScheduledExecutorService a = bjm.a();
                final bff bffVar = bff.this;
                a.execute(new Runnable() { // from class: bfa
                    @Override // java.lang.Runnable
                    public final void run() {
                        bfe bfeVar = (bfe) bff.this.a.a();
                        kfb kfbVar2 = kfbVar;
                        if (bfeVar == null) {
                            kfbVar2.c(new IllegalStateException("Observable has not yet been initialized with a value."));
                        } else {
                            kfbVar2.b(bfeVar.a);
                        }
                    }
                });
                return bffVar + " [fetch@" + SystemClock.uptimeMillis() + "]";
            }
        });
    }

    @Override // defpackage.bfl
    public final void c(Executor executor, bfk bfkVar) {
        synchronized (this.b) {
            final bfd bfdVar = (bfd) this.b.get(bfkVar);
            if (bfdVar != null) {
                bfdVar.b();
            }
            final bfd bfdVar2 = new bfd(executor, bfkVar);
            this.b.put(bfkVar, bfdVar2);
            bjm.a().execute(new Runnable() { // from class: bez
                @Override // java.lang.Runnable
                public final void run() {
                    bff bffVar = bff.this;
                    bfd bfdVar3 = bfdVar;
                    if (bfdVar3 != null) {
                        bffVar.a.k(bfdVar3);
                    }
                    bffVar.a.g(bfdVar2);
                }
            });
        }
    }

    @Override // defpackage.bfl
    public final void d(bfk bfkVar) {
        synchronized (this.b) {
            final bfd bfdVar = (bfd) this.b.remove(bfkVar);
            if (bfdVar != null) {
                bfdVar.b();
                bjm.a().execute(new Runnable() { // from class: bey
                    @Override // java.lang.Runnable
                    public final void run() {
                        bff.this.a.k(bfdVar);
                    }
                });
            }
        }
    }
}
