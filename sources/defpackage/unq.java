package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class unq extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ uns c;
    final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unq(uns unsVar, Object obj, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = unsVar;
        this.d = obj;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((unq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008f, code lost:
    
        if (defpackage.fgfz.c(r8, r7) == r0) goto L26;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.b
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 == r2) goto L11
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> Le
            goto L9d
        Le:
            r8 = move-exception
            goto L92
        L11:
            java.lang.Object r1 = r7.a
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> Le
            goto L3f
        L17:
            defpackage.ffci.b(r8)
            uns r8 = r7.c     // Catch: java.lang.Throwable -> Le
            j$.time.Instant r1 = r8.g     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L2b
            cqoh r8 = r8.a     // Catch: java.lang.Throwable -> Le
            j$.time.Instant r8 = r8.f()     // Catch: java.lang.Throwable -> Le
            j$.time.Duration r8 = j$.time.Duration.between(r1, r8)     // Catch: java.lang.Throwable -> Le
            goto L2d
        L2b:
            j$.time.Duration r8 = j$.time.Duration.ZERO     // Catch: java.lang.Throwable -> Le
        L2d:
            r1 = r8
            uns r8 = r7.c     // Catch: java.lang.Throwable -> Le
            uno r8 = r8.e     // Catch: java.lang.Throwable -> Le
            java.lang.Object r3 = r7.d     // Catch: java.lang.Throwable -> Le
            r7.a = r1     // Catch: java.lang.Throwable -> Le
            r7.b = r2     // Catch: java.lang.Throwable -> Le
            java.lang.Object r8 = r8.c(r3, r7)     // Catch: java.lang.Throwable -> Le
            if (r8 != r0) goto L3f
            goto L91
        L3f:
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> Le
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> Le
            if (r8 <= 0) goto L4a
            eptk r8 = defpackage.eptk.SELECTION     // Catch: java.lang.Throwable -> Le
            goto L4c
        L4a:
            eptk r8 = defpackage.eptk.UNKNOWN_CLOSING_SOURCE     // Catch: java.lang.Throwable -> Le
        L4c:
            uns r2 = r7.c     // Catch: java.lang.Throwable -> Le
            eptv r2 = r2.b()     // Catch: java.lang.Throwable -> Le
            j$.time.Duration r1 = (j$.time.Duration) r1     // Catch: java.lang.Throwable -> Le
            r1.toMillis()     // Catch: java.lang.Throwable -> Le
            enru r1 = defpackage.alct.a     // Catch: java.lang.Throwable -> Le
            ensk r1 = r1.j()     // Catch: java.lang.Throwable -> Le
            enrr r1 = (defpackage.enrr) r1     // Catch: java.lang.Throwable -> Le
            ensy r3 = defpackage.ensy.MEDIUM     // Catch: java.lang.Throwable -> Le
            r1.aa(r3)     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = "com/google/android/apps/messaging/shared/analytics/compose/ComposeNavigationEventLogger"
            java.lang.String r4 = "deprecatedLogScreenClosedAsync"
            java.lang.String r5 = "ComposeNavigationEventLogger.java"
            r6 = 154(0x9a, float:2.16E-43)
            ensk r1 = r1.h(r3, r4, r6, r5)     // Catch: java.lang.Throwable -> Le
            enrr r1 = (defpackage.enrr) r1     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = "ComposeNavigationEventLogger.deprecatedLogScreenClosedAsync 1 %s, %s"
            int r8 = r8.h     // Catch: java.lang.Throwable -> Le
            r1.B(r3, r2, r8)     // Catch: java.lang.Throwable -> Le
            r8 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> Le
            elfl r8 = defpackage.elfo.e(r8)     // Catch: java.lang.Throwable -> Le
            r8.getClass()     // Catch: java.lang.Throwable -> Le
            r1 = 0
            r7.a = r1     // Catch: java.lang.Throwable -> Le
            r1 = 2
            r7.b = r1     // Catch: java.lang.Throwable -> Le
            java.lang.Object r8 = defpackage.fgfz.c(r8, r7)     // Catch: java.lang.Throwable -> Le
            if (r8 != r0) goto L9d
        L91:
            return r0
        L92:
            uns r0 = r7.c
            cfyt r0 = r0.b
            elfl r8 = r0.b(r8)
            defpackage.axnw.h(r8)
        L9d:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.unq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new unq(this.c, this.d, ffguVar);
    }
}
