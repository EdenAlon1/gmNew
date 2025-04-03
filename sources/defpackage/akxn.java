package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class akxn {
    public abstract akxn a(eolu eoluVar);

    public abstract akxo b();

    public abstract akyo c();

    public abstract void d(epyw epywVar);

    public abstract void e(alal alalVar);

    public abstract void f(akzo akzoVar);

    public abstract void g(Optional optional);

    public final void h(eolu eoluVar, alal alalVar) {
        akyo c = c();
        akxn a = a(eoluVar);
        a.e(alalVar);
        ((akxj) a).b = 2;
        c.c(a.b());
    }

    public final void i(ListenableFuture listenableFuture, final alal alalVar) {
        f(akzn.a(((akyn) c()).c));
        g(c().b(alalVar));
        axnw.h(elfl.g(listenableFuture).h(new emwl() { // from class: akxm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                akxn.this.j((eolu) obj, alalVar);
                return true;
            }
        }, ((akyn) c()).b));
    }

    public final void j(eolu eoluVar, alal alalVar) {
        akyo c = c();
        akxn a = a(eoluVar);
        a.e(alalVar);
        ((akxj) a).b = 3;
        c.c(a.b());
    }
}
