package defpackage;

import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ygw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ IncomingDraft b;
    final /* synthetic */ ygy c;
    final /* synthetic */ ffji d;
    Object e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygw(ffgu ffguVar, IncomingDraft incomingDraft, ygy ygyVar, ffji ffjiVar) {
        super(2, ffguVar);
        this.b = incomingDraft;
        this.c = ygyVar;
        this.d = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ygw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b2, code lost:
    
        if (r1.c.d(r11, r10) != r0) goto L20;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r10.a
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/replacer/DraftReplacerImpl$replaceDraft$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r4 = "DraftReplacerImpl.kt"
            java.lang.String r5 = "BugleComposeRow2"
            r6 = 1
            if (r1 == 0) goto L20
            if (r1 == r6) goto L16
            defpackage.ffci.b(r11)
            goto Lb5
        L16:
            java.lang.Object r1 = r10.e
            java.lang.Object r7 = r10.f
            xhu r7 = (defpackage.xhu) r7
            defpackage.ffci.b(r11)
            goto L53
        L20:
            defpackage.ffci.b(r11)
            java.lang.Object r11 = r10.f
            ffsk r11 = (defpackage.ffsk) r11
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r11 = r10.b
            ygy r1 = r10.c
            ydb r7 = r1.b
            fgdj r7 = r7.a
            r8 = 5
            xgp r1 = r1.d
            xhu r11 = defpackage.yct.a(r11, r8, r1)
            java.lang.Object r1 = r7.c()
            xhu r1 = (defpackage.xhu) r1
            boolean r7 = r1.a()
            if (r7 == 0) goto L7a
            ffji r7 = r10.d
            r10.f = r11
            r10.e = r1
            r10.a = r6
            java.lang.Object r7 = r7.invoke(r10)
            if (r7 == r0) goto Lb4
            r9 = r7
            r7 = r11
            r11 = r9
        L53:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L79
            enru r11 = defpackage.ygy.a
            ensk r11 = r11.e()
            ensn r0 = defpackage.ente.a
            r11.Y(r0, r5)
            r0 = 52
            ensk r11 = r11.h(r3, r2, r0, r4)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r0 = "Choosing not to replace existing draft %s"
            r11.t(r0, r1)
            r11 = 0
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        L79:
            r11 = r7
        L7a:
            enru r7 = defpackage.ygy.a
            ensk r7 = r7.e()
            ensn r8 = defpackage.ente.a
            r7.Y(r8, r5)
            r5 = 57
            ensk r2 = r7.h(r3, r2, r5, r4)
            enrr r2 = (defpackage.enrr) r2
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r3 = r10.b
            java.lang.String r4 = "Replacing draft with incoming %s parsed as %s"
            r2.D(r4, r3, r11)
            ygy r2 = r10.c
            ygx r3 = new ygx
            xhu r1 = (defpackage.xhu) r1
            r3.<init>(r1, r11)
            ydb r1 = r2.b
            r1.c(r3)
            ygy r1 = r10.c
            r2 = 0
            r10.f = r2
            r10.e = r2
            r2 = 2
            r10.a = r2
            ydy r1 = r1.c
            java.lang.Object r11 = r1.d(r11, r10)
            if (r11 != r0) goto Lb5
        Lb4:
            return r0
        Lb5:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r6)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ygw ygwVar = new ygw(ffguVar, this.b, this.c, this.d);
        ygwVar.f = obj;
        return ygwVar;
    }
}
