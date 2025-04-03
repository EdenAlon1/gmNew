package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emdw implements emdd {
    public final Context a;
    public final ffbr b;
    public final ffbr c;
    public final enru d;
    public final AtomicReference e;
    private final ffbr f;
    private final ffsk g;
    private final ffbr h;
    private final Set i;
    private final ffbz j;
    private final ffbz k;

    public emdw(Context context, ffbr ffbrVar, ffsk ffskVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        context.getClass();
        ffskVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.a = context;
        this.f = ffbrVar;
        this.g = ffskVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.h = ffbrVar4;
        this.d = enru.c("com/google/chat/smartmessaging/penpal/server/v3/PenpalOnDeviceClientImpl");
        this.i = new LinkedHashSet();
        this.j = ffca.a(new ffix() { // from class: emde
            @Override // defpackage.ffix
            public final Object invoke() {
                Context context2;
                ExecutorService executorService;
                Executor executor;
                emdw emdwVar = emdw.this;
                sar sarVar = new sar();
                sarVar.a = emdwVar.a;
                sarVar.b(sam.a);
                ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                if (newCachedThreadPool == null) {
                    throw new NullPointerException("Null workerExecutor");
                }
                sarVar.b = newCachedThreadPool;
                sarVar.a();
                sarVar.b((Executor) emdwVar.b.b());
                sarVar.a();
                if (sarVar.e == 1 && (context2 = sarVar.a) != null && (executorService = sarVar.b) != null && (executor = sarVar.c) != null) {
                    return emcw.a(new sas(context2, executorService, executor, sarVar.d));
                }
                StringBuilder sb = new StringBuilder();
                if (sarVar.a == null) {
                    sb.append(" context");
                }
                if (sarVar.b == null) {
                    sb.append(" workerExecutor");
                }
                if (sarVar.c == null) {
                    sb.append(" callbackExecutor");
                }
                if (sarVar.e == 0) {
                    sb.append(" bindImportantEnabled");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
        });
        Object b = ffbrVar4.b();
        b.getClass();
        this.e = new AtomicReference(new emdj((ernh) b));
        this.k = ffca.a(new ffix() { // from class: emdf
            @Override // defpackage.ffix
            public final Object invoke() {
                String[] stringArray = emdw.this.a.getResources().getStringArray(R.array.suggested_text_starters);
                stringArray.getClass();
                return ffdo.L(stringArray);
            }
        });
    }

    static /* synthetic */ Object o(emdw emdwVar, int i, ffgu ffguVar) {
        return emdwVar.q(i, null, ffguVar);
    }

    private final Object q(int i, Integer num, ffgu ffguVar) {
        return num != null ? fgfz.c(j().b(i, num.intValue()), ffguVar) : fgfz.c(j().a(i), ffguVar);
    }

    private final List r() {
        return ffdx.ai(ffdx.c((List) this.k.a()), 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(saq saqVar, boolean z) {
        emdj emdjVar = (emdj) this.e.get();
        if (emdjVar.c()) {
            emdjVar.b();
        } else if (z) {
            return;
        }
        ffqy.d(this.g, null, null, new emdt(this, saqVar, null), 3);
    }

    private static final scv t(String str, esgx esgxVar) {
        String str2;
        scp scpVar = new scp();
        if (str == null) {
            throw new NullPointerException("Null message");
        }
        scpVar.a = str;
        int i = 0;
        scpVar.a(0);
        switch (esgxVar) {
            case TONE_UNSPECIFIED:
                break;
            case TONE_FORMAL:
                i = 1;
                break;
            case TONE_CONCISE:
                i = 2;
                break;
            case TONE_SHAKESPEARE:
                i = 3;
                break;
            case TONE_CHILL:
                i = 4;
                break;
            case TONE_REPHRASE:
                i = 5;
                break;
            case TONE_RHYMES:
                i = 6;
                break;
            case TONE_EXCITED:
                i = 7;
                break;
            case UNRECOGNIZED:
                throw new IllegalArgumentException("Unrecognized style");
            default:
                throw new ffcd();
        }
        scpVar.a(i);
        if (scpVar.c == 1 && (str2 = scpVar.a) != null) {
            return new scq(str2, scpVar.b);
        }
        StringBuilder sb = new StringBuilder();
        if (scpVar.a == null) {
            sb.append(" message");
        }
        if (scpVar.c == 0) {
            sb.append(" tone");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    private static final sdh u(fbup fbupVar) {
        eygr<fbun> eygrVar = fbupVar.b;
        eygrVar.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(eygrVar, 10));
        for (fbun fbunVar : eygrVar) {
            arrayList.add(new sdb(fbunVar.b == 30 ? (String) fbunVar.c : "", "User".concat(String.valueOf(fbunVar.d))));
        }
        engw n = engw.n(arrayList);
        if (n != null) {
            return new sdc(n);
        }
        throw new IllegalStateException("Missing required properties: messages");
    }

    private static final String v(String str) {
        return ffpc.x(ffpc.A(str, "User0:")).toString();
    }

    @Override // defpackage.emdd
    public final Object a(List list, ffgu ffguVar) {
        return n(list, ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:24:0x003f, B:25:0x005a, B:28:0x005f), top: B:23:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.emdd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fbup r8, int r9, long r10, defpackage.ffgu r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.emdq
            if (r0 == 0) goto L13
            r0 = r12
            emdq r0 = (defpackage.emdq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            emdq r0 = new emdq
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L48
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            emdw r8 = r0.e
            defpackage.ffci.b(r12)     // Catch: java.lang.Throwable -> L2e
            goto L9a
        L2e:
            r9 = move-exception
            goto Laa
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            long r10 = r0.a
            fbup r8 = r0.f
            emdw r9 = r0.e
            defpackage.ffci.b(r12)     // Catch: java.lang.Throwable -> L43
            goto L5a
        L43:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
            goto Laa
        L48:
            defpackage.ffci.b(r12)
            r0.e = r7     // Catch: java.lang.Throwable -> La7
            r0.f = r8     // Catch: java.lang.Throwable -> La7
            r0.a = r10     // Catch: java.lang.Throwable -> La7
            r0.d = r4     // Catch: java.lang.Throwable -> La7
            java.lang.Object r12 = r7.l(r9, r5, r0)     // Catch: java.lang.Throwable -> La7
            if (r12 == r1) goto La6
            r9 = r7
        L5a:
            saq r12 = (defpackage.saq) r12     // Catch: java.lang.Throwable -> L43
            if (r12 != 0) goto L5f
            return r5
        L5f:
            sdh r8 = u(r8)     // Catch: java.lang.Throwable -> L43
            ffbr r2 = r9.c     // Catch: java.lang.Throwable -> L43
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L43
            emcw r2 = (defpackage.emcw) r2     // Catch: java.lang.Throwable -> L43
            sak r2 = r9.j()     // Catch: java.lang.Throwable -> L43
            emdl r4 = new emdl     // Catch: java.lang.Throwable -> L43
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L43
            sap r12 = defpackage.emcw.c(r2, r12, r4)     // Catch: java.lang.Throwable -> L43
            com.google.common.util.concurrent.ListenableFuture r8 = r12.b(r8)     // Catch: java.lang.Throwable -> L43
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L43
            ffbr r2 = r9.f     // Catch: java.lang.Throwable -> L43
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L43
            java.util.concurrent.ScheduledExecutorService r2 = (java.util.concurrent.ScheduledExecutorService) r2     // Catch: java.lang.Throwable -> L43
            com.google.common.util.concurrent.ListenableFuture r8 = defpackage.erqt.p(r8, r10, r12, r2)     // Catch: java.lang.Throwable -> L43
            r8.getClass()     // Catch: java.lang.Throwable -> L43
            r0.e = r9     // Catch: java.lang.Throwable -> L43
            r0.f = r5     // Catch: java.lang.Throwable -> L43
            r0.d = r3     // Catch: java.lang.Throwable -> L43
            java.lang.Object r12 = defpackage.fgfz.c(r8, r0)     // Catch: java.lang.Throwable -> L43
            if (r12 == r1) goto La6
            r8 = r9
        L9a:
            saw r12 = (defpackage.saw) r12     // Catch: java.lang.Throwable -> L2e
            int r9 = r12.a()     // Catch: java.lang.Throwable -> L2e
            java.lang.Integer r10 = new java.lang.Integer     // Catch: java.lang.Throwable -> L2e
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L2e
            return r10
        La6:
            return r1
        La7:
            r8 = move-exception
            r9 = r8
            r8 = r7
        Laa:
            enru r8 = r8.d
            ensk r8 = r8.j()
            enrr r8 = (defpackage.enrr) r8
            ensk r8 = r8.g(r9)
            java.lang.String r9 = "getTokenCount"
            r10 = 394(0x18a, float:5.52E-43)
            java.lang.String r11 = "com/google/chat/smartmessaging/penpal/server/v3/PenpalOnDeviceClientImpl"
            java.lang.String r12 = "PenpalOnDeviceClientImpl.kt"
            ensk r8 = r8.h(r11, r9, r10, r12)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r9 = "Getting token count failed"
            r8.q(r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emdw.b(fbup, int, long, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0106, code lost:
    
        if (r2 != r4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // defpackage.emdd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r17, defpackage.esgx r18, int r19, int r20, long r21, defpackage.ffgu r23) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emdw.c(java.lang.String, esgx, int, int, long, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0102 A[Catch: Exception -> 0x0033, TimeoutException -> 0x0036, sao -> 0x0039, LOOP:0: B:14:0x00fc->B:16:0x0102, LOOP_END, TRY_LEAVE, TryCatch #2 {TimeoutException -> 0x0036, sao -> 0x0039, Exception -> 0x0033, blocks: (B:12:0x002e, B:13:0x00e3, B:14:0x00fc, B:16:0x0102, B:27:0x00b7), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // defpackage.emdd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r19, defpackage.esgx r20, int r21, int r22, java.lang.Integer r23, long r24, defpackage.ffgu r26) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emdw.d(java.lang.String, esgx, int, int, java.lang.Integer, long, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0105, code lost:
    
        if (r2 != r4) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // defpackage.emdd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fbup r18, int r19, int r20, long r21, defpackage.ffgu r23) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emdw.e(fbup, int, int, long, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f5 A[Catch: Exception -> 0x002d, TimeoutException -> 0x0032, sao -> 0x0037, LOOP:0: B:14:0x00ef->B:16:0x00f5, LOOP_END, TRY_LEAVE, TryCatch #2 {TimeoutException -> 0x0032, sao -> 0x0037, Exception -> 0x002d, blocks: (B:12:0x0028, B:13:0x00d6, B:14:0x00ef, B:16:0x00f5, B:32:0x00b1), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.emdd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fbup r9, int r10, int r11, java.lang.Integer r12, long r13, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emdw.f(fbup, int, int, java.lang.Integer, long, ffgu):java.lang.Object");
    }

    @Override // defpackage.emdd
    public final String g(fbup fbupVar) {
        fbupVar.getClass();
        engw<ryr> engwVar = u(fbupVar).c().a;
        engwVar.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
        for (ryr ryrVar : engwVar) {
            arrayList.add(ryrVar.a + ": " + ryrVar.b);
        }
        return ffdx.aA(arrayList, "\n", null, null, null, 62);
    }

    @Override // defpackage.emdd
    public final String h(fbup fbupVar) {
        fbupVar.getClass();
        String format = String.format("Given the conversation history between User0 and User1, predict what User0 will likely say next.\nConversation:\n%s\n\nUser0's Response: <ctrl23>", Arrays.copyOf(new Object[]{g(fbupVar)}, 1));
        format.getClass();
        return format;
    }

    @Override // defpackage.emdd
    public final void i() {
        ffqy.d(this.g, null, null, new emdk(this, null), 3);
    }

    public final sak j() {
        return (sak) this.j.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(int r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.emdm
            if (r0 == 0) goto L13
            r0 = r6
            emdm r0 = (defpackage.emdm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            emdm r0 = new emdm
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            emdw r5 = r0.d
            defpackage.ffci.b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            java.util.List r5 = defpackage.ffdx.b(r6)
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = r4.n(r5, r0)
            if (r6 == r1) goto L6b
            r5 = r4
        L48:
            emcx r6 = (defpackage.emcx) r6
            emcx r0 = defpackage.emcx.a
            if (r6 != r0) goto L51
            ffcu r5 = defpackage.ffcu.a
            return r5
        L51:
            java.util.concurrent.atomic.AtomicReference r5 = r5.e
            java.lang.Object r5 = r5.get()
            emdj r5 = (defpackage.emdj) r5
            fgdj r0 = r5.f
            fgdj r1 = r5.g
            fgdj r2 = r5.h
            fgdj r5 = r5.i
            emdy r3 = new emdy
            r3.<init>(r0, r1, r2, r5)
            emeb r5 = defpackage.emea.a(r6, r3)
            throw r5
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emdw.k(int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(int r5, java.lang.Integer r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.emdn
            if (r0 == 0) goto L13
            r0 = r7
            emdn r0 = (defpackage.emdn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            emdn r0 = new emdn
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            emdw r5 = r0.d
            defpackage.ffci.b(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r7)
            r0.d = r4
            r0.c = r3
            java.lang.Object r7 = r4.m(r5, r6, r0)
            if (r7 == r1) goto L68
            r5 = r4
        L3f:
            ffcf r7 = (defpackage.ffcf) r7
            java.lang.Object r6 = r7.a
            saq r6 = (defpackage.saq) r6
            java.lang.Object r7 = r7.b
            emcx r7 = (defpackage.emcx) r7
            emcx r0 = defpackage.emcx.a
            if (r7 != r0) goto L4e
            return r6
        L4e:
            java.util.concurrent.atomic.AtomicReference r5 = r5.e
            java.lang.Object r5 = r5.get()
            emdj r5 = (defpackage.emdj) r5
            fgdj r6 = r5.f
            fgdj r0 = r5.g
            fgdj r1 = r5.h
            fgdj r5 = r5.i
            emdy r2 = new emdy
            r2.<init>(r6, r0, r1, r5)
            emeb r5 = defpackage.emea.a(r7, r2)
            throw r5
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emdw.l(int, java.lang.Integer, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(int r11, java.lang.Integer r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emdw.m(int, java.lang.Integer, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        if (r0 != r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ea, code lost:
    
        if (r0 == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ec, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ea -> B:11:0x00ed). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.util.List r17, defpackage.ffgu r18) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emdw.n(java.util.List, ffgu):java.lang.Object");
    }
}
