package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayef extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ayeg d;
    final /* synthetic */ ayee e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayef(ayeg ayegVar, ayee ayeeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = ayegVar;
        this.e = ayeeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayef) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        if (r1.b(r5) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        if (r1.a(r5) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0031, code lost:
    
        if (r6 != r0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.c
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 == r3) goto L12
            defpackage.ffci.b(r6)
            goto L89
        L12:
            java.lang.Object r1 = r5.b
            java.lang.Object r3 = r5.a
            defpackage.ffci.b(r6)
            goto L5b
        L1a:
            defpackage.ffci.b(r6)
            goto L33
        L1e:
            defpackage.ffci.b(r6)
            ayeg r6 = r5.d
            ffbr r6 = r6.c
            java.lang.Object r6 = r6.b()
            ayei r6 = (defpackage.ayei) r6
            r5.c = r4
            java.lang.Object r6 = r6.b(r5)
            if (r6 == r0) goto L8e
        L33:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L41
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L41:
            ayeg r6 = r5.d
            ayee r1 = r5.e
            ffbr r6 = r6.b
            java.lang.Object r6 = r6.b()
            ayed r6 = (defpackage.ayed) r6
            r5.a = r1
            r5.b = r6
            r5.c = r3
            java.lang.Object r3 = r6.c(r5)
            if (r3 == r0) goto L8e
            r3 = r1
            r1 = r6
        L5b:
            ayee r6 = defpackage.ayee.a
            ayee r3 = (defpackage.ayee) r3
            int r6 = r3.ordinal()
            r3 = 0
            if (r6 == 0) goto L7c
            if (r6 != r4) goto L76
            r5.a = r3
            r5.b = r3
            r6 = 4
            r5.c = r6
            java.lang.Object r6 = r1.b(r5)
            if (r6 != r0) goto L89
            goto L8e
        L76:
            ffcd r6 = new ffcd
            r6.<init>()
            throw r6
        L7c:
            r5.a = r3
            r5.b = r3
            r5.c = r2
            java.lang.Object r6 = r1.a(r5)
            if (r6 != r0) goto L89
            goto L8e
        L89:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayef.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ayef(this.d, this.e, ffguVar);
    }
}
