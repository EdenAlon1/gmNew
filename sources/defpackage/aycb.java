package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aycb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aycd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aycb(aycd aycdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aycdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aycb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
    
        if (r7 != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r7 == r0) goto L28;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.a
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L23
            if (r1 == r5) goto L1d
            if (r1 == r4) goto L19
            if (r1 == r3) goto L15
            defpackage.ffci.b(r7)     // Catch: android.database.sqlite.SQLiteException -> L21
            goto L85
        L15:
            defpackage.ffci.b(r7)     // Catch: android.database.sqlite.SQLiteException -> L21
            goto L75
        L19:
            defpackage.ffci.b(r7)     // Catch: android.database.sqlite.SQLiteException -> L21
            goto L63
        L1d:
            defpackage.ffci.b(r7)     // Catch: android.database.sqlite.SQLiteException -> L21
            goto L4d
        L21:
            r7 = move-exception
            goto L88
        L23:
            defpackage.ffci.b(r7)
            aycd r7 = r6.b     // Catch: android.database.sqlite.SQLiteException -> L21
            ffbr r7 = r7.e     // Catch: android.database.sqlite.SQLiteException -> L21
            java.lang.Object r7 = r7.b()     // Catch: android.database.sqlite.SQLiteException -> L21
            atfa r7 = (defpackage.atfa) r7     // Catch: android.database.sqlite.SQLiteException -> L21
            boolean r7 = r7.a()     // Catch: android.database.sqlite.SQLiteException -> L21
            if (r7 == 0) goto L66
            aybt r7 = defpackage.aybw.a     // Catch: android.database.sqlite.SQLiteException -> L21
            aycd r1 = r6.b     // Catch: android.database.sqlite.SQLiteException -> L21
            ejoc r2 = r1.b     // Catch: android.database.sqlite.SQLiteException -> L21
            ffbr r1 = r1.d     // Catch: android.database.sqlite.SQLiteException -> L21
            java.lang.Object r1 = r1.b()     // Catch: android.database.sqlite.SQLiteException -> L21
            comc r1 = (defpackage.comc) r1     // Catch: android.database.sqlite.SQLiteException -> L21
            r6.a = r5     // Catch: android.database.sqlite.SQLiteException -> L21
            java.lang.Object r7 = r7.c(r2, r1, r6)     // Catch: android.database.sqlite.SQLiteException -> L21
            if (r7 != r0) goto L4d
            goto L84
        L4d:
            aycw r7 = defpackage.aycz.a     // Catch: android.database.sqlite.SQLiteException -> L21
            aycd r1 = r6.b     // Catch: android.database.sqlite.SQLiteException -> L21
            ejoc r2 = r1.b     // Catch: android.database.sqlite.SQLiteException -> L21
            ffbr r1 = r1.d     // Catch: android.database.sqlite.SQLiteException -> L21
            java.lang.Object r1 = r1.b()     // Catch: android.database.sqlite.SQLiteException -> L21
            comc r1 = (defpackage.comc) r1     // Catch: android.database.sqlite.SQLiteException -> L21
            r6.a = r4     // Catch: android.database.sqlite.SQLiteException -> L21
            java.lang.Object r7 = r7.c(r2, r1, r6)     // Catch: android.database.sqlite.SQLiteException -> L21
            if (r7 == r0) goto L84
        L63:
            java.util.UUID r7 = (java.util.UUID) r7     // Catch: android.database.sqlite.SQLiteException -> L21
            goto La3
        L66:
            aybt r7 = defpackage.aybw.a     // Catch: android.database.sqlite.SQLiteException -> L21
            aycd r1 = r6.b     // Catch: android.database.sqlite.SQLiteException -> L21
            ejoc r1 = r1.b     // Catch: android.database.sqlite.SQLiteException -> L21
            r6.a = r3     // Catch: android.database.sqlite.SQLiteException -> L21
            java.lang.Object r7 = r7.c(r1, r2, r6)     // Catch: android.database.sqlite.SQLiteException -> L21
            if (r7 != r0) goto L75
            goto L84
        L75:
            aycw r7 = defpackage.aycz.a     // Catch: android.database.sqlite.SQLiteException -> L21
            aycd r1 = r6.b     // Catch: android.database.sqlite.SQLiteException -> L21
            ejoc r1 = r1.b     // Catch: android.database.sqlite.SQLiteException -> L21
            r3 = 4
            r6.a = r3     // Catch: android.database.sqlite.SQLiteException -> L21
            java.lang.Object r7 = r7.c(r1, r2, r6)     // Catch: android.database.sqlite.SQLiteException -> L21
            if (r7 != r0) goto L85
        L84:
            return r0
        L85:
            java.util.UUID r7 = (java.util.UUID) r7     // Catch: android.database.sqlite.SQLiteException -> L21
            goto La3
        L88:
            aycd r0 = r6.b
            ffbr r0 = r0.c
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La6
            entd r0 = defpackage.aycd.a
            ensk r0 = r0.j()
            java.lang.String r1 = "Caught SQLiteException when enqueueing to WorkManager."
            defpackage.a.K(r0, r1, r7)
        La3:
            ffcu r7 = defpackage.ffcu.a
            return r7
        La6:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aycb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aycb(this.b, ffguVar);
    }
}
