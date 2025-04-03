package defpackage;

import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzcz {
    private final ArrayDeque b = new ArrayDeque();
    public ListenableFuture a = null;

    public final synchronized ListenableFuture a(erog erogVar) {
        SettableFuture create;
        create = SettableFuture.create();
        this.b.add(new Pair(create, erogVar));
        if (this.a == null) {
            b();
        }
        return create;
    }

    public final synchronized void b() {
        final Pair pair = (Pair) this.b.poll();
        if (pair == null) {
            return;
        }
        try {
            ListenableFuture a = ((erog) pair.second).a();
            this.a = a;
            a.b(new Runnable() { // from class: dzcx
                @Override // java.lang.Runnable
                public final void run() {
                    dzcz dzczVar = dzcz.this;
                    Pair pair2 = pair;
                    synchronized (dzczVar) {
                        try {
                            ((SettableFuture) pair2.first).set(dzczVar.a.get());
                            dzczVar.a = null;
                            dzczVar.b();
                        } finally {
                        }
                    }
                }
            }, erpp.a);
        } catch (Throwable th) {
            ((SettableFuture) pair.first).setException(th);
            this.a = null;
            c(th);
        }
    }

    public final synchronized void c(Throwable th) {
        while (true) {
            Pair pair = (Pair) this.b.poll();
            if (pair != null) {
                ((SettableFuture) pair.first).setException(new dzcy(th));
            }
        }
    }
}
