package defpackage;

import android.os.Looper;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edyy implements edyr {
    private final ffbr a;
    private final dlpw b;

    public edyy(ffbr ffbrVar, dlpw dlpwVar) {
        this.a = ffbrVar;
        this.b = dlpwVar;
    }

    @Override // defpackage.edyr
    public final void a() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: edyx
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                edyy.this.b(defaultUncaughtExceptionHandler, thread, th);
            }
        });
    }

    public final /* synthetic */ void b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        long a = this.b.a();
        try {
            ArrayList arrayList = new ArrayList();
            if (thread == Looper.getMainLooper().getThread()) {
                Set set = (Set) this.a.b();
                ArrayList arrayList2 = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList2.add(((edyw) it.next()).a());
                    } catch (Throwable th2) {
                        arrayList.add(th2);
                    }
                }
                ListenableFuture[] listenableFutureArr = (ListenableFuture[]) arrayList2.toArray(new ListenableFuture[0]);
                final erqr erqrVar = new erqr(listenableFutureArr);
                engr d = engw.d(listenableFutureArr.length);
                for (int i = 0; i < listenableFutureArr.length; i++) {
                    d.h(new erqq(erqrVar));
                }
                final engw g = d.g();
                for (final int i2 = 0; i2 < listenableFutureArr.length; i2++) {
                    listenableFutureArr[i2].b(new Runnable() { // from class: erqk
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            erqr erqrVar2 = erqr.this;
                            ListenableFuture[] listenableFutureArr2 = erqrVar2.d;
                            int i3 = i2;
                            ListenableFuture listenableFuture = listenableFutureArr2[i3];
                            listenableFuture.getClass();
                            listenableFutureArr2[i3] = null;
                            int i4 = erqrVar2.e;
                            while (true) {
                                engw engwVar = g;
                                int i5 = ((enou) engwVar).c;
                                if (i4 >= i5) {
                                    erqrVar2.e = i5;
                                    return;
                                }
                                int i6 = i4 + 1;
                                if (((ernr) engwVar.get(i4)).m(listenableFuture)) {
                                    erqrVar2.a();
                                    erqrVar2.e = i6;
                                    return;
                                }
                                i4 = i6;
                            }
                        }
                    }, erpp.a);
                }
                enqv it2 = g.iterator();
                while (it2.hasNext()) {
                    try {
                        ersn.b((ListenableFuture) it2.next(), 4000 - (this.b.a() - a), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException e) {
                        arrayList.add(e);
                    } catch (Throwable th3) {
                        arrayList.add(th3);
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((Throwable) it3.next()).printStackTrace();
            }
        } finally {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
