package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekvn {
    public final dlpw a;
    private final errm b;

    public ekvn(dlpw dlpwVar, errm errmVar) {
        this.a = dlpwVar;
        this.b = errmVar;
    }

    public final ListenableFuture a(erog erogVar, enip enipVar) {
        final long a = this.a.a();
        HashSet<ekvl> hashSet = new HashSet();
        Iterator<E> it = enipVar.iterator();
        while (it.hasNext()) {
            errm errmVar = this.b;
            final ekvm ekvmVar = (ekvm) it.next();
            ekvmVar.getClass();
            ListenableFuture i = elfr.i(eldl.c(new erog() { // from class: ekvi
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    return ekvm.this.b();
                }
            }), errmVar);
            ejjz.c(i, "Future Monitor failed", new Object[0]);
            hashSet.add(new ekvf(ekvmVar, i));
        }
        final ListenableFuture i2 = elfr.i(eldl.c(erogVar), erpp.a);
        final ListenableFuture a2 = ejks.a(i2, eldl.m(new Callable() { // from class: ekvg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(ekvn.this.a.a() - a);
            }
        }), erpp.a);
        errm errmVar2 = this.b;
        HashSet hashSet2 = new HashSet();
        for (final ekvl ekvlVar : hashSet) {
            ListenableFuture b = elfr.b(ekvlVar.b(), a2, i2).b(new erog() { // from class: ekvj
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    ekvl ekvlVar2 = ekvl.this;
                    erqt.q(ekvlVar2.b());
                    Long l = (Long) erqt.q(a2);
                    return ekvlVar2.a().a(i2, l.longValue());
                }
            }, errmVar2);
            ejjz.c(b, "Future Monitor failed", new Object[0]);
            hashSet2.add(b);
        }
        return elfr.b(i2, erqt.p(erqt.j(erqt.a(hashSet2).a(eldl.m(new Callable() { // from class: ekvk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }), erpp.a)), 10L, TimeUnit.SECONDS, this.b)).b(eldl.c(new erog() { // from class: ekvh
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return ListenableFuture.this;
            }
        }), erpp.a);
    }
}
