package defpackage;

import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azsl implements Function {
    final /* synthetic */ Iterable a;

    public azsl(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        azrm azrmVar = (azrm) obj;
        engr engrVar = new engr();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            engrVar.h(String.valueOf(azsv.b((azsu) it.next())));
        }
        azrmVar.aq(new dtrw("my_identities.token", 3, azrm.at(engrVar.g()), false));
        return azrmVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
