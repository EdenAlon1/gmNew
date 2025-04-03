package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cljs implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final clrd apply(awyl awylVar) {
        clrc clrcVar = (clrc) clrd.a.createBuilder();
        c(awylVar, clrcVar);
        int i = awylVar.b;
        b(awylVar, clrcVar);
        d(awylVar, clrcVar);
        return (clrd) clrcVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(awyl awylVar, clrc clrcVar);

    public abstract void c(awyl awylVar, clrc clrcVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(awyl awylVar, clrc clrcVar);
}
