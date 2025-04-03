package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dekl extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ dekm e;
    final /* synthetic */ eixn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dekl(dekm dekmVar, eixn eixnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = dekmVar;
        this.f = eixnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dekl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.d
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 == r2) goto L14
            java.lang.Object r0 = r7.c
            java.lang.Object r1 = r7.b
            java.lang.Object r2 = r7.a
            defpackage.ffci.b(r8)
            goto L7a
        L14:
            java.lang.Object r1 = r7.b
            java.lang.Object r2 = r7.a
            defpackage.ffci.b(r8)
            goto L56
        L1c:
            defpackage.ffci.b(r8)
            dekm r8 = r7.e
            eixn r1 = r7.f
            ffbr r3 = r8.c
            java.lang.Object r3 = r3.b()
            avdj r3 = (defpackage.avdj) r3
            boolean r3 = r3.a()
            fgcm r8 = r8.d
            if (r3 == 0) goto L59
            dekm r3 = r7.e
            ffbr r3 = r3.b
            java.lang.Object r3 = r3.b()
            ejar r3 = (defpackage.ejar) r3
            eixn r4 = r7.f
            eisx r4 = r4.a()
            com.google.common.util.concurrent.ListenableFuture r3 = r3.a(r4)
            r7.a = r8
            r7.b = r1
            r7.d = r2
            java.lang.Object r2 = defpackage.fgfz.c(r3, r7)
            if (r2 == r0) goto L8f
            r6 = r2
            r2 = r8
            r8 = r6
        L56:
            android.accounts.Account r8 = (android.accounts.Account) r8
            goto L5d
        L59:
            r2 = 0
            r6 = r2
            r2 = r8
            r8 = r6
        L5d:
            dekm r3 = r7.e
            ffbr r3 = r3.a
            java.lang.Object r3 = r3.b()
            dekd r3 = (defpackage.dekd) r3
            eixn r4 = r7.f
            r7.a = r2
            r7.b = r1
            r7.c = r8
            r5 = 2
            r7.d = r5
            java.lang.Object r3 = r3.a(r4, r7)
            if (r3 == r0) goto L8f
            r0 = r8
            r8 = r3
        L7a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            dekg r3 = new dekg
            eixn r1 = (defpackage.eixn) r1
            android.accounts.Account r0 = (android.accounts.Account) r0
            r3.<init>(r1, r0, r8)
            r2.f(r3)
            ffcu r8 = defpackage.ffcu.a
            return r8
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dekl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dekl(this.e, this.f, ffguVar);
    }
}
