package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chge extends ffhv implements ffjm {
    int a;
    final /* synthetic */ awui b;
    final /* synthetic */ chgf c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chge(ffgu ffguVar, awui awuiVar, chgf chgfVar) {
        super(2, ffguVar);
        this.b = awuiVar;
        this.c = chgfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chge) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c1, code lost:
    
        if (defpackage.fgfz.c(r10, r9) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r10 != r0) goto L16;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1a
            if (r1 == r3) goto L12
            defpackage.ffci.b(r10)
            goto Lc4
        L12:
            java.lang.Object r1 = r9.d
            java.lang.String r1 = (java.lang.String) r1
            defpackage.ffci.b(r10)
            goto L64
        L1a:
            java.lang.Object r1 = r9.d
            java.lang.String r1 = (java.lang.String) r1
            defpackage.ffci.b(r10)
            goto L54
        L22:
            defpackage.ffci.b(r10)
            java.lang.Object r10 = r9.d
            ffsk r10 = (defpackage.ffsk) r10
            awui r10 = r9.b
            java.lang.String r10 = r10.d
            r10.getClass()
            int r1 = r10.length()
            if (r1 <= 0) goto Lc8
            chgf r1 = r9.c
            ffbr r1 = r1.g
            java.lang.Object r1 = r1.b()
            chbx r1 = (defpackage.chbx) r1
            elfl r1 = r1.d(r10, r2)
            r1.getClass()
            r9.d = r10
            r9.a = r4
            java.lang.Object r1 = defpackage.fgfz.c(r1, r9)
            if (r1 == r0) goto Lc7
            r8 = r1
            r1 = r10
            r10 = r8
        L54:
            chbu r10 = (defpackage.chbu) r10
            elfl r10 = r10.u()
            r9.d = r1
            r9.a = r3
            java.lang.Object r10 = defpackage.fgfz.c(r10, r9)
            if (r10 == r0) goto Lc7
        L64:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/net/TachyonTachygramBindDelegate$bindToTachyonForPhone$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r5 = "TachyonTachygramBindDelegate.kt"
            java.lang.String r6 = "BugleNetwork"
            if (r10 != 0) goto L8f
            enru r10 = defpackage.chgf.a
            ensk r10 = r10.j()
            ensn r0 = defpackage.ente.a
            r10.Y(r0, r6)
            r0 = 86
            ensk r10 = r10.h(r4, r3, r0, r5)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r0 = "Skip Phone bind because the MSISDN is not registered for Tachyon"
            r10.q(r0)
            ffcu r10 = defpackage.ffcu.a
            return r10
        L8f:
            enru r10 = defpackage.chgf.a
            ensk r10 = r10.h()
            ensn r7 = defpackage.ente.a
            r10.Y(r7, r6)
            r6 = 89
            ensk r10 = r10.h(r4, r3, r6, r5)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r3 = "Bind to Tachyon for phone on foregrounding"
            r10.q(r3)
            chgf r10 = r9.c
            ffbr r10 = r10.h
            java.lang.Object r10 = r10.b()
            cilk r10 = (defpackage.cilk) r10
            elfl r10 = r10.e(r1)
            r10.getClass()
            r1 = 0
            r9.d = r1
            r9.a = r2
            java.lang.Object r10 = defpackage.fgfz.c(r10, r9)
            if (r10 != r0) goto Lc4
            goto Lc7
        Lc4:
            ffcu r10 = defpackage.ffcu.a
            return r10
        Lc7:
            return r0
        Lc8:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chge.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        chge chgeVar = new chge(ffguVar, this.b, this.c);
        chgeVar.d = obj;
        return chgeVar;
    }
}
