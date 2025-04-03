package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class bdmt implements Function {
    public final /* synthetic */ bdmz a;

    public /* synthetic */ bdmt(bdmz bdmzVar) {
        this.a = bdmzVar;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        bcse bcseVar = (bcse) ((bcyh) obj);
        ((bdjj) this.a.b.b()).a(bcseVar);
        return bcseVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
