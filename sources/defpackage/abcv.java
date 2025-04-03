package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abcv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ abcy c;
    final /* synthetic */ ConversationIdType d;
    final /* synthetic */ cnpk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abcv(boolean z, abcy abcyVar, ConversationIdType conversationIdType, cnpk cnpkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = z;
        this.c = abcyVar;
        this.d = conversationIdType;
        this.e = cnpkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abcv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            if (this.b) {
                ((cnpd) this.c.b.b()).i();
            }
            elfl b = this.c.h.i().b();
            b.getClass();
            this.a = 1;
            obj = fgfz.c(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        final abcy abcyVar = this.c;
        final ConversationIdType conversationIdType = this.d;
        final cnpk cnpkVar = this.e;
        final engw engwVar = (engw) obj;
        abcyVar.g.d("SatelliteToolstoneUpdater#handleSatelliteConnectionStateChange", new Runnable() { // from class: abcu
            @Override // java.lang.Runnable
            public final void run() {
                MessageIdType messageIdType;
                ensk e = abcy.a.e();
                e.Y(ente.a, "BugleSatellite");
                ((enrr) e.h("com/google/android/apps/messaging/conversation2/satellite/SatelliteToolstoneUpdater$handleSatelliteConnectionStateChange$1", "invokeSuspend$lambda$0", 78, "SatelliteToolstoneUpdater.kt")).q("SatelliteToolstoneUpdater#handleConnectionTypeChange executing...");
                engw engwVar2 = engw.this;
                if (engwVar2.size() == 1) {
                    engwVar2.getClass();
                    if (aojl.a(((ResolvedRecipient) ffdx.T(engwVar2)).g().n()) || aojl.b(((ResolvedRecipient) ffdx.T(engwVar2)).g().n())) {
                        return;
                    }
                }
                cnpk cnpkVar2 = cnpkVar;
                ConversationIdType conversationIdType2 = conversationIdType;
                abcy abcyVar2 = abcyVar;
                MessageCoreData q = ((bdmq) abcyVar2.e.b()).q(conversationIdType2);
                int ordinal = cnpkVar2.ordinal();
                if (ordinal == 1) {
                    engwVar2.getClass();
                    if (q == null) {
                        ensk e2 = abcy.a.e();
                        e2.Y(ente.a, "BugleSatellite");
                        ((enrr) e2.h("com/google/android/apps/messaging/conversation2/satellite/SatelliteToolstoneUpdater", "insertToolstone", 120, "SatelliteToolstoneUpdater.kt")).q("SatelliteToolstoneUpdater#onSatellite executing ...");
                        int i2 = 251;
                        if (engwVar2.size() == 1 && ((ResolvedRecipient) ffdx.T(engwVar2)).g().v()) {
                            i2 = 239;
                        }
                        MessageCoreData n = ((bdmq) abcyVar2.e.b()).n(conversationIdType2);
                        if (n == null || (messageIdType = n.B()) == null) {
                            messageIdType = bdhb.a;
                        }
                        crlo crloVar = (crlo) abcyVar2.d.b();
                        messageIdType.getClass();
                        crloVar.a(conversationIdType2, messageIdType, i2);
                        ensk e3 = abcy.a.e();
                        e3.Y(ente.a, "BugleSatellite");
                        ((enrr) e3.h("com/google/android/apps/messaging/conversation2/satellite/SatelliteToolstoneUpdater", "insertToolstone", 134, "SatelliteToolstoneUpdater.kt")).q("SatelliteToolstoneUpdater#onSatellite toolstone updated.");
                    }
                } else if (ordinal != 2) {
                    ensk e4 = abcy.a.e();
                    e4.Y(ente.a, "BugleSatellite");
                    ((enrr) e4.h("com/google/android/apps/messaging/conversation2/satellite/SatelliteToolstoneUpdater", "removeToolstone", 143, "SatelliteToolstoneUpdater.kt")).q("SatelliteToolstoneUpdater#offSatellite executing...");
                    if (q != null && ((bdmq) abcyVar2.e.b()).r(conversationIdType2) != null) {
                        crlo crloVar2 = (crlo) abcyVar2.d.b();
                        MessageIdType B = q.B();
                        B.getClass();
                        crloVar2.c(B);
                        ensk e5 = abcy.a.e();
                        e5.Y(ente.a, "BugleSatellite");
                        ((enrr) e5.h("com/google/android/apps/messaging/conversation2/satellite/SatelliteToolstoneUpdater", "removeToolstone", 151, "SatelliteToolstoneUpdater.kt")).q("SatelliteToolstoneUpdater#offSatellite Toolstone deleted.");
                    }
                }
                ensk e6 = abcy.a.e();
                e6.Y(ente.a, "BugleSatellite");
                ((enrr) e6.h("com/google/android/apps/messaging/conversation2/satellite/SatelliteToolstoneUpdater$handleSatelliteConnectionStateChange$1", "invokeSuspend$lambda$0", 108, "SatelliteToolstoneUpdater.kt")).q("SatelliteToolstoneUpdater#handleConnectionTypeChange executed.");
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new abcv(this.b, this.c, this.d, this.e, ffguVar);
    }
}
