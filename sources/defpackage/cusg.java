package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cusg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cujo b;
    final /* synthetic */ cusj c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cusg(ffgu ffguVar, cujo cujoVar, cusj cusjVar) {
        super(2, ffguVar);
        this.b = cujoVar;
        this.c = cusjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cusg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:
    
        if (r14 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            r13 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r13.a
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/util/spam/rcs/RcsWithSpamHeaderProtection$classify$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r4 = "RcsWithSpamHeaderProtection.kt"
            java.lang.String r5 = "BugleSpam"
            r6 = 1
            if (r1 == 0) goto L19
            if (r1 == r6) goto L15
            defpackage.ffci.b(r14)
            goto L7c
        L15:
            defpackage.ffci.b(r14)
            return r14
        L19:
            defpackage.ffci.b(r14)
            java.lang.Object r14 = r13.d
            ffsk r14 = (defpackage.ffsk) r14
            cujo r14 = r13.b
            int r1 = r14.j
            r7 = 3
            if (r1 == r7) goto L44
            enru r14 = defpackage.cusj.a
            ensk r14 = r14.e()
            ensn r0 = defpackage.ente.a
            r14.Y(r0, r5)
            r0 = 47
            ensk r14 = r14.h(r3, r2, r0, r4)
            enrr r14 = (defpackage.enrr) r14
            java.lang.String r0 = "Not RCS protocol, skipping RCS enforcement."
            r14.q(r0)
            cukp r14 = defpackage.cuko.a()
            return r14
        L44:
            cusf r1 = r14.e
            if (r1 == 0) goto L54
            cusj r14 = r13.c
            r13.a = r6
            java.lang.Object r14 = r14.h(r1, r13)
            if (r14 != r0) goto L53
            goto L7b
        L53:
            return r14
        L54:
            java.lang.Integer r14 = r14.d
            if (r14 != 0) goto L59
            goto L62
        L59:
            int r1 = r14.intValue()
            if (r1 != r6) goto L62
            cula r14 = defpackage.cula.b
            goto L89
        L62:
            r1 = 2
            if (r14 != 0) goto L66
            goto L6f
        L66:
            int r14 = r14.intValue()
            if (r14 != r1) goto L6f
            cula r14 = defpackage.cula.c
            goto L89
        L6f:
            cusj r14 = r13.c
            cujo r6 = r13.b
            r13.a = r1
            java.lang.Object r14 = r14.g(r6, r13)
            if (r14 != r0) goto L7c
        L7b:
            return r0
        L7c:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L87
            cula r14 = defpackage.cula.b
            goto L89
        L87:
            cula r14 = defpackage.cula.a
        L89:
            r8 = r14
            cula r14 = defpackage.cula.a
            boolean r14 = defpackage.ffkj.e(r8, r14)
            if (r14 == 0) goto Laf
            enru r14 = defpackage.cusj.a
            ensk r14 = r14.e()
            ensn r0 = defpackage.ente.a
            r14.Y(r0, r5)
            r0 = 66
            ensk r14 = r14.h(r3, r2, r0, r4)
            enrr r14 = (defpackage.enrr) r14
            java.lang.String r0 = "No spam warning header in incoming message, skipping RCS enforcement."
            r14.q(r0)
            cukp r14 = defpackage.cuko.a()
            return r14
        Laf:
            cukp r6 = new cukp
            erer r7 = defpackage.erer.SPAM
            r11 = 0
            r12 = 28
            r9 = 0
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cusg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cusg cusgVar = new cusg(ffguVar, this.b, this.c);
        cusgVar.d = obj;
        return cusgVar;
    }
}
