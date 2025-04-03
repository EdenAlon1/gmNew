package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cpsr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cphu b;
    final /* synthetic */ cpsu c;
    final /* synthetic */ awui d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpsr(cphu cphuVar, cpsu cpsuVar, awui awuiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cphuVar;
        this.c = cpsuVar;
        this.d = awuiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpsr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00bf, code lost:
    
        return new defpackage.cpry((defpackage.essr) r8, r7.c.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        if (r8 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00b1, code lost:
    
        if (r8 != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00b3, code lost:
    
        return r0;
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
            if (r1 == 0) goto Le
            if (r1 == r2) goto La3
            goto Lb4
        Le:
            emyl r8 = defpackage.ctjd.ak
            java.lang.Object r8 = r8.get()
            cfup r8 = (defpackage.cfup) r8
            java.lang.Object r8 = r8.e()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r1 = 0
            if (r8 == 0) goto La6
            cphu r8 = r7.b
            if (r8 == 0) goto La6
            r7.a = r2
            emyl r2 = defpackage.ctjd.ak
            java.lang.Object r2 = r2.get()
            cfup r2 = (defpackage.cfup) r2
            java.lang.Object r2 = r2.e()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto La0
            cppd r8 = (defpackage.cppd) r8
            ffbr r2 = r8.b
            java.lang.Object r2 = r2.b()
            j$.util.Optional r2 = (j$.util.Optional) r2
            boolean r2 = r2.isPresent()
            if (r2 == 0) goto La0
            awui r2 = r8.d
            ffbr r3 = r8.b
            java.lang.String r2 = r2.d
            java.lang.Object r3 = r3.b()
            j$.util.Optional r3 = (j$.util.Optional) r3
            java.lang.Object r3 = r3.get()
            cjdk r3 = (defpackage.cjdk) r3
            java.lang.String r3 = r3.r()
            boolean r2 = defpackage.ffkj.e(r2, r3)
            if (r2 != 0) goto L77
            cfup r2 = defpackage.ctjd.av
            java.lang.Object r2 = r2.e()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto La0
        L77:
            enru r2 = defpackage.cppd.a
            ensk r2 = r2.e()
            java.lang.String r3 = "getPenpalConversationType"
            r4 = 76
            java.lang.String r5 = "com/google/android/apps/messaging/shared/tachygram/chat/penpal/PenpalAdditionalMetadataProvider"
            java.lang.String r6 = "PenpalAdditionalMetadataProvider.kt"
            ensk r2 = r2.h(r5, r3, r4, r6)
            enrr r2 = (defpackage.enrr) r2
            java.lang.String r3 = "Adding metadata for 1:Gemini message"
            r2.q(r3)
            ffhd r2 = r8.c
            ffhd r2 = defpackage.ekxi.a(r2)
            cppb r3 = new cppb
            r3.<init>(r1, r8)
            java.lang.Object r8 = defpackage.ffra.a(r2, r3, r7)
            goto La1
        La0:
            r8 = r1
        La1:
            if (r8 == r0) goto Lb3
        La3:
            r1 = r8
            febo r1 = (defpackage.febo) r1
        La6:
            cpsu r8 = r7.c
            awui r2 = r7.d
            r3 = 2
            r7.a = r3
            java.lang.Object r8 = defpackage.cpsu.g(r8, r2, r1, r7, r3)
            if (r8 != r0) goto Lb4
        Lb3:
            return r0
        Lb4:
            cpsu r0 = r7.c
            essr r8 = (defpackage.essr) r8
            ffsk r0 = r0.a
            cpry r1 = new cpry
            r1.<init>(r8, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpsr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cpsr(this.b, this.c, this.d, ffguVar);
    }
}
