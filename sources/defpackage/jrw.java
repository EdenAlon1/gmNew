package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrw implements hkx {
    public final jtd a;
    public boolean b = true;
    private final List c;
    private final jtp d;
    private final jsa e;
    private final ffji f;
    private final hho g;

    public jrw(List list, Object obj, jtp jtpVar, jsa jsaVar, ffji ffjiVar, jtd jtdVar) {
        this.c = list;
        this.d = jtpVar;
        this.e = jsaVar;
        this.f = ffjiVar;
        this.a = jtdVar;
        this.g = new hic(obj, hla.a);
    }

    @Override // defpackage.hkx
    public final Object a() {
        return this.g.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[Catch: all -> 0x0035, TRY_ENTER, TryCatch #2 {all -> 0x0035, blocks: (B:12:0x0030, B:15:0x0063, B:17:0x0073), top: B:11:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095 A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x0095, B:30:0x00c1, B:42:0x004a), top: B:41:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1 A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x0095, B:30:0x00c1, B:42:0x004a), top: B:41:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0071 -> B:13:0x00d6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d3 -> B:13:0x00d6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrw.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.jsd r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.jru
            if (r0 == 0) goto L13
            r0 = r7
            jru r0 = (defpackage.jru) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jru r0 = new jru
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.a
            defpackage.ffci.b(r7)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            return r7
        L2a:
            r7 = move-exception
            goto L4a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.ffci.b(r7)
            jrv r7 = new jrv     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            r7.<init>(r5, r6, r4)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            r0.a = r6     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            r0.d = r3     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r6 = defpackage.ffvm.c(r2, r7, r0)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            if (r6 != r1) goto L49
            return r1
        L49:
            return r6
        L4a:
            ffhd r1 = r0.u()
            ffse r2 = kotlinx.coroutines.CoroutineExceptionHandler.c
            ffha r1 = r1.get(r2)
            kotlinx.coroutines.CoroutineExceptionHandler r1 = (kotlinx.coroutines.CoroutineExceptionHandler) r1
            if (r1 != 0) goto L59
            goto L7e
        L59:
            ffhd r0 = r0.u()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.util.Objects.toString(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r3 = "Unable to load font "
            java.lang.String r6 = r3.concat(r6)
            r2.<init>(r6, r7)
            r1.handleException(r0, r2)
            return r4
        L73:
            r6 = move-exception
            ffhd r7 = r0.u()
            boolean r7 = defpackage.ffui.h(r7)
            if (r7 == 0) goto L7f
        L7e:
            return r4
        L7f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrw.c(jsd, ffgu):java.lang.Object");
    }
}
