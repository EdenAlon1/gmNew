package defpackage;

import androidx.car.app.model.Alert;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cflt extends ceut {
    public static final cskc a = cskc.g("BugleDataModel", "StartHeavyWorkWorkHandler");
    public final Set b;
    public final cfkw c;
    public final cflm d;
    public final ceww e;
    public final cevh f;
    private final ffsk g;
    private final cbwj h;

    public cflt(ffsk ffskVar, Set set, cfkw cfkwVar, cflm cflmVar, ceww cewwVar, cbwj cbwjVar, cevh cevhVar) {
        ffskVar.getClass();
        set.getClass();
        cfkwVar.getClass();
        cflmVar.getClass();
        cewwVar.getClass();
        cbwjVar.getClass();
        cevhVar.getClass();
        this.g = ffskVar;
        this.b = set;
        this.c = cfkwVar;
        this.d = cflmVar;
        this.e = cewwVar;
        this.h = cbwjVar;
        this.f = cevhVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.e(true);
        l.c(Alert.DURATION_SHOW_INDEFINITELY);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("StartHeavyWorkWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = eyex.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final String f() {
        return "heavy_work";
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        c = axol.c(this.g, ffhe.a, ffsm.a, new cflr(this, null));
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (defpackage.fgfz.c((com.google.common.util.concurrent.ListenableFuture) r7, r0) != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.cflq
            if (r0 == 0) goto L13
            r0 = r7
            cflq r0 = (defpackage.cflq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cflq r0 = new cflq
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            goto L5f
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            defpackage.ffci.b(r7)
            goto L51
        L36:
            defpackage.ffci.b(r7)
            cbwj r7 = r6.h
            cflp r2 = new cflp
            r2.<init>()
            java.lang.String r5 = "StartHeavyWorkWorkHandler#kickOffFirstQueuedHeavyWorkOperation"
            elfl r7 = r7.a(r5, r2)
            r7.getClass()
            r0.c = r4
            java.lang.Object r7 = defpackage.fgfz.c(r7, r0)
            if (r7 == r1) goto L62
        L51:
            r7.getClass()
            com.google.common.util.concurrent.ListenableFuture r7 = (com.google.common.util.concurrent.ListenableFuture) r7
            r0.c = r3
            java.lang.Object r7 = defpackage.fgfz.c(r7, r0)
            if (r7 != r1) goto L5f
            goto L62
        L5f:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cflt.k(ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v4, types: [cflo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005e -> B:12:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.cfls
            if (r0 == 0) goto L13
            r0 = r8
            cfls r0 = (defpackage.cfls) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cfls r0 = new cfls
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.a
            engs r4 = r0.e
            defpackage.ffci.b(r8)     // Catch: java.lang.Exception -> L2b
            goto L41
        L2b:
            r8 = move-exception
            goto L5e
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            defpackage.ffci.b(r8)
            java.util.Set r8 = r7.b
            enpd r8 = (defpackage.enpd) r8
            enqu r8 = r8.listIterator()
            r4 = r8
        L41:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L76
            java.lang.Object r8 = r4.next()
            r2 = r8
            cflo r2 = (defpackage.cflo) r2
            r8 = r4
            engs r8 = (defpackage.engs) r8     // Catch: java.lang.Exception -> L2b
            r0.e = r8     // Catch: java.lang.Exception -> L2b
            r0.a = r2     // Catch: java.lang.Exception -> L2b
            r0.d = r3     // Catch: java.lang.Exception -> L2b
            java.lang.Object r8 = r2.c()     // Catch: java.lang.Exception -> L2b
            if (r8 != r1) goto L41
            return r1
        L5e:
            cskc r5 = defpackage.cflt.a
            csjb r5 = r5.b()
            java.lang.String r6 = "Could not unpause agent"
            r5.I(r6)
            java.lang.String r6 = "agent"
            java.lang.String r2 = r2.a()
            r5.A(r6, r2)
            r5.s(r8)
            goto L41
        L76:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cflt.l(ffgu):java.lang.Object");
    }
}
