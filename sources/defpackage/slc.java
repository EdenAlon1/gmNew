package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class slc extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ffwm c;
    final /* synthetic */ ffxe d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slc(ffwm ffwmVar, ffxe ffxeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ffwmVar;
        this.d = ffxeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((slc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r10 != r0) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036 A[Catch: all -> 0x0081, Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:7:0x000e, B:8:0x0024, B:10:0x002e, B:12:0x0036, B:14:0x0040, B:17:0x004f, B:19:0x0053, B:22:0x007b, B:23:0x0080, B:31:0x0017, B:33:0x001e), top: B:2:0x0006, outer: #0 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:8:0x0024). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0078 -> B:8:0x0024). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L15
            if (r1 == r2) goto L12
            java.lang.Object r1 = r9.a
        Le:
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            goto L24
        L12:
            java.lang.Object r1 = r9.a
            goto Le
        L15:
            java.lang.Object r1 = r9.a
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            goto L2e
        L1b:
            defpackage.ffci.b(r10)
            ffwm r10 = r9.c     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            ffwo r1 = r10.r()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
        L24:
            r9.a = r1     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r9.b = r3     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            java.lang.Object r10 = r1.a(r9)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            if (r10 == r0) goto L85
        L2e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            if (r10 == 0) goto L8b
            java.lang.Object r10 = r1.b()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            skw r10 = (defpackage.skw) r10     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            boolean r4 = r10 instanceof defpackage.sku     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            if (r4 == 0) goto L4f
            ffxe r10 = r9.d     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            skq r4 = defpackage.skq.a     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r9.a = r1     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r9.b = r2     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            java.lang.Object r10 = r10.a(r4, r9)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            if (r10 != r0) goto L24
            goto L85
        L4f:
            boolean r4 = r10 instanceof defpackage.skv     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            if (r4 == 0) goto L7b
            ffxe r4 = r9.d     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            skr r5 = new skr     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            skv r10 = (defpackage.skv) r10     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            android.os.Bundle r10 = r10.a     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            java.lang.String r6 = "soda_event"
            fark r7 = defpackage.fark.a     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            eyfc r8 = defpackage.eyfc.a()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            eyhs r10 = com.google.protobuf.contrib.android.ProtoParsers.d(r10, r6, r7, r8)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r10.getClass()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            fark r10 = (defpackage.fark) r10     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r9.a = r1     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r10 = 3
            r9.b = r10     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            java.lang.Object r10 = r4.a(r5, r9)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            if (r10 != r0) goto L24
            goto L85
        L7b:
            ffcd r10 = new ffcd     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r10.<init>()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            throw r10     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
        L81:
            r10 = move-exception
            goto L93
        L83:
            r10 = move-exception
            goto L86
        L85:
            return r0
        L86:
            ffxe r0 = r9.d     // Catch: java.lang.Throwable -> L81
            r0.e(r10)     // Catch: java.lang.Throwable -> L81
        L8b:
            ffxe r10 = r9.d
            defpackage.ffxh.a(r10)
            ffcu r10 = defpackage.ffcu.a
            return r10
        L93:
            ffxe r0 = r9.d
            defpackage.ffxh.a(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.slc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new slc(this.c, this.d, ffguVar);
    }
}
