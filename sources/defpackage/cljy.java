package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cljy implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final awzd apply(clsd clsdVar) {
        awzc awzcVar = (awzc) awzd.a.createBuilder();
        b(clsdVar, awzcVar);
        c(clsdVar, awzcVar);
        e(awzcVar);
        if ((clsdVar.b & 32) != 0) {
            boolean z = clsdVar.h;
            awzcVar.copyOnWrite();
            awzd awzdVar = (awzd) awzcVar.instance;
            awzdVar.b |= 8;
            awzdVar.f = z;
        }
        d(clsdVar, awzcVar);
        f(awzcVar);
        return (awzd) awzcVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(clsd clsdVar, awzc awzcVar);

    public abstract void c(clsd clsdVar, awzc awzcVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(clsd clsdVar, awzc awzcVar);

    public abstract void e(awzc awzcVar);

    public abstract void f(awzc awzcVar);
}
