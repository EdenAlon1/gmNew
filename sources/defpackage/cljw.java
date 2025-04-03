package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cljw implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final clsh apply(awyz awyzVar) {
        clsg clsgVar = (clsg) clsh.a.createBuilder();
        d(awyzVar, clsgVar);
        if ((awyzVar.b & 2048) != 0) {
            emwd emwdVar = cllq.b;
            axad axadVar = awyzVar.n;
            if (axadVar == null) {
                axadVar = axad.a;
            }
            clsn clsnVar = (clsn) emwdVar.fP(axadVar);
            clsgVar.copyOnWrite();
            clsh clshVar = (clsh) clsgVar.instance;
            clsnVar.getClass();
            clshVar.d = clsnVar;
            clshVar.b |= 2;
        }
        b(awyzVar, clsgVar);
        c(awyzVar, clsgVar);
        if ((awyzVar.b & 1024) != 0) {
            emwd emwdVar2 = cllq.a;
            awya awyaVar = awyzVar.m;
            if (awyaVar == null) {
                awyaVar = awya.a;
            }
            clpi clpiVar = (clpi) emwdVar2.fP(awyaVar);
            clsgVar.copyOnWrite();
            clsh clshVar2 = (clsh) clsgVar.instance;
            clpiVar.getClass();
            clshVar2.g = clpiVar;
            clshVar2.b |= 16;
        }
        e(clsgVar);
        return (clsh) clsgVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(awyz awyzVar, clsg clsgVar);

    public abstract void c(awyz awyzVar, clsg clsgVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(awyz awyzVar, clsg clsgVar);

    public abstract void e(clsg clsgVar);
}
