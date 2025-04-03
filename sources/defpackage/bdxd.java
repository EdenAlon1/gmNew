package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdxd {
    public static final /* synthetic */ int b = 0;
    private static final entd c = entd.c("BugleNotifications");
    public final bdxa a;
    private final ffbr d;

    public bdxd(bdxa bdxaVar, ffbr ffbrVar) {
        this.a = bdxaVar;
        this.d = ffbrVar;
    }

    public final void a(final MessageIdType messageIdType) {
        ((ensz) c.n().h("com/google/android/apps/messaging/shared/datamodel/data/util/RequestLinkPreviewScheduler", "requestLinkPreview", 35, "RequestLinkPreviewScheduler.java")).q("running requestLinkPreview after commit in silo execution");
        dtuu dtuuVar = (dtuu) this.d.b();
        dtut dtutVar = new dtut() { // from class: bdxb
            @Override // defpackage.dtut
            public final ekzz a() {
                int i = bdxd.b;
                return eleg.f("UsageStatisticsImpl::logMessageSentOrReceivedInSiloExecution");
            }
        };
        String valueOf = String.valueOf(messageIdType.toString());
        dtuuVar.h(dtutVar, valueOf.concat("logMessageSentOrReceived"), new Runnable() { // from class: bdxc
            @Override // java.lang.Runnable
            public final void run() {
                cerz cerzVar = (cerz) cesa.a.createBuilder();
                String b2 = messageIdType.b();
                cerzVar.copyOnWrite();
                cesa cesaVar = (cesa) cerzVar.instance;
                b2.getClass();
                cesaVar.b |= 1;
                cesaVar.c = b2;
                cerzVar.copyOnWrite();
                cesa cesaVar2 = (cesa) cerzVar.instance;
                cesaVar2.d = 1;
                cesaVar2.b |= 2;
                ((cevh) bdxd.this.a.a.b()).a(ceyr.g("request_link_preview", (cesa) cerzVar.build()));
            }
        }, dtuz.TXN_1);
    }

    public final void b(MessageIdType messageIdType) {
        cerz cerzVar = (cerz) cesa.a.createBuilder();
        String b2 = messageIdType.b();
        cerzVar.copyOnWrite();
        cesa cesaVar = (cesa) cerzVar.instance;
        b2.getClass();
        cesaVar.b |= 1;
        cesaVar.c = b2;
        cerzVar.copyOnWrite();
        cesa cesaVar2 = (cesa) cerzVar.instance;
        cesaVar2.d = 2;
        cesaVar2.b = 2 | cesaVar2.b;
        ((cevh) this.a.a.b()).g(ceyr.g("request_link_preview", (cesa) cerzVar.build()));
    }
}
