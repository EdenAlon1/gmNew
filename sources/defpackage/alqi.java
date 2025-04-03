package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alqi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ alqj b;
    final /* synthetic */ Instant c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alqi(alqj alqjVar, int i, Instant instant, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = alqjVar;
        this.d = i;
        this.c = instant;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alqi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
    
        if (r9.a(r1, r8) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
    
        ((defpackage.enrr) defpackage.alqj.a.a(java.util.logging.Level.INFO).h("com/google/android/apps/messaging/shared/analytics/screen/ScreenFirstVisitLoggerImpl$logEventsOnFirstScreenVisit$1", "invokeSuspend", 40, "ScreenFirstVisitLoggerImpl.kt")).t("All logging tasks for first visit completed at screen: %s", defpackage.algl.a(r8.d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b7, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0026, code lost:
    
        if (r9 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L19;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.a
            r2 = 1
            defpackage.ffci.b(r9)
            if (r1 == 0) goto Le
            if (r1 == r2) goto L28
            goto L94
        Le:
            alqj r9 = r8.b
            ffbr r9 = r9.d
            java.lang.Object r9 = r9.b()
            algm r9 = (defpackage.algm) r9
            int r1 = r8.d
            j$.time.Instant r3 = r8.c
            elfl r9 = r9.j(r1, r3)
            r8.a = r2
            java.lang.Object r9 = defpackage.fgfz.c(r9, r8)
            if (r9 == r0) goto Lb8
        L28:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L33
            ffcu r9 = defpackage.ffcu.a
            return r9
        L33:
            alqj r9 = r8.b
            ffbr r9 = r9.c
            java.lang.Object r9 = r9.b()
            alql r9 = (defpackage.alql) r9
            int r1 = r8.d
            j$.time.Instant r2 = r8.c
            enru r3 = defpackage.alql.a
            ensk r3 = r3.h()
            java.lang.String r4 = "logFirstEntryToScreen"
            r5 = 37
            java.lang.String r6 = "com/google/android/apps/messaging/shared/analytics/screen/ScreenImpressionLogger"
            java.lang.String r7 = "ScreenImpressionLogger.kt"
            ensk r3 = r3.h(r6, r4, r5, r7)
            enrr r3 = (defpackage.enrr) r3
            java.lang.String r4 = "Logging first visit to screen type: %s"
            java.lang.String r5 = defpackage.algl.a(r1)
            r3.t(r4, r5)
            ffbr r9 = r9.b
            java.lang.Object r9 = r9.b()
            akyb r9 = (defpackage.akyb) r9
            akxn r9 = r9.a()
            r3 = 3
            if (r1 != r3) goto L70
            epyw r3 = defpackage.epyw.CONVERSATION_SCREEN_FIRST_VISIT
            goto L72
        L70:
            epyw r3 = defpackage.epyw.HOME_SCREEN_FIRST_VISIT
        L72:
            r9.d(r3)
            eolu r1 = defpackage.alql.b(r1, r2)
            alal r2 = defpackage.alal.LOG_SPEC_CONVERSATION_SCREEN_EVENTS
            r9.j(r1, r2)
            alqj r9 = r8.b
            ffbr r9 = r9.b
            java.lang.Object r9 = r9.b()
            alju r9 = (defpackage.alju) r9
            int r1 = r8.d
            r2 = 2
            r8.a = r2
            java.lang.Object r9 = r9.a(r1, r8)
            if (r9 != r0) goto L94
            goto Lb8
        L94:
            enru r9 = defpackage.alqj.a
            java.util.logging.Level r0 = java.util.logging.Level.INFO
            enrr r9 = r9.a(r0)
            java.lang.String r0 = "invokeSuspend"
            r1 = 40
            java.lang.String r2 = "com/google/android/apps/messaging/shared/analytics/screen/ScreenFirstVisitLoggerImpl$logEventsOnFirstScreenVisit$1"
            java.lang.String r3 = "ScreenFirstVisitLoggerImpl.kt"
            ensk r9 = r9.h(r2, r0, r1, r3)
            enrr r9 = (defpackage.enrr) r9
            int r0 = r8.d
            java.lang.String r1 = "All logging tasks for first visit completed at screen: %s"
            java.lang.String r0 = defpackage.algl.a(r0)
            r9.t(r1, r0)
            ffcu r9 = defpackage.ffcu.a
            return r9
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alqi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new alqi(this.b, this.d, this.c, ffguVar);
    }
}
