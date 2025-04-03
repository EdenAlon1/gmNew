package com.google.android.libraries.abuse.hades.moirai.download;

import android.content.Context;
import androidx.car.app.model.Alert;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.dkyz;
import defpackage.dlag;
import defpackage.dlai;
import defpackage.dlaj;
import defpackage.dlas;
import defpackage.dlau;
import defpackage.dlby;
import defpackage.dlfe;
import defpackage.dlgb;
import defpackage.dlib;
import defpackage.dlij;
import defpackage.dlpw;
import defpackage.enrr;
import defpackage.enru;
import defpackage.eyee;
import defpackage.ffcu;
import defpackage.fflm;
import defpackage.ppn;
import defpackage.ppo;
import defpackage.ppq;
import defpackage.rtl;
import defpackage.rtm;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class PersephoneDownloadWorker extends CoroutineWorker {
    private static final enru f = enru.c("com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker");
    public final Context e;
    private final dlij g;
    private final dlby h;
    private final dlpw i;
    private final dkyz j;
    private final dlib k;
    private final dlas l;
    private final dlai m;
    private final dlau n;
    private final dlfe o;
    private final dlaj p;
    private final dlag q;
    private final rtl r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersephoneDownloadWorker(Context context, WorkerParameters workerParameters, dlij dlijVar, dlby dlbyVar, dlpw dlpwVar, dkyz dkyzVar, dlib dlibVar, dlas dlasVar, dlai dlaiVar, dlau dlauVar, dlfe dlfeVar, dlaj dlajVar, dlag dlagVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        dlijVar.getClass();
        dlbyVar.getClass();
        dlpwVar.getClass();
        dlibVar.getClass();
        dlasVar.getClass();
        dlaiVar.getClass();
        dlauVar.getClass();
        dlfeVar.getClass();
        dlajVar.getClass();
        this.e = context;
        this.g = dlijVar;
        this.h = dlbyVar;
        this.i = dlpwVar;
        this.j = dkyzVar;
        this.k = dlibVar;
        this.l = dlasVar;
        this.m = dlaiVar;
        this.n = dlauVar;
        this.o = dlfeVar;
        this.p = dlajVar;
        this.q = dlagVar;
        rtl rtlVar = (rtl) rtm.a.createBuilder();
        rtlVar.getClass();
        this.r = rtlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void m(com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker r2, defpackage.dlgb r3, defpackage.eyee r4, int r5, int r6, int r7, int r8) {
        /*
            rtl r0 = r2.r
            r0.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r0 = r0.instance
            rtm r0 = (defpackage.rtm) r0
            rtm r1 = defpackage.rtm.a
            int r5 = r5 + (-1)
            r0.c = r5
            int r5 = r0.b
            r1 = 1
            r5 = r5 | r1
            r0.b = r5
            rtl r5 = r2.r
            r5.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r5 = r5.instance
            rtm r5 = (defpackage.rtm) r5
            r0 = r8 & 8
            if (r0 == 0) goto L23
            r6 = r1
        L23:
            if (r6 == 0) goto L90
            r8 = r8 & 16
            int r6 = r6 + (-1)
            r0 = 0
            if (r8 == 0) goto L2d
            r7 = r0
        L2d:
            r5.g = r6
            int r6 = r5.b
            r6 = r6 | 16
            r5.b = r6
            if (r7 != 0) goto L38
            goto L44
        L38:
            int r7 = r7 + (-2)
            if (r7 == 0) goto L62
            r5 = 2
            if (r7 == r1) goto L61
            r1 = 3
            if (r7 == r5) goto L62
            if (r7 == r1) goto L5f
        L44:
            enru r5 = com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker.f
            ensk r5 = r5.h()
            java.lang.String r6 = "addLog"
            r7 = 326(0x146, float:4.57E-43)
            java.lang.String r8 = "com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker"
            java.lang.String r1 = "PersephoneDownloadWorker.kt"
            ensk r5 = r5.h(r8, r6, r7, r1)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r6 = "No download status to provide to protectionDownload"
            r5.q(r6)
            r1 = r0
            goto L62
        L5f:
            r1 = 4
            goto L62
        L61:
            r1 = r5
        L62:
            if (r1 == 0) goto L77
            rtl r5 = r2.r
            r5.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r5 = r5.instance
            rtm r5 = (defpackage.rtm) r5
            int r1 = r1 + (-1)
            r5.f = r1
            int r6 = r5.b
            r6 = r6 | 8
            r5.b = r6
        L77:
            dlfe r5 = r2.o
            java.lang.String r6 = r3.b
            dlfk r5 = r5.a(r6)
            if (r5 == 0) goto L8f
            rtl r2 = r2.r
            eyfy r2 = r2.build()
            r2.getClass()
            rtm r2 = (defpackage.rtm) r2
            r5.b(r3, r4, r2)
        L8f:
            return
        L90:
            r2 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker.m(com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker, dlgb, eyee, int, int, int, int):void");
    }

    private final ppq n(int i) {
        enru enruVar = f;
        ((enrr) enruVar.h().h("com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker", "retryOrFail", 214, "PersephoneDownloadWorker.kt")).r("Current retry count: %s", i);
        ((enrr) enruVar.h().h("com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker", "retryOrFail", 215, "PersephoneDownloadWorker.kt")).r("Max download retry attempts: %s", Alert.DURATION_SHOW_INDEFINITELY);
        if (i < Integer.MAX_VALUE) {
            ((enrr) enruVar.j().h("com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker", "retryOrFail", 218, "PersephoneDownloadWorker.kt")).q("Retrying.");
            return new ppo();
        }
        ((enrr) enruVar.j().h("com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker", "retryOrFail", 223, "PersephoneDownloadWorker.kt")).q("Download worker reached max retry attempts. Abandoning download work.");
        return new ppn();
    }

    private final Object o(dlgb dlgbVar, int i) {
        eyee eyeeVar = eyee.b;
        eyeeVar.getClass();
        m(this, dlgbVar, eyeeVar, 4, i, 0, 16);
        return ffcu.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(2:3|(4:5|6|7|8))|7|8) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|332|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03ef, code lost:
    
        if (defpackage.ffcu.a != r2) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x02bc, code lost:
    
        if (r0.d(r3, r8) == r2) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x02ac, code lost:
    
        if (r0.k(r8) == r2) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x03f7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x06b2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x012c, code lost:
    
        r12 = "doWork";
        r14 = "com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker";
        r15 = "PersephoneDownloadWorker.kt";
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0131, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0132, code lost:
    
        r11 = r3;
        r12 = "doWork";
        r14 = "com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker";
        r15 = "PersephoneDownloadWorker.kt";
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0202, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0203, code lost:
    
        r15 = "PersephoneDownloadWorker.kt";
        r11 = r12;
        r3 = "Persephone sync failed: %s";
        r4 = r14;
        r12 = "doWork";
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x01f2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x01f3, code lost:
    
        r15 = "PersephoneDownloadWorker.kt";
        r3 = r12;
        r4 = r14;
        r12 = "doWork";
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x015e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x015f, code lost:
    
        r14 = "com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker";
        r15 = "PersephoneDownloadWorker.kt";
        r4 = r12;
        r3 = "Persephone sync failed: %s";
        r12 = "doWork";
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0156, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0157, code lost:
    
        r14 = "com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker";
        r15 = "PersephoneDownloadWorker.kt";
        r3 = r11;
        r4 = r12;
        r12 = "doWork";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0159: MOVE (r3 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:346), block:B:331:0x0157 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x015a: MOVE (r4 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:347), block:B:331:0x0157 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0161: MOVE (r4 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:354), block:B:329:0x015f */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01f4: MOVE (r3 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:501), block:B:327:0x01f3 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0204: MOVE (r11 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:517), block:B:325:0x0203 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x01f5: MOVE (r4 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]) (LINE:502), block:B:327:0x01f3 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0206: MOVE (r4 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]) (LINE:519), block:B:325:0x0203 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0597 A[Catch: Exception -> 0x05f3, dlhz -> 0x05fc, dlbz -> 0x05ff, TRY_LEAVE, TryCatch #17 {dlhz -> 0x05fc, blocks: (B:29:0x05e6, B:45:0x0588, B:48:0x0597, B:52:0x05b7, B:53:0x05de, B:63:0x05bb, B:66:0x05d3, B:93:0x04cc, B:95:0x04e7, B:96:0x055d, B:99:0x04ef, B:101:0x04fa, B:104:0x0524, B:105:0x0540), top: B:92:0x04cc }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x05bb A[Catch: Exception -> 0x05ef, dlbz -> 0x05f1, dlhz -> 0x05fc, TryCatch #17 {dlhz -> 0x05fc, blocks: (B:29:0x05e6, B:45:0x0588, B:48:0x0597, B:52:0x05b7, B:53:0x05de, B:63:0x05bb, B:66:0x05d3, B:93:0x04cc, B:95:0x04e7, B:96:0x055d, B:99:0x04ef, B:101:0x04fa, B:104:0x0524, B:105:0x0540), top: B:92:0x04cc }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04e7 A[Catch: Exception -> 0x03f7, dlbz -> 0x05ec, dlhz -> 0x05fc, TryCatch #6 {Exception -> 0x03f7, blocks: (B:29:0x05e6, B:88:0x0491, B:93:0x04cc, B:95:0x04e7, B:96:0x055d, B:99:0x04ef, B:101:0x04fa, B:104:0x0524, B:105:0x0540, B:143:0x03f1, B:169:0x03ed, B:160:0x041b), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04ef A[Catch: Exception -> 0x03f7, dlbz -> 0x05ec, dlhz -> 0x05fc, TryCatch #6 {Exception -> 0x03f7, blocks: (B:29:0x05e6, B:88:0x0491, B:93:0x04cc, B:95:0x04e7, B:96:0x055d, B:99:0x04ef, B:101:0x04fa, B:104:0x0524, B:105:0x0540, B:143:0x03f1, B:169:0x03ed, B:160:0x041b), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v44, types: [dlgb] */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v5, types: [dlgb] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v25, types: [dlbg] */
    /* JADX WARN: Type inference failed for: r12v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v56, types: [dlau] */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r22v15 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v21 */
    /* JADX WARN: Type inference failed for: r22v22 */
    /* JADX WARN: Type inference failed for: r22v23 */
    /* JADX WARN: Type inference failed for: r22v24 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r23v18, types: [dlgb] */
    /* JADX WARN: Type inference failed for: r23v20, types: [dlgb] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v100 */
    /* JADX WARN: Type inference failed for: r3v104 */
    /* JADX WARN: Type inference failed for: r3v105 */
    /* JADX WARN: Type inference failed for: r3v106 */
    /* JADX WARN: Type inference failed for: r3v115 */
    /* JADX WARN: Type inference failed for: r3v118 */
    /* JADX WARN: Type inference failed for: r3v119 */
    /* JADX WARN: Type inference failed for: r3v120 */
    /* JADX WARN: Type inference failed for: r3v121 */
    /* JADX WARN: Type inference failed for: r3v122 */
    /* JADX WARN: Type inference failed for: r3v125 */
    /* JADX WARN: Type inference failed for: r3v126 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31, types: [dlgb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v8, types: [dlgb] */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v85, types: [dlgb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX WARN: Type inference failed for: r3v90 */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r3v93 */
    /* JADX WARN: Type inference failed for: r3v94 */
    /* JADX WARN: Type inference failed for: r3v95 */
    /* JADX WARN: Type inference failed for: r4v10, types: [com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v100 */
    /* JADX WARN: Type inference failed for: r4v103 */
    /* JADX WARN: Type inference failed for: r4v104 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v26, types: [com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v63, types: [com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r4v76 */
    /* JADX WARN: Type inference failed for: r4v77 */
    /* JADX WARN: Type inference failed for: r4v79 */
    /* JADX WARN: Type inference failed for: r4v80 */
    /* JADX WARN: Type inference failed for: r4v81 */
    /* JADX WARN: Type inference failed for: r4v84 */
    /* JADX WARN: Type inference failed for: r4v85 */
    /* JADX WARN: Type inference failed for: r4v86 */
    /* JADX WARN: Type inference failed for: r4v87 */
    /* JADX WARN: Type inference failed for: r4v89 */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker] */
    /* JADX WARN: Type inference failed for: r4v90 */
    /* JADX WARN: Type inference failed for: r4v91 */
    /* JADX WARN: Type inference failed for: r4v92 */
    /* JADX WARN: Type inference failed for: r4v93 */
    /* JADX WARN: Type inference failed for: r4v96 */
    /* JADX WARN: Type inference failed for: r4v97 */
    /* JADX WARN: Type inference failed for: r4v98 */
    /* JADX WARN: Type inference failed for: r4v99 */
    /* JADX WARN: Type inference failed for: r5v6, types: [dlij] */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r37) {
        /*
            Method dump skipped, instructions count: 1926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.dlgb r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dlbh
            if (r0 == 0) goto L13
            r0 = r8
            dlbh r0 = (defpackage.dlbh) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dlbh r0 = new dlbh
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r7 = r0.a
            defpackage.ffci.b(r8)
            goto L87
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.ffci.b(r8)
            dlaj r8 = r6.p
            java.lang.String r2 = r7.b
            rug r8 = r8.a(r2)
            eygr r8 = r8.b
            r8.getClass()
            r2 = 10
            int r2 = defpackage.ffdx.n(r8, r2)
            int r2 = defpackage.ffew.a(r2)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r5 = 16
            int r2 = defpackage.ffmk.f(r2, r5)
            r4.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
        L5a:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L71
            java.lang.Object r2 = r8.next()
            ewfc r2 = (defpackage.ewfc) r2
            java.lang.String r5 = r2.b
            r5.getClass()
            java.lang.String r2 = r2.c
            r4.put(r5, r2)
            goto L5a
        L71:
            dlag r8 = r6.q
            if (r8 != 0) goto L76
            return r4
        L76:
            java.lang.String r7 = r7.b
            com.google.common.util.concurrent.ListenableFuture r7 = r8.a()
            r0.a = r4
            r0.d = r3
            java.lang.Object r8 = defpackage.fgfz.c(r7, r0)
            if (r8 == r1) goto L8e
            r7 = r4
        L87:
            java.util.Map r8 = (java.util.Map) r8
            java.util.Map r7 = defpackage.ffew.j(r7, r8)
            return r7
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker.k(dlgb, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0106 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.dlbx r21, defpackage.ffgu r22) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker.l(dlbx, ffgu):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PersephoneDownloadWorker(Context context, WorkerParameters workerParameters, dlij dlijVar, dlby dlbyVar, dlpw dlpwVar, Optional<dkyz> optional, dlib dlibVar, dlas dlasVar, dlai dlaiVar, dlau dlauVar, dlfe dlfeVar, dlaj dlajVar, Optional<dlag> optional2) {
        this(context, workerParameters, dlijVar, dlbyVar, dlpwVar, (dkyz) fflm.b(optional), dlibVar, dlasVar, dlaiVar, dlauVar, dlfeVar, dlajVar, (dlag) fflm.b(optional2));
        context.getClass();
        workerParameters.getClass();
        dlijVar.getClass();
        dlbyVar.getClass();
        dlpwVar.getClass();
        optional.getClass();
        dlibVar.getClass();
        dlasVar.getClass();
        dlaiVar.getClass();
        dlauVar.getClass();
        dlfeVar.getClass();
        dlajVar.getClass();
        optional2.getClass();
    }
}
