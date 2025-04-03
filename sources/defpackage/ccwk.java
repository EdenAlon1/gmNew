package defpackage;

import j$.util.function.Function$CC;
import java.util.Collection;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccwk implements Function {
    final /* synthetic */ Collection a;

    public ccwk(Collection collection) {
        this.a = collection;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        bsol bsolVar = (bsol) obj;
        bsolVar.t(bdgq.d(this.a));
        return bsolVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
