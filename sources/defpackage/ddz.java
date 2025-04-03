package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddz extends ffhu implements ffjm {
    int a;
    final /* synthetic */ deb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddz(deb debVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = debVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ddz) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
    
        if (r13 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x002b, code lost:
    
        if (r13 != r0) goto L9;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0041 -> B:5:0x0045). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            r12 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r12.a
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L13
            java.lang.Object r1 = r12.c
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r13)
            goto L45
        L13:
            java.lang.Object r1 = r12.c
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r13)
            goto L2d
        L1b:
            defpackage.ffci.b(r13)
            java.lang.Object r13 = r12.c
            r1 = r13
            iju r1 = (defpackage.iju) r1
            r12.c = r1
            r12.a = r4
            java.lang.Object r13 = defpackage.dtr.g(r1, r3, r12, r2)
            if (r13 == r0) goto Lb0
        L2d:
            deb r4 = r12.b
            iku r13 = (defpackage.iku) r13
            long r5 = r13.a
            r4.c = r5
            long r5 = r13.c
            r4.a = r5
        L39:
            r12.c = r1
            r12.a = r2
            java.lang.Object r13 = defpackage.ijt.a(r1, r12)
            if (r13 != r0) goto L45
            goto Lb0
        L45:
            iki r13 = (defpackage.iki) r13
            java.util.List r13 = r13.a
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r13.size()
            r4.<init>(r5)
            int r5 = r13.size()
            r6 = 0
            r7 = r6
        L58:
            if (r7 >= r5) goto L6b
            java.lang.Object r8 = r13.get(r7)
            r9 = r8
            iku r9 = (defpackage.iku) r9
            boolean r9 = r9.d
            if (r9 == 0) goto L68
            r4.add(r8)
        L68:
            int r7 = r7 + 1
            goto L58
        L6b:
            deb r13 = r12.b
            int r5 = r4.size()
        L71:
            if (r6 >= r5) goto L88
            java.lang.Object r7 = r4.get(r6)
            r8 = r7
            iku r8 = (defpackage.iku) r8
            long r8 = r8.a
            long r10 = r13.c
            boolean r8 = defpackage.ikt.b(r8, r10)
            if (r8 == 0) goto L85
            goto L89
        L85:
            int r6 = r6 + 1
            goto L71
        L88:
            r7 = r3
        L89:
            iku r7 = (defpackage.iku) r7
            if (r7 != 0) goto L94
            java.lang.Object r13 = defpackage.ffdx.M(r4)
            r7 = r13
            iku r7 = (defpackage.iku) r7
        L94:
            if (r7 == 0) goto La0
            deb r13 = r12.b
            long r5 = r7.a
            r13.c = r5
            long r5 = r7.c
            r13.a = r5
        La0:
            boolean r13 = r4.isEmpty()
            if (r13 != 0) goto La7
            goto L39
        La7:
            deb r13 = r12.b
            r0 = -1
            r13.c = r0
            ffcu r13 = defpackage.ffcu.a
            return r13
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ddz ddzVar = new ddz(this.b, ffguVar);
        ddzVar.c = obj;
        return ddzVar;
    }
}
