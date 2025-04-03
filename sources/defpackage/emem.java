package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emem implements ffxy {
    final /* synthetic */ emge a;
    final /* synthetic */ emgi b;
    final /* synthetic */ fflb c;
    final /* synthetic */ emeq d;

    public emem(emge emgeVar, emgi emgiVar, fflb fflbVar, emeq emeqVar) {
        this.a = emgeVar;
        this.b = emgiVar;
        this.c = fflbVar;
        this.d = emeqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r6, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.emel
            if (r0 == 0) goto L13
            r0 = r8
            emel r0 = (defpackage.emel) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            emel r0 = new emel
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            emem r6 = r0.d
            defpackage.ffci.b(r8)
            goto L5b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.ffci.b(r8)
            emge r8 = r5.a
            hho r8 = r8.m
            java.lang.Object r8 = r8.a()
            if (r8 != 0) goto L77
            emgi r8 = r5.b
            fflb r2 = r5.c
            emgm r8 = r8.H()
            java.lang.Object r2 = r2.a
            android.net.Uri r2 = (android.net.Uri) r2
            kaf r4 = new kaf
            r4.<init>(r6)
            r0.d = r5
            r0.c = r3
            java.lang.Object r8 = r8.a(r2, r4, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            r6 = r5
        L5b:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            if (r8 != 0) goto L70
            emeq r7 = r6.d
            adak r7 = r7.c
            if (r7 == 0) goto L6a
            draw r8 = defpackage.draw.b
            r7.b(r8)
        L6a:
            emeq r6 = r6.d
            defpackage.emeq.b(r6)
            goto L77
        L70:
            emge r6 = r6.a
            hho r6 = r6.m
            r6.b(r8)
        L77:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emem.b(long, ffgu):java.lang.Object");
    }

    @Override // defpackage.ffxy
    public final /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        return b(((kaf) obj).a, ffguVar);
    }
}
