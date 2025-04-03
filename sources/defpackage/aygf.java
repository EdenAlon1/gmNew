package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aygf implements ayfy {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/conversation/deleter/ConversationDeleterPwqImpl");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final errl e;
    private final ffbr f;

    public aygf(errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.e = errlVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.f = ffbrVar4;
    }

    @Override // defpackage.ayfy
    public final elfl a(final aygc aygcVar) {
        return elfo.f(new Runnable() { // from class: ayge
            @Override // java.lang.Runnable
            public final void run() {
                final aygf aygfVar = aygf.this;
                final aygc aygcVar2 = aygcVar;
                ayfx ayfxVar = (ayfx) aygcVar2;
                if (ayfxVar.e) {
                    ensk g = aygf.a.g();
                    g.Y(ente.a, "BugleConversation");
                    enrr enrrVar = (enrr) g;
                    enrrVar.Y(csux.p, ayfxVar.a);
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/conversation/deleter/ConversationDeleterPwqImpl", "deleteConversationExecution", 66, "ConversationDeleterPwqImpl.java")).q("Queuing conversation with DeleteConversationHandler to be deleted only if its empty (not using soft delete)");
                    aygfVar.c(aygcVar2);
                    return;
                }
                ensk g2 = aygf.a.g();
                g2.Y(ente.a, "BugleConversation");
                enrr enrrVar2 = (enrr) g2;
                enrrVar2.Y(csux.p, ayfxVar.a);
                ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/conversation/deleter/ConversationDeleterPwqImpl", "deleteConversationExecution", 74, "ConversationDeleterPwqImpl.java")).q("Soft deleting conversation and queuing with DeleteConversationHandler to be deleted");
                ((dtuu) aygfVar.c.b()).d("ConversationDeleterPwqImpl.deleteConversation", new Runnable() { // from class: aygd
                    @Override // java.lang.Runnable
                    public final void run() {
                        aygf aygfVar2 = aygf.this;
                        aygc aygcVar3 = aygcVar2;
                        ekzz f = eleg.f("DeleteDatabaseOperations#softDeleteConversation");
                        ayfx ayfxVar2 = (ayfx) aygcVar3;
                        long j = ayfxVar2.b;
                        ConversationIdType conversationIdType = ayfxVar2.a;
                        try {
                            csix.h();
                            String[] strArr = bsom.a;
                            bsoe bsoeVar = new bsoe();
                            bsoeVar.ap("softDeleteConversation");
                            bsoeVar.o(j);
                            bsoeVar.f(conversationIdType);
                            f.close();
                            ((cbgf) aygfVar2.b.b()).d(conversationIdType);
                            aygfVar2.c(aygcVar3);
                        } catch (Throwable th) {
                            try {
                                f.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                });
            }
        }, this.e);
    }

    @Override // defpackage.ayfy
    public final void b(aygc aygcVar) {
        a(aygcVar);
    }

    public final void c(aygc aygcVar) {
        ayfx ayfxVar = (ayfx) aygcVar;
        long j = ayfxVar.e ? 0L : ayfxVar.b;
        ceqc ceqcVar = (ceqc) this.f.b();
        ceqd ceqdVar = (ceqd) ceqe.a.createBuilder();
        String a2 = ayfxVar.a.a();
        ceqdVar.copyOnWrite();
        ceqe ceqeVar = (ceqe) ceqdVar.instance;
        a2.getClass();
        ceqeVar.b = a2;
        eoko eokoVar = ayfxVar.c;
        ceqdVar.copyOnWrite();
        ((ceqe) ceqdVar.instance).e = eokoVar.u;
        ceqdVar.copyOnWrite();
        ((ceqe) ceqdVar.instance).c = j;
        SuperSortLabel superSortLabel = ayfxVar.d;
        ceqdVar.copyOnWrite();
        ((ceqe) ceqdVar.instance).f = superSortLabel.i;
        boolean z = ayfxVar.e;
        ceqdVar.copyOnWrite();
        ((ceqe) ceqdVar.instance).d = z;
        ((cevh) ceqcVar.a.b()).a(ceyr.g("delete_conversation_handler", (ceqe) ceqdVar.build()));
    }
}
