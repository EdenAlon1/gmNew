package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvdi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvdp b;
    final /* synthetic */ engw c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvdi(ffgu ffguVar, cvdp cvdpVar, engw engwVar) {
        super(2, ffguVar);
        this.b = cvdpVar;
        this.c = engwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvdi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r5 == r0) goto L16;
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
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r5)     // Catch: java.lang.Exception -> L11
            goto L33
        Ld:
            defpackage.ffci.b(r5)     // Catch: java.lang.Exception -> L11
            goto L27
        L11:
            r5 = move-exception
            goto L36
        L13:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.d
            ffsk r5 = (defpackage.ffsk) r5
            cvdp r5 = r4.b     // Catch: java.lang.Exception -> L11
            engw r1 = r4.c     // Catch: java.lang.Exception -> L11
            r4.a = r2     // Catch: java.lang.Exception -> L11
            java.lang.Object r5 = r5.e(r1, r4)     // Catch: java.lang.Exception -> L11
            if (r5 != r0) goto L27
            goto L32
        L27:
            com.google.common.util.concurrent.ListenableFuture r5 = (com.google.common.util.concurrent.ListenableFuture) r5     // Catch: java.lang.Exception -> L11
            r1 = 2
            r4.a = r1     // Catch: java.lang.Exception -> L11
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)     // Catch: java.lang.Exception -> L11
            if (r5 != r0) goto L33
        L32:
            return r0
        L33:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L11
            return r5
        L36:
            enru r0 = defpackage.cvdp.a
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            java.lang.String r2 = "Bugle"
            r0.Y(r1, r2)
            enrr r0 = (defpackage.enrr) r0
            ensk r5 = r0.g(r5)
            java.lang.String r0 = "invokeSuspend"
            r1 = 189(0xbd, float:2.65E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/shared/video/BugleVideoCalling2$callRecipients$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r3 = "BugleVideoCalling2.kt"
            ensk r5 = r5.h(r2, r0, r1, r3)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r0 = "launchCallOrSetup failed"
            r5.q(r0)
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvdi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cvdi cvdiVar = new cvdi(ffguVar, this.b, this.c);
        cvdiVar.d = obj;
        return cvdiVar;
    }
}
