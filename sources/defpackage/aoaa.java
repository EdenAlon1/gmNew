package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoaa extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aoai b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoaa(aoai aoaiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aoaiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aoaa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ae, code lost:
    
        return defpackage.engq.a(defpackage.ffdx.o(defpackage.ffdx.b(r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if (r10 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
    
        if (r10 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if (r10 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r1 != 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0082, code lost:
    
        return defpackage.engq.a(defpackage.ffdx.o((java.lang.Iterable) r10));
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L11
            defpackage.ffci.b(r10)
            if (r1 == r2) goto L78
            goto La2
        L11:
            java.lang.Object r1 = r9.c
            ffsk r1 = (defpackage.ffsk) r1
            defpackage.ffci.b(r10)
            goto L36
        L19:
            defpackage.ffci.b(r10)
            java.lang.Object r10 = r9.c
            r1 = r10
            ffsk r1 = (defpackage.ffsk) r1
            aoai r10 = r9.b
            aqge r10 = r10.b
            elfl r10 = r10.b()
            r10.getClass()
            r9.c = r1
            r9.a = r3
            java.lang.Object r10 = defpackage.fgfz.c(r10, r9)
            if (r10 == r0) goto Laf
        L36:
            alxj r10 = (defpackage.alxj) r10
            alxi r10 = r10.b()
            alxi r4 = defpackage.alxi.RBM
            r5 = 0
            if (r10 != r4) goto L83
            aoai r10 = r9.b
            ffss[] r4 = new defpackage.ffss[r2]
            ffhe r6 = defpackage.ffhe.a
            ffsm r7 = defpackage.ffsm.a
            ffhd r6 = defpackage.ekxi.a(r6)
            anzx r8 = new anzx
            r8.<init>(r5, r10)
            ffss r10 = defpackage.ffra.b(r1, r6, r7, r8)
            r6 = 0
            r4[r6] = r10
            aoai r10 = r9.b
            ffhe r6 = defpackage.ffhe.a
            ffsm r7 = defpackage.ffsm.a
            ffhd r6 = defpackage.ekxi.a(r6)
            anzy r8 = new anzy
            r8.<init>(r5, r10)
            ffss r10 = defpackage.ffra.b(r1, r6, r7, r8)
            r4[r3] = r10
            r9.c = r5
            r9.a = r2
            java.lang.Object r10 = defpackage.ffqv.b(r4, r9)
            if (r10 == r0) goto Laf
        L78:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r10 = defpackage.ffdx.o(r10)
            engw r10 = defpackage.engq.a(r10)
            return r10
        L83:
            aoai r10 = r9.b
            ffhe r2 = defpackage.ffhe.a
            ffsm r3 = defpackage.ffsm.a
            ffhd r2 = defpackage.ekxi.a(r2)
            anzz r4 = new anzz
            r4.<init>(r5, r10)
            ffss r10 = defpackage.ffra.b(r1, r2, r3, r4)
            r9.c = r5
            r1 = 3
            r9.a = r1
            java.lang.Object r10 = r10.c(r9)
            if (r10 != r0) goto La2
            goto Laf
        La2:
            java.util.List r10 = defpackage.ffdx.b(r10)
            java.util.List r10 = defpackage.ffdx.o(r10)
            engw r10 = defpackage.engq.a(r10)
            return r10
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoaa.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aoaa aoaaVar = new aoaa(this.b, ffguVar);
        aoaaVar.c = obj;
        return aoaaVar;
    }
}
