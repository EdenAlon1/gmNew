package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clkr extends cljk {
    @Override // defpackage.cljk
    public final void b(awuw awuwVar, clnx clnxVar) {
        clqr clqrVar = (clqr) clqs.a.createBuilder();
        String str = awuwVar.c;
        clqrVar.copyOnWrite();
        clqs clqsVar = (clqs) clqrVar.instance;
        str.getClass();
        clqsVar.b |= 1;
        clqsVar.c = str;
        clnxVar.copyOnWrite();
        clny clnyVar = (clny) clnxVar.instance;
        clqs clqsVar2 = (clqs) clqrVar.build();
        clny clnyVar2 = clny.a;
        clqsVar2.getClass();
        clnyVar.d = clqsVar2;
        clnyVar.b |= 4;
    }

    @Override // defpackage.cljk
    public final void c(awuw awuwVar, clnx clnxVar) {
        Stream map = Collection.EL.stream(awuwVar.g).map(new Function() { // from class: clkq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cllk.b((awui) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        Iterable iterable = (Iterable) map.collect(endq.a);
        clnxVar.copyOnWrite();
        clny clnyVar = (clny) clnxVar.instance;
        clny clnyVar2 = clny.a;
        eygr eygrVar = clnyVar.f;
        if (!eygrVar.c()) {
            clnyVar.f = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, clnyVar.f);
    }

    @Override // defpackage.cljk
    public final void d(awuw awuwVar, clnx clnxVar) {
        eydp eydpVar = (eydp) eydq.a.createBuilder();
        eyee eyeeVar = awuwVar.h;
        eydpVar.copyOnWrite();
        eydq eydqVar = (eydq) eydpVar.instance;
        eyeeVar.getClass();
        eydqVar.c = eyeeVar;
        clnxVar.copyOnWrite();
        clny clnyVar = (clny) clnxVar.instance;
        eydq eydqVar2 = (eydq) eydpVar.build();
        clny clnyVar2 = clny.a;
        eydqVar2.getClass();
        clnyVar.c = eydqVar2;
        clnyVar.b |= 1;
    }
}
