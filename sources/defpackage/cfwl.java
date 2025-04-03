package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfwl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cfwi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfwl(cfwi cfwiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cfwiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfwl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r8 != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0050, code lost:
    
        if (r8 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0056, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0055, code lost:
    
        return (java.lang.Void) r8;
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
            int r1 = r7.a
            r2 = 1
            defpackage.ffci.b(r8)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L47
            goto L53
        Ld:
            cfwi r8 = r7.b
            ffbr r8 = r8.d
            java.lang.Object r8 = r8.b()
            cgcu r8 = (defpackage.cgcu) r8
            boolean r8 = r8.a()
            java.lang.String r1 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/fcm/impl/GaiaDittoPingRefreshHandler$refreshRegistration$1"
            java.lang.String r4 = "GaiaDittoPingRefreshHandler.kt"
            java.lang.String r5 = "BugleGDitto"
            if (r8 == 0) goto L57
            enru r8 = defpackage.cfwi.a
            ensk r8 = r8.h()
            ensn r6 = defpackage.ente.a
            r8.Y(r6, r5)
            r5 = 59
            ensk r8 = r8.h(r3, r1, r5, r4)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r1 = "Start refresh registration"
            r8.q(r1)
            cfwi r8 = r7.b
            r7.a = r2
            java.lang.Object r8 = r8.b(r7)
            if (r8 == r0) goto L56
        L47:
            com.google.common.util.concurrent.ListenableFuture r8 = (com.google.common.util.concurrent.ListenableFuture) r8
            r1 = 2
            r7.a = r1
            java.lang.Object r8 = defpackage.fgfz.c(r8, r7)
            if (r8 != r0) goto L53
            goto L56
        L53:
            java.lang.Void r8 = (java.lang.Void) r8
            return r8
        L56:
            return r0
        L57:
            enru r8 = defpackage.cfwi.a
            ensk r8 = r8.h()
            ensn r0 = defpackage.ente.a
            r8.Y(r0, r5)
            r0 = 62
            ensk r8 = r8.h(r3, r1, r0, r4)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r0 = "Skip refresh registration"
            r8.q(r0)
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfwl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cfwl(this.b, ffguVar);
    }
}
