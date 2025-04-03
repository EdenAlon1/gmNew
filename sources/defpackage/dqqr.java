package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqqr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqqw b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqqr(dqqw dqqwVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqqwVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqqr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r4 = (defpackage.dqof) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r4 = r4.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        return r4.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if (r4 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if (r4 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r3.a
            r2 = 1
            defpackage.ffci.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1b
            goto L2d
        Ld:
            dqqw r4 = r3.b
            java.lang.String r1 = r3.c
            r3.a = r2
            dqok r4 = r4.b
            java.lang.Object r4 = r4.e(r1, r3)
            if (r4 == r0) goto L3e
        L1b:
            dqqj r4 = (defpackage.dqqj) r4
            if (r4 == 0) goto L3c
            dqqw r1 = r3.b
            r2 = 2
            r3.a = r2
            dqoy r1 = r1.c
            java.lang.Object r4 = r1.a(r4, r3)
            if (r4 != r0) goto L2d
            goto L3e
        L2d:
            dqof r4 = (defpackage.dqof) r4
            if (r4 == 0) goto L3c
            java.lang.CharSequence r4 = r4.a()
            if (r4 == 0) goto L3c
            java.lang.String r4 = r4.toString()
            return r4
        L3c:
            r4 = 0
            return r4
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqqr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqqr(this.b, this.c, ffguVar);
    }
}
