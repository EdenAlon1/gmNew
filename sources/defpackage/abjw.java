package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abjw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abjx b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abjw(abjx abjxVar, float f, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abjxVar;
        this.c = f;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abjw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        if (defpackage.ffsw.c(5000, r3) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (r4 == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        r4 = (defpackage.cymp) r4;
        r3.b.c = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        return defpackage.ffcu.a;
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
            if (r1 == r2) goto L17
            goto L2c
        Ld:
            r3.a = r2
            r1 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r4 = defpackage.ffsw.c(r1, r3)
            if (r4 == r0) goto L36
        L17:
            abjx r4 = r3.b
            float r1 = r3.c
            abjv r2 = new abjv
            r2.<init>()
            r1 = 2
            r3.a = r1
            comc r4 = r4.a
            java.lang.Object r4 = r4.d(r2, r3)
            if (r4 != r0) goto L2c
            goto L36
        L2c:
            cymp r4 = (defpackage.cymp) r4
            abjx r4 = r3.b
            r0 = 0
            r4.c = r0
            ffcu r4 = defpackage.ffcu.a
            return r4
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abjw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new abjw(this.b, this.c, ffguVar);
    }
}
