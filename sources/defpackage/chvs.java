package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class chvs extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ bzge d;
    final /* synthetic */ chvu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chvs(bzge bzgeVar, chvu chvuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = bzgeVar;
        this.e = chvuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chvs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r5.c(r1, r4) == r0) goto L20;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.c
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r5)
            goto L6d
        Ld:
            java.lang.Object r0 = r4.b
            java.lang.Object r1 = r4.a
            defpackage.ffci.b(r5)
            goto L4b
        L15:
            defpackage.ffci.b(r5)
            bzge r5 = r4.d
            fcek r5 = r5.a
            java.lang.String r5 = r5.d
            java.lang.String r1 = "GDitto"
            boolean r5 = defpackage.ffkj.e(r5, r1)
            if (r5 == 0) goto L5f
            chvu r5 = r4.e
            ffbr r5 = r5.a
            java.lang.Object r5 = r5.b()
            bzgd r5 = (defpackage.bzgd) r5
            bzge r1 = r4.d
            java.lang.String r1 = r1.b
            bzej r5 = r5.f(r1)
            if (r5 == 0) goto L59
            chvu r1 = r4.e
            bzge r3 = r4.d
            r4.a = r1
            r4.b = r3
            r4.c = r2
            java.lang.Object r5 = r1.d(r5, r4)
            if (r5 == r0) goto L6c
            r0 = r3
        L4b:
            bzge r0 = (defpackage.bzge) r0
            fcek r5 = r0.d
            chvu r1 = (defpackage.chvu) r1
            r1.e(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L59:
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L5f:
            chvu r5 = r4.e
            bzge r1 = r4.d
            r3 = 2
            r4.c = r3
            java.lang.Object r5 = r5.c(r1, r4)
            if (r5 != r0) goto L6d
        L6c:
            return r0
        L6d:
            chvu r5 = r4.e
            bzge r0 = r4.d
            fcek r0 = r0.d
            r5.e(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chvs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new chvs(this.d, this.e, ffguVar);
    }
}
