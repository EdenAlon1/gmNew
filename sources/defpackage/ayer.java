package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ayer extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ayex c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayer(ayex ayexVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ayexVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayer) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
    
        if (r6.g((j$.time.Instant) r1, false, r5) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r6 != r0) goto L17;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L17
            if (r1 == r2) goto L11
            defpackage.ffci.b(r6)
            goto L82
        L11:
            java.lang.Object r1 = r5.a
            defpackage.ffci.b(r6)
            goto L60
        L17:
            java.lang.Object r1 = r5.a
            defpackage.ffci.b(r6)
            goto L45
        L1d:
            defpackage.ffci.b(r6)
            ayex r6 = r5.c
            ffbr r6 = r6.c
            java.lang.Object r6 = r6.b()
            cqoh r6 = (defpackage.cqoh) r6
            j$.time.Instant r6 = r6.f()
            ayex r1 = r5.c
            ffbr r1 = r1.d
            java.lang.Object r1 = r1.b()
            comc r1 = (defpackage.comc) r1
            r5.a = r6
            r5.b = r3
            java.lang.Object r1 = r1.c(r5)
            if (r1 == r0) goto L85
            r4 = r1
            r1 = r6
            r6 = r4
        L45:
            axvx r6 = (defpackage.axvx) r6
            eyja r6 = r6.h
            if (r6 != 0) goto L4d
            eyja r6 = defpackage.eyja.a
        L4d:
            r6.getClass()
            ayex r3 = r5.c
            j$.time.Instant r6 = defpackage.eykn.d(r6)
            r5.a = r1
            r5.b = r2
            java.lang.Object r6 = r3.f(r6, r5)
            if (r6 == r0) goto L85
        L60:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            ayex r2 = r5.c
            java.lang.String r3 = "Bugle.Contacts.Sync.Work.Incremental.Contacts.Count"
            r2.h(r3, r6)
            ayex r6 = r5.c
            r1.getClass()
            r2 = 0
            r5.a = r2
            r2 = 3
            r5.b = r2
            j$.time.Instant r1 = (j$.time.Instant) r1
            r2 = 0
            java.lang.Object r6 = r6.g(r1, r2, r5)
            if (r6 != r0) goto L82
            goto L85
        L82:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayer.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ayer(this.c, ffguVar);
    }
}
