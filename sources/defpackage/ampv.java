package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ampv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ BugleConversation b;
    final /* synthetic */ ampx c;
    final /* synthetic */ ampp d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ampv(ffgu ffguVar, BugleConversation bugleConversation, ampx ampxVar, ampp amppVar) {
        super(2, ffguVar);
        this.b = bugleConversation;
        this.c = ampxVar;
        this.d = amppVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ampv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r5.c(r1, r2, r4) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0022, code lost:
    
        if (r5 != r0) goto L9;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r5)
            goto L3c
        Ld:
            defpackage.ffci.b(r5)
            goto L24
        L11:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.e
            ffsk r5 = (defpackage.ffsk) r5
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r5 = r4.b
            amqf r1 = defpackage.amqf.a
            r4.a = r2
            java.lang.Object r5 = r1.a(r5, r4)
            if (r5 == r0) goto L5b
        L24:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L3f
            ampx r5 = r4.c
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r1 = r4.b
            ampp r2 = r4.d
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = r5.c(r1, r2, r4)
            if (r5 != r0) goto L3c
            goto L5b
        L3c:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L3f:
            enru r5 = defpackage.ampx.a
            ensk r5 = r5.h()
            java.lang.String r0 = "invokeSuspend"
            r1 = 102(0x66, float:1.43E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/shared/api/messaging/conversation/customtheme/controller/RichThemeControllerImpl$sendRichTheme$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r3 = "RichThemeControllerImpl.kt"
            ensk r5 = r5.h(r2, r0, r1, r3)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r0 = "Capability check failed. Not sending custom theme selection."
            r5.q(r0)
            ffcu r5 = defpackage.ffcu.a
            return r5
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ampv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ampv ampvVar = new ampv(ffguVar, this.b, this.c, this.d);
        ampvVar.e = obj;
        return ampvVar;
    }
}
