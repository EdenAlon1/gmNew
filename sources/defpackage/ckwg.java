package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckwg extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ckwi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckwg(ckwi ckwiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ckwiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckwg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (r9 != r0) goto L23;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.b
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/RepairForkedMmsGroupSynclet$sync$1$1"
            java.lang.String r4 = "RepairForkedMmsGroupSynclet.kt"
            java.lang.String r5 = "BugleGroupManagement"
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L24
            if (r1 == r7) goto L1e
            if (r1 == r6) goto L1a
            java.lang.Object r0 = r8.a
            defpackage.ffci.b(r9)
            return r0
        L1a:
            defpackage.ffci.b(r9)     // Catch: java.util.concurrent.CancellationException -> L22
            goto L5f
        L1e:
            defpackage.ffci.b(r9)     // Catch: java.util.concurrent.CancellationException -> L22
            goto L32
        L22:
            r9 = move-exception
            goto L62
        L24:
            defpackage.ffci.b(r9)
            ckwi r9 = r8.c     // Catch: java.util.concurrent.CancellationException -> L22
            r8.b = r7     // Catch: java.util.concurrent.CancellationException -> L22
            java.lang.Object r9 = r9.g(r8)     // Catch: java.util.concurrent.CancellationException -> L22
            if (r9 != r0) goto L32
            goto La1
        L32:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.util.concurrent.CancellationException -> L22
            boolean r9 = r9.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L22
            if (r9 != 0) goto L54
            enru r9 = defpackage.ckwi.a     // Catch: java.util.concurrent.CancellationException -> L22
            ensk r9 = r9.e()     // Catch: java.util.concurrent.CancellationException -> L22
            ensn r1 = defpackage.ente.a     // Catch: java.util.concurrent.CancellationException -> L22
            r9.Y(r1, r5)     // Catch: java.util.concurrent.CancellationException -> L22
            r1 = 149(0x95, float:2.09E-43)
            ensk r9 = r9.h(r3, r2, r1, r4)     // Catch: java.util.concurrent.CancellationException -> L22
            enrr r9 = (defpackage.enrr) r9     // Catch: java.util.concurrent.CancellationException -> L22
            java.lang.String r1 = "Skip as RepairForkedMmsGroupSynclet interval has not passed."
            r9.q(r1)     // Catch: java.util.concurrent.CancellationException -> L22
            r9 = 0
            return r9
        L54:
            ckwi r9 = r8.c     // Catch: java.util.concurrent.CancellationException -> L22
            r8.b = r6     // Catch: java.util.concurrent.CancellationException -> L22
            r1 = 0
            java.lang.Object r9 = r9.b(r1, r8)     // Catch: java.util.concurrent.CancellationException -> L22
            if (r9 == r0) goto La1
        L5f:
            ckvl r9 = (defpackage.ckvl) r9     // Catch: java.util.concurrent.CancellationException -> L22
            goto L82
        L62:
            enru r1 = defpackage.ckwi.a
            ensk r1 = r1.j()
            ensn r6 = defpackage.ente.a
            r1.Y(r6, r5)
            enrr r1 = (defpackage.enrr) r1
            ensk r9 = r1.g(r9)
            r1 = 154(0x9a, float:2.16E-43)
            ensk r9 = r9.h(r3, r2, r1, r4)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r1 = "RepairForkedMmsGroupSynclet has been cancelled."
            r9.q(r1)
            ckvg r9 = defpackage.ckvg.a
        L82:
            ckwi r1 = r8.c
            boolean r2 = r9 instanceof defpackage.ckvg
            if (r2 != 0) goto La2
            r8.a = r9
            r2 = 3
            r8.b = r2
            effy r2 = r1.n
            ckvb r3 = new ckvb
            r3.<init>()
            java.lang.Object r1 = defpackage.ctzl.b(r2, r3, r8)
            ffhh r2 = defpackage.ffhh.a
            if (r1 == r2) goto L9e
            ffcu r1 = defpackage.ffcu.a
        L9e:
            if (r1 == r0) goto La1
            goto La2
        La1:
            return r0
        La2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckwg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ckwg(this.c, ffguVar);
    }
}
