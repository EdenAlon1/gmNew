package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzra extends ceut {
    private static final cskc a = cskc.g("BugleEtouffee", "UpdateConversationEncryptionStatusHandler");
    private final ffbr b;

    public bzra(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.b(cevc.WORKMANAGER_ONLY);
        l.f(poa.EXPONENTIAL);
        poh pohVar = new poh();
        pohVar.c(2);
        ((ceti) l).a = pohVar.a();
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("UpdateConversationEncryptionStatusHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return bzrc.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        bzrc bzrcVar = (bzrc) eyhsVar;
        ConversationIdType b = bdgq.b(bzrcVar.b);
        if (b.b()) {
            a.r("Conversation ID is missing.");
            return elfo.e(ceyt.i());
        }
        csjb a2 = a.a();
        a2.I("Processing work item");
        a2.c(b);
        a2.r();
        emxf.a(!bzrcVar.c.isEmpty());
        eygr eygrVar = bzrcVar.c;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = eygrVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((bzqk) this.b.b()).a((awui) it.next(), b).a());
        }
        return elfo.j(arrayList).a(new Callable() { // from class: bzqz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ceyt.i();
            }
        }, erpp.a);
    }
}
