package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akeo extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ akep c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akeo(akep akepVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = akepVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akeo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r7.b((j$.time.Duration) r1, r6) != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r7 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r1 != 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004a, code lost:
    
        r7 = r6.c;
        r6.b = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0053, code lost:
    
        if (r7.d(r6) != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0059, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto L10
            defpackage.ffci.b(r7)
            if (r1 == r2) goto L4a
            goto L56
        L10:
            java.lang.Object r1 = r6.a
            defpackage.ffci.b(r7)
            goto L38
        L16:
            defpackage.ffci.b(r7)
            akep r7 = r6.c
            cqoh r7 = r7.a
            j$.time.Instant r7 = r7.f()
            long r4 = r7.toEpochMilli()
            j$.time.Duration r1 = j$.time.Duration.ofMillis(r4)
            akep r7 = r6.c
            r1.getClass()
            r6.a = r1
            r6.b = r3
            java.lang.Object r7 = r7.c(r1, r6)
            if (r7 == r0) goto L59
        L38:
            akep r7 = r6.c
            r1.getClass()
            r3 = 0
            r6.a = r3
            r6.b = r2
            j$.time.Duration r1 = (j$.time.Duration) r1
            java.lang.Object r7 = r7.b(r1, r6)
            if (r7 == r0) goto L59
        L4a:
            akep r7 = r6.c
            r1 = 3
            r6.b = r1
            java.lang.Object r7 = r7.d(r6)
            if (r7 != r0) goto L56
            goto L59
        L56:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akeo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new akeo(this.c, ffguVar);
    }
}
