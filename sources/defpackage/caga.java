package defpackage;

import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caga {
    public final ffbr a;
    private final chpz b;
    private final Map c = new ConcurrentHashMap();

    public caga(chpz chpzVar, ffbr ffbrVar) {
        this.b = chpzVar;
        this.a = ffbrVar;
    }

    public final elfl a(String str) {
        final chpz chpzVar = this.b;
        chpzVar.getClass();
        return elfl.g(((chpy) Map.EL.computeIfAbsent(this.c, str, new Function() { // from class: cafy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return chpz.this.a((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })).b.h().h(new emwl() { // from class: chpt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((chod) obj).c;
            }
        }, erpp.a));
    }
}
