package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class clkd implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cltb apply(axaq axaqVar) {
        clta cltaVar = (clta) cltb.a.createBuilder();
        c(axaqVar, cltaVar);
        int i = axaqVar.b;
        b(axaqVar, cltaVar);
        if ((axaqVar.b & 2) != 0) {
            String str = axaqVar.d;
            cltaVar.copyOnWrite();
            cltb cltbVar = (cltb) cltaVar.instance;
            str.getClass();
            cltbVar.b |= 8;
            cltbVar.e = str;
        }
        return (cltb) cltaVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(axaq axaqVar, clta cltaVar);

    public abstract void c(axaq axaqVar, clta cltaVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
