package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class clji implements Function {
    public abstract void a(clne clneVar, awtw awtwVar);

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(clne clneVar, awtw awtwVar);

    @Override // java.util.function.Function
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final awtx apply(clne clneVar) {
        awtw awtwVar = (awtw) awtx.a.createBuilder();
        a(clneVar, awtwVar);
        b(clneVar, awtwVar);
        return (awtx) awtwVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
