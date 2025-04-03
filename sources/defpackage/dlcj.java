package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlcj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dlck c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlcj(boolean z, dlck dlckVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = z;
        this.c = dlckVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlcj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00bd, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0093, code lost:
    
        r14 = (defpackage.dlhd) r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0095, code lost:
    
        if (r14 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0097, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bb, code lost:
    
        throw new defpackage.dlgk(15, 5, "No protections in storage after update for client " + r13.c.a + ".", null, 0, 56);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        if (r1.c(r13) != r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        if (r14 == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0044, code lost:
    
        if (r14.k(r13) != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0032, code lost:
    
        if (r14.b.a(r14.a, r13) != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r1 != 4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0087, code lost:
    
        r14 = r13.c;
        r13.a = 5;
        r14 = r14.a(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0090, code lost:
    
        if (r14 != r0) goto L34;
     */
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
            r2 = 4
            r3 = 2
            r4 = 1
            r5 = 3
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 == r3) goto L17
            defpackage.ffci.b(r14)
            if (r1 == r5) goto L55
            if (r1 == r2) goto L87
            goto L93
        L17:
            defpackage.ffci.b(r14)
            goto L46
        L1b:
            defpackage.ffci.b(r14)
            goto L34
        L1f:
            defpackage.ffci.b(r14)
            boolean r14 = r13.b
            if (r14 == 0) goto L4b
            dlck r14 = r13.c
            r13.a = r4
            dlij r1 = r14.b
            dlgb r14 = r14.a
            java.lang.Object r14 = r1.a(r14, r13)
            if (r14 == r0) goto Lbd
        L34:
            dlck r14 = r13.c
            dlib r1 = r14.d
            dlgb r14 = r14.a
            dlia r14 = r1.a(r14)
            r13.a = r3
            java.lang.Object r14 = r14.k(r13)
            if (r14 == r0) goto Lbd
        L46:
            dlck r14 = r13.c
            defpackage.dlck.c(r14)
        L4b:
            dlck r14 = r13.c
            r13.a = r5
            java.lang.Object r14 = r14.a(r13)
            if (r14 == r0) goto Lbd
        L55:
            dlck r1 = r13.c
            dlhd r14 = (defpackage.dlhd) r14
            dlas r3 = r1.e
            boolean r3 = r3.a
            if (r3 != 0) goto L71
            if (r14 == 0) goto L62
            goto Lbc
        L62:
            dlgk r6 = new dlgk
            r11 = 0
            r12 = 56
            r7 = 14
            r8 = 6
            java.lang.String r9 = "Persephone downloads not enabled."
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            throw r6
        L71:
            ffsk r3 = r1.f
            dlci r4 = new dlci
            r6 = 0
            r4.<init>(r1, r6)
            ffss r1 = defpackage.ffqy.c(r3, r6, r4, r5)
            if (r14 != 0) goto Lbc
            r13.a = r2
            java.lang.Object r14 = r1.c(r13)
            if (r14 == r0) goto Lbd
        L87:
            dlck r14 = r13.c
            r1 = 5
            r13.a = r1
            java.lang.Object r14 = r14.a(r13)
            if (r14 != r0) goto L93
            goto Lbd
        L93:
            dlhd r14 = (defpackage.dlhd) r14
            if (r14 == 0) goto L98
            return r14
        L98:
            dlck r14 = r13.c
            dlgk r0 = new dlgk
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No protections in storage after update for client "
            r1.<init>(r2)
            dlgb r14 = r14.a
            r1.append(r14)
            java.lang.String r14 = "."
            r1.append(r14)
            java.lang.String r3 = r1.toString()
            r5 = 0
            r6 = 56
            r1 = 15
            r2 = 5
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            throw r0
        Lbc:
            return r14
        Lbd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlcj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dlcj(this.b, this.c, ffguVar);
    }
}
