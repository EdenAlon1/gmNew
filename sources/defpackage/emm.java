package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class emm extends ffhu implements ffjm {
    Object a;
    int b;
    final /* synthetic */ eot c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emm(eot eotVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = eotVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((emm) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r10 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r10 != r0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004b -> B:5:0x004e). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.b
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L15
            java.lang.Object r1 = r9.a
            java.lang.Object r4 = r9.d
            iju r4 = (defpackage.iju) r4
            defpackage.ffci.b(r10)
            goto L4e
        L15:
            java.lang.Object r1 = r9.d
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r10)
            goto L31
        L1d:
            defpackage.ffci.b(r10)
            java.lang.Object r10 = r9.d
            r1 = r10
            iju r1 = (defpackage.iju) r1
            ikk r10 = defpackage.ikk.a
            r9.d = r1
            r9.b = r4
            java.lang.Object r10 = defpackage.dtr.a(r1, r3, r10, r9)
            if (r10 == r0) goto L85
        L31:
            eot r4 = r9.c
            iku r10 = (defpackage.iku) r10
            r5 = 0
            r4.t(r5)
            r4 = r1
            r1 = r10
        L3c:
            if (r2 != 0) goto L73
            ikk r10 = defpackage.ikk.a
            r9.d = r4
            r9.a = r1
            r5 = 2
            r9.b = r5
            java.lang.Object r10 = r4.r(r10, r9)
            if (r10 != r0) goto L4e
            goto L85
        L4e:
            iki r10 = (defpackage.iki) r10
            java.util.List r5 = r10.a
            int r6 = r5.size()
            r7 = r3
        L57:
            if (r7 >= r6) goto L69
            java.lang.Object r8 = r5.get(r7)
            iku r8 = (defpackage.iku) r8
            boolean r8 = defpackage.ikj.e(r8)
            if (r8 != 0) goto L66
            goto L3c
        L66:
            int r7 = r7 + 1
            goto L57
        L69:
            java.util.List r10 = r10.a
            java.lang.Object r10 = r10.get(r3)
            r2 = r10
            iku r2 = (defpackage.iku) r2
            goto L3c
        L73:
            eot r10 = r9.c
            iku r1 = (defpackage.iku) r1
            long r0 = r1.c
            long r2 = r2.c
            long r0 = defpackage.iak.e(r2, r0)
            r10.t(r0)
            ffcu r10 = defpackage.ffcu.a
            return r10
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        emm emmVar = new emm(this.c, ffguVar);
        emmVar.d = obj;
        return emmVar;
    }
}
