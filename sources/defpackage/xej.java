package defpackage;

import android.app.assist.AssistContent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xej extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xek b;
    final /* synthetic */ AssistContent c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xej(xek xekVar, AssistContent assistContent, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = xekVar;
        this.c = assistContent;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xej) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        r2.put("conversation_type", r4);
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r0 = "conversation_id"
            ffhh r1 = defpackage.ffhh.a
            int r2 = r7.a
            r3 = 1
            defpackage.ffci.b(r8)
            if (r2 == 0) goto Ld
            goto L1a
        Ld:
            xek r8 = r7.b
            r7.a = r3
            ffxx r8 = r8.c
            java.lang.Object r8 = defpackage.fgbj.a(r8, r7)
            if (r8 != r1) goto L1a
            return r1
        L1a:
            xek r1 = r7.b
            alxj r8 = (defpackage.alxj) r8
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = r1.b
            java.lang.String r1 = r1.b()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            alxi r8 = r8.b()     // Catch: org.json.JSONException -> L5e
            r4 = 0
            if (r8 != 0) goto L31
            goto L53
        L31:
            int r8 = r8.ordinal()     // Catch: org.json.JSONException -> L5e
            if (r8 == 0) goto L53
            if (r8 == r3) goto L51
            r3 = 2
            if (r8 == r3) goto L4e
            r3 = 3
            if (r8 == r3) goto L4b
            r3 = 4
            if (r8 != r3) goto L45
            java.lang.String r4 = "Business"
            goto L53
        L45:
            ffcd r8 = new ffcd     // Catch: org.json.JSONException -> L5e
            r8.<init>()     // Catch: org.json.JSONException -> L5e
            throw r8     // Catch: org.json.JSONException -> L5e
        L4b:
            java.lang.String r4 = "RBM"
            goto L53
        L4e:
            java.lang.String r4 = "Group"
            goto L53
        L51:
            java.lang.String r4 = "Individual"
        L53:
            if (r4 == 0) goto L5a
            java.lang.String r8 = "conversation_type"
            r2.put(r8, r4)     // Catch: org.json.JSONException -> L5e
        L5a:
            r2.put(r0, r1)     // Catch: org.json.JSONException -> L5e
            goto L7e
        L5e:
            r8 = move-exception
            enru r3 = defpackage.xek.a
            ensk r3 = r3.j()
            enrr r3 = (defpackage.enrr) r3
            ensk r8 = r3.g(r8)
            java.lang.String r3 = "invokeSuspend"
            r4 = 47
            java.lang.String r5 = "com/google/android/apps/messaging/conversation2/assistant/AssistantAdapterImpl$onProvideAssistContent$1"
            java.lang.String r6 = "AssistantAdapterImpl.kt"
            ensk r8 = r8.h(r5, r3, r4, r6)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r3 = "Error parsing ConversationData for Assistant"
            r8.q(r3)
        L7e:
            android.app.assist.AssistContent r8 = r7.c
            java.lang.String r2 = r2.toString()
            r8.setStructuredData(r2)
            android.app.assist.AssistContent r8 = r7.c
            android.content.Intent r8 = r8.getIntent()
            r8.putExtra(r0, r1)
            android.app.assist.AssistContent r8 = r7.c
            xek r0 = r7.b
            android.content.Intent r8 = r8.getIntent()
            java.lang.String r1 = "mapi_conversation_id"
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r0 = r0.b
            r8.putExtra(r1, r0)
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xej.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xej(this.b, this.c, ffguVar);
    }
}
