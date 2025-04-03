package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajed extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ajee b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajed(ajee ajeeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ajeeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajed) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007b, code lost:
    
        if (r6.a(r2, r5) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0049, code lost:
    
        if (r6.a(r3, r5) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x007d, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.a
            r2 = 1
            defpackage.ffci.b(r6)
            if (r1 == 0) goto Lb
            goto L7e
        Lb:
            ajee r6 = r5.b
            ffbr r6 = r6.n
            java.lang.Object r6 = r6.b()
            aspy r6 = (defpackage.aspy) r6
            boolean r6 = r6.a()
            r1 = 0
            if (r6 == 0) goto L4c
            ajee r6 = r5.b
            ajdn r3 = new ajdn
            r3.<init>(r6, r1)
            zqx r1 = r6.g
            fgdj r1 = r1.b
            fgdj r6 = r6.o
            fgch r4 = new fgch
            r4.<init>(r1, r6, r3)
            ajdt r6 = new ajdt
            r6.<init>(r4)
            ajdz r1 = new ajdz
            r1.<init>(r6)
            ffxx r6 = defpackage.ffyy.a(r1)
            ajee r1 = r5.b
            ajdo r3 = new ajdo
            r3.<init>(r1)
            r5.a = r2
            java.lang.Object r6 = r6.a(r3, r5)
            if (r6 != r0) goto L7e
            goto L7d
        L4c:
            ajee r6 = r5.b
            ajdp r2 = new ajdp
            r2.<init>(r6, r1)
            zqx r1 = r6.g
            fgdj r1 = r1.b
            fgdj r3 = r6.o
            ffxx r6 = r6.d
            ffxx r6 = defpackage.fgck.a(r1, r3, r6, r2)
            ajdw r1 = new ajdw
            r1.<init>(r6)
            ajec r6 = new ajec
            r6.<init>(r1)
            ffxx r6 = defpackage.ffyy.a(r6)
            ajee r1 = r5.b
            ajdq r2 = new ajdq
            r2.<init>(r1)
            r1 = 2
            r5.a = r1
            java.lang.Object r6 = r6.a(r2, r5)
            if (r6 != r0) goto L7e
        L7d:
            return r0
        L7e:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajed.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajed(this.b, ffguVar);
    }
}
