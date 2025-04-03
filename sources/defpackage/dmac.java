package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmac implements ffjn {
    final /* synthetic */ dlzu a;
    final /* synthetic */ ffmf b;

    public dmac(dlzu dlzuVar, ffmf ffmfVar) {
        this.a = dlzuVar;
        this.b = ffmfVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi hviVar = (hvi) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hviVar.getClass();
        hfdVar.v(1451363959);
        hfdVar.v(1251116307);
        Object f = hfdVar.f();
        if (f == hfc.a) {
            f = new ils();
            hfdVar.y(f);
        }
        final ils ilsVar = (ils) f;
        hfdVar.o();
        hfdVar.v(1251120841);
        boolean D = hfdVar.D(this.a) | hfdVar.D(this.b) | hfdVar.F(ilsVar);
        final dlzu dlzuVar = this.a;
        final ffmf ffmfVar = this.b;
        Object f2 = hfdVar.f();
        if (D || f2 == hfc.a) {
            f2 = new ffji() { // from class: dmab
                /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
                
                    if (r2 != 3) goto L20;
                 */
                @Override // defpackage.ffji
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r6) {
                    /*
                        r5 = this;
                        android.view.MotionEvent r6 = (android.view.MotionEvent) r6
                        r6.getClass()
                        dlzu r0 = defpackage.dlzu.this
                        r1 = 0
                        if (r0 != 0) goto Lb
                        goto L68
                    Lb:
                        int r2 = r6.getAction()
                        r3 = 1
                        if (r2 == 0) goto L22
                        if (r2 == r3) goto L1b
                        r4 = 2
                        if (r2 == r4) goto L22
                        r6 = 3
                        if (r2 == r6) goto L1b
                        goto L68
                    L1b:
                        ffix r6 = r0.c
                        r6.invoke()
                    L20:
                        r1 = r3
                        goto L68
                    L22:
                        ffmf r2 = r2
                        if (r2 == 0) goto L68
                        float r4 = r6.getX()
                        java.lang.Float r4 = java.lang.Float.valueOf(r4)
                        boolean r4 = r2.d(r4)
                        if (r4 == 0) goto L68
                        ils r1 = r3
                        float r6 = r6.getX()
                        java.lang.Comparable r4 = r2.c()
                        java.lang.Number r4 = (java.lang.Number) r4
                        float r4 = r4.floatValue()
                        float r6 = r6 - r4
                        java.lang.Comparable r4 = r2.b()
                        java.lang.Number r4 = (java.lang.Number) r4
                        float r4 = r4.floatValue()
                        java.lang.Comparable r2 = r2.c()
                        java.lang.Number r2 = (java.lang.Number) r2
                        float r2 = r2.floatValue()
                        float r4 = r4 - r2
                        ffji r0 = r0.b
                        float r6 = r6 / r4
                        java.lang.Float r6 = java.lang.Float.valueOf(r6)
                        r0.invoke(r6)
                        r1.a(r3)
                        goto L20
                    L68:
                        java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dmab.invoke(java.lang.Object):java.lang.Object");
                }
            };
            hfdVar.y(f2);
        }
        hfdVar.o();
        hvi b = iln.b(hviVar, ilsVar, (ffji) f2);
        hfdVar.o();
        return b;
    }
}
