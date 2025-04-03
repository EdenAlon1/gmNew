package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzmj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bznk b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzmj(ffgu ffguVar, bznk bznkVar) {
        super(2, ffguVar);
        this.b = bznkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzmj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0024, code lost:
    
        if (r7 != r0) goto L10;
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
            int r1 = r6.a
            r2 = 1
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r7)
            return r7
        Ld:
            defpackage.ffci.b(r7)
            goto L26
        L11:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.c
            ffsk r7 = (defpackage.ffsk) r7
            bznk r7 = r6.b
            comc r7 = r7.n()
            r6.a = r2
            java.lang.Object r7 = r7.c(r6)
            if (r7 == r0) goto L98
        L26:
            bzma r7 = (defpackage.bzma) r7
            long r1 = r7.i
            j$.time.Instant r1 = j$.time.Instant.ofEpochMilli(r1)
            cfva r2 = defpackage.bzaq.a
            java.lang.Object r2 = r2.e()
            r2.getClass()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            j$.time.Instant r1 = r1.plusMillis(r2)
            int r2 = r7.c
            bzlz r2 = defpackage.bzlz.b(r2)
            if (r2 != 0) goto L4b
            bzlz r2 = defpackage.bzlz.UNRECOGNIZED
        L4b:
            bzlz r3 = defpackage.bzlz.ERROR_TIME_OUT
            if (r2 == r3) goto L97
            long r2 = r7.i
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L97
            bznk r2 = r6.b
            ffbr r2 = r2.j
            java.lang.Object r2 = r2.b()
            cqoh r2 = (defpackage.cqoh) r2
            j$.time.Instant r2 = r2.f()
            boolean r1 = r1.isBefore(r2)
            if (r1 == 0) goto L97
            entd r7 = defpackage.bznk.b
            ensk r7 = r7.n()
            java.lang.String r1 = "Timeout while gaia pairing prompt is on the background."
            r7.q(r1)
            bznk r7 = r6.b
            ffbr r7 = r7.h
            java.lang.Object r7 = r7.b()
            cgvp r7 = (defpackage.cgvp) r7
            cgvo r1 = defpackage.cgvo.g
            r7.b(r1)
            bznk r7 = r6.b
            comc r7 = r7.n()
            bzml r1 = defpackage.bzml.a
            r2 = 2
            r6.a = r2
            java.lang.Object r7 = r7.d(r1, r6)
            if (r7 != r0) goto L97
            goto L98
        L97:
            return r7
        L98:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzmj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bzmj bzmjVar = new bzmj(ffguVar, this.b);
        bzmjVar.c = obj;
        return bzmjVar;
    }
}
