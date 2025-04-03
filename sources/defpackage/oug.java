package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oug implements ffxy {
    final /* synthetic */ fflb a;
    final /* synthetic */ ffxy b;
    final /* synthetic */ String[] c;
    final /* synthetic */ int[] d;

    public oug(fflb fflbVar, ffxy ffxyVar, String[] strArr, int[] iArr) {
        this.a = fflbVar;
        this.b = ffxyVar;
        this.c = strArr;
        this.d = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r13.fQ(r2, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
    
        if (r13.fQ(r2, r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ffxy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(int[] r12, defpackage.ffgu r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.ouf
            if (r0 == 0) goto L13
            r0 = r13
            ouf r0 = (defpackage.ouf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ouf r0 = new ouf
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L27
            goto L2f
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            int[] r12 = r0.e
            oug r0 = r0.d
            defpackage.ffci.b(r13)
            goto L9e
        L37:
            defpackage.ffci.b(r13)
            fflb r13 = r11.a
            java.lang.Object r2 = r13.a
            if (r2 != 0) goto L55
            ffxy r13 = r11.b
            java.lang.String[] r2 = r11.c
            java.util.Set r2 = defpackage.ffdo.N(r2)
            r0.d = r11
            r0.e = r12
            r0.c = r4
            java.lang.Object r13 = r13.fQ(r2, r0)
            if (r13 != r1) goto L9d
            goto L9c
        L55:
            java.lang.String[] r2 = r11.c
            int[] r4 = r11.d
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            r7 = r6
        L60:
            int r8 = r2.length
            if (r6 >= r8) goto L84
            r8 = r2[r6]
            int r9 = r7 + 1
            java.lang.Object r10 = r13.a
            if (r10 == 0) goto L7c
            int[] r10 = (int[]) r10
            r7 = r4[r7]
            r10 = r10[r7]
            r7 = r12[r7]
            if (r10 == r7) goto L78
            r5.add(r8)
        L78:
            int r6 = r6 + 1
            r7 = r9
            goto L60
        L7c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Required value was null."
            r12.<init>(r13)
            throw r12
        L84:
            boolean r13 = r5.isEmpty()
            if (r13 != 0) goto L9d
            ffxy r13 = r11.b
            java.util.Set r2 = defpackage.ffdx.ar(r5)
            r0.d = r11
            r0.e = r12
            r0.c = r3
            java.lang.Object r13 = r13.fQ(r2, r0)
            if (r13 != r1) goto L9d
        L9c:
            return r1
        L9d:
            r0 = r11
        L9e:
            fflb r13 = r0.a
            r13.a = r12
            ffcu r12 = defpackage.ffcu.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oug.fQ(int[], ffgu):java.lang.Object");
    }
}
