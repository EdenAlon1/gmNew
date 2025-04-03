package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtgc extends ffhv implements ffji {
    int a;
    final /* synthetic */ dtgp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtgc(dtgp dtgpVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dtgpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r3) {
        /*
            r2 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r2.a
            defpackage.ffci.b(r3)
            if (r1 == 0) goto La
            goto L24
        La:
            dtgp r3 = r2.b
            fgcm r3 = r3.k
            java.lang.Object r3 = r3.c()
            dtga r3 = (defpackage.dtga) r3
            boolean r1 = r3 instanceof defpackage.dtfy
            if (r1 == 0) goto L27
            dtgp r3 = r2.b
            r1 = 1
            r2.a = r1
            java.lang.Object r3 = r3.h(r1, r2)
            if (r3 != r0) goto L24
            return r0
        L24:
            android.net.Uri r3 = (android.net.Uri) r3
            goto L47
        L27:
            boolean r0 = r3 instanceof defpackage.dtfz
            if (r0 == 0) goto L36
            dtfz r3 = (defpackage.dtfz) r3
            drng r3 = r3.a
            java.lang.String r3 = r3.b
            android.net.Uri r3 = android.net.Uri.parse(r3)
            goto L47
        L36:
            boolean r0 = r3 instanceof defpackage.dtfx
            r1 = 0
            if (r0 != 0) goto L46
            boolean r3 = r3 instanceof defpackage.dtfw
            if (r3 == 0) goto L40
            goto L46
        L40:
            ffcd r3 = new ffcd
            r3.<init>()
            throw r3
        L46:
            r3 = r1
        L47:
            if (r3 == 0) goto L4e
            dtgp r0 = r2.b
            r0.i(r3)
        L4e:
            dtgp r3 = r2.b
            r3.j()
            ffcu r3 = defpackage.ffcu.a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtgc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dtgc(this.b, (ffgu) obj).b(ffcu.a);
    }
}
