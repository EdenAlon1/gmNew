package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpcz implements dpdc {
    public static final enru a = enru.c("com/google/android/libraries/compose/audio/processor/AudioLevelProcessor");
    public final dpda b;
    public final fgcl c;
    public final fgcq d;
    private final ffsk e;
    private ffud f;

    public dpcz(ffsk ffskVar, dpda dpdaVar) {
        ffskVar.getClass();
        this.e = ffskVar;
        this.b = dpdaVar;
        fgcl e = fgcu.e(0, 0, 0, 7);
        this.c = e;
        this.d = new fgcn(e);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.dpcs
            if (r0 == 0) goto L13
            r0 = r11
            dpcs r0 = (defpackage.dpcs) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dpcs r0 = new dpcs
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r0 = r0.a
            defpackage.ffci.b(r11)
            return r0
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L31:
            defpackage.ffci.b(r11)
            ffrq r6 = new ffrq
            r6.<init>()
            dpda r11 = r10.b
            int r2 = r11.b
            int r4 = r11.c
            int r2 = r2 * r4
            long r4 = (long) r2
            j$.time.Duration r11 = r11.d
            long r7 = r11.toMillis()
            long r4 = r4 * r7
            j$.time.Duration r11 = defpackage.ernk.g(r3)
            long r7 = r11.toMillis()
            long r7 = r4 / r7
            enru r11 = defpackage.dpcz.a
            ensk r11 = r11.h()
            java.lang.String r2 = "launchInputCoroutine"
            r4 = 65
            java.lang.String r5 = "com/google/android/libraries/compose/audio/processor/AudioLevelProcessor"
            java.lang.String r9 = "AudioLevelProcessor.kt"
            ensk r11 = r11.h(r5, r2, r4, r9)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r2 = "Starting audio level processing with polling window of: %d"
            r11.s(r2, r7)
            ffsk r11 = r10.e
            dpcx r4 = new dpcx
            r9 = 0
            r5 = r10
            r4.<init>(r5, r6, r7, r9)
            r2 = 3
            r5 = 0
            ffud r11 = defpackage.ffqy.d(r11, r5, r5, r4, r2)
            r0.a = r11
            r0.d = r3
            java.lang.Object r0 = r6.B(r0)
            if (r0 != r1) goto L85
            return r1
        L85:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpcz.a(ffgu):java.lang.Object");
    }

    @Override // defpackage.dpdc
    public final Object b(ffgu ffguVar) {
        return ffcu.a;
    }

    @Override // defpackage.dpdc
    public final Object c(ffgu ffguVar) {
        ffud ffudVar = this.f;
        if (ffudVar != null) {
            ffudVar.t(new CancellationException("AudioLevelProcessor released."));
        }
        this.f = null;
        return ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.dpdc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dpcy
            if (r0 == 0) goto L13
            r0 = r5
            dpcy r0 = (defpackage.dpcy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dpcy r0 = new dpcy
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dpcz r0 = r0.d
            defpackage.ffci.b(r5)
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            r0 = r4
        L40:
            ffud r5 = (defpackage.ffud) r5
            r0.f = r5
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpcz.d(ffgu):java.lang.Object");
    }
}
