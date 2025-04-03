package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejqc implements ejny {
    public static final enru a = enru.c("com/google/apps/tiktok/contrib/work/impl/WipeoutWorker");
    public static final erqj b = new ejpx();
    public final Executor c;
    public final ejpq d;
    private final eiyk f;
    private final erqj g = new ejpy();
    private final erqj h = new ejpz();
    public final erqj e = new ejqa();
    private final erqj i = new ejqb();

    public ejqc(eiyk eiykVar, Executor executor, ejpq ejpqVar) {
        this.f = eiykVar;
        this.c = executor;
        this.d = ejpqVar;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final ListenableFuture b(WorkerParameters workerParameters) {
        final ListenableFuture h = this.d.a.h(pqt.a("tiktok_account_work"));
        final ListenableFuture d = this.f.d();
        ListenableFuture a2 = elfr.d(h, d).a(new Callable() { // from class: ejpv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Set set = (Set) erqt.q(ListenableFuture.this);
                Collection collection = (Collection) erqt.q(h);
                int i = engw.d;
                engr engrVar = new engr();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    eisx a3 = ejqf.a(((pqq) it.next()).c);
                    if (!set.contains(a3)) {
                        engrVar.h(ejqf.c(a3));
                    }
                }
                return engrVar.g();
            }
        }, this.c);
        elfr.l(a2, this.g, this.c);
        ListenableFuture j = elfr.j(a2, new emwl() { // from class: ejpw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = engw.d;
                engr engrVar = new engr();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ejqc ejqcVar = ejqc.this;
                    ListenableFuture f = erny.f(ejqcVar.d.a.a((String) it.next()), new emwl() { // from class: ejpj
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return null;
                        }
                    }, erpp.a);
                    elfr.l(f, ejqcVar.e, ejqcVar.c);
                    engrVar.h(f);
                }
                return engrVar.g();
            }
        }, this.c);
        elfr.l(j, this.h, this.c);
        ListenableFuture k = elfr.k(j, new eroh() { // from class: ejpt
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ejpq ejpqVar = ejqc.this.d;
                return erny.f(ejpqVar.a.i(), new emwl() { // from class: ejpo
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }, ejpqVar.b);
            }
        }, this.c);
        elfr.l(k, this.i, this.c);
        return elfr.d(j, k).a(new Callable() { // from class: ejpu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ppp();
            }
        }, this.c);
    }
}
