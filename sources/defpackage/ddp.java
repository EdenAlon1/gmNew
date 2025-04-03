package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddp extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ddx c;
    final /* synthetic */ long d;
    final /* synthetic */ dwn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddp(ddx ddxVar, long j, dwn dwnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ddxVar;
        this.d = j;
        this.e = dwnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ddp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (defpackage.ffsw.c(r3, r5) != r0) goto L19;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r5.a
            defpackage.ffci.b(r6)
            goto L69
        Lf:
            defpackage.ffci.b(r6)
            goto L53
        L13:
            defpackage.ffci.b(r6)
            ddx r6 = r5.c
            ffkx r1 = new ffkx
            r1.<init>()
            dre r3 = defpackage.drf.a
            dfa r4 = new dfa
            r4.<init>(r1)
            defpackage.ixw.c(r6, r3, r4)
            boolean r1 = r1.a
            if (r1 != 0) goto L49
            long r3 = defpackage.dff.a
            android.view.View r6 = defpackage.isy.a(r6)
            android.view.ViewParent r6 = r6.getParent()
        L35:
            if (r6 == 0) goto L53
            boolean r1 = r6 instanceof android.view.ViewGroup
            if (r1 == 0) goto L53
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            boolean r1 = r6.shouldDelayChildPressedState()
            if (r1 == 0) goto L44
            goto L49
        L44:
            android.view.ViewParent r6 = r6.getParent()
            goto L35
        L49:
            long r3 = defpackage.dff.a
            r5.b = r2
            java.lang.Object r6 = defpackage.ffsw.c(r3, r5)
            if (r6 == r0) goto L72
        L53:
            long r1 = r5.d
            dwp r6 = new dwp
            r6.<init>(r1)
            dwn r1 = r5.e
            r5.a = r6
            r2 = 2
            r5.b = r2
            java.lang.Object r1 = r1.a(r6, r5)
            if (r1 != r0) goto L68
            goto L72
        L68:
            r0 = r6
        L69:
            ddx r6 = r5.c
            dwp r0 = (defpackage.dwp) r0
            r6.e = r0
            ffcu r6 = defpackage.ffcu.a
            return r6
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ddp(this.c, this.d, this.e, ffguVar);
    }
}
