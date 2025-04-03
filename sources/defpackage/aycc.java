package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aycc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aycd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aycc(aycd aycdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aycdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aycc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r5.a(r2, r1, r4) == r0) goto L16;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r5)     // Catch: android.database.sqlite.SQLiteException -> L11
            goto L68
        Ld:
            defpackage.ffci.b(r5)     // Catch: android.database.sqlite.SQLiteException -> L11
            goto L31
        L11:
            r5 = move-exception
            goto L4d
        L13:
            defpackage.ffci.b(r5)
            aybt r5 = defpackage.aybw.a     // Catch: android.database.sqlite.SQLiteException -> L11
            aycd r1 = r4.b     // Catch: android.database.sqlite.SQLiteException -> L11
            ejoc r3 = r1.b     // Catch: android.database.sqlite.SQLiteException -> L11
            ffbr r1 = r1.e     // Catch: android.database.sqlite.SQLiteException -> L11
            java.lang.Object r1 = r1.b()     // Catch: android.database.sqlite.SQLiteException -> L11
            atfa r1 = (defpackage.atfa) r1     // Catch: android.database.sqlite.SQLiteException -> L11
            boolean r1 = r1.a()     // Catch: android.database.sqlite.SQLiteException -> L11
            r4.a = r2     // Catch: android.database.sqlite.SQLiteException -> L11
            java.lang.Object r5 = r5.a(r3, r1, r4)     // Catch: android.database.sqlite.SQLiteException -> L11
            if (r5 != r0) goto L31
            goto L4c
        L31:
            aycw r5 = defpackage.aycz.a     // Catch: android.database.sqlite.SQLiteException -> L11
            aycd r1 = r4.b     // Catch: android.database.sqlite.SQLiteException -> L11
            ejoc r2 = r1.b     // Catch: android.database.sqlite.SQLiteException -> L11
            ffbr r1 = r1.e     // Catch: android.database.sqlite.SQLiteException -> L11
            java.lang.Object r1 = r1.b()     // Catch: android.database.sqlite.SQLiteException -> L11
            atfa r1 = (defpackage.atfa) r1     // Catch: android.database.sqlite.SQLiteException -> L11
            boolean r1 = r1.a()     // Catch: android.database.sqlite.SQLiteException -> L11
            r3 = 2
            r4.a = r3     // Catch: android.database.sqlite.SQLiteException -> L11
            java.lang.Object r5 = r5.a(r2, r1, r4)     // Catch: android.database.sqlite.SQLiteException -> L11
            if (r5 != r0) goto L68
        L4c:
            return r0
        L4d:
            aycd r0 = r4.b
            ffbr r0 = r0.c
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6b
            entd r0 = defpackage.aycd.a
            ensk r0 = r0.j()
            java.lang.String r1 = "Caught SQLiteException when enqueueing to WorkManager."
            defpackage.a.K(r0, r1, r5)
        L68:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L6b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aycc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aycc(this.b, ffguVar);
    }
}
