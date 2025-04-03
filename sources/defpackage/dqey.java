package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqey extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    int f;
    final /* synthetic */ dqfc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqey(dqfc dqfcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.g = dqfcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqey) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        if (r1 == r0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00a1  */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005f -> B:12:0x0060). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L11
            int r0 = r7.e
            defpackage.ffci.b(r8)
            goto L9f
        L11:
            java.lang.Object r1 = r7.d
            java.lang.Object r4 = r7.c
            java.lang.Object r5 = r7.b
            java.lang.Object r6 = r7.a
            defpackage.ffci.b(r8)
            goto L60
        L1d:
            defpackage.ffci.b(r8)
            dqfc r8 = r7.g
            enru r1 = defpackage.dqfc.a
            dqfc r1 = r7.g
            java.util.List r8 = r8.aU()
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.ffdx.n(r8, r5)
            r4.<init>(r5)
            java.util.Iterator r8 = r8.iterator()
            r6 = r1
            r1 = r4
            r4 = r8
        L3c:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L6a
            java.lang.Object r8 = r4.next()
            dqlf r8 = (defpackage.dqlf) r8
            r5 = r6
            dqfc r5 = (defpackage.dqfc) r5
            dqli r5 = r5.q()
            r7.a = r6
            r7.b = r1
            r7.c = r4
            r7.d = r1
            r7.f = r2
            java.lang.Object r8 = defpackage.dqlg.d(r5, r8, r7)
            if (r8 == r0) goto L9d
            r5 = r1
        L60:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r8.booleanValue()
            r1.add(r8)
            r1 = r5
            goto L3c
        L6a:
            r8 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            boolean r8 = r1.contains(r8)
            r8 = r8 ^ r2
            dqfc r1 = r7.g
            enru r2 = defpackage.dqfc.a
            dslw r1 = r1.bA()
            dqdf r1 = (defpackage.dqdf) r1
            dpnj r1 = r1.e
            if (r1 == 0) goto L9e
            dqfc r1 = r7.g
            dqli r1 = r1.q()
            dqlf r2 = defpackage.dqlf.a
            r7.a = r3
            r7.b = r3
            r7.c = r3
            r7.d = r3
            r7.e = r8
            r4 = 2
            r7.f = r4
            java.lang.Object r1 = defpackage.dqlg.d(r1, r2, r7)
            if (r1 != r0) goto L9e
        L9d:
            return r0
        L9e:
            r0 = r8
        L9f:
            if (r0 == 0) goto La9
            dqfc r8 = r7.g
            enru r0 = defpackage.dqfc.a
            r8.bc()
            goto Lc8
        La9:
            dqfc r8 = r7.g
            enru r0 = defpackage.dqfc.a
            dqkk r0 = r8.by()
            dqdo r1 = new dqdo
            r1.<init>()
            java.lang.String r2 = "CameraGalleryScreen.PermissionsButton#onClick"
            android.view.View$OnClickListener r0 = r0.b(r2, r1)
            r1 = 2132086998(0x7f1510d6, float:1.9814239E38)
            r2 = 2132087299(0x7f151203, float:1.981485E38)
            r8.bh(r1, r3, r2, r0)
            r8.bQ()
        Lc8:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqey.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqey(this.g, ffguVar);
    }
}
