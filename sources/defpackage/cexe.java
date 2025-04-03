package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cexe {
    final /* synthetic */ cexg a;
    private final ceve b;
    private final Long[] c;
    private final ceyt d;

    public cexe(cexg cexgVar, ceve ceveVar, Long[] lArr, ceyt ceytVar) {
        this.a = cexgVar;
        this.b = ceveVar;
        this.c = lArr;
        this.d = ceytVar;
    }

    public final String toString() {
        String str = (String) DesugarArrays.stream(this.c).map(new Function() { // from class: cexd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return String.valueOf((Long) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(","));
        String d = this.a.c.d(this.b);
        if (d == null) {
            d = "?";
        }
        Object obj = this.d;
        if (obj == null) {
            obj = "";
        }
        return d + " [" + str + "] " + obj.toString();
    }
}
