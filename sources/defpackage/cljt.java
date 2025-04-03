package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cljt implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final awyn apply(clqz clqzVar) {
        awym awymVar = (awym) awyn.a.createBuilder();
        b(clqzVar, awymVar);
        c(clqzVar, awymVar);
        return (awyn) awymVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(clqz clqzVar, awym awymVar);

    public abstract void c(clqz clqzVar, awym awymVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
