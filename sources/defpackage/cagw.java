package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cagw implements bdnu {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/downgrade/DowngradeOnUnencryptedMessageListener");
    private final cagz b;
    private final ffbr c;

    public cagw(cagz cagzVar, ffbr ffbrVar) {
        this.b = cagzVar;
        this.c = ffbrVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [aoku, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [aoku, java.lang.Object] */
    @Override // defpackage.bdnu
    public final void d(MessageCoreData messageCoreData) {
        String al = messageCoreData.al();
        Optional ag = messageCoreData.ag();
        if (messageCoreData.cB()) {
            try {
                String aA = messageCoreData.aA();
                if (aA != null) {
                    ((cevh) this.b.a.b()).e("downgrade_on_unencrypted_message", aA);
                    return;
                }
                return;
            } catch (IndexOutOfBoundsException unused) {
                ensk h = a.h();
                h.Y(ente.a, "BugleDataModel");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/downgrade/DowngradeOnUnencryptedMessageListener", "afterMessageInserted", 64, "DowngradeOnUnencryptedMessageListener.java")).q("Nothing to cancel in DowngradeOnUnencryptedMessageQueue");
                return;
            }
        }
        if (messageCoreData.cF() || al == null) {
            return;
        }
        if (eijq.b.g(al) || eijq.e.g(al) || eijq.c.g(al)) {
            cagx cagxVar = (cagx) cagy.a.createBuilder();
            String conversationIdType = messageCoreData.z().toString();
            cagxVar.copyOnWrite();
            cagy cagyVar = (cagy) cagxVar.instance;
            conversationIdType.getClass();
            cagyVar.c = conversationIdType;
            long r = messageCoreData.r();
            cagxVar.copyOnWrite();
            ((cagy) cagxVar.instance).d = r;
            awui w = messageCoreData.w();
            cagxVar.copyOnWrite();
            cagy cagyVar2 = (cagy) cagxVar.instance;
            w.getClass();
            cagyVar2.h = w;
            cagyVar2.b |= 2;
            String str = messageCoreData.E().b;
            if (str != null) {
                cagxVar.copyOnWrite();
                ((cagy) cagxVar.instance).e = str;
            }
            String valueOf = String.valueOf(String.valueOf(messageCoreData.z()));
            if (!ag.isPresent() || !ag.get().e().isPresent()) {
                ensk j = a.j();
                j.Y(ente.a, "BugleDataModel");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/downgrade/DowngradeOnUnencryptedMessageListener", "afterMessageInserted", 89, "DowngradeOnUnencryptedMessageListener.java")).q("SenderIdentity not found. Unable to downgrade.");
                ((akzt) this.c.b()).e("Bugle.Etouffee.Conversation.Encryption.Update", caqc.SKIP_DOWNGRADE_DUE_TO_MISSING_SENDER_IDENTITY.u);
                return;
            }
            String concat = "etouffee-downgrade-conversation-".concat(valueOf);
            awui awuiVar = (awui) ag.get().e().get();
            String str2 = awuiVar.d;
            cagxVar.copyOnWrite();
            cagy cagyVar3 = (cagy) cagxVar.instance;
            cagyVar3.g = awuiVar;
            cagyVar3.b |= 1;
            cagxVar.copyOnWrite();
            cagy cagyVar4 = (cagy) cagxVar.instance;
            str2.getClass();
            cagyVar4.f = str2;
            cagy cagyVar5 = (cagy) cagxVar.build();
            String str3 = concat + "-" + messageCoreData.aA();
            cagz cagzVar = this.b;
            cetp cetpVar = new cetp();
            cetpVar.b = str3;
            cetpVar.d = str3;
            ((cevh) cagzVar.a.b()).g(ceyr.h("downgrade_on_unencrypted_message", cagyVar5, cetpVar.a()));
        }
    }

    @Override // defpackage.bdnu
    public final void e(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdnu
    public final void k(MessageCoreData messageCoreData) {
    }
}
