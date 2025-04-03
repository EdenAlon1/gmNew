package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuts extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cutu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuts(cutu cutuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cutuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuts) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        r5 = (defpackage.cutr) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001d, code lost:
    
        if (r5 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        if (r5 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005d, code lost:
    
        return r0;
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
            defpackage.ffci.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1f
            goto L37
        Ld:
            cutu r5 = r4.b
            ffbr r5 = r5.b
            java.lang.Object r5 = r5.b()
            cuui r5 = (defpackage.cuui) r5
            r4.a = r2
            java.lang.Object r5 = r5.a(r4)
            if (r5 == r0) goto L5d
        L1f:
            eisx r5 = (defpackage.eisx) r5
            if (r5 == 0) goto L3a
            cutu r1 = r4.b
            ffbr r1 = r1.c
            java.lang.Object r1 = r1.b()
            cutv r1 = (defpackage.cutv) r1
            r2 = 2
            r4.a = r2
            java.lang.Object r5 = r1.c(r5, r4)
            if (r5 != r0) goto L37
            goto L5d
        L37:
            cutr r5 = (defpackage.cutr) r5
            goto L5a
        L3a:
            enru r5 = defpackage.cutu.a
            ensk r5 = r5.h()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "BugleSpam"
            r5.Y(r0, r1)
            java.lang.String r0 = "invokeSuspend"
            r1 = 58
            java.lang.String r2 = "com/google/android/apps/messaging/shared/util/spam/spatula/SpatulaSettingsChecker$getAccountIdAndCheckSpatulaSettings$1$1"
            java.lang.String r3 = "SpatulaSettingsChecker.kt"
            ensk r5 = r5.h(r2, r0, r1, r3)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r0 = "No active account found from SpatulaAccountDataService."
            r5.q(r0)
        L5a:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuts.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cuts(this.b, ffguVar);
    }
}
