package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axm implements bjt {
    final /* synthetic */ ListenableFuture a;
    final /* synthetic */ kfb b;
    final /* synthetic */ String c;

    public axm(ListenableFuture listenableFuture, kfb kfbVar, String str) {
        this.a = listenableFuture;
        this.b = kfbVar;
        this.c = str;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        if (th instanceof CancellationException) {
            ksw.c(this.b.c(new axp(this.c.concat(" cancelled."), th)));
        } else {
            this.b.b(null);
        }
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        bkj.j(this.a, this.b);
    }
}
