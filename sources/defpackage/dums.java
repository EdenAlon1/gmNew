package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dums implements erqj {
    final /* synthetic */ String a;
    final /* synthetic */ ListenableFuture b;
    final /* synthetic */ dumt c;

    public dums(dumt dumtVar, String str, ListenableFuture listenableFuture) {
        this.a = str;
        this.b = listenableFuture;
        this.c = dumtVar;
    }

    private final void c() {
        synchronized (this.c) {
            if (((ListenableFuture) this.c.b.get(this.a)) == this.b) {
                this.c.b.remove(this.a);
            }
        }
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
        c();
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        c();
    }
}
