package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clvi {
    private static final cskc a = cskc.g("BugleDataModel", "ParticipantOfflineDetector");
    private final cqoh b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public clvi(cqoh cqohVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.b = cqohVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
    }

    public final void a(ConversationIdType conversationIdType) {
        bseh r = ((bczy) this.d.b()).r(conversationIdType);
        if (r == null || r.P().isPresent() || r.am() || r.k() != 0 || r.r() != 0 || !((ckds) this.e.b()).A(conversationIdType)) {
            return;
        }
        bdmq bdmqVar = (bdmq) this.c.b();
        ekzz f = eleg.f("MessageDatabaseOperations#getLatestOutgoingRcsMessage");
        try {
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.m(conversationIdType);
            buxzVar.ak(1, 25);
            buxzVar.K(3);
            buxzVar.B(false);
            Optional ofNullable = Optional.ofNullable(bdmqVar.m(new buxs(buxzVar)));
            f.close();
            if (ofNullable.isPresent() && bdjs.t(((MessageCoreData) ofNullable.get()).k())) {
                csjb a2 = a.a();
                a2.c(conversationIdType);
                a2.I("Set participant offline timestamp");
                a2.r();
                bczy bczyVar = (bczy) this.d.b();
                String[] strArr2 = bsom.a;
                bsoe bsoeVar = new bsoe();
                bsoeVar.ap("markRecipientOfflineIfXmsReceivedInRcsChat");
                bsoeVar.U(Optional.of(this.b.f()));
                bczyVar.ak(conversationIdType, bsoeVar);
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
