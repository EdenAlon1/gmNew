package defpackage;

import android.content.Context;
import android.os.BatteryManager;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckut implements ekrm {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/MmsGroupUpgradeSynclet");
    public final ffbr b;
    public final akzt c;
    public final ctvs d;
    public final effy e;
    public final cqoh f;
    public final ffbr g;
    public final ffbr h;
    public final ffbz i;
    private final ffsk j;
    private final ffhd k;
    private final cktd l;
    private final aqvh m;
    private final ffbr n;
    private final csiy o;

    public ckut(ffsk ffskVar, ffhd ffhdVar, csiy csiyVar, cktd cktdVar, ffbr ffbrVar, final Context context, akzt akztVar, ctvs ctvsVar, aqvh aqvhVar, effy effyVar, cqoh cqohVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffskVar.getClass();
        ffhdVar.getClass();
        csiyVar.getClass();
        cktdVar.getClass();
        context.getClass();
        akztVar.getClass();
        ctvsVar.getClass();
        aqvhVar.getClass();
        effyVar.getClass();
        cqohVar.getClass();
        this.j = ffskVar;
        this.k = ffhdVar;
        this.o = csiyVar;
        this.l = cktdVar;
        this.b = ffbrVar;
        this.c = akztVar;
        this.d = ctvsVar;
        this.m = aqvhVar;
        this.e = effyVar;
        this.f = cqohVar;
        this.n = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffca.a(new ffix() { // from class: ckud
            @Override // defpackage.ffix
            public final Object invoke() {
                Object systemService = context.getSystemService("batterymanager");
                systemService.getClass();
                return (BatteryManager) systemService;
            }
        });
    }

    @Override // defpackage.ekrm
    public final /* bridge */ /* synthetic */ ListenableFuture a() {
        elfl c;
        ekzz f = eleg.f("MmsGroupUpgradeSynclet#sync");
        try {
            c = axol.c(this.j, ffhe.a, ffsm.a, new ckus(this, null));
            ffig.a(f, null);
            return c;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0139, code lost:
    
        if (r13 == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f2, code lost:
    
        if (r13 != r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
    
        if (r13 != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckut.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ckum
            if (r0 == 0) goto L13
            r0 = r5
            ckum r0 = (defpackage.ckum) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ckum r0 = new ckum
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ckut r0 = r0.d
            defpackage.ffci.b(r5)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            effy r5 = r4.e
            com.google.common.util.concurrent.ListenableFuture r5 = r5.a()
            r5.getClass()
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 == r1) goto L7d
            r0 = r4
        L48:
            ckuv r5 = (defpackage.ckuv) r5
            eyja r5 = r5.d
            if (r5 != 0) goto L50
            eyja r5 = defpackage.eyja.a
        L50:
            r5.getClass()
            j$.time.Instant r5 = defpackage.eykn.d(r5)
            ffbr r1 = r0.n
            java.lang.Object r1 = r1.b()
            r1.getClass()
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            j$.time.Duration r1 = defpackage.ernk.f(r1)
            j$.time.Instant r5 = r5.plus(r1)
            cqoh r0 = r0.f
            j$.time.Instant r0 = r0.f()
            boolean r5 = r5.isBefore(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckut.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ckun
            if (r0 == 0) goto L13
            r0 = r7
            ckun r0 = (defpackage.ckun) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ckun r0 = new ckun
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            int r0 = r0.a
            defpackage.ffci.b(r7)
            goto L6b
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            ckut r2 = r0.e
            defpackage.ffci.b(r7)
            goto L51
        L3a:
            defpackage.ffci.b(r7)
            effy r7 = r6.e
            com.google.common.util.concurrent.ListenableFuture r7 = r7.a()
            r7.getClass()
            r0.e = r6
            r0.d = r4
            java.lang.Object r7 = defpackage.fgfz.c(r7, r0)
            if (r7 == r1) goto L71
            r2 = r6
        L51:
            ckuv r7 = (defpackage.ckuv) r7
            int r7 = r7.c
            int r7 = r7 + r4
            effy r2 = r2.e
            ckua r4 = new ckua
            r4.<init>()
            r5 = 0
            r0.e = r5
            r0.a = r7
            r0.d = r3
            java.lang.Object r0 = defpackage.ctzl.b(r2, r4, r0)
            if (r0 == r1) goto L71
            r0 = r7
        L6b:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r0)
            return r7
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckut.d(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
    
        if (r7 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0098, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004f, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0088 -> B:11:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ckuq
            if (r0 == 0) goto L13
            r0 = r7
            ckuq r0 = (defpackage.ckuq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ckuq r0 = new ckuq
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r2 = r0.a
            defpackage.ffci.b(r7)
            goto L8a
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            defpackage.ffci.b(r7)
            goto L51
        L39:
            defpackage.ffci.b(r7)
            aqvh r7 = r6.m
            aqge r7 = r7.a()
            elfl r7 = r7.b()
            r7.getClass()
            r0.d = r5
            java.lang.Object r7 = defpackage.fgfz.c(r7, r0)
            if (r7 == r1) goto L98
        L51:
            r7.getClass()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r2 = r7 instanceof java.util.Collection
            if (r2 == 0) goto L64
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L64
            goto L93
        L64:
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
        L69:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L93
            java.lang.Object r7 = r2.next()
            aqux r7 = (defpackage.aqux) r7
            aqge r7 = r7.e()
            elfl r7 = r7.b()
            r7.getClass()
            r0.a = r2
            r0.d = r4
            java.lang.Object r7 = defpackage.fgfz.c(r7, r0)
            if (r7 == r1) goto L98
        L8a:
            aqys r7 = (defpackage.aqys) r7
            boolean r7 = r7.a()
            if (r7 == 0) goto L69
            r3 = r5
        L93:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckut.e(ffgu):java.lang.Object");
    }
}
