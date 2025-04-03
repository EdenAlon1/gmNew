package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class llm extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ lkk d;
    final /* synthetic */ lkj e;
    final /* synthetic */ ffsk f;
    final /* synthetic */ ffjm g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llm(lkk lkkVar, lkj lkjVar, ffsk ffskVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = lkkVar;
        this.e = lkjVar;
        this.f = ffskVar;
        this.g = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((llm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[SYNTHETIC] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r11.c
            if (r1 == 0) goto L12
            java.lang.Object r1 = r11.b
            java.lang.Object r2 = r11.a
            defpackage.ffci.b(r12)     // Catch: java.lang.Throwable -> Le
            goto L69
        Le:
            r0 = move-exception
            r12 = r0
            goto L86
        L12:
            defpackage.ffci.b(r12)
            lkk r12 = r11.d
            lkj r12 = r12.a()
            lkj r1 = defpackage.lkj.DESTROYED
            if (r12 == r1) goto L9f
            fflb r4 = new fflb
            r4.<init>()
            fflb r1 = new fflb
            r1.<init>()
            lkj r12 = r11.e     // Catch: java.lang.Throwable -> L83
            lkk r10 = r11.d     // Catch: java.lang.Throwable -> L83
            ffsk r5 = r11.f     // Catch: java.lang.Throwable -> L83
            ffjm r9 = r11.g     // Catch: java.lang.Throwable -> L83
            r11.a = r4     // Catch: java.lang.Throwable -> L83
            r11.b = r1     // Catch: java.lang.Throwable -> L83
            r2 = 1
            r11.c = r2     // Catch: java.lang.Throwable -> L83
            ffrh r7 = new ffrh     // Catch: java.lang.Throwable -> L83
            ffgu r3 = defpackage.ffhi.c(r11)     // Catch: java.lang.Throwable -> L83
            r7.<init>(r3, r2)     // Catch: java.lang.Throwable -> L83
            r7.B()     // Catch: java.lang.Throwable -> L83
            lki r3 = defpackage.lkh.c(r12)     // Catch: java.lang.Throwable -> L83
            lki r6 = defpackage.lkh.a(r12)     // Catch: java.lang.Throwable -> L83
            fgjf r8 = new fgjf     // Catch: java.lang.Throwable -> L83
            r8.<init>()     // Catch: java.lang.Throwable -> L83
            lll r2 = new lll     // Catch: java.lang.Throwable -> L83
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L83
            r1.a = r2     // Catch: java.lang.Throwable -> L83
            java.lang.Object r12 = r1.a     // Catch: java.lang.Throwable -> L83
            r12.getClass()     // Catch: java.lang.Throwable -> L83
            lkp r12 = (defpackage.lkp) r12     // Catch: java.lang.Throwable -> L83
            r10.c(r12)     // Catch: java.lang.Throwable -> L83
            java.lang.Object r12 = r7.m()     // Catch: java.lang.Throwable -> L83
            if (r12 == r0) goto L82
            r2 = r4
        L69:
            fflb r2 = (defpackage.fflb) r2
            java.lang.Object r12 = r2.a
            ffud r12 = (defpackage.ffud) r12
            if (r12 == 0) goto L74
            defpackage.ffub.a(r12)
        L74:
            fflb r1 = (defpackage.fflb) r1
            java.lang.Object r12 = r1.a
            lkp r12 = (defpackage.lkp) r12
            if (r12 == 0) goto L9f
            lkk r0 = r11.d
            r0.d(r12)
            goto L9f
        L82:
            return r0
        L83:
            r0 = move-exception
            r12 = r0
            r2 = r4
        L86:
            fflb r2 = (defpackage.fflb) r2
            java.lang.Object r0 = r2.a
            ffud r0 = (defpackage.ffud) r0
            if (r0 == 0) goto L91
            defpackage.ffub.a(r0)
        L91:
            fflb r1 = (defpackage.fflb) r1
            java.lang.Object r0 = r1.a
            lkp r0 = (defpackage.lkp) r0
            if (r0 == 0) goto L9e
            lkk r1 = r11.d
            r1.d(r0)
        L9e:
            throw r12
        L9f:
            ffcu r12 = defpackage.ffcu.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new llm(this.d, this.e, this.f, this.g, ffguVar);
    }
}
