package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alej extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aleo b;
    final /* synthetic */ eolv c;
    final /* synthetic */ epyw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alej(aleo aleoVar, eolv eolvVar, epyw epywVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aleoVar;
        this.c = eolvVar;
        this.d = epywVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alej) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r5.contains(new java.lang.Integer(r1.dk)) == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080 A[RETURN] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.a
            r2 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            defpackage.ffci.b(r8)
            if (r1 == 0) goto L10
            goto L81
        L10:
            aleo r8 = r7.b
            eolv r1 = r7.c
            epyw r4 = r7.d
            r7.a = r2
            cfva r5 = defpackage.alei.a
            ffel r5 = defpackage.ffel.a
            int r6 = r1.j
            eolt r6 = defpackage.eolt.b(r6)
            if (r6 != 0) goto L26
            eolt r6 = defpackage.eolt.UNKNOWN_BUGLE_EVENT_TYPE
        L26:
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L4e
            cfva r5 = defpackage.alei.a
            java.lang.Object r5 = r5.e()
            ezgu r5 = (defpackage.ezgu) r5
            eygi r5 = r5.b
            int r1 = r1.j
            eolt r1 = defpackage.eolt.b(r1)
            if (r1 != 0) goto L40
            eolt r1 = defpackage.eolt.UNKNOWN_BUGLE_EVENT_TYPE
        L40:
            java.lang.Integer r6 = new java.lang.Integer
            int r1 = r1.dk
            r6.<init>(r1)
            boolean r1 = r5.contains(r6)
            if (r1 != 0) goto L4e
            goto L6d
        L4e:
            ffel r1 = defpackage.ffel.a
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L6f
            cfva r1 = defpackage.alei.b
            java.lang.Object r1 = r1.e()
            ezgu r1 = (defpackage.ezgu) r1
            eygi r1 = r1.b
            int r4 = r4.f11do
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            boolean r1 = r1.contains(r5)
            if (r1 != 0) goto L6f
        L6d:
            r8 = r3
            goto L7e
        L6f:
            cfva r1 = defpackage.alei.c
            java.lang.Object r1 = r1.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.booleanValue()
            java.lang.Object r8 = r8.b(r7)
        L7e:
            if (r8 != r0) goto L81
            return r0
        L81:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r8 = r8 ^ r2
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alej.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new alej(this.b, this.c, this.d, ffguVar);
    }
}
