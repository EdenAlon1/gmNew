package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqit extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fgcl c;
    final /* synthetic */ dqiy d;
    final /* synthetic */ dqgm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqit(fgcl fgclVar, dqiy dqiyVar, dqgm dqgmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = fgclVar;
        this.d = dqiyVar;
        this.e = dqgmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqit) c(obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r1.fQ(r9, r8) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r9 != r0) goto L9;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.a
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 == r2) goto Le
            defpackage.ffci.b(r9)
            r7 = r8
            goto L44
        Le:
            java.lang.Object r1 = r8.b
            fgcl r1 = (defpackage.fgcl) r1
            defpackage.ffci.b(r9)
            r7 = r8
            goto L37
        L17:
            defpackage.ffci.b(r9)
            java.lang.Object r3 = r8.b
            fgcl r1 = r8.c
            dqiy r9 = r8.d
            dqgm r4 = r8.e
            r8.b = r1
            r8.a = r2
            dqji r2 = r9.f
            ernh r9 = r2.b
            j$.time.Instant r5 = r9.a()
            r6 = 50
            r7 = r8
            java.lang.Object r9 = r2.c(r3, r4, r5, r6, r7)
            if (r9 == r0) goto L47
        L37:
            r2 = 0
            r7.b = r2
            r2 = 2
            r7.a = r2
            java.lang.Object r9 = r1.fQ(r9, r8)
            if (r9 != r0) goto L44
            goto L47
        L44:
            ffcu r9 = defpackage.ffcu.a
            return r9
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqit.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dqit dqitVar = new dqit(this.c, this.d, this.e, ffguVar);
        dqitVar.b = obj;
        return dqitVar;
    }
}
