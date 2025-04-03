package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class clke implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final axat apply(clsx clsxVar) {
        axas axasVar = (axas) axat.a.createBuilder();
        b(clsxVar, axasVar);
        c(clsxVar, axasVar);
        return (axat) axasVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(clsx clsxVar, axas axasVar);

    public abstract void c(clsx clsxVar, axas axasVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
