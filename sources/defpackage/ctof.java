package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctof implements ctiw, cskg {
    private final ffbr A;
    private final ctis B;
    private final ffbr C;
    private boolean D;
    private boolean E;
    private final ffbz F;
    private final ffbz G;
    private final ffji H;
    public final ffbr a;
    public final ffbr b;
    public final ffhd c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final cqoh h;
    public final ctpo i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final cskc n;
    public final ConcurrentMap o;
    public emlk p;
    public long q;
    public final Locale r;
    public final fgjb s;
    private final Context t;
    private final ffbr u;
    private final ffbr v;
    private final ffhd w;
    private final errl x;
    private final ffhd y;
    private final ffsk z;

    public ctof(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffhd ffhdVar, errl errlVar, ffhd ffhdVar2, ffhd ffhdVar3, ffsk ffskVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ctis ctisVar, ffbr ffbrVar9, ffbr ffbrVar10, cqoh cqohVar, ctpo ctpoVar, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15) {
        context.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffhdVar.getClass();
        errlVar.getClass();
        ffhdVar2.getClass();
        ffhdVar3.getClass();
        ffskVar.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar8.getClass();
        ctisVar.getClass();
        ffbrVar9.getClass();
        ffbrVar10.getClass();
        cqohVar.getClass();
        ffbrVar11.getClass();
        ffbrVar12.getClass();
        ffbrVar13.getClass();
        ffbrVar14.getClass();
        ffbrVar15.getClass();
        this.t = context;
        this.a = ffbrVar;
        this.u = ffbrVar2;
        this.b = ffbrVar3;
        this.v = ffbrVar4;
        this.w = ffhdVar;
        this.x = errlVar;
        this.c = ffhdVar2;
        this.y = ffhdVar3;
        this.z = ffskVar;
        this.d = ffbrVar5;
        this.A = ffbrVar6;
        this.e = ffbrVar7;
        this.f = ffbrVar8;
        this.B = ctisVar;
        this.C = ffbrVar9;
        this.g = ffbrVar10;
        this.h = cqohVar;
        this.i = ctpoVar;
        this.j = ffbrVar11;
        this.k = ffbrVar12;
        this.l = ffbrVar13;
        this.m = ffbrVar14;
        this.n = cskc.g("Bugle", "SmartSuggestionRequester");
        this.F = ffca.a(new ffix() { // from class: ctnn
            @Override // defpackage.ffix
            public final Object invoke() {
                return new ctox((emmt) ctof.this.d.b());
            }
        });
        this.G = ffca.a(new ffix() { // from class: ctno
            @Override // defpackage.ffix
            public final Object invoke() {
                return new ctoy((emmt) ctof.this.d.b());
            }
        });
        this.H = new eogl(new ctnv(this, null));
        this.o = new ConcurrentHashMap();
        this.r = ctid.c(context);
        this.s = new fgjf();
    }

    public static final epka j(int i, long j) {
        epjz epjzVar = (epjz) epka.a.createBuilder();
        epjzVar.copyOnWrite();
        epka epkaVar = (epka) epjzVar.instance;
        epkaVar.c = i - 2;
        epkaVar.b |= 1;
        epjzVar.copyOnWrite();
        epka epkaVar2 = (epka) epjzVar.instance;
        epkaVar2.b |= 2;
        epkaVar2.d = j;
        eyfy build = epjzVar.build();
        build.getClass();
        return (epka) build;
    }

    private final void k() {
        try {
            this.n.p("Loading Smart Reply JNIs.");
            boolean z = (!this.B.a()) | this.E;
            this.E = z;
            if (!z) {
                ctmy.c();
                csli.b("sensitive_classifier_jni");
                csli.b("pumpkin_jni_android");
                this.D = true;
            }
        } catch (UnsatisfiedLinkError e) {
            if (!Thread.currentThread().isInterrupted()) {
                this.D = true;
            }
            csjb e2 = this.n.e();
            e2.I("Problem linking Smart Reply JNIs.");
            e2.s(e);
            this.E = true;
        } catch (Throwable th) {
            if (!Thread.currentThread().isInterrupted()) {
                this.D = true;
            }
            csjb e3 = this.n.e();
            e3.I("Problem loading Smart Reply JNIs.");
            e3.s(th);
            this.E = true;
        }
        if (this.E) {
            return;
        }
        try {
            csli.b("mediapipe_tasks_vision_jni");
        } catch (Throwable th2) {
            csjb e4 = this.n.e();
            e4.I("Problem loading Mediapipe Text Classifier JNIs.");
            e4.s(th2);
        }
    }

    private final boolean m() {
        return this.p == null && !this.E;
    }

    @Override // defpackage.ctiw
    public final elfl a(List list) {
        elfl c;
        list.getClass();
        ekzz f = eleg.f("SmartSuggestionRequesterImpl#generateSmartSuggestions");
        try {
            c = axol.c(this.z, ffhe.a, ffsm.a, new ctnw(this, list, null));
            ffig.a(f, null);
            return c;
        } finally {
        }
    }

    @Override // defpackage.ctiw
    public final elfl b(List list, final String str) {
        elfl c;
        list.getClass();
        str.getClass();
        if (list.isEmpty()) {
            elfl e = elfo.e(false);
            e.getClass();
            return e;
        }
        c = axol.c(this.z, ffhe.a, ffsm.a, new ctoc(this, list, (MessageCoreData) list.get(0), null));
        Future future = (Future) this.o.put(str, c);
        if (future != null) {
            future.cancel(false);
        }
        final ffji ffjiVar = new ffji() { // from class: ctnl
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Boolean bool = (Boolean) obj;
                return bool;
            }
        };
        return c.h(new emwl() { // from class: ctnm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }
        }, this.x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0169 A[Catch: Exception -> 0x0b8d, TryCatch #20 {Exception -> 0x0b8d, blocks: (B:13:0x0059, B:15:0x0160, B:17:0x0169, B:18:0x016b, B:25:0x0181, B:32:0x0197, B:33:0x01a0, B:43:0x01a4, B:46:0x01b5, B:671:0x01c7, B:670:0x01c4, B:40:0x0203, B:41:0x020a, B:673:0x01c9, B:675:0x01ee, B:676:0x01f5, B:677:0x01f3, B:678:0x020b, B:679:0x0b8b, B:680:0x0064, B:685:0x0075, B:692:0x008c, B:693:0x0095, B:741:0x0132, B:743:0x0137, B:744:0x013e, B:747:0x0147, B:749:0x014c, B:750:0x0155, B:751:0x013c, B:755:0x0156, B:756:0x0b8c), top: B:11:0x0057, inners: #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0aa7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0ace A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0a22 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0a04 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x094f A[Catch: all -> 0x0966, Exception -> 0x09c7, TRY_ENTER, TryCatch #32 {all -> 0x0966, blocks: (B:350:0x094f, B:351:0x0952, B:352:0x0965, B:387:0x083a, B:388:0x084a, B:390:0x0850, B:392:0x085e, B:394:0x0860, B:397:0x0864, B:398:0x0874, B:400:0x087a, B:407:0x0892, B:414:0x08a5, B:415:0x08a9, B:420:0x08b5, B:422:0x08c3, B:423:0x08c8, B:425:0x08c6, B:427:0x08d2, B:432:0x08d3, B:442:0x08fc, B:443:0x0903), top: B:386:0x083a }] */
    /* JADX WARN: Removed duplicated region for block: B:679:0x0b8b A[Catch: Exception -> 0x0b8d, TRY_ENTER, TryCatch #20 {Exception -> 0x0b8d, blocks: (B:13:0x0059, B:15:0x0160, B:17:0x0169, B:18:0x016b, B:25:0x0181, B:32:0x0197, B:33:0x01a0, B:43:0x01a4, B:46:0x01b5, B:671:0x01c7, B:670:0x01c4, B:40:0x0203, B:41:0x020a, B:673:0x01c9, B:675:0x01ee, B:676:0x01f5, B:677:0x01f3, B:678:0x020b, B:679:0x0b8b, B:680:0x0064, B:685:0x0075, B:692:0x008c, B:693:0x0095, B:741:0x0132, B:743:0x0137, B:744:0x013e, B:747:0x0147, B:749:0x014c, B:750:0x0155, B:751:0x013c, B:755:0x0156, B:756:0x0b8c), top: B:11:0x0057, inners: #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0344  */
    /* JADX WARN: Type inference failed for: r0v19, types: [exdb, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.emlk c(defpackage.emkq r50, defpackage.engr r51) {
        /*
            Method dump skipped, instructions count: 2995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctof.c(emkq, engr):emlk");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r5, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r6, defpackage.engr r7, defpackage.ffgu r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.ctnq
            if (r0 == 0) goto L13
            r0 = r8
            ctnq r0 = (defpackage.ctnq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ctnq r0 = new ctnq
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            albb r5 = r0.e
            ekzz r6 = r0.f
            engr r7 = r0.d
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L2d
            goto L5d
        L2d:
            r5 = move-exception
            goto L73
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.ffci.b(r8)
            java.lang.String r8 = "SmartSuggestionRequesterImpl#createGetSuggestionsRequest"
            ekzz r8 = defpackage.eleg.f(r8)
            ffbr r2 = r4.g     // Catch: java.lang.Throwable -> L71
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L71
            alba r2 = (defpackage.alba) r2     // Catch: java.lang.Throwable -> L71
            albb r2 = r2.a()     // Catch: java.lang.Throwable -> L71
            r0.d = r7     // Catch: java.lang.Throwable -> L71
            r0.f = r8     // Catch: java.lang.Throwable -> L71
            r0.e = r2     // Catch: java.lang.Throwable -> L71
            r0.c = r3     // Catch: java.lang.Throwable -> L71
            java.lang.Object r5 = r4.e(r5, r6, r0)     // Catch: java.lang.Throwable -> L71
            if (r5 == r1) goto L70
            r6 = r8
            r8 = r5
            r5 = r2
        L5d:
            fbts r8 = (defpackage.fbts) r8     // Catch: java.lang.Throwable -> L2d
            long r0 = r5.a()     // Catch: java.lang.Throwable -> L2d
            r5 = 5
            epka r5 = j(r5, r0)     // Catch: java.lang.Throwable -> L2d
            r7.h(r5)     // Catch: java.lang.Throwable -> L2d
            r5 = 0
            defpackage.ffig.a(r6, r5)
            return r8
        L70:
            return r1
        L71:
            r5 = move-exception
            r6 = r8
        L73:
            throw r5     // Catch: java.lang.Throwable -> L74
        L74:
            r7 = move-exception
            defpackage.ffig.a(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctof.d(java.util.List, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, engr, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.List r6, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ctns
            if (r0 == 0) goto L13
            r0 = r8
            ctns r0 = (defpackage.ctns) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ctns r0 = new ctns
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r8)
            ffhd r8 = r5.c
            ffhd r8 = defpackage.ekxi.a(r8)
            ctnr r2 = new ctnr
            r4 = 0
            r2.<init>(r4, r5, r7, r6)
            r0.c = r3
            java.lang.Object r8 = defpackage.ffra.a(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctof.e(java.util.List, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x019d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.List r27, defpackage.ffgu r28) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctof.f(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f6 A[Catch: all -> 0x0119, TryCatch #2 {all -> 0x0119, blocks: (B:26:0x00ee, B:28:0x00f6, B:29:0x00fa), top: B:25:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fa A[Catch: all -> 0x0119, TRY_LEAVE, TryCatch #2 {all -> 0x0119, blocks: (B:26:0x00ee, B:28:0x00f6, B:29:0x00fa), top: B:25:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:14:0x0031, B:15:0x0113, B:43:0x00d4, B:50:0x0093, B:52:0x0099, B:53:0x009d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:14:0x0031, B:15:0x0113, B:43:0x00d4, B:50:0x0093, B:52:0x0099, B:53:0x009d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r13v0, types: [engr] */
    /* JADX WARN: Type inference failed for: r13v1, types: [fgjb] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.engr r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctof.g(engr, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r11v0, types: [ffix] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r11v26, types: [alrx] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r1v0, types: [ffhh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [albb] */
    /* JADX WARN: Type inference failed for: r1v8, types: [albb] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [engr] */
    /* JADX WARN: Type inference failed for: r2v14, types: [engr] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.engr r9, defpackage.albb r10, defpackage.ffix r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctof.h(engr, albb, ffix, ffgu):java.lang.Object");
    }

    public final void i(Throwable th) {
        if (((Boolean) ((cfup) ctni.e.get()).e()).booleanValue()) {
            axnw.h(((cfyt) this.j.b()).b(th));
        }
    }

    @Override // defpackage.cskg
    public final void l(int i) {
        elfl c;
        if (((Number) ctni.b.e()).intValue() > i) {
            return;
        }
        c = axol.c(this.z, ffhe.a, ffsm.a, new ctoe(this, null));
        axnw.h(c);
    }
}
