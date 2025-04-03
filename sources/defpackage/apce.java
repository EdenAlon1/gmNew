package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apce implements aqge {
    public final ConversationIdType a;
    private final becj b;
    private final aouq c;
    private final ffsk d;
    private final BugleConversationId e;
    private final beci f;

    public apce(becj becjVar, aouq aouqVar, ffsk ffskVar, BugleConversationId bugleConversationId) {
        this.b = becjVar;
        this.c = aouqVar;
        this.d = ffskVar;
        this.e = bugleConversationId;
        this.a = bugleConversationId.a;
        coin b = ScheduledSendTable.b();
        b.c(ScheduledSendTable.c.a);
        b.e(new Function() { // from class: apcb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                coit coitVar = (coit) obj;
                coitVar.d(coiu.SCHEDULED);
                coitVar.aq(new dtrt("scheduled_send.conversation_id", 1, Long.valueOf(bdgq.a(apce.this.a))));
                return coitVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxo d = MessagesTable.d();
        d.c(MessagesTable.c.a);
        b.G(dtvz.i(d.b(), MessagesTable.c.a, ScheduledSendTable.c.b).g());
        this.f = becjVar.a(b.b(), "BugleMessageRespository.ScheduledMessagesQuery");
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.f.f(new ctbf() { // from class: apcc
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "ScheduledMessageObservableSupplier::register", "ScheduledMessageObservableSupplier::callback", "ScheduledMessageObservableSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new apcd(this, null));
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aqge
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final engw c() {
        engw y = cogw.a(this.a).y();
        y.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
        enqv it = y.iterator();
        while (it.hasNext()) {
            cnvv cnvvVar = (cnvv) it.next();
            aouq aouqVar = this.c;
            BugleConversationId bugleConversationId = this.e;
            apnr apnrVar = (apnr) aouqVar.a.b();
            apnrVar.getClass();
            cnvvVar.getClass();
            arrayList.add(new aoup(apnrVar, bugleConversationId, cnvvVar));
        }
        return engq.a(arrayList);
    }
}
