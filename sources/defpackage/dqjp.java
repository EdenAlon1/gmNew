package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqjp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqjz b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqjp(dqjz dqjzVar, Object obj, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqjzVar;
        this.c = obj;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqjp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        if (defpackage.fgfz.c(r6, r5) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005c, code lost:
    
        if (r6.i.fQ(r1, r5) == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0062, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
    
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
            if (r1 == r2) goto L4f
            goto L5f
        Ld:
            efkj r6 = defpackage.dqjm.a
            dqjz r6 = r5.b
            java.lang.Object r1 = r5.c
            dqii r3 = r6.e
            ffji r3 = r3.b
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            efko r3 = new efko
            r3.<init>()
            java.lang.String r4 = "\n          DELETE FROM `usages`\n          WHERE `type` = ? AND `value` = ?\n          "
            r3.b(r4)
            java.lang.String r6 = r6.f
            r3.d(r6)
            r3.d(r1)
            efkn r6 = r3.a()
            dqjz r1 = r5.b
            ffbr r1 = r1.b
            java.lang.Object r1 = r1.b()
            efiv r1 = (defpackage.efiv) r1
            com.google.common.util.concurrent.ListenableFuture r6 = r1.c(r6)
            r6.getClass()
            r5.a = r2
            java.lang.Object r6 = defpackage.fgfz.c(r6, r5)
            if (r6 == r0) goto L62
        L4f:
            dqjz r6 = r5.b
            java.lang.Object r1 = r5.c
            r2 = 2
            r5.a = r2
            fgcl r6 = r6.i
            java.lang.Object r6 = r6.fQ(r1, r5)
            if (r6 != r0) goto L5f
            goto L62
        L5f:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqjp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqjp(this.b, this.c, ffguVar);
    }
}
