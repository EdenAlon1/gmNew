package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chgc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ chgf b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chgc(ffgu ffguVar, chgf chgfVar) {
        super(2, ffguVar);
        this.b = chgfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chgc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:
    
        if (r7 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (defpackage.fgfz.c(r7, r6) != r0) goto L9;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.a
            r2 = 1
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r7)
            goto L6f
        Ld:
            defpackage.ffci.b(r7)
            goto L51
        L11:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.c
            ffsk r7 = (defpackage.ffsk) r7
            enru r7 = defpackage.chgf.a
            ensk r7 = r7.h()
            ensn r1 = defpackage.ente.a
            java.lang.String r3 = "BugleNetwork"
            r7.Y(r1, r3)
            java.lang.String r1 = "invokeSuspend"
            r3 = 44
            java.lang.String r4 = "com/google/android/apps/messaging/shared/net/TachyonTachygramBindDelegate$bindTachygramChannels$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r5 = "TachyonTachygramBindDelegate.kt"
            ensk r7 = r7.h(r4, r1, r3, r5)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r1 = "Start tachygram channels binding."
            r7.q(r1)
            chgf r7 = r6.b
            ffbr r7 = r7.e
            java.lang.Object r7 = r7.b()
            djrv r7 = (defpackage.djrv) r7
            com.google.common.util.concurrent.ListenableFuture r7 = r7.h()
            r7.getClass()
            r6.a = r2
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 == r0) goto L72
        L51:
            chgf r7 = r6.b
            r1 = 2
            r6.a = r1
            ffhd r1 = r7.d
            ffhd r1 = defpackage.ekxi.a(r1)
            chgb r2 = new chgb
            r3 = 0
            r2.<init>(r3, r7)
            java.lang.Object r7 = defpackage.ffra.a(r1, r2, r6)
            ffhh r1 = defpackage.ffhh.a
            if (r7 == r1) goto L6c
            ffcu r7 = defpackage.ffcu.a
        L6c:
            if (r7 != r0) goto L6f
            goto L72
        L6f:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chgc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        chgc chgcVar = new chgc(ffguVar, this.b);
        chgcVar.c = obj;
        return chgcVar;
    }
}
