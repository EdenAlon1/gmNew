package defpackage;

import java.util.HashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xuw {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentState");
    public final ffhd b;
    public final ffsk c;
    public final ydb d;
    public final yan e;
    public final xzv f;
    public final asnv g;
    public final atcf h;
    public final ffbr i;
    public final fgdj j;
    private final HashMap k;
    private final fgjb l;
    private Set m;
    private final fgjb n;

    public xuw(ffhd ffhdVar, ffsk ffskVar, ydb ydbVar, yan yanVar, xzv xzvVar, asnv asnvVar, atcf atcfVar, ffbr ffbrVar) {
        ffhdVar.getClass();
        ffskVar.getClass();
        ydbVar.getClass();
        xzvVar.getClass();
        asnvVar.getClass();
        this.b = ffhdVar;
        this.c = ffskVar;
        this.d = ydbVar;
        this.e = yanVar;
        this.f = xzvVar;
        this.g = asnvVar;
        this.h = atcfVar;
        this.i = ffbrVar;
        this.j = axqw.c(ydbVar.a, ffskVar, new ffji() { // from class: xul
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                xhu xhuVar = (xhu) obj;
                xhuVar.getClass();
                return xhuVar.b;
            }
        });
        this.k = new HashMap();
        this.l = new fgjf();
        this.m = ffen.a;
        this.n = new fgjf();
        axol.k(ffskVar, ffhdVar, new xuo(this, null), 2);
    }

    private final ffud e(xhm xhmVar, int i) {
        return axol.k(this.c, this.b, new xut(xhmVar, this, i, null), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a4, code lost:
    
        if (r2.c(r10, r0) != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (d(r10, r0) == r1) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.xup
            if (r0 == 0) goto L13
            r0 = r11
            xup r0 = (defpackage.xup) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            xup r0 = new xup
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            goto L3a
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            java.lang.Object r10 = r0.a
            xuw r2 = r0.e
            defpackage.ffci.b(r11)
            goto L99
        L3a:
            defpackage.ffci.b(r11)
            goto La7
        L3e:
            defpackage.ffci.b(r11)
            atcf r11 = r9.h
            boolean r11 = r11.a()
            if (r11 != 0) goto L52
            r0.d = r5
            java.lang.Object r10 = r9.d(r10, r0)
            if (r10 != r1) goto La7
            goto Laa
        L52:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r5 = r10.size()
            r6 = 0
        L61:
            if (r6 >= r5) goto L8b
            java.lang.Object r7 = r10.get(r6)
            xhp r7 = (defpackage.xhp) r7
            boolean r8 = r7 instanceof defpackage.xhm
            if (r8 == 0) goto L76
            ffes r8 = new ffes
            r8.<init>(r6, r7)
            r11.add(r8)
            goto L82
        L76:
            boolean r8 = r7 instanceof defpackage.xho
            if (r8 == 0) goto L85
            ffes r8 = new ffes
            r8.<init>(r6, r7)
            r2.add(r8)
        L82:
            int r6 = r6 + 1
            goto L61
        L85:
            ffcd r10 = new ffcd
            r10.<init>()
            throw r10
        L8b:
            r0.e = r9
            r0.a = r2
            r0.d = r4
            java.lang.Object r10 = r9.b(r11, r0)
            if (r10 == r1) goto Laa
            r10 = r2
            r2 = r9
        L99:
            r11 = 0
            r0.e = r11
            r0.a = r11
            r0.d = r3
            java.lang.Object r10 = r2.c(r10, r0)
            if (r10 != r1) goto La7
            goto Laa
        La7:
            ffcu r10 = defpackage.ffcu.a
            return r10
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xuw.a(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[Catch: all -> 0x011c, TryCatch #0 {all -> 0x011c, blocks: (B:11:0x004f, B:12:0x0065, B:14:0x006b, B:17:0x0079, B:22:0x007d, B:23:0x0081, B:26:0x008f, B:28:0x00ba, B:30:0x00c0, B:32:0x00d6, B:36:0x00dd, B:37:0x00e1, B:39:0x00e7, B:41:0x0116), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f A[Catch: all -> 0x011c, TRY_ENTER, TryCatch #0 {all -> 0x011c, blocks: (B:11:0x004f, B:12:0x0065, B:14:0x006b, B:17:0x0079, B:22:0x007d, B:23:0x0081, B:26:0x008f, B:28:0x00ba, B:30:0x00c0, B:32:0x00d6, B:36:0x00dd, B:37:0x00e1, B:39:0x00e7, B:41:0x0116), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7 A[Catch: all -> 0x011c, LOOP:2: B:37:0x00e1->B:39:0x00e7, LOOP_END, TryCatch #0 {all -> 0x011c, blocks: (B:11:0x004f, B:12:0x0065, B:14:0x006b, B:17:0x0079, B:22:0x007d, B:23:0x0081, B:26:0x008f, B:28:0x00ba, B:30:0x00c0, B:32:0x00d6, B:36:0x00dd, B:37:0x00e1, B:39:0x00e7, B:41:0x0116), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xuw.b(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e A[Catch: all -> 0x00e3, TryCatch #0 {all -> 0x00e3, blocks: (B:11:0x004f, B:12:0x0058, B:14:0x005e, B:17:0x006e, B:22:0x0072, B:23:0x0076, B:25:0x007c, B:27:0x00b4, B:28:0x00c3, B:30:0x00c9, B:32:0x00d7), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[Catch: all -> 0x00e3, LOOP:1: B:23:0x0076->B:25:0x007c, LOOP_END, TryCatch #0 {all -> 0x00e3, blocks: (B:11:0x004f, B:12:0x0058, B:14:0x005e, B:17:0x006e, B:22:0x0072, B:23:0x0076, B:25:0x007c, B:27:0x00b4, B:28:0x00c3, B:30:0x00c9, B:32:0x00d7), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9 A[Catch: all -> 0x00e3, LOOP:2: B:28:0x00c3->B:30:0x00c9, LOOP_END, TryCatch #0 {all -> 0x00e3, blocks: (B:11:0x004f, B:12:0x0058, B:14:0x005e, B:17:0x006e, B:22:0x0072, B:23:0x0076, B:25:0x007c, B:27:0x00b4, B:28:0x00c3, B:30:0x00c9, B:32:0x00d7), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xuw.c(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068 A[Catch: all -> 0x0123, TryCatch #0 {all -> 0x0123, blocks: (B:11:0x004f, B:13:0x0068, B:17:0x0081, B:18:0x0073, B:20:0x0079, B:24:0x0084, B:25:0x0088, B:28:0x0096, B:30:0x00c1, B:32:0x00c7, B:34:0x00dd, B:38:0x00e4, B:39:0x00e8, B:41:0x00ee, B:43:0x011d), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[Catch: all -> 0x0123, TRY_ENTER, TryCatch #0 {all -> 0x0123, blocks: (B:11:0x004f, B:13:0x0068, B:17:0x0081, B:18:0x0073, B:20:0x0079, B:24:0x0084, B:25:0x0088, B:28:0x0096, B:30:0x00c1, B:32:0x00c7, B:34:0x00dd, B:38:0x00e4, B:39:0x00e8, B:41:0x00ee, B:43:0x011d), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee A[Catch: all -> 0x0123, LOOP:2: B:39:0x00e8->B:41:0x00ee, LOOP_END, TryCatch #0 {all -> 0x0123, blocks: (B:11:0x004f, B:13:0x0068, B:17:0x0081, B:18:0x0073, B:20:0x0079, B:24:0x0084, B:25:0x0088, B:28:0x0096, B:30:0x00c1, B:32:0x00c7, B:34:0x00dd, B:38:0x00e4, B:39:0x00e8, B:41:0x00ee, B:43:0x011d), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @defpackage.ffbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xuw.d(java.util.List, ffgu):java.lang.Object");
    }
}
