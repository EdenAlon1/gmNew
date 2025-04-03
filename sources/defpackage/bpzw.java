package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bpzw extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ dtyq c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpzw(dtyq dtyqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dtyqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bpzw) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (defpackage.ffxd.b(r3, r5, r6) == r0) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Type inference failed for: r1v1, types: [bpzv, dtrs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [dtyq] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.b
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L25
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            defpackage.ffci.b(r7)
            goto L5b
        L11:
            java.lang.Object r0 = r6.d
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.ffci.b(r7)
            goto L79
        L19:
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.d
            ffxe r3 = (defpackage.ffxe) r3
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L23
            goto L45
        L23:
            r7 = move-exception
            goto L61
        L25:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.d
            ffxe r7 = (defpackage.ffxe) r7
            bpzv r1 = new bpzv
            r1.<init>(r7)
            dtyq r5 = r6.c
            r5.L(r1)
            dtyq r5 = r6.c     // Catch: java.lang.Throwable -> L5e
            r6.d = r7     // Catch: java.lang.Throwable -> L5e
            r6.a = r1     // Catch: java.lang.Throwable -> L5e
            r6.b = r3     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r3 = r7.a(r5, r6)     // Catch: java.lang.Throwable -> L5e
            if (r3 == r0) goto L77
            r3 = r7
        L45:
            dtyq r7 = r6.c
            bpzu r5 = new bpzu
            bpzv r1 = (defpackage.bpzv) r1
            r5.<init>()
            r6.d = r4
            r6.a = r4
            r6.b = r2
            java.lang.Object r7 = defpackage.ffxd.b(r3, r5, r6)
            if (r7 != r0) goto L5b
            goto L77
        L5b:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L5e:
            r2 = move-exception
            r3 = r7
            r7 = r2
        L61:
            dtyq r2 = r6.c
            bpzu r5 = new bpzu
            bpzv r1 = (defpackage.bpzv) r1
            r5.<init>()
            r6.d = r7
            r6.a = r4
            r1 = 3
            r6.b = r1
            java.lang.Object r1 = defpackage.ffxd.b(r3, r5, r6)
            if (r1 != r0) goto L78
        L77:
            return r0
        L78:
            r0 = r7
        L79:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpzw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bpzw bpzwVar = new bpzw(this.c, ffguVar);
        bpzwVar.d = obj;
        return bpzwVar;
    }
}
