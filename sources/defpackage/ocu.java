package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ocu implements ffxy {
    final /* synthetic */ ocy a;

    public ocu(ocy ocyVar) {
        this.a = ocyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r7.b(r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ffxy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(defpackage.ffes r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.oct
            if (r0 == 0) goto L13
            r0 = r7
            oct r0 = (defpackage.oct) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            oct r0 = new oct
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            goto L60
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ffes r6 = r0.e
            ocu r2 = r0.d
            defpackage.ffci.b(r7)
            goto L4e
        L3a:
            defpackage.ffci.b(r7)
            ocy r7 = r5.a
            r0.d = r5
            r0.e = r6
            r0.c = r4
            fgcl r7 = r7.b
            java.lang.Object r7 = r7.fQ(r6, r0)
            if (r7 == r1) goto L63
            r2 = r5
        L4e:
            ocy r7 = r2.a
            oed r7 = r7.a
            r2 = 0
            r0.d = r2
            r0.e = r2
            r0.c = r3
            java.lang.Object r6 = r7.b(r6, r0)
            if (r6 != r1) goto L60
            goto L63
        L60:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocu.fQ(ffes, ffgu):java.lang.Object");
    }
}
