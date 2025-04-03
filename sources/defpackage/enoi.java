package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enoi extends ennz {
    final Object a;
    int b;
    final /* synthetic */ enoj c;

    public enoi(enoj enojVar, int i) {
        this.c = enojVar;
        this.a = enojVar.a[i];
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (defpackage.emxb.a(r4.a, r2.a[r0]) != false) goto L9;
     */
    @Override // defpackage.ennx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a() {
        /*
            r4 = this;
            int r0 = r4.b
            r1 = -1
            if (r0 == r1) goto L17
            enoj r2 = r4.c
            int r3 = r2.c
            if (r0 >= r3) goto L17
            java.lang.Object r3 = r4.a
            java.lang.Object[] r2 = r2.a
            r0 = r2[r0]
            boolean r0 = defpackage.emxb.a(r3, r0)
            if (r0 != 0) goto L21
        L17:
            enoj r0 = r4.c
            java.lang.Object r2 = r4.a
            int r0 = r0.d(r2)
            r4.b = r0
        L21:
            int r0 = r4.b
            if (r0 != r1) goto L27
            r0 = 0
            return r0
        L27:
            enoj r1 = r4.c
            int[] r1 = r1.b
            r0 = r1[r0]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enoi.a():int");
    }

    @Override // defpackage.ennx
    public final Object b() {
        return this.a;
    }
}
