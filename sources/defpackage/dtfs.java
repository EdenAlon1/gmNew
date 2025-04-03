package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtfs {
    private static final enru d = enru.c("com/google/android/libraries/compose/voice/recorder/VoiceRecorder");
    public final dtfh a;
    public dpea b;
    public Uri c;
    private final ffsk e;
    private final ffsk f;
    private final dtfv g;
    private final Optional h;
    private ffud i;
    private final aklc j;

    public dtfs(ffsk ffskVar, ffsk ffskVar2, dtfv dtfvVar, aklc aklcVar, Optional optional, dtfh dtfhVar) {
        ffskVar.getClass();
        ffskVar2.getClass();
        dtfvVar.getClass();
        aklcVar.getClass();
        this.e = ffskVar;
        this.f = ffskVar2;
        this.g = dtfvVar;
        this.j = aklcVar;
        this.h = optional;
        this.a = dtfhVar;
    }

    private final dtft g() {
        return this.g.b;
    }

    public final drqm a() {
        return this.g.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x03e4, code lost:
    
        if (r4.a(r2) == r3) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x038b A[Catch: Exception -> 0x03b3, TryCatch #2 {Exception -> 0x03b3, blocks: (B:59:0x039c, B:51:0x0360, B:53:0x038b, B:54:0x038f, B:56:0x0397), top: B:50:0x0360 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0397 A[Catch: Exception -> 0x03b3, TryCatch #2 {Exception -> 0x03b3, blocks: (B:59:0x039c, B:51:0x0360, B:53:0x038b, B:54:0x038f, B:56:0x0397), top: B:50:0x0360 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [dpea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [dpea, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffjm r47, defpackage.ffjm r48, defpackage.ffjn r49, defpackage.ffgu r50) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtfs.b(ffjm, ffjm, ffjn, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dtfm
            if (r0 == 0) goto L13
            r0 = r5
            dtfm r0 = (defpackage.dtfm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dtfm r0 = new dtfm
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dtfs r0 = r0.d
            defpackage.ffci.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r4.e(r0)
            if (r5 == r1) goto L79
            r0 = r4
        L3f:
            dtfv r5 = r0.g
            j$.time.Duration r5 = r5.f
            j$.time.Duration r1 = j$.time.Duration.ZERO
            int r1 = r5.compareTo(r1)
            if (r1 > 0) goto L67
            enru r5 = defpackage.dtfs.d
            ensk r5 = r5.h()
            java.lang.String r0 = "startTrackingAudioLevel"
            r1 = 137(0x89, float:1.92E-43)
            java.lang.String r2 = "com/google/android/libraries/compose/voice/recorder/VoiceRecorder"
            java.lang.String r3 = "VoiceRecorder.kt"
            ensk r5 = r5.h(r2, r0, r1, r3)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r0 = "Audio level polling is disabled by override."
            r5.q(r0)
            ffcu r5 = defpackage.ffcu.a
            return r5
        L67:
            ffsk r1 = r0.f
            dtfn r2 = new dtfn
            r3 = 0
            r2.<init>(r0, r5, r3)
            r5 = 3
            ffud r5 = defpackage.ffqy.d(r1, r3, r3, r2, r5)
            r0.i = r5
            ffcu r5 = defpackage.ffcu.a
            return r5
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtfs.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(1:(1:(2:14|15)(3:17|18|19))(3:20|21|22))(3:23|24|25))(10:26|27|28|29|30|31|(1:33)(2:38|39)|34|(3:36|24|25)|37))(1:53))(3:67|(1:69)|37)|54|(4:58|59|(6:61|30|31|(0)(0)|34|(0))|37)(2:56|57)))|71|6|7|(0)(0)|54|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d7, code lost:
    
        r14 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3 A[Catch: all -> 0x00d7, Exception -> 0x00d9, TryCatch #2 {Exception -> 0x00d9, blocks: (B:31:0x009b, B:33:0x00a3, B:38:0x00a6), top: B:30:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6 A[Catch: all -> 0x00d7, Exception -> 0x00d9, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d9, blocks: (B:31:0x009b, B:33:0x00a3, B:38:0x00a6), top: B:30:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [dtfs] */
    /* JADX WARN: Type inference failed for: r2v5, types: [dtfs] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtfs.d(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dtfr
            if (r0 == 0) goto L13
            r0 = r5
            dtfr r0 = (defpackage.dtfr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dtfr r0 = new dtfr
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dtfs r0 = r0.d
            defpackage.ffci.b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            ffud r5 = r4.i
            if (r5 == 0) goto L57
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = defpackage.ffui.a(r5, r0)
            if (r5 == r1) goto L56
            r0 = r4
        L43:
            r5 = 0
            r0.i = r5
            dtfh r5 = r0.a
            fgcl r0 = r5.a
            java.util.List r0 = r0.d()
            r5.b = r0
            fgcl r5 = r5.a
            r5.e()
            goto L57
        L56:
            return r1
        L57:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtfs.e(ffgu):java.lang.Object");
    }

    public final boolean f() {
        return this.b != null;
    }
}
