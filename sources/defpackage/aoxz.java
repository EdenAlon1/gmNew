package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoxz implements alyd {
    private final apbq a;
    private final alyd b;

    public aoxz(apbq apbqVar, alyd alydVar) {
        this.a = apbqVar;
        this.b = alydVar;
    }

    @Override // defpackage.ctbf
    public final /* bridge */ /* synthetic */ elfl a(Object obj) {
        apsp apspVar;
        int e;
        List list;
        alyc alycVar = (alyc) obj;
        if ((alycVar instanceof apsp) && ((e = (apspVar = (apsp) alycVar).e()) == 2 || e == 11 || e == 5 || e == 6 || e == 14 || e == 1)) {
            apbq apbqVar = this.a;
            MessageIdType c = ((BugleMessageId) apspVar.b()).c();
            c.getClass();
            synchronized (apbqVar.c) {
                list = (List) apbqVar.c.get(c);
            }
            if (list == null || list.isEmpty()) {
            } else {
                axol.k(apbqVar.a, null, new apbo(c, apbqVar, list, null), 3);
            }
        }
        return this.b.a(alycVar);
    }

    @Override // defpackage.alyd
    public final elfl b() {
        return this.b.b();
    }
}
