package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdr implements bfl {
    private static final bdr b = new bdr(null);
    public final ListenableFuture a;

    private bdr(Object obj) {
        this.a = bkj.b(obj);
    }

    public static bfl a(Object obj) {
        return obj == null ? b : new bdr(obj);
    }

    @Override // defpackage.bfl
    public final ListenableFuture b() {
        return this.a;
    }

    @Override // defpackage.bfl
    public final void c(Executor executor, final bfk bfkVar) {
        this.a.b(new Runnable() { // from class: bdq
            @Override // java.lang.Runnable
            public final void run() {
                bdr bdrVar = bdr.this;
                bfk bfkVar2 = bfkVar;
                try {
                    bfkVar2.b(((bkm) bdrVar.a).b);
                } catch (InterruptedException | ExecutionException e) {
                    bfkVar2.a(e);
                }
            }
        }, executor);
    }

    @Override // defpackage.bfl
    public final void d(bfk bfkVar) {
    }
}
