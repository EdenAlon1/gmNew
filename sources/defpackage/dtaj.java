package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtaj implements dtak {
    private static final dqgm a = new dqgm(0);
    private final dqjj b;
    private final dqki c;
    private dqji d;

    public dtaj(dqjj dqjjVar, dqki dqkiVar) {
        dqjjVar.getClass();
        dqkiVar.getClass();
        this.b = dqjjVar;
        this.c = dqkiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r12 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r12 == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.dtak
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r10, int r11, defpackage.ffgu r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.dtai
            if (r0 == 0) goto L13
            r0 = r12
            dtai r0 = (defpackage.dtai) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dtai r0 = new dtai
            r0.<init>(r9, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.b
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.d
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L4d
            if (r1 == r5) goto L42
            if (r1 == r4) goto L38
            if (r1 != r3) goto L30
            defpackage.ffci.b(r12)
            goto L8d
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            int r10 = r6.a
            dqji r11 = r6.e
            defpackage.ffci.b(r12)
        L3f:
            r5 = r10
            r1 = r11
            goto L7b
        L42:
            int r11 = r6.a
            dqji r10 = r6.e
            defpackage.ffci.b(r12)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L6c
        L4d:
            defpackage.ffci.b(r12)
            dqji r12 = r9.d
            if (r12 != 0) goto L5a
            java.lang.String r12 = "frecencyProcessor"
            defpackage.ffkj.c(r12)
            r12 = r2
        L5a:
            dqki r1 = r9.c
            r6.e = r12
            r6.a = r11
            r6.d = r5
            java.lang.Object r10 = r1.g(r10, r6)
            if (r10 == r0) goto L9d
            r8 = r12
            r12 = r10
            r10 = r11
            r11 = r8
        L6c:
            ffxx r12 = (defpackage.ffxx) r12
            r6.e = r11
            r6.a = r10
            r6.d = r4
            java.lang.Object r12 = defpackage.ffxz.b(r12, r6)
            if (r12 == r0) goto L9d
            goto L3f
        L7b:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            dqgm r4 = defpackage.dtaj.a
            r6.e = r2
            r6.d = r3
            r7 = 2
            r3 = 0
            r2 = r12
            java.lang.Object r12 = defpackage.dqji.f(r1, r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L8d
            goto L9d
        L8d:
            ffnl r12 = (defpackage.ffnl) r12
            dtah r10 = new dtah
            r10.<init>()
            ffnl r10 = defpackage.ffno.i(r12, r10)
            java.util.List r10 = defpackage.ffno.g(r10)
            return r10
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtaj.a(java.lang.String, int, ffgu):java.lang.Object");
    }

    @Override // defpackage.dtak
    public final void b() {
        if (this.d == null) {
            this.d = this.b.a(new dqkd(31), new ffji() { // from class: dtag
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    String str = ((dqke) obj).a;
                    str.getClass();
                    return str;
                }
            });
        }
    }
}
