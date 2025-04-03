package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dul extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ duq d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dul(duq duqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = duqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dul) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        if (r1.a(r5, r6, r8) != r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0070 -> B:7:0x0025). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.c
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L11
            java.lang.Object r1 = r8.e
            ffsk r1 = (defpackage.ffsk) r1
            defpackage.ffci.b(r9)     // Catch: java.util.concurrent.CancellationException -> L25
            goto L25
        L11:
            java.lang.Object r1 = r8.b
            java.lang.Object r3 = r8.a
            java.lang.Object r4 = r8.e
            ffsk r4 = (defpackage.ffsk) r4
            defpackage.ffci.b(r9)
            goto L46
        L1d:
            defpackage.ffci.b(r9)
            java.lang.Object r9 = r8.e
            r1 = r9
            ffsk r1 = (defpackage.ffsk) r1
        L25:
            boolean r9 = defpackage.ffsl.g(r1)
            if (r9 == 0) goto L73
            fflb r9 = new fflb
            r9.<init>()
            duq r3 = r8.d
            r8.e = r1
            r8.a = r9
            r8.b = r9
            r8.c = r2
            ffwm r3 = r3.d
            java.lang.Object r3 = r3.i(r8)
            if (r3 == r0) goto L72
            r4 = r1
            r1 = r9
            r9 = r3
            r3 = r1
        L46:
            fflb r1 = (defpackage.fflb) r1
            r1.a = r9
            r9 = r3
            fflb r9 = (defpackage.fflb) r9
            java.lang.Object r9 = r9.a
            boolean r9 = r9 instanceof defpackage.dty
            if (r9 == 0) goto L70
            duq r9 = r8.d     // Catch: java.util.concurrent.CancellationException -> L70
            dni r1 = r9.f     // Catch: java.util.concurrent.CancellationException -> L70
            dhy r5 = defpackage.dhy.b     // Catch: java.util.concurrent.CancellationException -> L70
            duk r6 = new duk     // Catch: java.util.concurrent.CancellationException -> L70
            fflb r3 = (defpackage.fflb) r3     // Catch: java.util.concurrent.CancellationException -> L70
            r7 = 0
            r6.<init>(r3, r9, r7)     // Catch: java.util.concurrent.CancellationException -> L70
            r8.e = r4     // Catch: java.util.concurrent.CancellationException -> L70
            r8.a = r7     // Catch: java.util.concurrent.CancellationException -> L70
            r8.b = r7     // Catch: java.util.concurrent.CancellationException -> L70
            r9 = 2
            r8.c = r9     // Catch: java.util.concurrent.CancellationException -> L70
            java.lang.Object r9 = r1.a(r5, r6, r8)     // Catch: java.util.concurrent.CancellationException -> L70
            if (r9 == r0) goto L72
        L70:
            r1 = r4
            goto L25
        L72:
            return r0
        L73:
            ffcu r9 = defpackage.ffcu.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dul.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dul dulVar = new dul(this.d, ffguVar);
        dulVar.e = obj;
        return dulVar;
    }
}
