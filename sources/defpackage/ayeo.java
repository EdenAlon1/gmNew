package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ayeo extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ayex c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayeo(ayex ayexVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ayexVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayeo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0053, code lost:
    
        if (r6.g((j$.time.Instant) r1, true, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r6 != r0) goto L9;
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
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r6)
            goto L56
        Ld:
            java.lang.Object r1 = r5.a
            defpackage.ffci.b(r6)
            goto L35
        L13:
            defpackage.ffci.b(r6)
            ayex r6 = r5.c
            ffbr r6 = r6.c
            java.lang.Object r6 = r6.b()
            cqoh r6 = (defpackage.cqoh) r6
            j$.time.Instant r1 = r6.f()
            ayex r6 = r5.c
            j$.time.Instant r3 = j$.time.Instant.EPOCH
            r3.getClass()
            r5.a = r1
            r5.b = r2
            java.lang.Object r6 = r6.f(r3, r5)
            if (r6 == r0) goto L59
        L35:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            ayex r3 = r5.c
            java.lang.String r4 = "Bugle.Contacts.Sync.Work.Full.Contacts.Count"
            r3.h(r4, r6)
            ayex r6 = r5.c
            r1.getClass()
            r3 = 0
            r5.a = r3
            r3 = 2
            r5.b = r3
            j$.time.Instant r1 = (j$.time.Instant) r1
            java.lang.Object r6 = r6.g(r1, r2, r5)
            if (r6 != r0) goto L56
            goto L59
        L56:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayeo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ayeo(this.c, ffguVar);
    }
}
