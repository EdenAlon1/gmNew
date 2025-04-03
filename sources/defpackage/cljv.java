package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cljv implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final awyt apply(clrn clrnVar) {
        awys awysVar = (awys) awyt.a.createBuilder();
        b(clrnVar, awysVar);
        c(clrnVar, awysVar);
        return (awyt) awysVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(clrn clrnVar, awys awysVar);

    public abstract void c(clrn clrnVar, awys awysVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
