package defpackage;

import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azjq implements Function {
    final /* synthetic */ List a;

    public azjq(List list) {
        this.a = list;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        azjl azjlVar = (azjl) obj;
        engr engrVar = new engr();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            engrVar.h(String.valueOf(azcs.b((azcr) it.next())));
        }
        azjlVar.aq(new dtrw("groups.token", 3, azjl.at(engrVar.g()), false));
        return azjlVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
