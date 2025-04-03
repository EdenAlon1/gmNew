package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elfj {
    public final erph a;

    public elfj(erph erphVar) {
        this.a = erphVar;
    }

    public static elfh a(elfj... elfjVarArr) {
        int i = engw.d;
        engr engrVar = new engr();
        for (elfj elfjVar : elfjVarArr) {
            engrVar.h(elfjVar.a);
        }
        engw g = engrVar.g();
        erri erriVar = erph.a;
        return new elfh(new erpb(g));
    }

    public static elfj c(ListenableFuture listenableFuture) {
        return new elfj(new erph(listenableFuture));
    }

    public static elfj d(erov erovVar, Executor executor) {
        return new elfj(erph.c(eldl.f(erovVar), executor));
    }

    public static elfj e(final eros erosVar, Executor executor) {
        long j = eldl.a;
        final elat e = ekyf.e();
        return new elfj(erph.d(new eros() { // from class: elcu
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                long j2 = eldl.a;
                erpcVar.getClass();
                elat h = ekyf.h(ekyf.b(), elat.this);
                try {
                    return erosVar.a(erpcVar);
                } finally {
                }
            }
        }, executor));
    }

    public final elfj b(Class cls, erow erowVar, Executor executor) {
        return new elfj(this.a.a(cls, eldl.g(erowVar), executor));
    }

    public final elfj f(erow erowVar, Executor executor) {
        return new elfj(this.a.e(eldl.g(erowVar), executor));
    }

    public final elfj g(erot erotVar, Executor executor) {
        return new elfj(this.a.f(eldl.e(erotVar), executor));
    }

    public final elfl h() {
        return elfl.g(this.a.g());
    }

    public final String toString() {
        return "PropagatedClosingFuture[" + this.a.toString() + "]";
    }
}
