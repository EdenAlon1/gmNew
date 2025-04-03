package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crqe extends ffhv implements ffjm {
    int a;
    final /* synthetic */ crqf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crqe(crqf crqfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = crqfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crqe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c3, code lost:
    
        if (r8.c(r7) == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00da, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0016, code lost:
    
        if (r8 != r0) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
            defpackage.ffci.b(r8)
            if (r1 == 0) goto Le
            if (r1 == r2) goto L18
            goto Ld7
        Le:
            crqf r8 = r7.b
            r7.a = r2
            java.lang.Object r8 = r8.b(r7)
            if (r8 == r0) goto Lda
        L18:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Ld7
            crqf r8 = r7.b
            boolean r1 = r8.b
            if (r1 == 0) goto L28
            goto Lba
        L28:
            java.lang.String r1 = "BlockListResolver#initialize"
            ekzz r1 = defpackage.eleg.f(r1)
            bvvn r3 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.e()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r4 = "BlockListResolver#initialize2"
            r3.z(r4)     // Catch: java.lang.Throwable -> Ld0
            crpy r4 = new crpy     // Catch: java.lang.Throwable -> Ld0
            r4.<init>()     // Catch: java.lang.Throwable -> Ld0
            r3.f(r4)     // Catch: java.lang.Throwable -> Ld0
            crpz r4 = new crpz     // Catch: java.lang.Throwable -> Ld0
            r4.<init>()     // Catch: java.lang.Throwable -> Ld0
            r3.h(r4)     // Catch: java.lang.Throwable -> Ld0
            bvvl r3 = r3.b()     // Catch: java.lang.Throwable -> Ld0
            bvtg r4 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.c     // Catch: java.lang.Throwable -> Ld0
            bvth r4 = r4.f     // Catch: java.lang.Throwable -> Ld0
            dtsu r3 = r3.p(r4)     // Catch: java.lang.Throwable -> Ld0
            bvti r3 = (defpackage.bvti) r3     // Catch: java.lang.Throwable -> Ld0
            engw r4 = r3.m()     // Catch: java.lang.Throwable -> Lc6
            r3.close()     // Catch: java.lang.Throwable -> Ld0
            r4.getClass()     // Catch: java.lang.Throwable -> Ld0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld0
            r3.<init>()     // Catch: java.lang.Throwable -> Ld0
            enqv r4 = r4.iterator()     // Catch: java.lang.Throwable -> Ld0
        L68:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> Ld0
            if (r5 == 0) goto L81
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> Ld0
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> Ld0
            if (r6 == 0) goto L68
            int r6 = r6.length()     // Catch: java.lang.Throwable -> Ld0
            if (r6 == 0) goto L68
            r3.add(r5)     // Catch: java.lang.Throwable -> Ld0
            goto L68
        L81:
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Ld0
        L85:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Ld0
            if (r4 == 0) goto Lb4
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Ld0
            ffbr r5 = r8.a     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> Ld0
            crql r5 = (defpackage.crql) r5     // Catch: java.lang.Throwable -> Ld0
            j$.util.Optional r5 = r5.a(r4)     // Catch: java.lang.Throwable -> Ld0
            boolean r6 = r5.isPresent()     // Catch: java.lang.Throwable -> Ld0
            if (r6 == 0) goto L85
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> Ld0
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> Ld0
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> Ld0
            if (r5 != 0) goto L85
            r5 = 0
            r8.e(r4, r5)     // Catch: java.lang.Throwable -> Ld0
            goto L85
        Lb4:
            r8.b = r2     // Catch: java.lang.Throwable -> Ld0
            r8 = 0
            defpackage.ffig.a(r1, r8)
        Lba:
            crqf r8 = r7.b
            r1 = 2
            r7.a = r1
            java.lang.Object r8 = r8.c(r7)
            if (r8 != r0) goto Ld7
            goto Lda
        Lc6:
            r8 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> Lcb
            goto Lcf
        Lcb:
            r0 = move-exception
            r8.addSuppressed(r0)     // Catch: java.lang.Throwable -> Ld0
        Lcf:
            throw r8     // Catch: java.lang.Throwable -> Ld0
        Ld0:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> Ld2
        Ld2:
            r0 = move-exception
            defpackage.ffig.a(r1, r8)
            throw r0
        Ld7:
            ffcu r8 = defpackage.ffcu.a
            return r8
        Lda:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crqe.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new crqe(this.b, ffguVar);
    }
}
