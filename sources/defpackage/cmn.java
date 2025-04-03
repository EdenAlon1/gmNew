package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cmn extends ffhu implements ffjm {
    Object a;
    Object b;
    int c;
    int d;
    int e;
    int f;
    long g;
    int h;
    final /* synthetic */ cmo i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmn(cmo cmoVar, ffgu ffguVar) {
        super(ffguVar);
        this.i = cmoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmn) c((ffnn) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0091 -> B:5:0x0097). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0048 -> B:6:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a5 -> B:16:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0062 -> B:4:0x0095). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.h
            r4 = 1
            r5 = 8
            if (r2 == 0) goto L22
            int r2 = r0.f
            int r6 = r0.e
            long r7 = r0.g
            int r9 = r0.d
            int r10 = r0.c
            java.lang.Object r11 = r0.b
            java.lang.Object r12 = r0.a
            java.lang.Object r13 = r0.j
            ffnn r13 = (defpackage.ffnn) r13
            defpackage.ffci.b(r21)
            goto L95
        L22:
            defpackage.ffci.b(r21)
            java.lang.Object r2 = r0.j
            ffnn r2 = (defpackage.ffnn) r2
            cmo r6 = r0.i
            cpf r7 = r6.a
            long[] r7 = r7.a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto Lac
            r9 = 0
        L35:
            r10 = r7
            long[] r10 = (long[]) r10
            r11 = r10[r9]
            long r13 = ~r11
            r10 = 7
            long r13 = r13 << r10
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r10 == 0) goto La5
            int r10 = r9 - r8
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r13 = r2
            r2 = 0
            r18 = r11
            r12 = r6
            r11 = r7
            r6 = r10
            r10 = r8
            r7 = r18
        L59:
            if (r2 >= r6) goto L9d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L95
            int r14 = r9 << 3
            int r14 = r14 + r2
            cnr r15 = new cnr
            r3 = r12
            cmo r3 = (defpackage.cmo) r3
            cpf r3 = r3.a
            r17 = r5
            java.lang.Object[] r5 = r3.b
            r5 = r5[r14]
            java.lang.Object[] r3 = r3.c
            r3 = r3[r14]
            r15.<init>(r5, r3)
            r0.j = r13
            r0.a = r12
            r0.b = r11
            r0.c = r10
            r0.d = r9
            r0.g = r7
            r0.e = r6
            r0.f = r2
            r0.h = r4
            java.lang.Object r3 = r13.a(r15, r0)
            if (r3 == r1) goto L94
            goto L97
        L94:
            return r1
        L95:
            r17 = r5
        L97:
            long r7 = r7 >> r17
            int r2 = r2 + r4
            r5 = r17
            goto L59
        L9d:
            r3 = r5
            if (r6 != r3) goto Lac
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r13
            goto La6
        La5:
            r3 = r5
        La6:
            if (r9 == r8) goto Lac
            int r9 = r9 + 1
            r5 = r3
            goto L35
        Lac:
            ffcu r1 = defpackage.ffcu.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cmn cmnVar = new cmn(this.i, ffguVar);
        cmnVar.j = obj;
        return cmnVar;
    }
}
