package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class calb {
    public static final cskc a = cskc.g("BugleEtouffee", "MessageFailureDataServiceImpl");
    public final bzqb b;
    public final bbfg c;
    public final ffbr d;
    private final errl e;

    public calb(errl errlVar, bzqb bzqbVar, bbfg bbfgVar, ffbr ffbrVar) {
        this.e = errlVar;
        this.b = bzqbVar;
        this.c = bbfgVar;
        this.d = ffbrVar;
    }

    public final void a(final MessageIdType messageIdType) {
        elfo.f(new Runnable() { // from class: cala
            @Override // java.lang.Runnable
            public final void run() {
                calb calbVar = calb.this;
                MessageIdType messageIdType2 = messageIdType;
                if (!bzwf.g()) {
                    if (!calbVar.b.k(messageIdType2)) {
                        csjb c = calb.a.c();
                        c.I("Failed to update etouffee status, skip resending");
                        c.A("messageId", messageIdType2);
                        c.r();
                        return;
                    }
                    boolean j = ((cqrl) calbVar.d.b()).j(messageIdType2);
                    csjb a2 = calb.a.a();
                    a2.I("Resending as non-etouffee message");
                    a2.A("messageId", messageIdType2);
                    a2.B("Chat API file upload response deleted?", j);
                    a2.r();
                    calbVar.c.b(messageIdType2, new MessageUsageStatisticsDataImpl());
                    return;
                }
                Optional e = calbVar.b.e(messageIdType2);
                if (!e.isPresent()) {
                    csjb e2 = calb.a.e();
                    e2.I("Failed to prepare the message, skip resending");
                    e2.d(messageIdType2);
                    e2.r();
                    return;
                }
                MessageIdType messageIdType3 = (MessageIdType) e.get();
                boolean j2 = ((cqrl) calbVar.d.b()).j(messageIdType2);
                csjb a3 = calb.a.a();
                a3.I("Resending as non-etouffee message");
                a3.d(messageIdType2);
                a3.A("messageIdToResend", messageIdType3);
                a3.B("Chat API file upload response deleted?", j2);
                a3.r();
                calbVar.c.b(messageIdType3, new MessageUsageStatisticsDataImpl());
            }
        }, this.e).k(axnw.b(), erpp.a);
    }
}
