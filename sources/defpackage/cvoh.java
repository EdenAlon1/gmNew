package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvoh extends ffhv implements ffjm {
    Object a;
    boolean b;
    int c;
    final /* synthetic */ cvoj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvoh(cvoj cvojVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = cvojVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvoh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r5 == r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto L10
            boolean r0 = r4.b
            defpackage.ffci.b(r5)
            goto L72
        L10:
            java.lang.Object r1 = r4.a
            defpackage.ffci.b(r5)
            goto L4e
        L16:
            defpackage.ffci.b(r5)
            boolean r5 = defpackage.adhu.a()
            if (r5 == 0) goto L24
            cvoj r5 = r4.d
            eisx r5 = r5.e
            goto L25
        L24:
            r5 = r2
        L25:
            cvoj r1 = r4.d
            ffbr r1 = r1.b
            java.lang.Object r1 = r1.b()
            ahns r1 = (defpackage.ahns) r1
            elfl r1 = r1.b(r5)
            boolean r5 = defpackage.cufg.a()
            if (r5 == 0) goto L55
            cvoj r5 = r4.d
            ffbr r5 = r5.d
            java.lang.Object r5 = r5.b()
            culw r5 = (defpackage.culw) r5
            r4.a = r1
            r4.c = r3
            java.lang.Object r5 = r5.c(r4)
            if (r5 != r0) goto L4e
            goto L86
        L4e:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L63
        L55:
            cvoj r5 = r4.d
            ffbr r5 = r5.c
            java.lang.Object r5 = r5.b()
            culz r5 = (defpackage.culz) r5
            boolean r5 = r5.e()
        L63:
            r4.a = r2
            r4.b = r5
            r2 = 2
            r4.c = r2
            java.lang.Object r1 = defpackage.fgfz.c(r1, r4)
            if (r1 == r0) goto L86
            r0 = r5
            r5 = r1
        L72:
            cvoj r1 = r4.d
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r2 = 0
            if (r5 == 0) goto L80
            if (r0 == 0) goto L80
            goto L81
        L80:
            r3 = r2
        L81:
            r1.g = r3
            ffcu r5 = defpackage.ffcu.a
            return r5
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvoh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvoh(this.d, ffguVar);
    }
}
