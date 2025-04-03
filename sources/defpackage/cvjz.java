package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvjz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvki b;
    final /* synthetic */ eiyc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvjz(cvki cvkiVar, eiyc eiycVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cvkiVar;
        this.c = eiycVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvjz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0017, code lost:
    
        if (r6 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (r3.m(r5) == r0) goto L17;
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
            if (r1 == r2) goto L19
            goto L3a
        Ld:
            cvki r6 = r5.b
            r5.a = r2
            comc r6 = r6.a
            java.lang.Object r6 = r6.c(r5)
            if (r6 == r0) goto L3d
        L19:
            eiyc r1 = r5.c
            cvki r3 = r5.b
            cvjn r6 = (defpackage.cvjn) r6
            int r4 = r6.b
            r2 = r2 & r4
            if (r2 == 0) goto L3a
            int r6 = r6.c
            eizj r1 = (defpackage.eizj) r1
            eisx r1 = r1.a
            int r1 = r1.a()
            if (r6 != r1) goto L3a
            r6 = 2
            r5.a = r6
            java.lang.Object r6 = r3.m(r5)
            if (r6 != r0) goto L3a
            goto L3d
        L3a:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvjz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvjz(this.b, this.c, ffguVar);
    }
}
