package defpackage;

import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clkp extends cljj {
    @Override // defpackage.cljj
    public final void c(clnm clnmVar, awun awunVar) {
        awunVar.a((Map) Collection.EL.stream(clnmVar.e).collect(endq.a(new Function() { // from class: clkm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((clno) obj).c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: clkn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((clno) obj).d;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })));
    }

    @Override // defpackage.cljj
    public final void d(awup awupVar, clnl clnlVar) {
        Stream map = Collection.EL.stream(DesugarCollections.unmodifiableMap(awupVar.e).entrySet()).map(new Function() { // from class: clko
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                clnn clnnVar = (clnn) clno.a.createBuilder();
                String str = (String) entry.getKey();
                clnnVar.copyOnWrite();
                clno clnoVar = (clno) clnnVar.instance;
                str.getClass();
                clnoVar.b |= 1;
                clnoVar.c = str;
                String str2 = (String) entry.getValue();
                clnnVar.copyOnWrite();
                clno clnoVar2 = (clno) clnnVar.instance;
                str2.getClass();
                clnoVar2.b |= 2;
                clnoVar2.d = str2;
                return (clno) clnnVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        clnlVar.a((Iterable) map.collect(endq.a));
    }
}
