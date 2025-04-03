package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekuh implements ejny {
    public final ejoc a;
    public final errl b;
    private final eksc c;
    private final ektx d;
    private final boolean e;

    public ekuh(eksc ekscVar, ejoc ejocVar, ektx ektxVar, errl errlVar, boolean z) {
        this.c = ekscVar;
        this.a = ejocVar;
        this.d = ektxVar;
        this.b = errlVar;
        this.e = z;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final ListenableFuture b(final WorkerParameters workerParameters) {
        return !this.e ? erqt.i(new ppp()) : this.d instanceof ekuy ? erny.f(this.c.b(), eldl.a(new emwl() { // from class: ekuf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return new ppp();
            }
        }), erpp.a) : erny.g(this.c.a(), eldl.d(new eroh() { // from class: ekug
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final ekuh ekuhVar = ekuh.this;
                ejoc ejocVar = ekuhVar.a;
                final WorkerParameters workerParameters2 = workerParameters;
                return ejks.a(erny.g(ejocVar.e("com.google.apps.tiktok.sync.impl.workmanager.SyncWorker"), eldl.d(new eroh() { // from class: ekuc
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) obj2).iterator();
                        while (true) {
                            final WorkerParameters workerParameters3 = workerParameters2;
                            final ekuh ekuhVar2 = ekuh.this;
                            if (!it.hasNext()) {
                                return erqt.a(arrayList).b(eldl.c(new erog() { // from class: ekue
                                    @Override // defpackage.erog
                                    public final ListenableFuture a() {
                                        return ekuh.this.a.b(workerParameters3.a);
                                    }
                                }), ekuhVar2.b);
                            }
                            pqq pqqVar = (pqq) it.next();
                            if (!workerParameters3.a.equals(pqqVar.a)) {
                                arrayList.add(ekuhVar2.a.b(pqqVar.a));
                            }
                        }
                    }
                }), ekuhVar.b), new Callable() { // from class: ekud
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new ppn();
                    }
                }, erpp.a);
            }
        }), this.b);
    }
}
