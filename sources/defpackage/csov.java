package defpackage;

import j$.util.Map;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class csov implements Consumer {
    public final /* synthetic */ csow a;

    public /* synthetic */ csov(csow csowVar) {
        this.a = csowVar;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        Integer num = (Integer) obj;
        num.intValue();
        csow csowVar = this.a;
        synchronized (csowVar.j) {
            for (csmx csmxVar : (List) Map.EL.getOrDefault(csowVar.i, num, new ArrayList())) {
                csmxVar.getClass();
                axnw.h(elfo.f(new csou(csmxVar), csowVar.b));
            }
            for (csmx csmxVar2 : (List) Map.EL.getOrDefault(csowVar.i, -1, new ArrayList())) {
                csmxVar2.getClass();
                axnw.h(elfo.f(new csou(csmxVar2), csowVar.b));
            }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
