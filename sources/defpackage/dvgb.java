package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvgb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dvgf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvgb(dvgf dvgfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dvgfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvgb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0063, code lost:
    
        if (r6 != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0069, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r6 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r6 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002a, code lost:
    
        if (r6 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r1 != 3) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0050, code lost:
    
        r6 = r5.b;
        r1 = r6.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0056, code lost:
    
        r6 = r6.a;
        r1 = r1.a();
        r5.a = 4;
        r6 = r6.b(r1, r5);
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
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L17
            if (r1 == r4) goto L13
            defpackage.ffci.b(r6)
            if (r1 == r3) goto L3e
            if (r1 == r2) goto L50
            goto L66
        L13:
            defpackage.ffci.b(r6)
            goto L2c
        L17:
            defpackage.ffci.b(r6)
            dvgf r6 = r5.b
            ealb r1 = r6.e
            int r1 = r1.a()
            r5.a = r4
            ealf r6 = r6.a
            java.lang.Object r6 = defpackage.eale.a(r6, r1, r5)
            if (r6 == r0) goto L69
        L2c:
            dvgf r6 = r5.b
            ealb r1 = r6.f
            int r1 = r1.a()
            r5.a = r3
            ealf r6 = r6.a
            java.lang.Object r6 = defpackage.eale.a(r6, r1, r5)
            if (r6 == r0) goto L69
        L3e:
            dvgf r6 = r5.b
            ealb r1 = r6.d
            int r1 = r1.a()
            r5.a = r2
            ealf r6 = r6.a
            java.lang.Object r6 = defpackage.eale.a(r6, r1, r5)
            if (r6 == r0) goto L69
        L50:
            dvgf r6 = r5.b
            ealb r1 = r6.g
            if (r1 == 0) goto L66
            ealf r6 = r6.a
            int r1 = r1.a()
            r2 = 4
            r5.a = r2
            java.lang.Object r6 = defpackage.eale.a(r6, r1, r5)
            if (r6 != r0) goto L66
            goto L69
        L66:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvgb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dvgb(this.b, ffguVar);
    }
}
