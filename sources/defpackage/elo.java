package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class elo extends ffkk implements ffji {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ cog c;
    final /* synthetic */ elp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elo(int i, int i2, cog cogVar, elp elpVar) {
        super(1);
        this.a = i;
        this.b = i2;
        this.c = cogVar;
        this.d = elpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        if (r3 == null) goto L7;
     */
    @Override // defpackage.ffji
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            ehv r7 = (defpackage.ehv) r7
            java.lang.Object r0 = r7.c
            eij r0 = (defpackage.eij) r0
            ffji r0 = r0.a()
            int r1 = r7.a
            int r2 = r6.a
            int r1 = java.lang.Math.max(r2, r1)
            int r2 = r7.a
            int r3 = r7.b
            int r2 = r2 + r3
            int r3 = r6.b
            int r2 = r2 + (-1)
            int r2 = java.lang.Math.min(r3, r2)
            if (r1 > r2) goto L4a
        L21:
            if (r0 == 0) goto L31
            int r3 = r7.a
            int r3 = r1 - r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.invoke(r3)
            if (r3 != 0) goto L36
        L31:
            eht r3 = new eht
            r3.<init>(r1)
        L36:
            cog r4 = r6.c
            r4.c(r3, r1)
            elp r4 = r6.d
            int r5 = r4.b
            int r5 = r1 - r5
            java.lang.Object[] r4 = r4.a
            r4[r5] = r3
            if (r1 == r2) goto L4a
            int r1 = r1 + 1
            goto L21
        L4a:
            ffcu r7 = defpackage.ffcu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elo.invoke(java.lang.Object):java.lang.Object");
    }
}
