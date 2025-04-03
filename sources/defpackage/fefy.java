package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fefy implements erqj {
    final /* synthetic */ String a;
    final /* synthetic */ ListenableFuture b;
    final /* synthetic */ fefz c;

    public fefy(fefz fefzVar, String str, ListenableFuture listenableFuture) {
        this.a = str;
        this.b = listenableFuture;
        this.c = fefzVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.c.b.remove(this.a, this.b);
    }
}
