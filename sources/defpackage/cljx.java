package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cljx implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cotg apply(clrv clrvVar) {
        Object apply;
        cotd cotdVar = (cotd) cotg.a.createBuilder();
        if ((clrvVar.b & 4) != 0) {
            Function function = clls.b;
            clqc clqcVar = clrvVar.e;
            if (clqcVar == null) {
                clqcVar = clqc.a;
            }
            apply = function.apply(clqcVar);
            cotk cotkVar = (cotk) apply;
            cotdVar.copyOnWrite();
            cotg cotgVar = (cotg) cotdVar.instance;
            cotkVar.getClass();
            cotgVar.c = cotkVar;
            cotgVar.b |= 1;
        }
        c(clrvVar, cotdVar);
        d(cotdVar);
        b(clrvVar, cotdVar);
        return (cotg) cotdVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(clrv clrvVar, cotd cotdVar);

    public abstract void c(clrv clrvVar, cotd cotdVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(cotd cotdVar);
}
