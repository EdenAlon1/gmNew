package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dpt extends ffhu implements ffjm {
    int a;
    final /* synthetic */ ffhd b;
    final /* synthetic */ ffjm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpt(ffhd ffhdVar, ffjm ffjmVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = ffhdVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpt) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (r6 != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if (r6 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r6 != r0) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [iju, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [ffjm] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004a -> B:7:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x005e -> B:7:0x002e). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 == r2) goto L14
            java.lang.Object r1 = r5.d
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r6)
            goto L2e
        L14:
            java.lang.Object r1 = r5.d
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r6)     // Catch: java.util.concurrent.CancellationException -> L1c
            goto L2e
        L1c:
            r6 = move-exception
            goto L4d
        L1e:
            java.lang.Object r1 = r5.d
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r6)     // Catch: java.util.concurrent.CancellationException -> L1c
            goto L42
        L26:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.d
            r1 = r6
            iju r1 = (defpackage.iju) r1
        L2e:
            ffhd r6 = r5.b
            boolean r6 = defpackage.ffui.h(r6)
            if (r6 == 0) goto L63
            ffjm r6 = r5.c     // Catch: java.util.concurrent.CancellationException -> L1c
            r5.d = r1     // Catch: java.util.concurrent.CancellationException -> L1c
            r5.a = r3     // Catch: java.util.concurrent.CancellationException -> L1c
            java.lang.Object r6 = r6.a(r1, r5)     // Catch: java.util.concurrent.CancellationException -> L1c
            if (r6 == r0) goto L61
        L42:
            r5.d = r1     // Catch: java.util.concurrent.CancellationException -> L1c
            r5.a = r2     // Catch: java.util.concurrent.CancellationException -> L1c
            java.lang.Object r6 = defpackage.dpu.d(r1, r5)     // Catch: java.util.concurrent.CancellationException -> L1c
            if (r6 != r0) goto L2e
            goto L61
        L4d:
            ffhd r4 = r5.b
            boolean r4 = defpackage.ffui.h(r4)
            if (r4 == 0) goto L62
            r5.d = r1
            r6 = 3
            r5.a = r6
            java.lang.Object r6 = defpackage.dpu.d(r1, r5)
            if (r6 == r0) goto L61
            goto L2e
        L61:
            return r0
        L62:
            throw r6
        L63:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dpt dptVar = new dpt(this.b, this.c, ffguVar);
        dptVar.d = obj;
        return dptVar;
    }
}
