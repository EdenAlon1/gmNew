package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class clkb implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final clst apply(axaj axajVar) {
        clss clssVar = (clss) clst.a.createBuilder();
        c(axajVar, clssVar);
        b(axajVar, clssVar);
        return (clst) clssVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(axaj axajVar, clss clssVar);

    public abstract void c(axaj axajVar, clss clssVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
