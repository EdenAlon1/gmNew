package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aybo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aybp b;
    final /* synthetic */ int c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aybo(ffgu ffguVar, aybp aybpVar, int i) {
        super(2, ffguVar);
        this.b = aybpVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aybo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0030, code lost:
    
        if (r7.a(null, r6) != r0) goto L25;
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
            r3 = 0
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L14
            java.lang.Object r0 = r6.d
            fgjb r0 = (defpackage.fgjb) r0
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L12
            goto L42
        L12:
            r7 = move-exception
            goto L4c
        L14:
            java.lang.Object r1 = r6.d
            fgjb r1 = (defpackage.fgjb) r1
            defpackage.ffci.b(r7)
            r7 = r1
            goto L32
        L1d:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.d
            ffsk r7 = (defpackage.ffsk) r7
            fgjb r7 = defpackage.ayce.a
            fgjb r7 = defpackage.ayce.a
            r6.d = r7
            r6.a = r2
            java.lang.Object r1 = r7.a(r3, r6)
            if (r1 == r0) goto L50
        L32:
            aybp r1 = r6.b     // Catch: java.lang.Throwable -> L48
            int r2 = r6.c     // Catch: java.lang.Throwable -> L48
            r6.d = r7     // Catch: java.lang.Throwable -> L48
            r4 = 2
            r6.a = r4     // Catch: java.lang.Throwable -> L48
            java.lang.Object r1 = r1.c(r2, r6)     // Catch: java.lang.Throwable -> L48
            if (r1 == r0) goto L50
            r0 = r7
        L42:
            r0.b(r3)
            ffcu r7 = defpackage.ffcu.a
            return r7
        L48:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L4c:
            r0.b(r3)
            throw r7
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aybo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aybo ayboVar = new aybo(ffguVar, this.b, this.c);
        ayboVar.d = obj;
        return ayboVar;
    }
}
