package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class clkc implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final axal apply(clsp clspVar) {
        axak axakVar = (axak) axal.a.createBuilder();
        b(clspVar, axakVar);
        c(clspVar, axakVar);
        return (axal) axakVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(clsp clspVar, axak axakVar);

    public abstract void c(clsp clspVar, axak axakVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
