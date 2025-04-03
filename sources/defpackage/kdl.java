package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kdl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ kes b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdl(kes kesVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = kesVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((kdl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r3.a() == r0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.a
            r2 = 1
            if (r1 == 0) goto Lf
            java.lang.Object r1 = r8.c
            ffsk r1 = (defpackage.ffsk) r1
            defpackage.ffci.b(r9)
            goto L43
        Lf:
            defpackage.ffci.b(r9)
            java.lang.Object r9 = r8.c
            ffsk r9 = (defpackage.ffsk) r9
            r1 = r9
        L17:
            boolean r9 = defpackage.ffsl.g(r1)
            if (r9 == 0) goto L5f
            kdk r9 = defpackage.kdk.a
            r8.c = r1
            r8.a = r2
            ffhd r3 = r8.u()
            jen r4 = defpackage.jeo.a
            ffha r3 = r3.get(r4)
            jeo r3 = (defpackage.jeo) r3
            if (r3 != 0) goto L36
            java.lang.Object r9 = defpackage.hhj.c(r9, r8)
            goto L40
        L36:
            jep r4 = new jep
            r5 = 0
            r4.<init>(r9, r5)
            java.lang.Object r9 = r3.a()
        L40:
            if (r9 != r0) goto L43
            return r0
        L43:
            kes r9 = r8.b
            int[] r3 = r9.i
            r4 = 0
            r5 = r3[r4]
            r6 = r3[r2]
            android.view.View r7 = r9.a
            r7.getLocationOnScreen(r3)
            int[] r3 = r9.i
            r4 = r3[r4]
            if (r5 != r4) goto L5b
            r3 = r3[r2]
            if (r6 == r3) goto L17
        L5b:
            r9.l()
            goto L17
        L5f:
            ffcu r9 = defpackage.ffcu.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        kdl kdlVar = new kdl(this.b, ffguVar);
        kdlVar.c = obj;
        return kdlVar;
    }
}
