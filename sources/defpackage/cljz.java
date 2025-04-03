package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cljz implements Function {
    public abstract void a(clqc clqcVar, coth cothVar);

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        clqc clqcVar = (clqc) obj;
        coth cothVar = (coth) cotk.a.createBuilder();
        b(clqcVar, cothVar);
        a(clqcVar, cothVar);
        return (cotk) cothVar.build();
    }

    public abstract void b(clqc clqcVar, coth cothVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
