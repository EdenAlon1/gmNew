package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bec {
    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((bdy) it.next()).e();
        }
    }

    public static void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        do {
            try {
                ((bdy) list.get(i)).f();
                i++;
            } catch (bdw e) {
                while (true) {
                    i--;
                    if (i < 0) {
                        throw e;
                    }
                    ((bdy) list.get(i)).e();
                }
            }
        } while (i < list.size());
    }

    public static ListenableFuture c(final Collection collection, final Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(bkj.d(((bdy) it.next()).b()));
        }
        final ListenableFuture c = bkj.c(5000L, scheduledExecutorService, bkj.e(arrayList));
        return kfg.a(new kfd() { // from class: bea
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                final ListenableFuture listenableFuture = ListenableFuture.this;
                Runnable runnable = new Runnable() { // from class: bdz
                    @Override // java.lang.Runnable
                    public final void run() {
                        ListenableFuture.this.cancel(true);
                    }
                };
                Executor executor2 = executor;
                kfbVar.a(runnable, executor2);
                bkj.i(listenableFuture, new beb(kfbVar), executor2);
                return "surfaceList[" + collection + "]";
            }
        });
    }
}
