package defpackage;

import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azdy implements Function {
    final /* synthetic */ Set a;

    public azdy(Set set) {
        this.a = set;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        azds azdsVar = (azds) obj;
        engr engrVar = new engr();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            engrVar.h(String.valueOf(azcs.b((azcr) it.next())));
        }
        azdsVar.aq(new dtrw("destinations.token", 3, azds.at(engrVar.g()), false));
        return azdsVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
