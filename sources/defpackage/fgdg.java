package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgdg extends ffhv implements ffjn {
    int a;
    /* synthetic */ int b;
    final /* synthetic */ fgdi c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgdg(fgdi fgdiVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = fgdiVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        fgdg fgdgVar = new fgdg(this.c, (ffgu) obj3);
        fgdgVar.d = (ffxy) obj;
        fgdgVar.b = intValue;
        return fgdgVar.b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (defpackage.ffsw.c(Long.MAX_VALUE, r6) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r7 != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
    
        if (r1.fQ(r7, r6) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        if (defpackage.ffsw.c(r7.b, r6) != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0070, code lost:
    
        if (r1.fQ(r7, r6) == r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.a
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L29
            if (r1 == r5) goto L25
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L19
            if (r1 == r2) goto L13
            goto L25
        L13:
            java.lang.Object r1 = r6.d
            defpackage.ffci.b(r7)
            goto L64
        L19:
            java.lang.Object r1 = r6.d
            defpackage.ffci.b(r7)
            goto L55
        L1f:
            java.lang.Object r1 = r6.d
            defpackage.ffci.b(r7)
            goto L49
        L25:
            defpackage.ffci.b(r7)
            goto L73
        L29:
            defpackage.ffci.b(r7)
            java.lang.Object r1 = r6.d
            int r7 = r6.b
            if (r7 <= 0) goto L3d
            fgcw r7 = defpackage.fgcw.a
            r6.a = r5
            java.lang.Object r7 = r1.fQ(r7, r6)
            if (r7 != r0) goto L73
            goto L76
        L3d:
            fgdi r7 = r6.c
            r6.a = r4
            long r4 = r7.b
            java.lang.Object r7 = defpackage.ffsw.c(r4, r6)
            if (r7 == r0) goto L76
        L49:
            fgcw r7 = defpackage.fgcw.b
            r6.d = r1
            r6.a = r3
            java.lang.Object r7 = r1.fQ(r7, r6)
            if (r7 == r0) goto L76
        L55:
            r6.d = r1
            r6.a = r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r7 = defpackage.ffsw.c(r2, r6)
            if (r7 == r0) goto L76
        L64:
            fgcw r7 = defpackage.fgcw.c
            r2 = 0
            r6.d = r2
            r2 = 5
            r6.a = r2
            java.lang.Object r7 = r1.fQ(r7, r6)
            if (r7 != r0) goto L73
            goto L76
        L73:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgdg.b(java.lang.Object):java.lang.Object");
    }
}
