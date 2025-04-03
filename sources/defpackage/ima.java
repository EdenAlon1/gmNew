package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ima extends ffhv implements ffjm {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ imc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ima(long j, imc imcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = j;
        this.c = imcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ima) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        r6.w(defpackage.ffci.a(new defpackage.ikl(r5.b)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0018, code lost:
    
        if (defpackage.ffsw.c(r3 - 8, r5) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (defpackage.ffsw.c(8, r5) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r6 = r5.c.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r6 == null) goto L14;
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
            if (r1 == r2) goto L1a
            goto L26
        Ld:
            long r3 = r5.b
            r5.a = r2
            r1 = -8
            long r3 = r3 + r1
            java.lang.Object r6 = defpackage.ffsw.c(r3, r5)
            if (r6 == r0) goto L3d
        L1a:
            r6 = 2
            r5.a = r6
            r1 = 8
            java.lang.Object r6 = defpackage.ffsw.c(r1, r5)
            if (r6 != r0) goto L26
            goto L3d
        L26:
            imc r6 = r5.c
            ffrf r6 = r6.a
            if (r6 == 0) goto L3a
            long r0 = r5.b
            ikl r2 = new ikl
            r2.<init>(r0)
            java.lang.Object r0 = defpackage.ffci.a(r2)
            r6.w(r0)
        L3a:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ima.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ima(this.b, this.c, ffguVar);
    }
}
