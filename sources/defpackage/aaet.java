package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaet extends ffhv implements ffjm {
    boolean a;
    Object b;
    int c;
    final /* synthetic */ aaex d;
    final /* synthetic */ alxr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaet(aaex aaexVar, alxr alxrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = aaexVar;
        this.e = alxrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaet) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        if (r8 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0037, code lost:
    
        if (r8 != r0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0092  */
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
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L26
            if (r1 == r3) goto L20
            if (r1 == r2) goto L18
            boolean r0 = r7.a
            java.lang.Object r1 = r7.b
            defpackage.ffci.b(r8)
            goto L88
        L18:
            boolean r1 = r7.a
            java.lang.Object r2 = r7.b
            defpackage.ffci.b(r8)
            goto L72
        L20:
            boolean r1 = r7.a
            defpackage.ffci.b(r8)
            goto L4d
        L26:
            defpackage.ffci.b(r8)
            goto L39
        L2a:
            defpackage.ffci.b(r8)
            aaex r8 = r7.d
            alxr r1 = r7.e
            r7.c = r4
            java.lang.Object r8 = r8.d(r1, r7)
            if (r8 == r0) goto Lb0
        L39:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r1 = r8.booleanValue()
            aaex r8 = r7.d
            alxr r5 = r7.e
            r7.a = r1
            r7.c = r3
            java.lang.Object r8 = r8.c(r5, r7)
            if (r8 == r0) goto Lb0
        L4d:
            aaex r3 = r7.d
            java.lang.String r8 = (java.lang.String) r8
            ffbr r3 = r3.h
            java.lang.Object r3 = r3.b()
            ashf r3 = (defpackage.ashf) r3
            boolean r3 = r3.a()
            if (r3 == 0) goto L9a
            aaex r3 = r7.d
            r7.b = r8
            r7.a = r1
            r7.c = r2
            ffxx r2 = r3.i
            java.lang.Object r2 = defpackage.fgbj.c(r2, r7)
            if (r2 == r0) goto Lb0
            r6 = r2
            r2 = r8
            r8 = r6
        L72:
            if (r8 == 0) goto L99
            aaex r8 = r7.d
            r7.b = r2
            r7.a = r1
            r3 = 4
            r7.c = r3
            ffxx r8 = r8.i
            java.lang.Object r8 = defpackage.fgbj.a(r8, r7)
            if (r8 != r0) goto L86
            goto Lb0
        L86:
            r0 = r1
            r1 = r2
        L88:
            alxg r8 = (defpackage.alxg) r8
            alxh r8 = r8.d()
            alxh r2 = defpackage.alxh.NONE
            if (r8 != r2) goto L95
            r8 = r1
            r1 = r0
            goto L9a
        L95:
            r4 = 0
            r5 = r0
            r8 = r1
            goto L9b
        L99:
            r8 = r2
        L9a:
            r5 = r1
        L9b:
            r3 = r4
            aaex r1 = r7.d
            alxr r2 = r7.e
            aaeo r0 = new aaeo
            r4 = r8
            java.lang.String r4 = (java.lang.String) r4
            r0.<init>()
            ajjc r8 = r1.c
            r8.b(r0)
            ffcu r8 = defpackage.ffcu.a
            return r8
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaet.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aaet(this.d, this.e, ffguVar);
    }
}
