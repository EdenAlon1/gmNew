package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dboz implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ dbpe b;

    public dboz(ffxy ffxyVar, dbpe dbpeVar) {
        this.a = ffxyVar;
        this.b = dbpeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.dboy
            if (r0 == 0) goto L13
            r0 = r11
            dboy r0 = (defpackage.dboy) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dboy r0 = new dboy
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.ffci.b(r11)
            goto Lbf
        L28:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L30:
            defpackage.ffci.b(r11)
            ffxy r11 = r9.a
            java.util.List r10 = (java.util.List) r10
            r10.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
        L43:
            boolean r4 = r10.hasNext()
            java.lang.String r5 = "EXTRA_WORK_SPEC_ID"
            if (r4 == 0) goto L60
            java.lang.Object r4 = r10.next()
            r6 = r4
            android.app.job.JobInfo r6 = (android.app.job.JobInfo) r6
            android.os.PersistableBundle r6 = r6.getExtras()
            boolean r5 = r6.containsKey(r5)
            if (r5 == 0) goto L43
            r2.add(r4)
            goto L43
        L60:
            r10 = 10
            int r10 = defpackage.ffdx.n(r2, r10)
            int r10 = defpackage.ffew.a(r10)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r6 = 16
            int r10 = defpackage.ffmk.f(r10, r6)
            r4.<init>(r10)
            java.util.Iterator r10 = r2.iterator()
        L79:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Lb6
            java.lang.Object r2 = r10.next()
            android.app.job.JobInfo r2 = (android.app.job.JobInfo) r2
            android.os.PersistableBundle r6 = r2.getExtras()
            java.lang.String r6 = r6.getString(r5)
            r6.getClass()
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 34
            if (r7 < r8) goto La3
            dbpe r7 = r9.b
            int r2 = r2.getId()
            android.app.job.JobScheduler r7 = r7.b
            int r2 = defpackage.aak$$ExternalSyntheticApiModelOutline0.m(r7, r2)
            goto La4
        La3:
            r2 = 0
        La4:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r2)
            ffcf r2 = new ffcf
            r2.<init>(r6, r7)
            java.lang.Object r6 = r2.a
            java.lang.Object r2 = r2.b
            r4.put(r6, r2)
            goto L79
        Lb6:
            r0.b = r3
            java.lang.Object r10 = r11.fQ(r4, r0)
            if (r10 != r1) goto Lbf
            return r1
        Lbf:
            ffcu r10 = defpackage.ffcu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dboz.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
