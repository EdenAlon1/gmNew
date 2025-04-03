package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class erpb {
    public final erou a = new erou();
    protected final engw b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ erpb(Iterable iterable) {
        this.b = engw.j(iterable);
        enqv it = ((engw) iterable).iterator();
        while (it.hasNext()) {
            erph erphVar = (erph) it.next();
            erou erouVar = this.a;
            erri erriVar = erph.a;
            erphVar.i(erouVar);
        }
    }

    public final erph a(eroz erozVar, Executor executor) {
        erph erphVar = new erph(erqt.c(enfc.d(this.b).f(new emwl() { // from class: erox
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                erri erriVar = erph.a;
                return ((erph) obj).c;
            }
        }).g()).b(new eroy(this, erozVar), executor));
        erphVar.b.b(this.a, erpp.a);
        return erphVar;
    }
}
