package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvyx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvzm b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvyx(cvzm cvzmVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cvzmVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvyx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c0, code lost:
    
        if (r12.a(r4, r11) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r12 != r0) goto L23;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r11.a
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L16
            if (r1 == r2) goto L12
            defpackage.ffci.b(r12)     // Catch: java.lang.Throwable -> L1a
            goto Lc3
        L12:
            defpackage.ffci.b(r12)     // Catch: java.lang.Throwable -> L1a
            goto L69
        L16:
            defpackage.ffci.b(r12)     // Catch: java.lang.Throwable -> L1a
            goto L35
        L1a:
            r0 = move-exception
            r12 = r0
            goto Lce
        L1e:
            defpackage.ffci.b(r12)
            cvzm r12 = r11.b     // Catch: java.lang.Throwable -> L1a
            cwis r1 = r12.h     // Catch: java.lang.Throwable -> L1a
            cwir r1 = r1.e()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = r11.c     // Catch: java.lang.Throwable -> L1a
            r11.a = r4     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r12 = r12.h(r1, r5, r11)     // Catch: java.lang.Throwable -> L1a
            if (r12 != r0) goto L35
            goto Lcd
        L35:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L1a
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L1a
            if (r12 == 0) goto L47
            ffcu r12 = defpackage.ffcu.a     // Catch: java.lang.Throwable -> L1a
            cvzm r0 = r11.b
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.r
            r0.set(r3)
            return r12
        L47:
            cvzm r12 = r11.b     // Catch: java.lang.Throwable -> L1a
            ffbr r12 = r12.f     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r12 = r12.b()     // Catch: java.lang.Throwable -> L1a
            alxl r12 = (defpackage.alxl) r12     // Catch: java.lang.Throwable -> L1a
            cvzm r1 = r11.b     // Catch: java.lang.Throwable -> L1a
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = r1.d     // Catch: java.lang.Throwable -> L1a
            r1.getClass()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = r11.c     // Catch: java.lang.Throwable -> L1a
            elfl r12 = r12.s(r1, r5)     // Catch: java.lang.Throwable -> L1a
            r12.getClass()     // Catch: java.lang.Throwable -> L1a
            r11.a = r2     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r12 = defpackage.fgfz.c(r12, r11)     // Catch: java.lang.Throwable -> L1a
            if (r12 == r0) goto Lcd
        L69:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L1a
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L1a
            if (r12 == 0) goto L86
            cvzm r12 = r11.b     // Catch: java.lang.Throwable -> L1a
            ffbr r12 = r12.g     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r12 = r12.b()     // Catch: java.lang.Throwable -> L1a
            aigz r12 = (defpackage.aigz) r12     // Catch: java.lang.Throwable -> L1a
            aikq r0 = new aikq     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r11.c     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r1, r4)     // Catch: java.lang.Throwable -> L1a
            r12.j(r0)     // Catch: java.lang.Throwable -> L1a
            goto Lc3
        L86:
            cvzm r12 = r11.b     // Catch: java.lang.Throwable -> L1a
            ffbr r12 = r12.e     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r12 = r12.b()     // Catch: java.lang.Throwable -> L1a
            ablq r12 = (defpackage.ablq) r12     // Catch: java.lang.Throwable -> L1a
            ablt r4 = new ablt     // Catch: java.lang.Throwable -> L1a
            cvzm r1 = r11.b     // Catch: java.lang.Throwable -> L1a
            android.content.Context r1 = r1.b     // Catch: java.lang.Throwable -> L1a
            r2 = 2132084011(0x7f15052b, float:1.980818E38)
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L1a
            r5.getClass()     // Catch: java.lang.Throwable -> L1a
            cvzm r1 = r11.b     // Catch: java.lang.Throwable -> L1a
            android.content.Context r1 = r1.b     // Catch: java.lang.Throwable -> L1a
            r2 = 2132084012(0x7f15052c, float:1.9808183E38)
            java.lang.String r6 = r1.getString(r2)     // Catch: java.lang.Throwable -> L1a
            cvyw r9 = new cvyw     // Catch: java.lang.Throwable -> L1a
            cvzm r1 = r11.b     // Catch: java.lang.Throwable -> L1a
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L1a
            r8 = 2
            r10 = 41
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1a
            r1 = 3
            r11.a = r1     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r12 = r12.a(r4, r11)     // Catch: java.lang.Throwable -> L1a
            if (r12 != r0) goto Lc3
            goto Lcd
        Lc3:
            cvzm r12 = r11.b
            java.util.concurrent.atomic.AtomicBoolean r12 = r12.r
            r12.set(r3)
            ffcu r12 = defpackage.ffcu.a
            return r12
        Lcd:
            return r0
        Lce:
            cvzm r0 = r11.b
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.r
            r0.set(r3)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvyx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvyx(this.b, this.c, ffguVar);
    }
}
