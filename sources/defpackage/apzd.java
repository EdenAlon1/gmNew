package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apzd implements apze {
    private final cndj a;
    private final cmrq b;
    private final auqo c;
    private final auqv d;

    public apzd(cndj cndjVar, cmrq cmrqVar, auqo auqoVar, auqv auqvVar) {
        cndjVar.getClass();
        cmrqVar.getClass();
        auqoVar.getClass();
        this.a = cndjVar;
        this.b = cmrqVar;
        this.c = auqoVar;
        this.d = auqvVar;
    }

    private final cmrl d(apxx apxxVar) {
        return this.b.b(apxxVar.a);
    }

    private static final cmrm e(apyw apywVar) {
        int ordinal = apywVar.ordinal();
        if (ordinal == 0) {
            return cmrm.ADD_REACTION;
        }
        if (ordinal == 1) {
            return cmrm.REMOVE_REACTION;
        }
        throw new ffcd();
    }

    @Override // defpackage.apze
    public final /* synthetic */ appw a(MessageCoreData messageCoreData, apyv apyvVar, apyw apywVar, boolean z) {
        String a;
        apxx apxxVar = (apxx) apyvVar;
        apywVar.getClass();
        cmrl d = d(apxxVar);
        if (z) {
            a = apxxVar.a;
        } else {
            a = this.a.a(e(apywVar), d, cmtc.a(((MessageData) messageCoreData).i));
        }
        apoe d2 = apof.d();
        d2.c(a);
        return d2.a();
    }

    @Override // defpackage.apze
    public final /* bridge */ /* synthetic */ engw b(apyv apyvVar, apyw apywVar) {
        apywVar.getClass();
        int i = engw.d;
        engw engwVar = enou.a;
        engwVar.getClass();
        return engwVar;
    }

    @Override // defpackage.apze
    public final void c(MessageCoreData messageCoreData, apyz apyzVar, alxg alxgVar, MessageCoreData messageCoreData2, boolean z) {
        String str;
        String str2;
        String str3;
        apyzVar.getClass();
        alxgVar.getClass();
        aqux g = alxgVar.g();
        if (g == null) {
            throw new IllegalArgumentException("Could not send a reaction without a SelfIdentity");
        }
        ConversationIdType conversationIdType = ((BugleConversationId) alxgVar.f()).a;
        MessageIdType B = messageCoreData.B();
        B.getClass();
        apxx apxxVar = (apxx) apyzVar.b();
        apyw c = apyzVar.c();
        cmrr cmrrVar = (cmrr) cmrs.a.createBuilder();
        cmrrVar.getClass();
        cmrh cmrhVar = (cmrh) cmri.a.createBuilder();
        cmrhVar.getClass();
        cmrj.b(true, cmrhVar);
        cmrj.c(g.g().b(), cmrhVar);
        cmrt.b(cmrj.a(cmrhVar), cmrrVar);
        fjay aJ = messageCoreData2.aJ();
        aJ.getClass();
        cmrt.d(aJ, cmrrVar);
        if (this.c.a() && (str3 = messageCoreData2.E().b) != null) {
            cmrt.c(str3, cmrrVar);
        }
        cmrs a = cmrt.a(cmrrVar);
        cmrw cmrwVar = (cmrw) cmry.a.createBuilder();
        cmrwVar.getClass();
        cmrz.c(apyzVar.d(), cmrwVar);
        cmrz.b(g.b(), cmrwVar);
        ((MessageData) messageCoreData2).l = cnbs.a(conversationIdType, B, d(apxxVar), a, e(c), cmrz.a(cmrwVar));
        messageCoreData2.bx(true);
        if (messageCoreData2.cX()) {
            apyw c2 = apyzVar.c();
            cmrx d = apyzVar.d();
            clbi b = clbi.b(messageCoreData2.aa());
            if (z) {
                clbg clbgVar = clbg.GSMA_RCS_NAMESPACE;
                int ordinal = c2.ordinal();
                if (ordinal == 0) {
                    str2 = "+Reaction";
                } else {
                    if (ordinal != 1) {
                        throw new ffcd();
                    }
                    str2 = "-Reaction";
                }
                b.d(clbgVar, "Reference-Type", str2);
            } else {
                clbg clbgVar2 = clbg.REACTIONS_NAMESPACE;
                int ordinal2 = c2.ordinal();
                if (ordinal2 == 0) {
                    str = "message-reaction-add";
                } else {
                    if (ordinal2 != 1) {
                        throw new ffcd();
                    }
                    str = "message-reaction-remove";
                }
                b.d(clbgVar2, "Message-Reply-Type", str);
            }
            if (messageCoreData.D().k() || messageCoreData.E().k()) {
                String str4 = messageCoreData.D().k() ? messageCoreData.D().b : messageCoreData.E().b;
                if (z) {
                    b.d(clbg.GSMA_RCS_NAMESPACE, "Reference-ID", str4);
                } else {
                    b.d(clbg.REACTIONS_NAMESPACE, "In-Reply-To-Message-Id", str4);
                }
            }
            if (((ersq) ((auqf) this.d).a.b()).a("bugle.send_reaction_surface_type")) {
                b.d(clbg.REACTIONS_NAMESPACE, "Origin-Surface-Type", String.valueOf(cmqk.a(d).k));
            }
            fayv c3 = b.c();
            c3.getClass();
            messageCoreData2.bs(c3);
            if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
                Optional a2 = clbh.a(messageCoreData.aa(), clbg.RCS_PENPAL_NAMESPACE, "PENPAL-CONVERSATION-ID");
                Optional a3 = clbh.a(messageCoreData.aa(), clbg.RCS_PENPAL_NAMESPACE, "PENPAL-MESSAGE-ID");
                if (a2.isEmpty() || a3.isEmpty()) {
                    return;
                }
                clbi b2 = clbi.b(messageCoreData2.aa());
                b2.d(clbg.RCS_PENPAL_NAMESPACE, "PENPAL-CONVERSATION-ID", (String) a2.get());
                b2.d(clbg.RCS_PENPAL_NAMESPACE, "PENPAL-MESSAGE-ID", (String) a3.get());
                messageCoreData2.bs(b2.c());
            }
        }
    }
}
