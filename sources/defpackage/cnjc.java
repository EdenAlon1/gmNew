package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnjc {
    public final SettableFuture c;
    public final elfl d;
    public final Object a = new Object();
    public final List b = new ArrayList(2);
    private boolean e = false;

    public cnjc() {
        ekzz f = eleg.f("DynamicFutureListListener");
        try {
            SettableFuture create = SettableFuture.create();
            f.b(create);
            this.c = create;
            this.d = elfl.g(create);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    final boolean a(final ListenableFuture listenableFuture) {
        synchronized (this.a) {
            if ((this.e && this.b.isEmpty()) || this.d.isDone()) {
                return false;
            }
            this.b.add(listenableFuture);
            this.e = true;
            axnw.i(listenableFuture, new Consumer() { // from class: cnjb
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    boolean isEmpty;
                    cnjc cnjcVar = cnjc.this;
                    Object obj2 = cnjcVar.a;
                    ListenableFuture listenableFuture2 = listenableFuture;
                    synchronized (obj2) {
                        cnjcVar.b.remove(listenableFuture2);
                        isEmpty = cnjcVar.b.isEmpty();
                    }
                    if (isEmpty) {
                        cnjcVar.c.set(null);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, erpp.a);
            return true;
        }
    }
}
