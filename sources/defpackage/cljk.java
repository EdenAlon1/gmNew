package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cljk implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final clny apply(awuw awuwVar) {
        clnx clnxVar = (clnx) clny.a.createBuilder();
        d(awuwVar, clnxVar);
        int i = awuwVar.b;
        b(awuwVar, clnxVar);
        if ((awuwVar.b & 2) != 0) {
            String str = awuwVar.d;
            clnxVar.copyOnWrite();
            clny clnyVar = (clny) clnxVar.instance;
            str.getClass();
            clnyVar.b |= 8;
            clnyVar.e = str;
        }
        c(awuwVar, clnxVar);
        return (clny) clnxVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(awuw awuwVar, clnx clnxVar);

    public abstract void c(awuw awuwVar, clnx clnxVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(awuw awuwVar, clnx clnxVar);
}
