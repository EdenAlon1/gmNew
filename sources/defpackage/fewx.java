package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fewx extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ AtomicBoolean c;
    final /* synthetic */ fecu d;
    final /* synthetic */ ffwm e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fewx(AtomicBoolean atomicBoolean, fecu fecuVar, ffwm ffwmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = atomicBoolean;
        this.d = fecuVar;
        this.e = ffwmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fewx) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[Catch: Exception -> 0x0068, TryCatch #0 {Exception -> 0x0068, blocks: (B:6:0x000f, B:8:0x0062, B:9:0x0039, B:12:0x0048, B:14:0x0050, B:23:0x001a, B:27:0x0033), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005f -> B:7:0x0012). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.b
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 == r2) goto L14
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.f
            ffxy r3 = (defpackage.ffxy) r3
            defpackage.ffci.b(r7)     // Catch: java.lang.Exception -> L68
        L12:
            r7 = r3
            goto L62
        L14:
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.f
            ffxy r3 = (defpackage.ffxy) r3
            defpackage.ffci.b(r7)     // Catch: java.lang.Exception -> L68
            goto L48
        L1e:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.f
            ffxy r7 = (defpackage.ffxy) r7
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.c
            r3 = 0
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L7f
            fecu r1 = r6.d
            r1.g(r2)
            ffwm r1 = r6.e     // Catch: java.lang.Exception -> L68
            ffwo r1 = r1.r()     // Catch: java.lang.Exception -> L68
        L39:
            r6.f = r7     // Catch: java.lang.Exception -> L68
            r6.a = r1     // Catch: java.lang.Exception -> L68
            r6.b = r2     // Catch: java.lang.Exception -> L68
            java.lang.Object r3 = r1.a(r6)     // Catch: java.lang.Exception -> L68
            if (r3 == r0) goto L6d
            r5 = r3
            r3 = r7
            r7 = r5
        L48:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L68
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Exception -> L68
            if (r7 == 0) goto L6a
            java.lang.Object r7 = r1.b()     // Catch: java.lang.Exception -> L68
            r6.f = r3     // Catch: java.lang.Exception -> L68
            r6.a = r1     // Catch: java.lang.Exception -> L68
            r4 = 2
            r6.b = r4     // Catch: java.lang.Exception -> L68
            java.lang.Object r7 = r3.fQ(r7, r6)     // Catch: java.lang.Exception -> L68
            if (r7 != r0) goto L12
            goto L6d
        L62:
            fecu r3 = r6.d     // Catch: java.lang.Exception -> L68
            r3.g(r2)     // Catch: java.lang.Exception -> L68
            goto L39
        L68:
            r7 = move-exception
            goto L6e
        L6a:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L6d:
            return r0
        L6e:
            ffwm r0 = r6.e
            java.lang.String r1 = "Exception thrown while collecting requests"
            java.util.concurrent.CancellationException r1 = defpackage.fftq.a(r1, r7)
            r0.t(r1)
            fecu r0 = r6.d
            r0.g(r2)
            throw r7
        L7f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "requests flow can only be collected once"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fewx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fewx fewxVar = new fewx(this.c, this.d, this.e, ffguVar);
        fewxVar.f = obj;
        return fewxVar;
    }
}
