package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuuu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cuuw b;
    final /* synthetic */ cujo c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuuu(ffgu ffguVar, cuuw cuuwVar, cujo cujoVar, int i) {
        super(2, ffguVar);
        this.b = cuuwVar;
        this.c = cujoVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuuu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r12 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r12 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0032, code lost:
    
        if (r12 != r0) goto L11;
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
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto L14
            if (r1 == r2) goto L10
            defpackage.ffci.b(r12)
            goto L66
        L10:
            defpackage.ffci.b(r12)
            goto L4b
        L14:
            defpackage.ffci.b(r12)
            goto L34
        L18:
            defpackage.ffci.b(r12)
            java.lang.Object r12 = r11.e
            ffsk r12 = (defpackage.ffsk) r12
            cuuw r12 = r11.b
            cujo r1 = r11.c
            int r4 = r11.d
            erdy r5 = defpackage.erdy.RECLASSIFICATION
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r4)
            r11.a = r3
            java.lang.Object r12 = r12.g(r1, r5, r6, r11)
            if (r12 == r0) goto Lb6
        L34:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L41
            cukp r12 = defpackage.cuko.a()
            return r12
        L41:
            cujo r12 = r11.c
            r11.a = r2
            java.lang.Object r12 = r12.c(r11)
            if (r12 == r0) goto Lb6
        L4b:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L91
            int r1 = r12.length()
            if (r1 != 0) goto L56
            goto L91
        L56:
            cuuw r1 = r11.b
            cujo r2 = r11.c
            int r4 = r11.d
            r5 = 3
            r11.a = r5
            java.lang.Object r12 = r1.h(r2, r12, r4, r11)
            if (r12 != r0) goto L66
            goto Lb6
        L66:
            cuuq r12 = (defpackage.cuuq) r12
            if (r12 != 0) goto L85
            int r12 = r11.d
            cukp r4 = new cukp
            erer r5 = defpackage.erer.NO_VERDICT
            cula r6 = defpackage.cula.a
            enru r0 = defpackage.cuuw.a
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r12)
            java.lang.Integer r8 = defpackage.cuup.b(r0, r3)
            r9 = 0
            r10 = 20
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L85:
            int r0 = r11.d
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            cukp r12 = r12.a(r1)
            return r12
        L91:
            enru r12 = defpackage.cuuw.a
            ensk r12 = r12.j()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "BugleSpam"
            r12.Y(r0, r1)
            java.lang.String r0 = "invokeSuspend"
            r1 = 120(0x78, float:1.68E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/shared/util/spam/strangerdanger/StrangerDangerSpamProtection$reclassify$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r3 = "StrangerDangerSpamProtection.kt"
            ensk r12 = r12.h(r2, r0, r1, r3)
            enrr r12 = (defpackage.enrr) r12
            java.lang.String r0 = "Null E164 destination, skipping StrangerDanger"
            r12.q(r0)
            cukp r12 = defpackage.cuko.a()
            return r12
        Lb6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuuu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cuuu cuuuVar = new cuuu(ffguVar, this.b, this.c, this.d);
        cuuuVar.e = obj;
        return cuuuVar;
    }
}
