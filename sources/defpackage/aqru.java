package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqru implements aqrf {
    public final Context b;
    public final ffsk c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final emar h;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final dtuu m;
    private static final aqrh i = new aqrh();
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/RecipientRepositoryProfileUpdateExtensionImpl");

    public aqru(Context context, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, dtuu dtuuVar) {
        context.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        dtuuVar.getClass();
        this.b = context;
        this.c = ffskVar;
        this.d = ffbrVar;
        this.j = ffbrVar2;
        this.k = ffbrVar3;
        this.l = ffbrVar4;
        this.e = ffbrVar5;
        this.f = ffbrVar6;
        this.g = ffbrVar7;
        this.m = dtuuVar;
        this.h = new emar();
    }

    @Override // defpackage.aqrf
    public final elfl a(eisx eisxVar, aqkp aqkpVar, aqkv aqkvVar) {
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        return axol.a(ffra.b(this.c, ekxi.a(ffheVar), ffsmVar, new aqri(null, aqkpVar, eisxVar, aqkvVar)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        if (r0 != r2) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.aqkp r15, defpackage.aqjx r16, defpackage.ffgu r17) {
        /*
            r14 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.aqrk
            if (r1 == 0) goto L15
            r1 = r0
            aqrk r1 = (defpackage.aqrk) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e = r2
            goto L1a
        L15:
            aqrk r1 = new aqrk
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.c
            ffhh r2 = defpackage.ffhh.a
            int r3 = r1.e
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L4c
            if (r3 == r5) goto L3d
            if (r3 != r4) goto L35
            java.lang.Object r15 = r1.b
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            java.lang.Object r1 = r1.a
            aqjx r1 = (defpackage.aqjx) r1
            defpackage.ffci.b(r0)
            goto Lc4
        L35:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L3d:
            java.lang.Object r15 = r1.b
            aqjx r15 = (defpackage.aqjx) r15
            java.lang.Object r3 = r1.a
            aqkp r3 = (defpackage.aqkp) r3
            defpackage.ffci.b(r0)
            r13 = r3
            r3 = r15
            r15 = r13
            goto La3
        L4c:
            defpackage.ffci.b(r0)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r0 = r16.b()
            aqkv r10 = r0.F()
            aqkh r11 = r16.a()
            r0 = r15
            aqjw r0 = (defpackage.aqjw) r0
            j$.util.Optional r3 = r0.j
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L70
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            elfl r0 = defpackage.elfo.e(r0)
            goto L92
        L70:
            j$.util.Optional r0 = r0.j
            java.lang.Object r0 = r0.get()
            r8 = r0
            aqru r8 = (defpackage.aqru) r8
            ffsk r0 = r8.c
            ffhe r3 = defpackage.ffhe.a
            ffsm r12 = defpackage.ffsm.a
            ffhd r3 = defpackage.ekxi.a(r3)
            aqrt r6 = new aqrt
            r7 = 0
            r9 = r15
            r6.<init>(r7, r8, r9, r10, r11)
            ffss r0 = defpackage.ffra.b(r0, r3, r12, r6)
            elfl r0 = defpackage.axol.a(r0)
        L92:
            r0.getClass()
            r1.a = r15
            r3 = r16
            r1.b = r3
            r1.e = r5
            java.lang.Object r0 = defpackage.fgfz.c(r0, r1)
            if (r0 == r2) goto Ld9
        La3:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            aqkv r5 = r3.c()
            cjvu r6 = r3.g()
            elfl r15 = r15.B(r5, r6)
            r15.getClass()
            r1.a = r3
            r1.b = r0
            r1.e = r4
            java.lang.Object r15 = defpackage.fgfz.c(r15, r1)
            if (r15 == r2) goto Ld9
            r1 = r0
            r0 = r15
            r15 = r1
            r1 = r3
        Lc4:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto Ld7
            boolean r15 = r0.booleanValue()
            if (r15 == 0) goto Ld7
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r15 = r1.b()
            return r15
        Ld7:
            r15 = 0
            return r15
        Ld9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqru.b(aqkp, aqjx, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091 A[Catch: all -> 0x003e, TryCatch #1 {all -> 0x003e, blocks: (B:11:0x0033, B:13:0x00bd, B:14:0x008b, B:16:0x0091, B:21:0x00cf, B:22:0x00df, B:24:0x00e5, B:26:0x00f5, B:29:0x00fe, B:35:0x0102), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cf A[Catch: all -> 0x003e, TryCatch #1 {all -> 0x003e, blocks: (B:11:0x0033, B:13:0x00bd, B:14:0x008b, B:16:0x0091, B:21:0x00cf, B:22:0x00df, B:24:0x00e5, B:26:0x00f5, B:29:0x00fe, B:35:0x0102), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00b6 -> B:13:0x00bd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.aqkp r11, java.util.List r12, boolean r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqru.c(aqkp, java.util.List, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.aqkp r17, defpackage.alyr r18, defpackage.engw r19, boolean r20, defpackage.ffgu r21) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqru.d(aqkp, alyr, engw, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.aqkp r6, defpackage.aqkv r7, final defpackage.aqkh r8, defpackage.ffgu r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.aqrj
            if (r0 == 0) goto L13
            r0 = r9
            aqrj r0 = (defpackage.aqrj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aqrj r0 = new aqrj
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            cjvk r8 = r0.e
            aqru r6 = r0.d
            defpackage.ffci.b(r9)
            goto L6f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.ffci.b(r9)
            java.lang.String r9 = "getRecipientById"
            ekzz r9 = defpackage.eleg.f(r9)
            engw r7 = defpackage.engw.r(r7)     // Catch: java.lang.Throwable -> L8a
            bvvl r7 = defpackage.aqjw.j(r7)     // Catch: java.lang.Throwable -> L8a
            elfl r7 = r7.w()     // Catch: java.lang.Throwable -> L8a
            aqit r2 = new aqit     // Catch: java.lang.Throwable -> L8a
            r4 = r6
            aqjw r4 = (defpackage.aqjw) r4     // Catch: java.lang.Throwable -> L8a
            r2.<init>()     // Catch: java.lang.Throwable -> L8a
            aqjw r6 = (defpackage.aqjw) r6     // Catch: java.lang.Throwable -> L8a
            errl r6 = r6.c     // Catch: java.lang.Throwable -> L8a
            elfl r6 = r7.h(r2, r6)     // Catch: java.lang.Throwable -> L8a
            r9.b(r6)     // Catch: java.lang.Throwable -> L8a
            r9.close()
            r0.d = r5
            r7 = r8
            cjvk r7 = (defpackage.cjvk) r7
            r0.e = r7
            r0.c = r3
            java.lang.Object r9 = defpackage.fgfz.c(r6, r0)
            if (r9 != r1) goto L6e
            return r1
        L6e:
            r6 = r5
        L6f:
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r9 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r9
            if (r9 != 0) goto L79
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L79:
            dtuu r7 = r6.m
            aqrg r0 = new aqrg
            r0.<init>()
            java.lang.String r6 = "internalUpdateUntrustedDisplayNameAndMetaDataV2"
            java.lang.Object r6 = r7.c(r6, r0)
            r6.getClass()
            return r6
        L8a:
            r6 = move-exception
            r9.close()     // Catch: java.lang.Throwable -> L8f
            goto L93
        L8f:
            r7 = move-exception
            r6.addSuppressed(r7)
        L93:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqru.e(aqkp, aqkv, aqkh, ffgu):java.lang.Object");
    }
}
