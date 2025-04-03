package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbcu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dbcd b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbcu(ffgu ffguVar, dbcd dbcdVar, String str) {
        super(2, ffguVar);
        this.b = dbcdVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbcu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0030, code lost:
    
        if (r7 != r1) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:6:0x000f, B:7:0x0046, B:9:0x0053, B:10:0x0055, B:12:0x005d, B:13:0x005f, B:15:0x0067, B:16:0x0069, B:21:0x0017, B:22:0x0032, B:27:0x0022), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067 A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:6:0x000f, B:7:0x0046, B:9:0x0053, B:10:0x0055, B:12:0x005d, B:13:0x005f, B:15:0x0067, B:16:0x0069, B:21:0x0017, B:22:0x0032, B:27:0x0022), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0053 A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:6:0x000f, B:7:0x0046, B:9:0x0053, B:10:0x0055, B:12:0x005d, B:13:0x005f, B:15:0x0067, B:16:0x0069, B:21:0x0017, B:22:0x0032, B:27:0x0022), top: B:2:0x0007 }] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r0 = "conversationId:\t"
            ffhh r1 = defpackage.ffhh.a
            int r2 = r6.a
            r3 = 1
            if (r2 == 0) goto L1b
            if (r2 == r3) goto L13
            java.lang.Object r1 = r6.d
            dbce r1 = (defpackage.dbce) r1
            defpackage.ffci.b(r7)     // Catch: java.lang.Exception -> La0
            goto L46
        L13:
            java.lang.Object r2 = r6.d
            dbce r2 = (defpackage.dbce) r2
            defpackage.ffci.b(r7)     // Catch: java.lang.Exception -> La0
            goto L32
        L1b:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.d
            ffsk r7 = (defpackage.ffsk) r7
            dbce r2 = defpackage.dbcd.a     // Catch: java.lang.Exception -> La0
            dbcd r7 = r6.b     // Catch: java.lang.Exception -> La0
            ffss r7 = r7.e     // Catch: java.lang.Exception -> La0
            r6.d = r2     // Catch: java.lang.Exception -> La0
            r6.a = r3     // Catch: java.lang.Exception -> La0
            java.lang.Object r7 = r7.c(r6)     // Catch: java.lang.Exception -> La0
            if (r7 == r1) goto L9f
        L32:
            crty r7 = (defpackage.crty) r7     // Catch: java.lang.Exception -> La0
            java.lang.String r3 = r6.c     // Catch: java.lang.Exception -> La0
            elfl r7 = r7.n(r3)     // Catch: java.lang.Exception -> La0
            r6.d = r2     // Catch: java.lang.Exception -> La0
            r2 = 2
            r6.a = r2     // Catch: java.lang.Exception -> La0
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)     // Catch: java.lang.Exception -> La0
            if (r7 != r1) goto L46
            goto L9f
        L46:
            r7.getClass()     // Catch: java.lang.Exception -> La0
            eswr r7 = (defpackage.eswr) r7     // Catch: java.lang.Exception -> La0
            java.lang.String r1 = r7.c     // Catch: java.lang.Exception -> La0
            java.lang.String r2 = r7.d     // Catch: java.lang.Exception -> La0
            eyja r3 = r7.j     // Catch: java.lang.Exception -> La0
            if (r3 != 0) goto L55
            eyja r3 = defpackage.eyja.a     // Catch: java.lang.Exception -> La0
        L55:
            java.lang.String r3 = defpackage.eykm.i(r3)     // Catch: java.lang.Exception -> La0
            eyja r4 = r7.k     // Catch: java.lang.Exception -> La0
            if (r4 != 0) goto L5f
            eyja r4 = defpackage.eyja.a     // Catch: java.lang.Exception -> La0
        L5f:
            java.lang.String r4 = defpackage.eykm.i(r4)     // Catch: java.lang.Exception -> La0
            eyja r7 = r7.l     // Catch: java.lang.Exception -> La0
            if (r7 != 0) goto L69
            eyja r7 = defpackage.eyja.a     // Catch: java.lang.Exception -> La0
        L69:
            java.lang.String r7 = defpackage.eykm.i(r7)     // Catch: java.lang.Exception -> La0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La0
            r5.<init>(r0)     // Catch: java.lang.Exception -> La0
            r5.append(r1)     // Catch: java.lang.Exception -> La0
            java.lang.String r0 = "\ncorrelationId:\t"
            r5.append(r0)     // Catch: java.lang.Exception -> La0
            r5.append(r2)     // Catch: java.lang.Exception -> La0
            java.lang.String r0 = "\ncreateTime:\t"
            r5.append(r0)     // Catch: java.lang.Exception -> La0
            r5.append(r3)     // Catch: java.lang.Exception -> La0
            java.lang.String r0 = "\nupdateTime:\t"
            r5.append(r0)     // Catch: java.lang.Exception -> La0
            r5.append(r4)     // Catch: java.lang.Exception -> La0
            java.lang.String r0 = "\ndeleteTime:\t"
            r5.append(r0)     // Catch: java.lang.Exception -> La0
            r5.append(r7)     // Catch: java.lang.Exception -> La0
            java.lang.String r7 = "\n\n"
            r5.append(r7)     // Catch: java.lang.Exception -> La0
            java.lang.String r7 = r5.toString()     // Catch: java.lang.Exception -> La0
            return r7
        L9f:
            return r1
        La0:
            r7 = move-exception
            r7.toString()
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "Failed. "
            java.lang.String r7 = r0.concat(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbcu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dbcu dbcuVar = new dbcu(ffguVar, this.b, this.c);
        dbcuVar.d = obj;
        return dbcuVar;
    }
}
