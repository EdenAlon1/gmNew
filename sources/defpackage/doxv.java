package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doxv extends ffhu implements ffjm {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ Class e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doxv(Class cls, ffgu ffguVar) {
        super(ffguVar);
        this.e = cls;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doxv) c((ffnn) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r9.f = r7;
        r9.a = r6;
        r9.b = r5;
        r9.c = r1;
        r9.d = 1;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (r7.a(r1, r9) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c8, code lost:
    
        if (r7.a(defpackage.doxs.class, r9) == r0) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005f -> B:9:0x0061). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.d
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L10
            defpackage.ffci.b(r10)
            goto Lcb
        L10:
            java.lang.Object r1 = r9.c
            java.lang.Object r5 = r9.b
            java.lang.Object r6 = r9.a
            java.lang.Object r7 = r9.f
            ffnn r7 = (defpackage.ffnn) r7
            defpackage.ffci.b(r10)
            goto L61
        L1e:
            defpackage.ffci.b(r10)
            java.lang.Object r10 = r9.f
            ffnn r10 = (defpackage.ffnn) r10
            ffdn r1 = new ffdn
            r1.<init>()
            java.lang.Class r5 = r9.e
            r1.add(r5)
            java.lang.Class[] r5 = new java.lang.Class[r4]
            java.lang.Class<doxs> r6 = defpackage.doxs.class
            r5[r3] = r6
            java.util.Set r5 = defpackage.fffi.c(r5)
            r7 = r10
            r6 = r1
        L3b:
            boolean r10 = r6.isEmpty()
            if (r10 != 0) goto Lb7
            r10 = r6
            ffdn r10 = (defpackage.ffdn) r10
            java.lang.Object r10 = r10.removeFirst()
            r1 = r10
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r10 = r5.contains(r1)
            if (r10 != 0) goto L3b
            r9.f = r7
            r9.a = r6
            r9.b = r5
            r9.c = r1
            r9.d = r4
            java.lang.Object r10 = r7.a(r1, r9)
            if (r10 == r0) goto Lca
        L61:
            r5.add(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Class r10 = r1.getSuperclass()
            java.lang.Class[] r8 = new java.lang.Class[r4]
            r8[r3] = r10
            ffdu r10 = new ffdu
            r10.<init>(r8)
            java.lang.Class[] r1 = r1.getInterfaces()
            r1.getClass()
            java.util.List r1 = defpackage.ffdo.c(r1)
            ffnl[] r8 = new defpackage.ffnl[r2]
            r8[r3] = r10
            ffnl r10 = defpackage.ffdx.as(r1)
            r8[r4] = r10
            ffdu r10 = new ffdu
            r10.<init>(r8)
            ffnt r1 = defpackage.ffnt.a
            ffni r8 = new ffni
            r8.<init>(r10, r1)
            ffoa r10 = defpackage.ffoa.a
            ffng r1 = new ffng
            r1.<init>(r8, r3, r10)
            doxt r10 = new doxt
            r10.<init>()
            ffng r8 = new ffng
            r8.<init>(r1, r4, r10)
            doxu r10 = new doxu
            r10.<init>()
            ffnl r10 = defpackage.ffno.i(r8, r10)
            ffny r1 = new ffny
            r1.<init>(r10)
            defpackage.ffdx.w(r6, r1)
            goto L3b
        Lb7:
            r10 = 0
            r9.f = r10
            r9.a = r10
            r9.b = r10
            r9.c = r10
            r9.d = r2
            java.lang.Class<doxs> r10 = defpackage.doxs.class
            java.lang.Object r10 = r7.a(r10, r9)
            if (r10 != r0) goto Lcb
        Lca:
            return r0
        Lcb:
            ffcu r10 = defpackage.ffcu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doxv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        doxv doxvVar = new doxv(this.e, ffguVar);
        doxvVar.f = obj;
        return doxvVar;
    }
}
