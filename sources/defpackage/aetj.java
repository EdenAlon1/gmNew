package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aetj extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ aetk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aetj(aetk aetkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.f = aetkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aetj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0048  */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [drwd] */
    /* JADX WARN: Type inference failed for: r4v3, types: [drwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [drwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L27
            if (r1 == r3) goto L16
            java.lang.Object r1 = r9.c
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r9.b
            java.lang.Object r5 = r9.a
            defpackage.ffci.b(r10)
            goto L42
        L16:
            java.lang.Object r1 = r9.d
            java.lang.Object r4 = r9.c
            drva r4 = (defpackage.drva) r4
            java.lang.Object r5 = r9.b
            java.lang.Object r6 = r9.a
            defpackage.ffci.b(r10)
            r8 = r5
            r5 = r4
            r4 = r8
            goto L62
        L27:
            defpackage.ffci.b(r10)
            aetk r10 = r9.f
            drva[] r1 = new defpackage.drva[r2]
            r4 = 0
            drva r5 = defpackage.drva.MEDIA_TYPE_IMAGE
            r1[r4] = r5
            drva r4 = defpackage.drva.MEDIA_TYPE_VIDEO
            r1[r3] = r4
            java.util.List r1 = defpackage.ffdx.g(r1)
            java.util.Iterator r1 = r1.iterator()
            drwd r4 = r10.c
            r5 = r4
        L42:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L7a
            java.lang.Object r10 = r1.next()
            drva r10 = (defpackage.drva) r10
            r9.a = r5
            r9.b = r4
            r9.c = r10
            r9.d = r1
            r9.e = r3
            java.lang.Object r6 = r4.b(r10, r9)
            if (r6 == r0) goto L79
            r8 = r5
            r5 = r10
            r10 = r6
            r6 = r8
        L62:
            drwg r7 = defpackage.drwg.a
            if (r10 != r7) goto L77
            r9.a = r6
            r9.b = r4
            r9.c = r1
            r10 = 0
            r9.d = r10
            r9.e = r2
            java.lang.Object r10 = r4.c(r5, r9)
            if (r10 == r0) goto L79
        L77:
            r5 = r6
            goto L42
        L79:
            return r0
        L7a:
            ffcu r10 = defpackage.ffcu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aetj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aetj(this.f, ffguVar);
    }
}
