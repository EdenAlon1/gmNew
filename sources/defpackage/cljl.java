package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cljl implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final awuz apply(clnu clnuVar) {
        awuy awuyVar = (awuy) awuz.a.createBuilder();
        b(clnuVar, awuyVar);
        c(clnuVar, awuyVar);
        d(clnuVar, awuyVar);
        e(awuyVar);
        return (awuz) awuyVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(clnu clnuVar, awuy awuyVar);

    public abstract void c(clnu clnuVar, awuy awuyVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(clnu clnuVar, awuy awuyVar);

    public abstract void e(awuy awuyVar);
}
