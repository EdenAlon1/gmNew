package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoge implements Runnable {
    final /* synthetic */ SettableFuture a;
    final /* synthetic */ eogi b;

    public eoge(eogi eogiVar, SettableFuture settableFuture) {
        this.a = settableFuture;
        this.b = eogiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!this.a.isCancelled()) {
                if (erqt.q(this.a) == eogi.b) {
                    return;
                }
            }
        } catch (ExecutionException unused) {
        }
        this.b.m(this.a);
    }
}
