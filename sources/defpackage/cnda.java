package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnda implements cndm {
    private static final entd a = entd.c("BugleReactions");
    private final cmsl b;
    private final bbfb c;
    private final byzp d;
    private final cndj e;
    private final cqoh f;
    private final awtm g;
    private final ffbr h;

    public cnda(cmsl cmslVar, bbfb bbfbVar, byzp byzpVar, cndj cndjVar, cqoh cqohVar, awtm awtmVar, ffbr ffbrVar) {
        this.b = cmslVar;
        this.c = bbfbVar;
        this.d = byzpVar;
        this.e = cndjVar;
        this.f = cqohVar;
        this.g = awtmVar;
        this.h = ffbrVar;
    }

    private final void c(cndi cndiVar, cmrl cmrlVar, cmrm cmrmVar) {
        cmrx cmrxVar;
        String str;
        ffbr ffbrVar = this.h;
        long a2 = this.f.a();
        cndh cndhVar = (cndh) cndiVar;
        awui b = ((ckac) ffbrVar.b()).b(cndhVar.b);
        String a3 = this.e.a(cmrmVar, cmrlVar, ((cmsw) cndhVar.d).c);
        byzp byzpVar = this.d;
        ConversationIdType conversationIdType = cndhVar.a;
        SelfIdentityId selfIdentityId = cndhVar.c;
        MessageCoreData h = byzpVar.h(conversationIdType, selfIdentityId, b, a3, "text/plain", null);
        cmrh cmrhVar = (cmrh) cmri.a.createBuilder();
        cmrhVar.copyOnWrite();
        ((cmri) cmrhVar.instance).c = true;
        if (selfIdentityId != null) {
            String b2 = selfIdentityId.b();
            cmrhVar.copyOnWrite();
            ((cmri) cmrhVar.instance).b = b2;
        }
        cmrr cmrrVar = (cmrr) cmrs.a.createBuilder();
        cmrrVar.copyOnWrite();
        cmrs cmrsVar = (cmrs) cmrrVar.instance;
        cmri cmriVar = (cmri) cmrhVar.build();
        cmriVar.getClass();
        cmrsVar.c = cmriVar;
        cmrsVar.b |= 1;
        cmrs cmrsVar2 = (cmrs) cmrrVar.build();
        ConversationIdType conversationIdType2 = cndhVar.a;
        cmtd cmtdVar = cndhVar.d;
        cmrw cmrwVar = (cmrw) cmry.a.createBuilder();
        eprt eprtVar = ((cmqi) cndhVar.e).a;
        int ordinal = eprtVar.ordinal();
        if (ordinal == 1) {
            cmrxVar = cmrx.REACTION_BAR;
        } else if (ordinal == 3) {
            cmrxVar = cmrx.DITTO_REACTION_BAR;
        } else {
            if (ordinal != 4) {
                throw new IllegalArgumentException("Could not convert surface type: " + eprtVar.k);
            }
            cmrxVar = cmrx.CUSTOM_REACTION_PICKER;
        }
        MessageIdType messageIdType = ((cmsw) cmtdVar).a;
        cmrwVar.copyOnWrite();
        ((cmry) cmrwVar.instance).b = cmrxVar.a();
        int i = cndhVar.b;
        cmrwVar.copyOnWrite();
        ((cmry) cmrwVar.instance).c = i;
        ((MessageData) h).l = cnbs.a(conversationIdType2, messageIdType, cmrlVar, cmrsVar2, cmrmVar, (cmry) cmrwVar.build());
        cmtd cmtdVar2 = cndhVar.d;
        clbi a4 = clbi.a();
        clbg clbgVar = clbg.REACTIONS_NAMESPACE;
        int ordinal2 = cmrmVar.ordinal();
        if (ordinal2 == 1) {
            str = "message-reaction-add";
        } else {
            if (ordinal2 != 2) {
                throw new IllegalArgumentException("Could not get replyType header for reaction action: " + cmrmVar.a());
            }
            str = "message-reaction-remove";
        }
        a4.d(clbgVar, "Message-Reply-Type", str);
        String str2 = ((cmsw) cmtdVar2).b.b;
        if (str2 != null) {
            a4.d(clbg.REACTIONS_NAMESPACE, "In-Reply-To-Message-Id", str2);
        }
        h.bs(a4.c());
        h.bx(true);
        h.ce(this.g.a());
        this.c.d(h, cndhVar.b, eooi.MESSAGE_REACTION, a2).t();
        if (this.b.b()) {
            ensz a5 = a.a(this.b.a());
            a5.Y(csux.o, cndhVar.a.toString());
            a5.Y(csux.m, aquz.b(cndhVar.c));
            a5.Y(cmsm.d, ((cmsw) cndhVar.d).a.toString());
            a5.Y(cmsm.f, ((cmsw) cndhVar.d).b.f());
            a5.Y(cmsm.b, h.E().f());
            a5.Y(cmsm.i, cmrmVar);
            ((ensz) a5.h("com/google/android/apps/messaging/shared/reactions/transport/rcsfallback/sender/ReactionsRcsFallbackSender", "sendReaction", 134, "ReactionsRcsFallbackSender.java")).q("Initiated sending of the reaction.");
        }
    }

    @Override // defpackage.cndm
    public final void a(cndi cndiVar, cmrl cmrlVar) {
        if (this.b.b()) {
            ((ensz) a.a(this.b.a()).h("com/google/android/apps/messaging/shared/reactions/transport/rcsfallback/sender/ReactionsRcsFallbackSender", "addReaction", 84, "ReactionsRcsFallbackSender.java")).q("ReactionsRcsFallbackSender#addReaction()");
        }
        c(cndiVar, cmrlVar, cmrm.ADD_REACTION);
    }

    @Override // defpackage.cndm
    public final void b(cndi cndiVar, cmrl cmrlVar) {
        if (this.b.b()) {
            ((ensz) a.a(this.b.a()).h("com/google/android/apps/messaging/shared/reactions/transport/rcsfallback/sender/ReactionsRcsFallbackSender", "removeReaction", 94, "ReactionsRcsFallbackSender.java")).q("ReactionsRcsFallbackSender#removeReaction()");
        }
        c(cndiVar, cmrlVar, cmrm.REMOVE_REACTION);
    }
}
