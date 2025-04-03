package defpackage;

import j$.util.List;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjjx implements cjjt {
    private final cjjv a;
    private final List b;
    private final List c;
    private final cjkc d;

    public cjjx(cjjv cjjvVar, List list, cjkc cjkcVar) {
        list.getClass();
        this.a = cjjvVar;
        this.b = list;
        this.d = cjkcVar;
        List am = ffdx.am(list);
        this.c = am;
        List.EL.replaceAll(am, new UnaryOperator() { // from class: cjjw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cjjt cjjtVar = (cjjt) obj;
                cjjtVar.getClass();
                return new cjld(cjjtVar);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cjjt
    public final cjjv a() {
        return this.a;
    }

    @Override // defpackage.cjjt
    public final Object b(Object obj, ffgu ffguVar) {
        return this.d.a(obj, this.c, ffguVar);
    }

    public /* synthetic */ cjjx(cjjv cjjvVar, java.util.List list) {
        this(cjjvVar, list, new cjkc());
    }
}
