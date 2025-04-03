package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ebrr {
    public Context c;

    public abstract dwch a();

    public abstract ebpe b();

    public abstract ebrs c();

    public abstract emxc d();

    public abstract emxc e();

    public abstract void f(eawd eawdVar);

    public abstract void g(ExecutorService executorService);

    public abstract void h(eayr eayrVar);

    public abstract void i(ebrz ebrzVar);

    public abstract void j(ebtw ebtwVar);

    public abstract void k(dwch dwchVar);

    public abstract void l(ebvw ebvwVar);

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    public final ebrs m() {
        if (!d().g()) {
            g(Executors.newCachedThreadPool(ebog.a()));
        }
        ?? c = d().c();
        eayr eayrVar = new eayr(((ebph) b()).a);
        h(eayrVar);
        i(new ebrz(eayrVar, ((ebph) b()).a));
        eawd eawdVar = ((ebph) b()).c;
        if (eawdVar == null) {
            ((ebph) b()).b.getClass();
            f(new eawq(this.c, c, ((ebph) b()).a, ((ebph) b()).b));
        } else {
            f(eawdVar);
        }
        if (!e().g()) {
            j(new ebtv(((ebph) b()).a, this.c));
        }
        dwch a = a();
        if (!(a instanceof dwcg)) {
            l(new ebvz(((ebph) b()).a, eayrVar, a, new emyl() { // from class: ebvx
                @Override // defpackage.emyl
                public final Object get() {
                    return null;
                }
            }));
        }
        return c();
    }
}
