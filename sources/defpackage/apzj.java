package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Size;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apzj implements apze {
    private final Context a;
    private final auqo b;

    public apzj(dran dranVar, Context context, auqo auqoVar) {
        dranVar.getClass();
        context.getClass();
        auqoVar.getClass();
        this.a = context;
        this.b = auqoVar;
    }

    private static final cmrl d(apyb apybVar) {
        cmrk cmrkVar = (cmrk) cmrl.a.createBuilder();
        cmrkVar.getClass();
        cmru.c(apybVar.a(), cmrkVar);
        cmru.d(cmrv.EMOTIFY, cmrkVar);
        cmru.b(dran.h(new dqzc(apybVar.a(), apybVar.b(), null, false, null, null, null, 0, 0, 0L, null, null, 4092)), cmrkVar);
        return cmru.a(cmrkVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r3 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        if (r3 != null) goto L34;
     */
    @Override // defpackage.apze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.appw a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r3, defpackage.apyv r4, defpackage.apyw r5, boolean r6) {
        /*
            r2 = this;
            apyb r4 = (defpackage.apyb) r4
            r5.getClass()
            r4 = 0
            if (r6 == 0) goto Ld
            apyw r6 = defpackage.apyw.a
            if (r5 != r6) goto Ld
            return r4
        Ld:
            apoe r6 = defpackage.apof.d()
            int r5 = r5.ordinal()
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L4e
            if (r5 != r1) goto L48
            java.lang.String r3 = r3.ar()
            if (r3 == 0) goto L3b
            int r5 = r3.length()
            if (r5 != 0) goto L28
            goto L29
        L28:
            r4 = r3
        L29:
            if (r4 == 0) goto L3b
            android.content.Context r3 = r2.a
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r0] = r4
            r4 = 2132087085(0x7f15112d, float:1.9814415E38)
            java.lang.String r3 = r3.getString(r4, r5)
            if (r3 == 0) goto L3b
            goto L7a
        L3b:
            android.content.Context r3 = r2.a
            r4 = 2132087084(0x7f15112c, float:1.9814413E38)
            java.lang.String r3 = r3.getString(r4)
            r3.getClass()
            goto L7a
        L48:
            ffcd r3 = new ffcd
            r3.<init>()
            throw r3
        L4e:
            java.lang.String r3 = r3.ar()
            if (r3 == 0) goto L6e
            int r5 = r3.length()
            if (r5 != 0) goto L5b
            goto L5c
        L5b:
            r4 = r3
        L5c:
            if (r4 == 0) goto L6e
            android.content.Context r3 = r2.a
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r0] = r4
            r4 = 2132086973(0x7f1510bd, float:1.9814188E38)
            java.lang.String r3 = r3.getString(r4, r5)
            if (r3 == 0) goto L6e
            goto L7a
        L6e:
            android.content.Context r3 = r2.a
            r4 = 2132086972(0x7f1510bc, float:1.9814186E38)
            java.lang.String r3 = r3.getString(r4)
            r3.getClass()
        L7a:
            r6.c(r3)
            apof r3 = r6.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apzj.a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, apyv, apyw, boolean):appw");
    }

    @Override // defpackage.apze
    public final /* bridge */ /* synthetic */ engw b(apyv apyvVar, apyw apywVar) {
        apyb apybVar = (apyb) apyvVar;
        apywVar.getClass();
        if (apywVar != apyw.a) {
            int i = engw.d;
            engw engwVar = enou.a;
            engwVar.getClass();
            return engwVar;
        }
        cmrl d = d(apybVar);
        draj drajVar = d.b == 101 ? (draj) d.c : draj.a;
        drajVar.getClass();
        dqzc i2 = dran.i(drajVar);
        String a = drne.a(i2).a();
        if (a == null) {
            throw new NullPointerException("Null contentType");
        }
        Uri parse = Uri.parse(i2.b);
        if (parse == null) {
            throw new NullPointerException("Null uri");
        }
        engw r = engw.r(new apzf(a, parse, new Size(i2.g, i2.h), i2.a));
        r.getClass();
        return r;
    }

    @Override // defpackage.apze
    public final void c(MessageCoreData messageCoreData, apyz apyzVar, alxg alxgVar, MessageCoreData messageCoreData2, boolean z) {
        cmrm cmrmVar;
        String str;
        String str2;
        apxz apxzVar;
        bdhg bdhgVar;
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
        apyb apybVar = (apyb) apyzVar.b();
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
        if (this.b.a() && (str3 = messageCoreData2.E().b) != null) {
            cmrt.c(str3, cmrrVar);
        }
        cmrs a = cmrt.a(cmrrVar);
        cmrw cmrwVar = (cmrw) cmry.a.createBuilder();
        cmrwVar.getClass();
        cmrz.c(apyzVar.d(), cmrwVar);
        cmry a2 = cmrz.a(cmrwVar);
        cmrl d = d(apybVar);
        int ordinal = c.ordinal();
        if (ordinal == 0) {
            cmrmVar = cmrm.ADD_REACTION;
        } else {
            if (ordinal != 1) {
                throw new ffcd();
            }
            cmrmVar = cmrm.REMOVE_REACTION;
        }
        ((MessageData) messageCoreData2).l = cnbs.a(conversationIdType, B, d, a, cmrmVar, a2);
        messageCoreData2.bx(true);
        if (messageCoreData2.cX() && messageCoreData.cX()) {
            fayv aa = messageCoreData2.aa();
            if (!messageCoreData.E().k()) {
                throw new IllegalArgumentException("Could not send reaction to a message without RCS message id");
            }
            String str4 = messageCoreData.D().k() ? messageCoreData.D().b : messageCoreData.E().b;
            boolean z2 = apyzVar instanceof apyy;
            String str5 = null;
            if (z2 && (apxzVar = ((apyy) apyzVar).a) != null && (bdhgVar = apxzVar.f) != null) {
                str5 = bdhgVar.b;
            }
            clbi b = clbi.b(aa);
            b.d(clbg.EMOTIFY_REACTIONS_NAMESPACE, "Reaction-Emotify-Id", ((apyb) apyzVar.b()).a());
            if (!z || (z2 && str5 == null)) {
                apyw c2 = apyzVar.c();
                clbg clbgVar = clbg.EMOTIFY_REACTIONS_NAMESPACE;
                int ordinal2 = c2.ordinal();
                if (ordinal2 == 0) {
                    str = "message-reaction-add";
                } else {
                    if (ordinal2 != 1) {
                        throw new ffcd();
                    }
                    str = "message-reaction-remove";
                }
                b.d(clbgVar, "Message-Reply-Type", str);
                b.d(clbg.EMOTIFY_REACTIONS_NAMESPACE, "In-Reply-To-Message-Id", str4);
            } else {
                if (z2) {
                    str5.getClass();
                    str4 = str5;
                } else {
                    str4.getClass();
                }
                apyw c3 = apyzVar.c();
                clbg clbgVar2 = clbg.GSMA_RCS_NAMESPACE;
                int ordinal3 = c3.ordinal();
                if (ordinal3 == 0) {
                    str2 = "+Custom-Reaction";
                } else {
                    if (ordinal3 != 1) {
                        throw new ffcd();
                    }
                    str2 = "-Custom-Reaction";
                }
                b.d(clbgVar2, "Reference-Type", str2);
                b.d(clbg.GSMA_RCS_NAMESPACE, "Reference-ID", str4);
            }
            fayv c4 = b.c();
            c4.getClass();
            messageCoreData2.bs(c4);
        }
    }
}
