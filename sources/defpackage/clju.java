package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class clju implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final clrr apply(awyr awyrVar) {
        clrq clrqVar = (clrq) clrr.a.createBuilder();
        c(awyrVar, clrqVar);
        b(awyrVar, clrqVar);
        d(awyrVar, clrqVar);
        return (clrr) clrqVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(awyr awyrVar, clrq clrqVar);

    public abstract void c(awyr awyrVar, clrq clrqVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(awyr awyrVar, clrq clrqVar);
}
