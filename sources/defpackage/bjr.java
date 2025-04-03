package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bjr implements Runnable {
    final /* synthetic */ ListenableFuture a;
    final /* synthetic */ bjs b;

    public bjr(bjs bjsVar, ListenableFuture listenableFuture) {
        this.b = bjsVar;
        this.a = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                try {
                    bjs bjsVar = this.b;
                    Object h = bkj.h(this.a);
                    kfb kfbVar = bjsVar.b;
                    if (kfbVar != null) {
                        kfbVar.b(h);
                    }
                } catch (CancellationException unused) {
                    this.b.cancel(false);
                }
            } catch (ExecutionException e) {
                this.b.c(e.getCause());
            }
        } finally {
            this.b.a = null;
        }
    }
}
