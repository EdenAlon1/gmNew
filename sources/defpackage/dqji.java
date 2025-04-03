package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqji {
    public static final enru a = enru.c("com/google/android/libraries/compose/core/data/usage/FrecencyProcessor");
    public final ernh b;
    public final dqkk c;
    public final ffji d;
    public final fgjb e = new fgjf();
    public Map f;
    private final dqkd g;

    public dqji(ernh ernhVar, dqkk dqkkVar, dqkd dqkdVar, ffji ffjiVar) {
        this.b = ernhVar;
        this.c = dqkkVar;
        this.g = dqkdVar;
        this.d = ffjiVar;
    }

    public static /* synthetic */ Object f(dqji dqjiVar, Iterable iterable, Instant instant, dqgm dqgmVar, int i, ffgu ffguVar, int i2) {
        if ((i2 & 2) != 0) {
            instant = dqjiVar.b.a();
        }
        Instant instant2 = instant;
        if ((i2 & 8) != 0) {
            i = 50;
        }
        return dqjiVar.b(iterable, instant2, dqgmVar, i, ffguVar);
    }

    public final double a(dqkb dqkbVar, Instant instant, dqgm dqgmVar) {
        double d = ffkj.e(dqkbVar.a(), dqgmVar) ? this.g.a : this.g.b;
        Duration.between(dqkbVar.b(), instant).getClass();
        return d * Math.pow(0.95d, Math.sqrt(r5.toMillis() / this.g.c.toMillis()) + 1.0d) * 5.0d;
    }

    public final Object b(Iterable iterable, Instant instant, dqgm dqgmVar, int i, ffgu ffguVar) {
        return this.c.d("FrecencyProcessor#computeFrecent", new dqje(this, iterable, instant, dqgmVar, i, null), ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a A[Catch: all -> 0x00a1, TRY_ENTER, TryCatch #0 {all -> 0x00a1, blocks: (B:12:0x0084, B:15:0x008a, B:16:0x008e, B:18:0x0095, B:19:0x0099), top: B:11:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095 A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:12:0x0084, B:15:0x008a, B:16:0x008e, B:18:0x0095, B:19:0x0099), top: B:11:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r10, defpackage.dqgm r11, j$.time.Instant r12, int r13, defpackage.ffgu r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof defpackage.dqjg
            if (r0 == 0) goto L13
            r0 = r14
            dqjg r0 = (defpackage.dqjg) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            dqjg r0 = new dqjg
            r0.<init>(r9, r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.c
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.e
            r7 = 2
            r2 = 1
            r8 = 0
            if (r1 == 0) goto L48
            if (r1 == r2) goto L3c
            if (r1 != r7) goto L34
            int r10 = r6.b
            fgjf r11 = r6.g
            java.lang.Object r12 = r6.a
            dqji r13 = r6.f
            defpackage.ffci.b(r14)
            goto L84
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            int r10 = r6.b
            java.lang.Object r11 = r6.a
            dqji r12 = r6.f
            defpackage.ffci.b(r14)
            r13 = r10
            r10 = r11
            goto L67
        L48:
            defpackage.ffci.b(r14)
            java.util.Map r14 = r9.f
            if (r14 != 0) goto L6a
            r14 = r2
            ffel r2 = defpackage.ffel.a
            r6.f = r9
            r6.a = r10
            r6.b = r13
            r6.e = r14
            r1 = r9
            r4 = r11
            r3 = r12
            r5 = r13
            java.lang.Object r11 = r1.b(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L65
            goto L81
        L65:
            r12 = r9
            r13 = r5
        L67:
            r5 = r13
            r13 = r12
            goto L6c
        L6a:
            r5 = r13
            r13 = r9
        L6c:
            fgjb r11 = r13.e
            r6.f = r13
            r6.a = r10
            r12 = r11
            fgjf r12 = (defpackage.fgjf) r12
            r6.g = r12
            r6.b = r5
            r6.e = r7
            java.lang.Object r12 = r11.a(r8, r6)
            if (r12 != r0) goto L82
        L81:
            return r0
        L82:
            r12 = r10
            r10 = r5
        L84:
            java.util.Map r14 = r13.f     // Catch: java.lang.Throwable -> La1
            java.lang.String r0 = "scores"
            if (r14 != 0) goto L8e
            defpackage.ffkj.c(r0)     // Catch: java.lang.Throwable -> La1
            r14 = r8
        L8e:
            r14.remove(r12)     // Catch: java.lang.Throwable -> La1
            java.util.Map r12 = r13.f     // Catch: java.lang.Throwable -> La1
            if (r12 != 0) goto L99
            defpackage.ffkj.c(r0)     // Catch: java.lang.Throwable -> La1
            r12 = r8
        L99:
            ffnl r10 = r13.e(r12, r10)     // Catch: java.lang.Throwable -> La1
            r11.b(r8)
            return r10
        La1:
            r0 = move-exception
            r10 = r0
            r11.b(r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqji.c(java.lang.Object, dqgm, j$.time.Instant, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0090 A[Catch: all -> 0x00bb, TRY_ENTER, TryCatch #0 {all -> 0x00bb, blocks: (B:12:0x0084, B:15:0x0090, B:16:0x0094, B:18:0x009a, B:19:0x00a4, B:21:0x00af, B:22:0x00b3), top: B:11:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a A[Catch: all -> 0x00bb, TryCatch #0 {all -> 0x00bb, blocks: (B:12:0x0084, B:15:0x0090, B:16:0x0094, B:18:0x009a, B:19:0x00a4, B:21:0x00af, B:22:0x00b3), top: B:11:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af A[Catch: all -> 0x00bb, TryCatch #0 {all -> 0x00bb, blocks: (B:12:0x0084, B:15:0x0090, B:16:0x0094, B:18:0x009a, B:19:0x00a4, B:21:0x00af, B:22:0x00b3), top: B:11:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.dqkb r9, j$.time.Instant r10, defpackage.dqgm r11, int r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqji.d(dqkb, j$.time.Instant, dqgm, int, ffgu):java.lang.Object");
    }

    public final ffnl e(final Map map, final int i) {
        return (ffnl) this.c.e("FrecencyProcessor#topEntityFrecencies", new ffix() { // from class: dqjb
            @Override // defpackage.ffix
            public final Object invoke() {
                int i2 = i;
                return i2 == 0 ? ffne.a : ffno.k(new ffob(new ffng(ffdx.as(map.values()), true, new ffji() { // from class: dqjd
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        dqja dqjaVar = (dqja) obj;
                        dqjaVar.getClass();
                        return Boolean.valueOf(dqjaVar.b > eobe.a);
                    }
                }), new dqjf()), i2);
            }
        });
    }
}
