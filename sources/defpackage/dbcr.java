package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbcr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dbcd b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbcr(ffgu ffguVar, dbcd dbcdVar) {
        super(2, ffguVar);
        this.b = dbcdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbcr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0030, code lost:
    
        if (r12 != r1) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c A[Catch: Exception -> 0x00d3, TryCatch #0 {Exception -> 0x00d3, blocks: (B:6:0x000f, B:7:0x0045, B:9:0x0052, B:10:0x0054, B:12:0x005c, B:13:0x005e, B:15:0x0066, B:16:0x0068, B:18:0x0072, B:19:0x0074, B:21:0x0078, B:22:0x007a, B:27:0x0017, B:28:0x0032, B:33:0x0022), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[Catch: Exception -> 0x00d3, TryCatch #0 {Exception -> 0x00d3, blocks: (B:6:0x000f, B:7:0x0045, B:9:0x0052, B:10:0x0054, B:12:0x005c, B:13:0x005e, B:15:0x0066, B:16:0x0068, B:18:0x0072, B:19:0x0074, B:21:0x0078, B:22:0x007a, B:27:0x0017, B:28:0x0032, B:33:0x0022), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072 A[Catch: Exception -> 0x00d3, TryCatch #0 {Exception -> 0x00d3, blocks: (B:6:0x000f, B:7:0x0045, B:9:0x0052, B:10:0x0054, B:12:0x005c, B:13:0x005e, B:15:0x0066, B:16:0x0068, B:18:0x0072, B:19:0x0074, B:21:0x0078, B:22:0x007a, B:27:0x0017, B:28:0x0032, B:33:0x0022), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[Catch: Exception -> 0x00d3, TryCatch #0 {Exception -> 0x00d3, blocks: (B:6:0x000f, B:7:0x0045, B:9:0x0052, B:10:0x0054, B:12:0x005c, B:13:0x005e, B:15:0x0066, B:16:0x0068, B:18:0x0072, B:19:0x0074, B:21:0x0078, B:22:0x007a, B:27:0x0017, B:28:0x0032, B:33:0x0022), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052 A[Catch: Exception -> 0x00d3, TryCatch #0 {Exception -> 0x00d3, blocks: (B:6:0x000f, B:7:0x0045, B:9:0x0052, B:10:0x0054, B:12:0x005c, B:13:0x005e, B:15:0x0066, B:16:0x0068, B:18:0x0072, B:19:0x0074, B:21:0x0078, B:22:0x007a, B:27:0x0017, B:28:0x0032, B:33:0x0022), top: B:2:0x0007 }] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r0 = "fileId:\t"
            ffhh r1 = defpackage.ffhh.a
            int r2 = r11.a
            r3 = 1
            if (r2 == 0) goto L1b
            if (r2 == r3) goto L13
            java.lang.Object r1 = r11.c
            dbce r1 = (defpackage.dbce) r1
            defpackage.ffci.b(r12)     // Catch: java.lang.Exception -> Ld3
            goto L45
        L13:
            java.lang.Object r2 = r11.c
            dbce r2 = (defpackage.dbce) r2
            defpackage.ffci.b(r12)     // Catch: java.lang.Exception -> Ld3
            goto L32
        L1b:
            defpackage.ffci.b(r12)
            java.lang.Object r12 = r11.c
            ffsk r12 = (defpackage.ffsk) r12
            dbce r2 = defpackage.dbcd.a     // Catch: java.lang.Exception -> Ld3
            dbcd r12 = r11.b     // Catch: java.lang.Exception -> Ld3
            ffss r12 = r12.e     // Catch: java.lang.Exception -> Ld3
            r11.c = r2     // Catch: java.lang.Exception -> Ld3
            r11.a = r3     // Catch: java.lang.Exception -> Ld3
            java.lang.Object r12 = r12.c(r11)     // Catch: java.lang.Exception -> Ld3
            if (r12 == r1) goto Ld2
        L32:
            crty r12 = (defpackage.crty) r12     // Catch: java.lang.Exception -> Ld3
            elfl r12 = r12.j()     // Catch: java.lang.Exception -> Ld3
            r11.c = r2     // Catch: java.lang.Exception -> Ld3
            r2 = 2
            r11.a = r2     // Catch: java.lang.Exception -> Ld3
            java.lang.Object r12 = defpackage.fgfz.c(r12, r11)     // Catch: java.lang.Exception -> Ld3
            if (r12 != r1) goto L45
            goto Ld2
        L45:
            r12.getClass()     // Catch: java.lang.Exception -> Ld3
            esxk r12 = (defpackage.esxk) r12     // Catch: java.lang.Exception -> Ld3
            java.lang.String r1 = r12.b     // Catch: java.lang.Exception -> Ld3
            java.lang.String r2 = r12.c     // Catch: java.lang.Exception -> Ld3
            eyja r3 = r12.d     // Catch: java.lang.Exception -> Ld3
            if (r3 != 0) goto L54
            eyja r3 = defpackage.eyja.a     // Catch: java.lang.Exception -> Ld3
        L54:
            java.lang.String r3 = defpackage.eykm.i(r3)     // Catch: java.lang.Exception -> Ld3
            eyja r4 = r12.e     // Catch: java.lang.Exception -> Ld3
            if (r4 != 0) goto L5e
            eyja r4 = defpackage.eyja.a     // Catch: java.lang.Exception -> Ld3
        L5e:
            java.lang.String r4 = defpackage.eykm.i(r4)     // Catch: java.lang.Exception -> Ld3
            eyja r5 = r12.f     // Catch: java.lang.Exception -> Ld3
            if (r5 != 0) goto L68
            eyja r5 = defpackage.eyja.a     // Catch: java.lang.Exception -> Ld3
        L68:
            java.lang.String r5 = defpackage.eykm.i(r5)     // Catch: java.lang.Exception -> Ld3
            long r6 = r12.g     // Catch: java.lang.Exception -> Ld3
            ezhm r8 = r12.h     // Catch: java.lang.Exception -> Ld3
            if (r8 != 0) goto L74
            ezhm r8 = defpackage.ezhm.a     // Catch: java.lang.Exception -> Ld3
        L74:
            ezgy r8 = r8.b     // Catch: java.lang.Exception -> Ld3
            if (r8 != 0) goto L7a
            ezgy r8 = defpackage.ezgy.a     // Catch: java.lang.Exception -> Ld3
        L7a:
            java.lang.String r8 = r8.b     // Catch: java.lang.Exception -> Ld3
            java.lang.String r9 = r12.i     // Catch: java.lang.Exception -> Ld3
            java.lang.String r12 = r12.j     // Catch: java.lang.Exception -> Ld3
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld3
            r10.<init>(r0)     // Catch: java.lang.Exception -> Ld3
            r10.append(r1)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = "\nname:\t"
            r10.append(r0)     // Catch: java.lang.Exception -> Ld3
            r10.append(r2)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = "\ncreateTime:\t"
            r10.append(r0)     // Catch: java.lang.Exception -> Ld3
            r10.append(r3)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = "\nupdateTime:\t"
            r10.append(r0)     // Catch: java.lang.Exception -> Ld3
            r10.append(r4)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = "\ndeleteTime:\t"
            r10.append(r0)     // Catch: java.lang.Exception -> Ld3
            r10.append(r5)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = "\nsizeBytes:\t"
            r10.append(r0)     // Catch: java.lang.Exception -> Ld3
            r10.append(r6)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = "\nblob_id:\t"
            r10.append(r0)     // Catch: java.lang.Exception -> Ld3
            r10.append(r8)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = "\nobjectId:\t"
            r10.append(r0)     // Catch: java.lang.Exception -> Ld3
            r10.append(r9)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = "\nconversationId:\t"
            r10.append(r0)     // Catch: java.lang.Exception -> Ld3
            r10.append(r12)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r12 = "\n\n"
            r10.append(r12)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r12 = r10.toString()     // Catch: java.lang.Exception -> Ld3
            return r12
        Ld2:
            return r1
        Ld3:
            r12 = move-exception
            r12.toString()
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "Failed. "
            java.lang.String r12 = r0.concat(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbcr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dbcr dbcrVar = new dbcr(ffguVar, this.b);
        dbcrVar.c = obj;
        return dbcrVar;
    }
}
