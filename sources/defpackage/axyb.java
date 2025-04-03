package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axyb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axyy b;
    final /* synthetic */ ekrb c;
    final /* synthetic */ axwz d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axyb(axyy axyyVar, ekrb ekrbVar, axwz axwzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = axyyVar;
        this.c = ekrbVar;
        this.d = axwzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axyb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r12 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        if (r12 == r0) goto L26;
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
            r2 = 3
            r3 = 0
            if (r1 == 0) goto L8d
            r4 = 1
            r5 = 2
            if (r1 == r4) goto L14
            defpackage.ffci.b(r12)
            if (r1 == r5) goto L6e
            if (r1 == r2) goto Lad
            return r12
        L14:
            java.lang.Object r1 = r11.e
            ffsk r1 = (defpackage.ffsk) r1
            defpackage.ffci.b(r12)
            java.util.List r12 = (java.util.List) r12
            cfup r2 = defpackage.axum.i
            java.lang.Object r2 = r2.e()
            r2.getClass()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.util.List r12 = defpackage.ffdx.W(r12, r2)
            axyy r2 = r11.b
            axwz r4 = r11.d
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = defpackage.ffdx.n(r12, r7)
            r6.<init>(r7)
            java.util.Iterator r12 = r12.iterator()
        L43:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto L64
            java.lang.Object r7 = r12.next()
            java.util.List r7 = (java.util.List) r7
            ffhe r8 = defpackage.ffhe.a
            ffsm r9 = defpackage.ffsm.a
            ffhd r8 = defpackage.ekxi.a(r8)
            axya r10 = new axya
            r10.<init>(r3, r2, r7, r4)
            ffss r7 = defpackage.ffra.b(r1, r8, r9, r10)
            r6.add(r7)
            goto L43
        L64:
            r11.e = r3
            r11.a = r5
            java.lang.Object r12 = defpackage.ffqv.a(r6, r11)
            if (r12 == r0) goto Lc0
        L6e:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r12 = r12.iterator()
        L79:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto Lb0
            java.lang.Object r2 = r12.next()
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = defpackage.ffdx.ak(r2)
            defpackage.ffdx.w(r1, r2)
            goto L79
        L8d:
            defpackage.ffci.b(r12)
            java.lang.Object r12 = r11.e
            ffsk r12 = (defpackage.ffsk) r12
            axyy r12 = r11.b
            ffbr r12 = r12.f
            java.lang.Object r12 = r12.b()
            asjx r12 = (defpackage.asjx) r12
            axyy r12 = r11.b
            ekrb r1 = r11.c
            axwz r4 = r11.d
            r11.a = r2
            java.lang.Object r12 = r12.D(r1, r4, r11)
            if (r12 != r0) goto Lad
            goto Lc0
        Lad:
            r1 = r12
            java.util.List r1 = (java.util.List) r1
        Lb0:
            axyy r12 = r11.b
            r2 = 4
            r11.a = r2
            axyk r2 = new axyk
            r2.<init>(r12, r1, r3)
            java.lang.Object r12 = defpackage.ffsl.a(r2, r11)
            if (r12 != r0) goto Lc1
        Lc0:
            return r0
        Lc1:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axyb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axyb axybVar = new axyb(this.b, this.c, this.d, ffguVar);
        axybVar.e = obj;
        return axybVar;
    }
}
