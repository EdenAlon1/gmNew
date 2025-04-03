package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbpc implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ dbpe b;

    public dbpc(ffxy ffxyVar, dbpe dbpeVar) {
        this.a = ffxyVar;
        this.b = dbpeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.dbpb
            if (r0 == 0) goto L13
            r0 = r12
            dbpb r0 = (defpackage.dbpb) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dbpb r0 = new dbpb
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r12)
            goto L5e
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.ffci.b(r12)
            ffxy r12 = r10.a
            cfis r11 = (defpackage.cfis) r11
            java.lang.String r5 = r11.a
            long r6 = r11.b
            dbqb r4 = new dbqb
            j$.time.Instant r6 = j$.time.Instant.ofEpochMilli(r6)
            r6.getClass()
            dbpe r2 = r10.b
            cqoh r2 = r2.a
            j$.time.Instant r7 = r2.f()
            r7.getClass()
            int r8 = r11.c
            int r9 = r11.d
            r4.<init>(r5, r6, r7, r8, r9)
            r0.b = r3
            java.lang.Object r11 = r12.fQ(r4, r0)
            if (r11 != r1) goto L5e
            return r1
        L5e:
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbpc.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
