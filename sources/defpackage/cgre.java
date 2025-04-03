package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgre extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ cgrh d;
    final /* synthetic */ cgrf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgre(cgrh cgrhVar, cgrf cgrfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = cgrhVar;
        this.e = cgrfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgre) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r10.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1d
            if (r1 == r2) goto L12
            java.lang.Object r1 = r10.a
            defpackage.ffci.b(r11)
            goto L2f
        L12:
            java.lang.Object r1 = r10.b
            java.lang.Object r4 = r10.a
        L16:
            defpackage.ffci.b(r11)     // Catch: java.lang.Exception -> L1a
            goto L22
        L1a:
            r11 = move-exception
            goto Lbf
        L1d:
            java.lang.Object r1 = r10.b
            java.lang.Object r4 = r10.a
            goto L16
        L22:
            r1 = r4
            goto L2f
        L24:
            defpackage.ffci.b(r11)
            cgrh r11 = r10.d
            eygr r11 = r11.b
            java.util.Iterator r1 = r11.iterator()
        L2f:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto Ld9
            java.lang.Object r11 = r1.next()
            java.lang.String r11 = (java.lang.String) r11
            android.net.Uri r4 = android.net.Uri.parse(r11)     // Catch: java.lang.Exception -> Lba
            r4.getClass()     // Catch: java.lang.Exception -> Lba
            boolean r5 = defpackage.cgrd.a(r4)     // Catch: java.lang.Exception -> Lba
            if (r5 != 0) goto L5d
            cgrf r4 = r10.e     // Catch: java.lang.Exception -> Lba
            java.lang.String r5 = "Invalid content uri for cms attachment deletion."
            r11.getClass()     // Catch: java.lang.Exception -> Lba
            r10.a = r1     // Catch: java.lang.Exception -> Lba
            r10.b = r11     // Catch: java.lang.Exception -> Lba
            r10.c = r3     // Catch: java.lang.Exception -> Lba
            java.lang.Object r11 = defpackage.cgrf.l(r4, r5, r11, r10)     // Catch: java.lang.Exception -> Lba
            if (r11 != r0) goto L2f
            goto Ld8
        L5d:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Exception -> Lba
            java.lang.String r4 = r4.getPath()     // Catch: java.lang.Exception -> Lba
            r4.getClass()     // Catch: java.lang.Exception -> Lba
            r5.<init>(r4)     // Catch: java.lang.Exception -> Lba
            boolean r4 = r5.exists()     // Catch: java.lang.Exception -> Lba
            if (r4 != 0) goto L83
            cgrf r4 = r10.e     // Catch: java.lang.Exception -> Lba
            java.lang.String r5 = "Skipped local cms attachment file deletion (file not present)."
            r11.getClass()     // Catch: java.lang.Exception -> Lba
            r10.a = r1     // Catch: java.lang.Exception -> Lba
            r10.b = r11     // Catch: java.lang.Exception -> Lba
            r10.c = r2     // Catch: java.lang.Exception -> Lba
            java.lang.Object r11 = defpackage.cgrf.l(r4, r5, r11, r10)     // Catch: java.lang.Exception -> Lba
            if (r11 != r0) goto L2f
            goto Ld8
        L83:
            boolean r4 = r5.delete()     // Catch: java.lang.Exception -> Lba
            if (r4 == 0) goto Lb2
            enru r4 = defpackage.cgrf.a     // Catch: java.lang.Exception -> Lba
            java.util.logging.Level r5 = java.util.logging.Level.INFO     // Catch: java.lang.Exception -> Lba
            enrr r4 = r4.a(r5)     // Catch: java.lang.Exception -> Lba
            ensn r5 = defpackage.ente.a     // Catch: java.lang.Exception -> Lba
            java.lang.String r6 = "BugleCmsMedia"
            r4.Y(r5, r6)     // Catch: java.lang.Exception -> Lba
            ensn r5 = defpackage.cdii.k     // Catch: java.lang.Exception -> Lba
            r4.Y(r5, r11)     // Catch: java.lang.Exception -> Lba
            java.lang.String r5 = "com/google/android/apps/messaging/shared/message/delete/DeletePartCmsAttachmentHandler$processPendingWorkItemAsync$1"
            java.lang.String r6 = "invokeSuspend"
            java.lang.String r7 = "DeletePartCmsAttachmentHandler.kt"
            r8 = 81
            ensk r4 = r4.h(r5, r6, r8, r7)     // Catch: java.lang.Exception -> Lba
            enrr r4 = (defpackage.enrr) r4     // Catch: java.lang.Exception -> Lba
            java.lang.String r5 = "Deleted local cms attachment file."
            r4.q(r5)     // Catch: java.lang.Exception -> Lba
            goto L2f
        Lb2:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Exception -> Lba
            java.lang.String r5 = "File.delete returned false"
            r4.<init>(r5)     // Catch: java.lang.Exception -> Lba
            throw r4     // Catch: java.lang.Exception -> Lba
        Lba:
            r4 = move-exception
            r9 = r1
            r1 = r11
            r11 = r4
            r4 = r9
        Lbf:
            r1.getClass()
            r10.a = r4
            r5 = 0
            r10.b = r5
            r5 = 3
            r10.c = r5
            java.lang.String r1 = (java.lang.String) r1
            cgrf r5 = r10.e
            java.lang.String r6 = "Unable to delete local cms attachment file."
            java.lang.Object r11 = r5.k(r6, r1, r11, r10)
            if (r11 == r0) goto Ld8
            goto L22
        Ld8:
            return r0
        Ld9:
            ceyt r11 = defpackage.ceyt.i()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgre.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cgre(this.d, this.e, ffguVar);
    }
}
