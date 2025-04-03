package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvpe extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvpf b;
    final /* synthetic */ wgi c;
    final /* synthetic */ SuggestionData d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvpe(cvpf cvpfVar, wgi wgiVar, SuggestionData suggestionData, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cvpfVar;
        this.c = wgiVar;
        this.d = suggestionData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvpe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (defpackage.fgfz.c(r6, r5) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005a, code lost:
    
        if (defpackage.fgfz.c(r6, r5) == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x007d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005d, code lost:
    
        r6 = defpackage.wgp.a.createBuilder();
        r0 = defpackage.wgk.a;
        r6.copyOnWrite();
        r1 = (defpackage.wgp) r6.instance;
        r0.getClass();
        r1.c = r0;
        r1.b = 2;
        r6 = r6.build();
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007c, code lost:
    
        return r6;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            defpackage.ffci.b(r6)
            if (r1 == 0) goto Le
            if (r1 == r3) goto L36
            goto L5d
        Le:
            cvpf r6 = r5.b
            wgi r1 = r5.c
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r4 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            bcqs r1 = r1.b()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = r1.e
            r4.<init>(r1)
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData r1 = r5.d
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r1 = r1.x()
            cvqc r6 = r6.b
            aqbs r6 = r6.a
            elfl r6 = r6.c(r4, r1)
            r6.getClass()
            r5.a = r3
            java.lang.Object r6 = defpackage.fgfz.c(r6, r5)
            if (r6 == r0) goto L7d
        L36:
            cvpf r6 = r5.b
            ffbr r6 = r6.a
            java.lang.Object r6 = r6.b()
            ctqh r6 = (defpackage.ctqh) r6
            wgi r1 = r5.c
            bcqs r1 = r1.b()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = r1.e
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData r3 = r5.d
            java.lang.String r3 = r3.b()
            fbre r4 = defpackage.fbre.CONSUMED
            elfl r6 = r6.a(r1, r3, r4)
            r5.a = r2
            java.lang.Object r6 = defpackage.fgfz.c(r6, r5)
            if (r6 != r0) goto L5d
            goto L7d
        L5d:
            wgp r6 = defpackage.wgp.a
            eyfq r6 = r6.createBuilder()
            wgm r6 = (defpackage.wgm) r6
            wgk r0 = defpackage.wgk.a
            r6.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r1 = r6.instance
            wgp r1 = (defpackage.wgp) r1
            r0.getClass()
            r1.c = r0
            r1.b = r2
            eyfy r6 = r6.build()
            r6.getClass()
            return r6
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvpe.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvpe(this.b, this.c, this.d, ffguVar);
    }
}
