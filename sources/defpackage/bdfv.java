package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdfv implements bdfp {
    private static final enru d = enru.c("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationParticipantsProviderImpl");
    public final ffbr a;
    public final aolr b;
    public final bdtd c;
    private final djsi e;
    private final ffhd f;
    private final ffsk g;

    public bdfv(ffbr ffbrVar, aolr aolrVar, djsi djsiVar, bdtd bdtdVar, ffhd ffhdVar, ffsk ffskVar) {
        ffbrVar.getClass();
        aolrVar.getClass();
        djsiVar.getClass();
        bdtdVar.getClass();
        ffhdVar.getClass();
        ffskVar.getClass();
        this.a = ffbrVar;
        this.b = aolrVar;
        this.e = djsiVar;
        this.c = bdtdVar;
        this.f = ffhdVar;
        this.g = ffskVar;
    }

    @Override // defpackage.bdfp
    public final elfl a(ConversationIdType conversationIdType) {
        elfl c;
        conversationIdType.getClass();
        c = axol.c(this.g, ffhe.a, ffsm.a, new bdfr(this, conversationIdType, null));
        return c;
    }

    @Override // defpackage.bdfp
    public final elfl b(ConversationIdType conversationIdType) {
        elfl c;
        conversationIdType.getClass();
        c = axol.c(this.g, ffhe.a, ffsm.a, new bdft(this, conversationIdType, null));
        return c;
    }

    @Override // defpackage.bdfp
    public final Object c(ConversationIdType conversationIdType, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.f), new bdfs(null, this, conversationIdType), ffguVar);
    }

    @Override // defpackage.bdfp
    public final Object d(ConversationIdType conversationIdType, awui awuiVar, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.f), new bdfu(null, this, conversationIdType, awuiVar), ffguVar);
    }

    @Override // defpackage.bdfp
    public final List e(ConversationIdType conversationIdType) {
        efbd.b();
        return i(conversationIdType);
    }

    @Override // defpackage.bdfp
    public final List f(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        efbd.b();
        return j(conversationIdType);
    }

    @Override // defpackage.bdfp
    public final boolean g(ConversationIdType conversationIdType, awui awuiVar) {
        conversationIdType.getClass();
        List L = ((bczy) this.a.b()).L(conversationIdType);
        if (L.isEmpty()) {
            ensk j = d.j();
            j.Y(ente.a, "BugleConversation");
            enrr enrrVar = (enrr) j;
            enrrVar.Y(csux.p, conversationIdType);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationParticipantsProviderImpl", "isParticipantInGroupRcsConversationBlocking", 81, "ConversationParticipantsProviderImpl.kt")).q("The conversation does not contain any participants.");
            return false;
        }
        engw y = this.b.y(L);
        y.getClass();
        ArrayList arrayList = new ArrayList();
        enqv it = y.iterator();
        while (it.hasNext()) {
            Optional e = ((aoku) it.next()).e();
            e.getClass();
            awui awuiVar2 = (awui) fflm.b(e);
            if (awuiVar2 != null) {
                arrayList.add(awuiVar2);
            }
        }
        return arrayList.contains(awuiVar);
    }

    public final aoku h(aztg aztgVar) {
        if (aztgVar.j()) {
            return (aoku) fflm.b(aztgVar.b());
        }
        djrj b = this.e.b(aztgVar.e());
        if (b != null) {
            return this.b.c(b.a, new emyl() { // from class: bdfq
                @Override // defpackage.emyl
                public final Object get() {
                    return Optional.empty();
                }
            });
        }
        ensk e = d.e();
        e.Y(ente.a, "BugleConversation");
        ((enrr) e.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationParticipantsProviderImpl", "toMessagingIdentity", 193, "ConversationParticipantsProviderImpl.kt")).q("No associated RCS provisioning, fallback on subscription.");
        return (aoku) fflm.b(aztgVar.b());
    }

    public final List i(ConversationIdType conversationIdType) {
        List L = ((bczy) this.a.b()).L(conversationIdType);
        L.getClass();
        return L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List j(ConversationIdType conversationIdType) {
        ffbr ffbrVar = this.a;
        List i = i(conversationIdType);
        bseh r = ((bczy) ffbrVar.b()).r(conversationIdType);
        if (r != null && byyr.d(r.k())) {
            SelfIdentityId c = aqvf.c(r.S());
            if (c == null) {
                ensk j = d.j();
                j.Y(ente.a, "BugleConversation");
                ((enrr) j.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationParticipantsProviderImpl", "doGetParticipantsExcludingConversationCurrentSelf", 140, "ConversationParticipantsProviderImpl.kt")).t("Current self id is not present for RCS group conversation[%s].", conversationIdType);
                return i;
            }
            aztg d2 = this.c.d(c);
            if (d2 == null) {
                ensk j2 = d.j();
                j2.Y(ente.a, "BugleConversation");
                ((enrr) j2.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationParticipantsProviderImpl", "getCurrentSelfParticipantMessagingIdentity", 170, "ConversationParticipantsProviderImpl.kt")).t("No subscription associated with currentSelfId[%s].", c);
            }
            aoku h = d2 != null ? h(d2) : null;
            if (h != null) {
                ArrayList arrayList = new ArrayList();
                enqv it = ((engw) i).iterator();
                while (it.hasNext()) {
                    E next = it.next();
                    if (!ffkj.e(this.b.q((ParticipantsTable.BindData) next), h)) {
                        arrayList.add(next);
                    }
                }
                return arrayList;
            }
        }
        return i;
    }
}
