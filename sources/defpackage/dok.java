package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dok extends ffhu implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ffji c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ ffix e;
    final /* synthetic */ ffix f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dok(ffji ffjiVar, ffjm ffjmVar, ffix ffixVar, ffix ffixVar2, ffgu ffguVar) {
        super(ffguVar);
        this.c = ffjiVar;
        this.d = ffjmVar;
        this.e = ffixVar;
        this.f = ffixVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dok) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0089, code lost:
    
        if (r12 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r11.b
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L26
            if (r1 == r2) goto L1e
            if (r1 == r4) goto L13
            defpackage.ffci.b(r12)
            r10 = r11
            goto L8c
        L13:
            java.lang.Object r1 = r11.a
            java.lang.Object r2 = r11.g
            iju r2 = (defpackage.iju) r2
            defpackage.ffci.b(r12)
            r10 = r11
            goto L57
        L1e:
            java.lang.Object r1 = r11.g
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r12)
            goto L38
        L26:
            defpackage.ffci.b(r12)
            java.lang.Object r12 = r11.g
            r1 = r12
            iju r1 = (defpackage.iju) r1
            r11.g = r1
            r11.b = r2
            java.lang.Object r12 = defpackage.dtr.g(r1, r3, r11, r4)
            if (r12 == r0) goto L9c
        L38:
            r5 = r1
            iku r12 = (defpackage.iku) r12
            ffky r1 = new ffky
            r1.<init>()
            long r6 = r12.a
            int r8 = r12.i
            doj r9 = new doj
            r9.<init>(r1)
            r11.g = r5
            r11.a = r1
            r11.b = r4
            r10 = r11
            java.lang.Object r12 = defpackage.doo.g(r5, r6, r8, r9, r10)
            if (r12 == r0) goto L9d
            r2 = r5
        L57:
            iku r12 = (defpackage.iku) r12
            if (r12 == 0) goto L99
            ffji r4 = r10.c
            long r5 = r12.c
            iak r7 = new iak
            r7.<init>(r5)
            r4.invoke(r7)
            ffjm r4 = r10.d
            ffky r1 = (defpackage.ffky) r1
            float r1 = r1.a
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r1)
            r4.a(r12, r5)
            ffjm r1 = r10.d
            doi r4 = new doi
            r4.<init>(r1)
            r10.g = r3
            r10.a = r3
            r1 = 3
            r10.b = r1
            long r5 = r12.a
            java.lang.Object r12 = defpackage.doo.l(r2, r5, r4, r11)
            if (r12 != r0) goto L8c
            goto L9d
        L8c:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L99
            ffix r12 = r10.f
            r12.invoke()
        L99:
            ffcu r12 = defpackage.ffcu.a
            return r12
        L9c:
            r10 = r11
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dok.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dok dokVar = new dok(this.c, this.d, this.e, this.f, ffguVar);
        dokVar.g = obj;
        return dokVar;
    }
}
