package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlcf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dlck b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlcf(dlck dlckVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dlckVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlcf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r5.k(r4) != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if (r5.b.a(r5.a, r4) != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r1 != 2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        r4.b.h = -1;
        r5 = r4.b;
        r4.a = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0045, code lost:
    
        if (r5.g.b(r5.a, r4) != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004b, code lost:
    
        return r0;
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
            if (r1 == 0) goto L10
            defpackage.ffci.b(r5)
            if (r1 == r3) goto L21
            if (r1 == r2) goto L33
            goto L48
        L10:
            defpackage.ffci.b(r5)
            dlck r5 = r4.b
            r4.a = r3
            dlij r1 = r5.b
            dlgb r5 = r5.a
            java.lang.Object r5 = r1.a(r5, r4)
            if (r5 == r0) goto L4b
        L21:
            dlck r5 = r4.b
            dlib r1 = r5.d
            dlgb r5 = r5.a
            dlia r5 = r1.a(r5)
            r4.a = r2
            java.lang.Object r5 = r5.k(r4)
            if (r5 == r0) goto L4b
        L33:
            dlck r5 = r4.b
            defpackage.dlck.c(r5)
            dlck r5 = r4.b
            r1 = 3
            r4.a = r1
            dlbf r1 = r5.g
            dlgb r5 = r5.a
            java.lang.Object r5 = r1.b(r5, r4)
            if (r5 != r0) goto L48
            goto L4b
        L48:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlcf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dlcf(this.b, ffguVar);
    }
}
