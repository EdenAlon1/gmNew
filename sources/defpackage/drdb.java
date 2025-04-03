package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drdb extends ffhv implements ffjm {
    int a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ drdd e;
    final /* synthetic */ drcy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drdb(drdd drddVar, drcy drcyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = drddVar;
        this.f = drcyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drdb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002f -> B:4:0x0032). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.d
            if (r1 == 0) goto L10
            int r1 = r7.a
            java.lang.Object r2 = r7.c
            java.lang.Object r3 = r7.b
            defpackage.ffci.b(r8)
            goto L32
        L10:
            defpackage.ffci.b(r8)
            drdd r8 = r7.e
            ffwm r8 = r8.d
            if (r8 == 0) goto L97
            ffwo r8 = r8.r()
            r1 = 0
            r2 = 0
            r3 = r1
            r1 = r2
            r2 = r8
        L22:
            r7.b = r3
            r7.c = r2
            r7.a = r1
            r8 = 1
            r7.d = r8
            java.lang.Object r8 = r2.a(r7)
            if (r8 != r0) goto L32
            return r0
        L32:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7a
            java.lang.Object r8 = r2.b()
            drde r8 = (defpackage.drde) r8
            if (r3 != 0) goto L43
            goto L78
        L43:
            int r1 = r1 + 1
            drdd r4 = r7.e
            j$.time.Duration r5 = r8.a
            drde r3 = (defpackage.drde) r3
            j$.time.Duration r6 = r3.a
            qri r4 = r4.a()
            j$.time.Duration r5 = r5.minus(r6)
            r5.getClass()
            long r5 = r5.toMillis()
            int r5 = (int) r5
            float r5 = (float) r5
            r6 = 1092616192(0x41200000, float:10.0)
            float r5 = r5 / r6
            int r5 = java.lang.Math.round(r5)
            r4.c = r5
            drdd r4 = r7.e
            drcy r5 = r7.f
            android.graphics.Bitmap r3 = r3.b
            qri r4 = r4.a()
            android.graphics.Bitmap r3 = r5.a(r3)
            r4.b(r3)
        L78:
            r3 = r8
            goto L22
        L7a:
            if (r3 == 0) goto L91
            int r1 = r1 + 1
            drdd r8 = r7.e
            drcy r0 = r7.f
            drde r3 = (defpackage.drde) r3
            android.graphics.Bitmap r2 = r3.b
            qri r8 = r8.a()
            android.graphics.Bitmap r0 = r0.a(r2)
            r8.b(r0)
        L91:
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r1)
            return r8
        L97:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Required value was null."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drdb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drdb(this.e, this.f, ffguVar);
    }
}
