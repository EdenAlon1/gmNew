package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cirr extends ceut {
    public static final entd a = entd.c("BugleNotifications");
    public final ffbr b;
    public final ffbr c;
    private final errl d;

    public cirr(ffbr ffbrVar, ffbr ffbrVar2, errl errlVar) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = errlVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("MarkFailuresAsNotifiedHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cirv.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final cirv cirvVar = (cirv) eyhsVar;
        return elfo.g(new Callable() { // from class: cirq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cirr cirrVar;
                Iterator<E> it = cirvVar.b.iterator();
                boolean z = false;
                while (true) {
                    cirrVar = cirr.this;
                    if (!it.hasNext()) {
                        break;
                    }
                    ciru ciruVar = (ciru) it.next();
                    int i = ciruVar.b;
                    if ((i & 1) == 0 || (i & 2) == 0) {
                        ((ensz) ((ensz) cirr.a.j()).h("com/google/android/apps/messaging/shared/notification/workhandlers/MarkFailuresAsNotifiedHandler", "markFailedMessagesAsNotified", 73, "MarkFailuresAsNotifiedHandler.java")).q("Conversation or message ID not found for resetting failed message notification");
                    } else {
                        bdmq bdmqVar = (bdmq) cirrVar.b.b();
                        ConversationIdType b = bdgq.b(ciruVar.c);
                        MessageIdType b2 = bdhb.b(ciruVar.d);
                        String[] strArr = MessagesTable.a;
                        buxr buxrVar = new buxr();
                        buxrVar.ap("markFailedMessagesAsNotified");
                        buxrVar.v(true);
                        if (bdmqVar.U(b, b2, buxrVar)) {
                            ensk o = cirr.a.o();
                            o.Y(csux.o, ciruVar.c);
                            o.Y(csux.a, ciruVar.d);
                            ((ensz) o.h("com/google/android/apps/messaging/shared/notification/workhandlers/MarkFailuresAsNotifiedHandler", "markFailedMessagesAsNotified", 92, "MarkFailuresAsNotifiedHandler.java")).q("Marked failed message as notified");
                            z = true;
                        }
                    }
                }
                if (!z) {
                    return ceyt.i();
                }
                return ceyt.j(engw.r(cisl.c()));
            }
        }, this.d);
    }
}
