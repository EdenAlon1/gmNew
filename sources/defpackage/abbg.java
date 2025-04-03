package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abbg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abbk b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abbg(abbk abbkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abbkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abbg) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r1.fQ(r5, r4) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r5 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r1.fQ(false, r4) == r0) goto L16;
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
            int r1 = r4.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Le
            defpackage.ffci.b(r5)
            goto L49
        Le:
            java.lang.Object r1 = r4.c
            ffxy r1 = (defpackage.ffxy) r1
            defpackage.ffci.b(r5)
            goto L2e
        L16:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.c
            r1 = r5
            ffxy r1 = (defpackage.ffxy) r1
            abbk r5 = r4.b
            dqza r5 = r5.g
            if (r5 == 0) goto L3a
            r4.c = r1
            r4.a = r3
            java.lang.Object r5 = r5.a(r4)
            if (r5 == r0) goto L48
        L2e:
            r3 = 0
            r4.c = r3
            r4.a = r2
            java.lang.Object r5 = r1.fQ(r5, r4)
            if (r5 != r0) goto L49
            goto L48
        L3a:
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r2 = 3
            r4.a = r2
            java.lang.Object r5 = r1.fQ(r5, r4)
            if (r5 != r0) goto L49
        L48:
            return r0
        L49:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abbg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        abbg abbgVar = new abbg(this.b, ffguVar);
        abbgVar.c = obj;
        return abbgVar;
    }
}
