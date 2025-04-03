package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqir implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ dqiy b;
    final /* synthetic */ dqgm c;

    public dqir(ffxy ffxyVar, dqiy dqiyVar, dqgm dqgmVar) {
        this.a = ffxyVar;
        this.b = dqiyVar;
        this.c = dqgmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r8.fQ(r9, r0) != r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ffxy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(defpackage.dqij r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dqiq
            if (r0 == 0) goto L13
            r0 = r9
            dqiq r0 = (defpackage.dqiq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dqiq r0 = new dqiq
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r9)
            goto L5c
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            java.lang.Object r8 = r0.a
            defpackage.ffci.b(r9)
            goto L50
        L38:
            defpackage.ffci.b(r9)
            ffxy r9 = r7.a
            dqiy r2 = r7.b
            dqgm r5 = r7.c
            r0.a = r9
            r0.d = r4
            dqji r2 = r2.f
            java.lang.Object r8 = defpackage.dqji.g(r2, r8, r5, r0)
            if (r8 == r1) goto L5f
            r6 = r9
            r9 = r8
            r8 = r6
        L50:
            r2 = 0
            r0.a = r2
            r0.d = r3
            java.lang.Object r8 = r8.fQ(r9, r0)
            if (r8 != r1) goto L5c
            goto L5f
        L5c:
            ffcu r8 = defpackage.ffcu.a
            return r8
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqir.fQ(dqij, ffgu):java.lang.Object");
    }
}
