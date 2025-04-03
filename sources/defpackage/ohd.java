package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ohd extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ oia c;
    final /* synthetic */ ofz d;
    Object e;
    int f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohd(ffgu ffguVar, oia oiaVar, ofz ofzVar) {
        super(3, ffguVar);
        this.c = oiaVar;
        this.d = ofzVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ohd ohdVar = new ohd((ffgu) obj3, this.c, this.d);
        ohdVar.g = (ffxy) obj;
        ohdVar.b = obj2;
        return ohdVar.b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009b, code lost:
    
        if (defpackage.ffyk.c(r6, r1, r9) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
    
        if (r10 != r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [ffxy] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1d
            if (r1 == r2) goto Lf
            defpackage.ffci.b(r10)
            goto L9e
        Lf:
            int r1 = r9.f
            java.lang.Object r4 = r9.e
            java.lang.Object r5 = r9.b
            oib r5 = (defpackage.oib) r5
            java.lang.Object r6 = r9.g
            defpackage.ffci.b(r10)
            goto L40
        L1d:
            defpackage.ffci.b(r10)
            java.lang.Object r6 = r9.g
            java.lang.Object r10 = r9.b
            java.lang.Number r10 = (java.lang.Number) r10
            int r1 = r10.intValue()
            oia r10 = r9.c
            r9.g = r6
            oib r5 = r10.i
            r9.b = r5
            fgjb r4 = r5.a
            r9.e = r4
            r9.f = r1
            r9.a = r2
            java.lang.Object r10 = r4.a(r3, r9)
            if (r10 == r0) goto La6
        L40:
            oie r10 = r5.b     // Catch: java.lang.Throwable -> La1
            ogh r5 = r10.j     // Catch: java.lang.Throwable -> La1
            ofz r7 = r9.d     // Catch: java.lang.Throwable -> La1
            ofx r5 = r5.a(r7)     // Catch: java.lang.Throwable -> La1
            ofw r7 = defpackage.ofw.a     // Catch: java.lang.Throwable -> La1
            boolean r5 = defpackage.ffkj.e(r5, r7)     // Catch: java.lang.Throwable -> La1
            r7 = 0
            if (r5 == 0) goto L5e
            oeo[] r10 = new defpackage.oeo[r7]     // Catch: java.lang.Throwable -> La1
            ffyf r1 = new ffyf     // Catch: java.lang.Throwable -> La1
            r1.<init>(r10)     // Catch: java.lang.Throwable -> La1
            r4.b(r3)
            goto L8e
        L5e:
            ogh r5 = r10.j     // Catch: java.lang.Throwable -> La1
            ofz r8 = r9.d     // Catch: java.lang.Throwable -> La1
            ofx r5 = r5.a(r8)     // Catch: java.lang.Throwable -> La1
            boolean r5 = r5 instanceof defpackage.ofu     // Catch: java.lang.Throwable -> La1
            if (r5 != 0) goto L73
            ogh r10 = r10.j     // Catch: java.lang.Throwable -> La1
            ofz r5 = r9.d     // Catch: java.lang.Throwable -> La1
            ofw r8 = defpackage.ofw.b     // Catch: java.lang.Throwable -> La1
            r10.d(r5, r8)     // Catch: java.lang.Throwable -> La1
        L73:
            r4.b(r3)
            oia r10 = r9.c
            ofz r4 = r9.d
            if (r1 != 0) goto L7d
            r2 = r7
        L7d:
            oet r10 = r10.f
            ffxx r10 = r10.b(r4)
            ffzr r4 = new ffzr
            r4.<init>(r10, r2)
            ohi r10 = new ohi
            r10.<init>(r4, r1)
            r1 = r10
        L8e:
            r9.g = r3
            r9.b = r3
            r9.e = r3
            r10 = 2
            r9.a = r10
            java.lang.Object r10 = defpackage.ffyk.c(r6, r1, r9)
            if (r10 != r0) goto L9e
            goto La6
        L9e:
            ffcu r10 = defpackage.ffcu.a
            return r10
        La1:
            r10 = move-exception
            r4.b(r3)
            throw r10
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohd.b(java.lang.Object):java.lang.Object");
    }
}
