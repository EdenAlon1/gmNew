package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class cfzj {
    public static engw a(Map map) {
        Stream map2 = Collection.EL.stream(map.entrySet()).map(new Function() { // from class: cfzi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                cfzc cfzcVar = new cfzc();
                cfzcVar.b((String) entry.getKey());
                cfzcVar.c((String) entry.getValue());
                return cfzcVar.a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return (engw) map2.collect(endq.a);
    }

    public static elfl b() {
        return elfo.e("");
    }

    public static elfl c() {
        return elfo.e(new ArrayList());
    }

    public static elfl d() {
        return elfo.e(new ArrayList());
    }
}
