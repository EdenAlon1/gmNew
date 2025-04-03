package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnmg {
    public static final bdhg a(fayv fayvVar) {
        fayvVar.getClass();
        if (b(fayvVar).k()) {
            return b(fayvVar);
        }
        Optional a = clbh.a(fayvVar, clbg.REPLIES_NAMESPACE, "In-Reply-To-Message-Id");
        final cnmf cnmfVar = cnmf.a;
        Object orElse = a.map(new Function() { // from class: cnme
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(bdhg.a);
        orElse.getClass();
        return (bdhg) orElse;
    }

    public static final bdhg b(fayv fayvVar) {
        return ffkj.e("Reply", (String) fflm.b(clbh.a(fayvVar, clbg.GSMA_RCS_NAMESPACE, "Reference-Type"))) ? bdhg.a((String) fflm.b(clbh.a(fayvVar, clbg.GSMA_RCS_NAMESPACE, "Reference-ID"))) : bdhg.a;
    }
}
