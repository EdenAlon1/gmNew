package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvzf implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ cvzm b;

    public cvzf(ffxy ffxyVar, cvzm cvzmVar) {
        this.a = ffxyVar;
        this.b = cvzmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r2.fQ(r7, r0) != r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cvze
            if (r0 == 0) goto L13
            r0 = r8
            cvze r0 = (defpackage.cvze) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            cvze r0 = new cvze
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r8)
            goto L75
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.e
            java.lang.Object r2 = r0.c
            defpackage.ffci.b(r8)
            goto L52
        L3a:
            defpackage.ffci.b(r8)
            ffxy r2 = r6.a
            cwir r7 = (defpackage.cwir) r7
            cvzm r8 = r6.b
            r0.c = r2
            android.content.Context r5 = r8.b
            r0.e = r5
            r0.b = r4
            java.lang.Object r8 = r8.i(r7, r0)
            if (r8 == r1) goto L78
            r7 = r5
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r4 == r8) goto L5e
            r8 = 2132087450(0x7f15129a, float:1.9815156E38)
            goto L61
        L5e:
            r8 = 2132087451(0x7f15129b, float:1.9815158E38)
        L61:
            android.content.Context r7 = (android.content.Context) r7
            java.lang.String r7 = r7.getString(r8)
            r8 = 0
            r0.c = r8
            r0.e = r8
            r0.b = r3
            java.lang.Object r7 = r2.fQ(r7, r0)
            if (r7 != r1) goto L75
            goto L78
        L75:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvzf.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
