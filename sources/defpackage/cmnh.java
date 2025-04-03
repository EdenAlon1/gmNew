package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmnh extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ cmnk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmnh(cmnk cmnkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = cmnkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmnh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x004f -> B:4:0x0052). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.c
            if (r1 == 0) goto Le
            java.lang.Object r1 = r5.b
            java.lang.Object r2 = r5.a
            defpackage.ffci.b(r6)
            goto L52
        Le:
            defpackage.ffci.b(r6)
            entd r6 = defpackage.cmnk.a
            ensk r6 = r6.h()
            ensz r6 = (defpackage.ensz) r6
            java.lang.String r1 = "Scheduling config refresh from the debug menu."
            r6.q(r1)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            cmnk r1 = r5.d
            java.util.Set r1 = r1.g()
            java.util.Iterator r1 = r1.iterator()
            r2 = r6
        L2e:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L61
            java.lang.Object r6 = r1.next()
            djrm r6 = (defpackage.djrm) r6
            cmnk r3 = r5.d
            ffbr r3 = r3.c
            java.lang.Object r3 = r3.b()
            cort r3 = (defpackage.cort) r3
            r5.a = r2
            r5.b = r1
            r4 = 1
            r5.c = r4
            java.lang.Object r6 = r3.x(r6)
            if (r6 != r0) goto L52
            return r0
        L52:
            cosz r6 = (defpackage.cosz) r6
            if (r6 == 0) goto L2e
            java.lang.String r6 = r6.c
            if (r6 == 0) goto L2e
            r3 = r2
            java.util.HashSet r3 = (java.util.HashSet) r3
            r3.add(r6)
            goto L2e
        L61:
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.util.Iterator r6 = r2.iterator()
            r6.getClass()
        L6a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r0 = r6.next()
            r0.getClass()
            cmnk r1 = r5.d
            java.lang.String r0 = (java.lang.String) r0
            ffbr r1 = r1.d
            java.lang.Object r1 = r1.b()
            cmne r1 = (defpackage.cmne) r1
            r1.g(r0)
            goto L6a
        L87:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmnh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmnh(this.d, ffguVar);
    }
}
