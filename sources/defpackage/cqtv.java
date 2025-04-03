package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqtv implements ejxi {
    final /* synthetic */ cqtw a;

    public cqtv(cqtw cqtwVar) {
        this.a = cqtwVar;
    }

    @Override // defpackage.ejxi
    public final /* synthetic */ ejuj a() {
        return cqtw.a;
    }

    @Override // defpackage.ejxi
    public final ListenableFuture b() {
        return elfo.g(new Callable() { // from class: cqtu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return enhk.j(cqtv.this.a.b);
            }
        }, this.a.c);
    }
}
