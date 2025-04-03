package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aplw extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ aplx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aplw(aplx aplxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = aplxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aplw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0087 A[RETURN] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L1e
            if (r1 == r2) goto L12
            defpackage.ffci.b(r8)
            goto L87
        L12:
            java.lang.Object r1 = r7.b
            apfz r1 = (defpackage.apfz) r1
            java.lang.Object r2 = r7.a
            aplx r2 = (defpackage.aplx) r2
            defpackage.ffci.b(r8)
            goto L72
        L1e:
            java.lang.Object r1 = r7.b
            aplx r1 = (defpackage.aplx) r1
            java.lang.Object r3 = r7.a
            elfl r3 = (defpackage.elfl) r3
            defpackage.ffci.b(r8)
            goto L5a
        L2a:
            defpackage.ffci.b(r8)
            aplx r8 = r7.d
            java.util.concurrent.atomic.AtomicBoolean r8 = r8.j
            boolean r8 = r8.get()
            if (r8 == 0) goto L38
            return r4
        L38:
            aplx r8 = r7.d
            aqge r1 = r8.e
            elfl r1 = r1.b()
            aqge r5 = r8.d
            elfl r5 = r5.b()
            r1.getClass()
            r7.a = r5
            r7.b = r8
            r7.c = r3
            java.lang.Object r1 = defpackage.fgfz.c(r1, r7)
            if (r1 != r0) goto L56
            goto L88
        L56:
            r3 = r1
            r1 = r8
            r8 = r3
            r3 = r5
        L5a:
            r8.getClass()
            apfz r8 = (defpackage.apfz) r8
            r3.getClass()
            r7.a = r1
            r7.b = r8
            r7.c = r2
            java.lang.Object r2 = defpackage.fgfz.c(r3, r7)
            if (r2 == r0) goto L88
            r6 = r1
            r1 = r8
            r8 = r2
            r2 = r6
        L72:
            r8.getClass()
            amfx r8 = (defpackage.amfx) r8
            r7.a = r4
            r7.b = r4
            r3 = 3
            r7.c = r3
            entd r3 = defpackage.aplx.a
            java.lang.Object r8 = r2.g(r1, r8, r7)
            if (r8 != r0) goto L87
            goto L88
        L87:
            return r4
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aplw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aplw(this.d, ffguVar);
    }
}
