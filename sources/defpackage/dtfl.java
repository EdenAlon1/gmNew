package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtfl extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dtfs c;
    final /* synthetic */ ffjn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtfl(dtfs dtfsVar, ffjn ffjnVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = dtfsVar;
        this.d = ffjnVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dtfl dtflVar = new dtfl(this.c, this.d, (ffgu) obj3);
        dtflVar.b = (Exception) obj2;
        return dtflVar.b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r5.a(r2, r1, r4) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r5 != r0) goto L9;
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
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r5)
            goto L35
        Ld:
            java.lang.Object r1 = r4.b
            defpackage.ffci.b(r5)
            goto L22
        L13:
            defpackage.ffci.b(r5)
            java.lang.Object r1 = r4.b
            dtfs r5 = r4.c
            r4.a = r2
            java.lang.Object r5 = r5.d(r4)
            if (r5 == r0) goto L38
        L22:
            android.net.Uri r5 = (android.net.Uri) r5
            ffjn r5 = r4.d
            dtfs r2 = r4.c
            r3 = 0
            r4.b = r3
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = r5.a(r2, r1, r4)
            if (r5 != r0) goto L35
            goto L38
        L35:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtfl.b(java.lang.Object):java.lang.Object");
    }
}
