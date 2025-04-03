package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lbs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ lcc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbs(lcc lccVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = lccVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lbs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (r4 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        if (r4.h(r3) == r0) goto L19;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r3.a
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r4)
            goto L43
        Ld:
            defpackage.ffci.b(r4)     // Catch: java.lang.Throwable -> L11
            goto L36
        L11:
            r4 = move-exception
            goto L46
        L13:
            defpackage.ffci.b(r4)
            lcc r4 = r3.b
            lcd r4 = r4.c
            ldh r4 = r4.a()
            boolean r4 = r4 instanceof defpackage.lcr
            if (r4 == 0) goto L2b
            lcc r4 = r3.b
            lcd r4 = r4.c
            ldh r4 = r4.a()
            return r4
        L2b:
            lcc r4 = r3.b     // Catch: java.lang.Throwable -> L11
            r3.a = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r4 = r4.h(r3)     // Catch: java.lang.Throwable -> L11
            if (r4 != r0) goto L36
            goto L42
        L36:
            lcc r4 = r3.b
            r1 = 2
            r3.a = r1
            r1 = 0
            java.lang.Object r4 = r4.i(r1, r3)
            if (r4 != r0) goto L43
        L42:
            return r0
        L43:
            ldh r4 = (defpackage.ldh) r4
            return r4
        L46:
            lcw r0 = new lcw
            r1 = -1
            r0.<init>(r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new lbs(this.b, ffguVar);
    }
}
