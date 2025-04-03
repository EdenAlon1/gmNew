package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cggf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cggg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cggf(cggg cgggVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cgggVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cggf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (r7 != r0) goto L8;
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
            defpackage.ffci.b(r7)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L36
            return r7
        Ld:
            cggg r7 = r6.b
            ffbr r7 = r7.d
            java.lang.Object r7 = r7.b()
            ejvb r7 = (defpackage.ejvb) r7
            cggg r1 = r6.b
            ffbr r1 = r1.b
            java.lang.Object r1 = r1.b()
            eixo r1 = (defpackage.eixo) r1
            ejuh r1 = r1.b()
            ejwa r3 = defpackage.ejwa.DONT_CARE
            com.google.common.util.concurrent.ListenableFuture r7 = r7.b(r1, r3)
            r7.getClass()
            r6.a = r2
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 == r0) goto Lb7
        L36:
            r7.getClass()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L44:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L63
            java.lang.Object r3 = r7.next()
            r4 = r3
            eixn r4 = (defpackage.eixn) r4
            eixz r4 = r4.b()
            java.lang.String r4 = r4.k
            java.lang.String r5 = "google"
            boolean r4 = defpackage.ffkj.e(r4, r5)
            if (r4 == 0) goto L44
            r1.add(r3)
            goto L44
        L63:
            boolean r7 = r1.isEmpty()
            r7 = r7 ^ r2
            enru r1 = defpackage.cggg.a
            ensk r1 = r1.h()
            ensn r2 = defpackage.ente.a
            java.lang.String r3 = "BugleAccountSignOut"
            r1.Y(r2, r3)
            java.lang.String r2 = "invokeSuspend"
            r3 = 38
            java.lang.String r4 = "com/google/android/apps/messaging/shared/gaia/synclet/GaiaStatusUpdaterSynclet$sync$1"
            java.lang.String r5 = "GaiaStatusUpdaterSynclet.kt"
            ensk r1 = r1.h(r4, r2, r3, r5)
            enrr r1 = (defpackage.enrr) r1
            java.lang.String r2 = "Storing is_gaia_detected=%s"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            r1.t(r2, r3)
            cggg r1 = r6.b
            ffbr r1 = r1.c
            java.lang.Object r1 = r1.b()
            cgfd r1 = (defpackage.cgfd) r1
            comc r2 = r1.c
            cgec r3 = new cgec
            r3.<init>()
            elfl r7 = r2.j(r3)
            cged r2 = new cged
            r2.<init>()
            errl r1 = r1.d
            elfl r7 = r7.h(r2, r1)
            r1 = 2
            r6.a = r1
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 != r0) goto Lb6
            goto Lb7
        Lb6:
            return r7
        Lb7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cggf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cggf(this.b, ffguVar);
    }
}
