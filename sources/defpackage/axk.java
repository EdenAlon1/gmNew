package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axk implements bjt {
    final /* synthetic */ kfb a;
    final /* synthetic */ ListenableFuture b;

    public axk(kfb kfbVar, ListenableFuture listenableFuture) {
        this.a = kfbVar;
        this.b = listenableFuture;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        if (th instanceof axp) {
            ksw.c(this.b.cancel(false));
        } else {
            ksw.c(this.a.b(null));
        }
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ksw.c(this.a.b(null));
    }
}
