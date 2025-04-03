package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cpk extends ffhu implements ffjm {
    Object a;
    Object b;
    int c;
    int d;
    int e;
    int f;
    long g;
    int h;
    final /* synthetic */ cpl i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpk(cpl cplVar, ffgu ffguVar) {
        super(ffguVar);
        this.i = cplVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpk) c((ffnn) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0049 -> B:14:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004b -> B:5:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0065 -> B:4:0x0089). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0085 -> B:4:0x0089). Please report as a decompilation issue!!! */
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
            r3 = 0
            r4 = 1
            r5 = 8
            if (r2 == 0) goto L23
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
            goto L89
        L23:
            defpackage.ffci.b(r21)
            java.lang.Object r2 = r0.j
            ffnn r2 = (defpackage.ffnn) r2
            cpl r6 = r0.i
            cpi r6 = r6.b
            java.lang.Object[] r7 = r6.b
            long[] r6 = r6.a
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L97
            r9 = r3
        L38:
            r10 = r6
            long[] r10 = (long[]) r10
            r11 = r10[r9]
            long r13 = ~r11
            r10 = 7
            long r13 = r13 << r10
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r10 == 0) goto L92
            int r10 = r9 - r8
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r13 = r2
            r2 = r3
            r18 = r11
            r11 = r6
            r12 = r7
            r6 = r10
            r10 = r8
            r7 = r18
        L5c:
            if (r2 >= r6) goto L8c
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L89
            int r14 = r9 << 3
            int r14 = r14 + r2
            r15 = r12
            java.lang.Object[] r15 = (java.lang.Object[]) r15
            r14 = r15[r14]
            r0.j = r13
            r0.a = r12
            r0.b = r11
            r0.c = r10
            r0.d = r9
            r0.g = r7
            r0.e = r6
            r0.f = r2
            r0.h = r4
            java.lang.Object r14 = r13.a(r14, r0)
            if (r14 == r1) goto L88
            goto L89
        L88:
            return r1
        L89:
            long r7 = r7 >> r5
            int r2 = r2 + r4
            goto L5c
        L8c:
            if (r6 != r5) goto L97
            r8 = r10
            r6 = r11
            r7 = r12
            r2 = r13
        L92:
            if (r9 == r8) goto L97
            int r9 = r9 + 1
            goto L38
        L97:
            ffcu r1 = defpackage.ffcu.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cpk cpkVar = new cpk(this.i, ffguVar);
        cpkVar.j = obj;
        return cpkVar;
    }
}
