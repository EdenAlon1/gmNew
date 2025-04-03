package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bznc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bznk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bznc(bznk bznkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bznkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bznc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (defpackage.ffsw.c(r3, r5) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004b, code lost:
    
        if (defpackage.ffcu.a == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        return defpackage.ffcu.a;
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
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L26
            goto L4e
        Ld:
            bznk r6 = r5.b
            ffbr r6 = r6.m
            java.lang.Object r6 = r6.b()
            r6.getClass()
            java.lang.Number r6 = (java.lang.Number) r6
            long r3 = r6.longValue()
            r5.a = r2
            java.lang.Object r6 = defpackage.ffsw.c(r3, r5)
            if (r6 == r0) goto L51
        L26:
            bznk r6 = r5.b
            r1 = 2
            r5.a = r1
            entd r1 = defpackage.bznk.b
            ensk r1 = r1.n()
            java.lang.String r2 = "Allow user to interact."
            r1.q(r2)
            bznf r1 = new bznf
            r2 = 0
            r1.<init>(r6, r2)
            ffsk r2 = r6.d
            elfl r1 = defpackage.axol.h(r2, r1)
            ejvp r6 = r6.i
            ejui r2 = defpackage.bzmc.a
            r6.a(r1, r2)
            ffcu r6 = defpackage.ffcu.a
            if (r6 != r0) goto L4e
            goto L51
        L4e:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bznc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bznc(this.b, ffguVar);
    }
}
