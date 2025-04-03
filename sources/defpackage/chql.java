package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class chql implements emwl {
    public final /* synthetic */ chqs a;

    @Override // defpackage.emwl
    public final Object apply(Object obj) {
        Stream stream = Collection.EL.stream((engw) obj);
        final chqs chqsVar = this.a;
        Stream map = stream.map(new Function() { // from class: chqe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                aqux aquxVar = (aqux) obj2;
                esak g = chqs.this.g(aquxVar.g().b(), aquxVar.r(), aquxVar.n(), aquxVar.q());
                g.copyOnWrite();
                esal esalVar = (esal) g.instance;
                esal esalVar2 = esal.a;
                esalVar.g = true;
                escu a = chqb.a(aquxVar.b());
                g.copyOnWrite();
                esal esalVar3 = (esal) g.instance;
                a.getClass();
                esalVar3.h = a;
                esalVar3.b |= 4;
                return (esal) g.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return (engw) map.collect(endq.a);
    }
}
