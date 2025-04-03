package defpackage;

import androidx.car.app.model.Alert;
import io.grpc.Status;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cccu {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsBackupSingleItemProcessor");
    public final ffsk a;
    private final axdf c;
    private final cqoh d;
    private final ccbt e;
    private final ccdo f;
    private final cscn g;
    private final cfyt h;
    private final asjt i;
    private final asia j;
    private final ccce k;
    private final ceva l;
    private final String m;
    private final int n;
    private final ccjf o;
    private final epdw p;

    public cccu(Map map, axdf axdfVar, cqoh cqohVar, ccbt ccbtVar, ccdo ccdoVar, cscn cscnVar, cfyt cfytVar, ffsk ffskVar, asjt asjtVar, asia asiaVar, ccce ccceVar, ceva cevaVar, String str, int i) {
        this.c = axdfVar;
        this.d = cqohVar;
        this.e = ccbtVar;
        this.f = ccdoVar;
        this.g = cscnVar;
        this.h = cfytVar;
        this.a = ffskVar;
        this.i = asjtVar;
        this.j = asiaVar;
        this.k = ccceVar;
        this.l = cevaVar;
        this.m = str;
        this.n = i;
        ccjf ccjfVar = (ccjf) map.get(Integer.valueOf(ccceVar.d));
        if (ccjfVar == null) {
            throw new IllegalArgumentException("No handler registered for table type " + ccceVar + ".tableType");
        }
        this.o = ccjfVar;
        epdw a = axcq.a(ccceVar.d, ccceVar.f);
        a.getClass();
        this.p = a;
    }

    static /* synthetic */ ceyt g(cccu cccuVar) {
        return cccuVar.h(ffel.a);
    }

    private final ceyt h(List list) {
        enrr a = b.a(Level.FINE);
        a.Y(ente.a, "BugleCms");
        ((enrr) a.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsBackupSingleItemProcessor", "reEnqueueResult", 247, "CmsBackupSingleItemProcessor.kt")).B("%s Re-enqueuing work at attempt threshold: pwqAttemptCount=%d.", k(), this.n);
        ceva cevaVar = this.l;
        int i = this.k.h;
        int i2 = ((cetk) cevaVar).c + i;
        eyja d = eykm.d(this.d.f().toEpochMilli());
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cccd cccdVar = (cccd) ((ccce) it.next()).toBuilder();
            cccdVar.copyOnWrite();
            ccce ccceVar = (ccce) cccdVar.instance;
            d.getClass();
            ccceVar.i = d;
            ccceVar.b |= 64;
            arrayList.add((ccce) cccdVar.build());
        }
        ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(this.f.b((ccce) it2.next(), Duration.ZERO));
        }
        int i3 = i2 + 1;
        if (i3 < i) {
            i3 = Alert.DURATION_SHOW_INDEFINITELY;
        }
        cccd cccdVar2 = (cccd) this.k.toBuilder();
        cccdVar2.copyOnWrite();
        ccce ccceVar2 = (ccce) cccdVar2.instance;
        ccceVar2.b |= 32;
        ccceVar2.h = i3;
        eyfy build = cccdVar2.build();
        build.getClass();
        return ceyt.j(engq.a(ffdx.ad(arrayList2, ffdx.b(this.f.b((ccce) build, cccm.a(i3, this.k.d))))));
    }

    private final ceyt i() {
        if (((cetk) this.l).c >= ((Number) ccbu.a.e()).intValue()) {
            return g(this);
        }
        enrr a = b.a(Level.FINE);
        a.Y(ente.a, "BugleCms");
        ((enrr) a.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsBackupSingleItemProcessor", "retryResult", 236, "CmsBackupSingleItemProcessor.kt")).t("%s Returning pwq retry result.", k());
        return ceyt.m();
    }

    private final Object j(Throwable th, ffgu ffguVar) {
        enrr a = b.a(Level.WARNING);
        a.Y(ente.a, "BugleCms");
        ((enrr) a.g(th).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsBackupSingleItemProcessor", "abandonWorkToDeadLetterQueue", 315, "CmsBackupSingleItemProcessor.kt")).t("%s Abandoning repeatedly failing work to DLQ.", k());
        ccbt ccbtVar = this.e;
        ccce ccceVar = this.k;
        Object c = fgfz.c(ccbtVar.b(ccceVar, th, ccceVar.g, this.n), ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }

    private final String k() {
        ccce ccceVar = this.k;
        return "className=CmsBackupSingleItemProcessor, tableType=" + ccceVar.d + ", itemId=" + ccceVar.e + ", flags=" + ccceVar.f + ", queue=" + ((cetk) this.l).b + ", accountId=" + ccceVar.c + ", priorAttempts=" + ccceVar.h + ", triggerName=" + ccceVar.j + ".";
    }

    private final boolean l(Throwable th) {
        ccce ccceVar = this.k;
        int i = ccceVar.d;
        if (i == 7) {
            return false;
        }
        return this.n >= (cshg.b(Status.c(th)) ? ((Integer) csgj.c.e()).intValue() : ((Integer) csgj.d.e()).intValue()) + (ccbt.e(ccceVar.f, i) == bqkw.BACKUP_DELETE ? ((Integer) ccbu.b.e()).intValue() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.cckd r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cccn
            if (r0 == 0) goto L13
            r0 = r6
            cccn r0 = (defpackage.cccn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cccn r0 = new cccn
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            java.lang.Throwable r5 = r5.a
            r0.c = r3
            java.lang.Object r5 = r4.j(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            ceyt r5 = defpackage.ceyt.k()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cccu.a(cckd, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (j(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ccke r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ccco
            if (r0 == 0) goto L13
            r0 = r7
            ccco r0 = (defpackage.ccco) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccco r0 = new ccco
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.ffci.b(r7)
            goto L4c
        L36:
            defpackage.ffci.b(r7)
            java.lang.Throwable r7 = r6.a
            boolean r7 = r5.l(r7)
            if (r7 == 0) goto L51
            java.lang.Throwable r6 = r6.a
            r0.c = r4
            java.lang.Object r6 = r5.j(r6, r0)
            if (r6 != r1) goto L4c
            goto L61
        L4c:
            ceyt r6 = defpackage.ceyt.k()
            return r6
        L51:
            java.lang.Throwable r6 = r6.a
            boolean r7 = r6 instanceof defpackage.csgv
            if (r7 == 0) goto L63
            csgv r6 = (defpackage.csgv) r6
            r0.c = r3
            java.lang.Object r6 = r5.e(r6, r0)
            if (r6 != r1) goto L62
        L61:
            return r1
        L62:
            return r6
        L63:
            boolean r6 = r6 instanceof defpackage.cdvu
            if (r6 == 0) goto L6c
            ceyt r6 = g(r5)
            return r6
        L6c:
            ceyt r6 = r5.i()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cccu.b(ccke, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r2.j(r6, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cckh r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cccp
            if (r0 == 0) goto L13
            r0 = r7
            cccp r0 = (defpackage.cccp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cccp r0 = new cccp
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            goto L75
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            cckh r6 = r0.e
            cccu r2 = r0.d
            defpackage.ffci.b(r7)
            goto L50
        L3a:
            defpackage.ffci.b(r7)
            cscn r7 = r5.g
            elfl r7 = r7.a(r4)
            r0.d = r5
            r0.e = r6
            r0.c = r4
            java.lang.Object r7 = defpackage.fgfz.c(r7, r0)
            if (r7 == r1) goto L7f
            r2 = r5
        L50:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L5d
            ceyt r6 = defpackage.ceyt.i()
            return r6
        L5d:
            java.lang.Throwable r7 = r6.a
            boolean r7 = r2.l(r7)
            if (r7 == 0) goto L7a
            java.lang.Throwable r6 = r6.a
            r7 = 0
            r0.d = r7
            r0.e = r7
            r0.c = r3
            java.lang.Object r6 = r2.j(r6, r0)
            if (r6 != r1) goto L75
            goto L7f
        L75:
            ceyt r6 = defpackage.ceyt.k()
            return r6
        L7a:
            ceyt r6 = r2.i()
            return r6
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cccu.c(cckh, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.Exception r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.cccq
            if (r0 == 0) goto L13
            r0 = r11
            cccq r0 = (defpackage.cccq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cccq r0 = new cccq
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "buildUnexpectedExceptionResult"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsBackupSingleItemProcessor"
            java.lang.String r5 = "CmsBackupSingleItemProcessor.kt"
            java.lang.String r6 = "BugleCms"
            r7 = 1
            if (r2 == 0) goto L3c
            if (r2 != r7) goto L34
            cccu r10 = r0.d
            defpackage.ffci.b(r11)     // Catch: java.lang.Exception -> L32
            goto Lb6
        L32:
            r11 = move-exception
            goto L92
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            defpackage.ffci.b(r11)
            enru r11 = defpackage.cccu.b
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            enrr r11 = r11.a(r2)
            ensn r2 = defpackage.ente.a
            r11.Y(r2, r6)
            ensk r11 = r11.g(r10)
            r2 = 106(0x6a, float:1.49E-43)
            ensk r11 = r11.h(r4, r3, r2, r5)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r2 = r9.k()
            java.lang.String r8 = "%s Unexpected failure while handling process result."
            r11.t(r8, r2)
            int r11 = r9.n
            if (r11 != r7) goto Lb5
            axdf r11 = r9.c     // Catch: java.lang.Exception -> L8f
            epdw r2 = r9.p     // Catch: java.lang.Exception -> L8f
            ccce r8 = r9.k     // Catch: java.lang.Exception -> L8f
            boolean r8 = r8.g     // Catch: java.lang.Exception -> L8f
            r11.g(r2, r8, r7, r10)     // Catch: java.lang.Exception -> L8f
            asjt r11 = r9.i     // Catch: java.lang.Exception -> L8f
            boolean r11 = r11.a()     // Catch: java.lang.Exception -> L8f
            if (r11 != 0) goto L89
            cfyt r11 = r9.h     // Catch: java.lang.Exception -> L8f
            elfl r10 = r11.b(r10)     // Catch: java.lang.Exception -> L8f
            r0.d = r9     // Catch: java.lang.Exception -> L8f
            r0.c = r7     // Catch: java.lang.Exception -> L8f
            java.lang.Object r10 = defpackage.fgfz.c(r10, r0)     // Catch: java.lang.Exception -> L8f
            if (r10 != r1) goto Lb5
            return r1
        L89:
            java.lang.String r11 = "Unexpected failure while handling process result"
            defpackage.crze.c(r11, r10)     // Catch: java.lang.Exception -> L8f
            goto Lb5
        L8f:
            r10 = move-exception
            r11 = r10
            r10 = r9
        L92:
            enru r0 = defpackage.cccu.b
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            enrr r0 = r0.a(r1)
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r6)
            ensk r11 = r0.g(r11)
            r0 = 130(0x82, float:1.82E-43)
            ensk r11 = r11.h(r4, r3, r0, r5)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r0 = "%s Exception while trying to log previous exception."
            java.lang.String r1 = r10.k()
            r11.t(r0, r1)
            goto Lb6
        Lb5:
            r10 = r9
        Lb6:
            ceyt r10 = r10.i()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cccu.d(java.lang.Exception, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0116, code lost:
    
        if (r11 == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.csgv r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cccu.e(csgv, ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(1:(1:(1:(3:14|15|16)(2:18|19))(4:20|21|22|23))(4:24|25|26|27))(4:28|29|30|31))(1:32))(3:58|(1:60)|47)|33|34|35|(2:37|38)(2:39|(2:41|42)(3:43|(1:45)(2:48|(1:50)(2:52|(1:54)(2:56|57)))|47))))|64|6|7|(0)(0)|33|34|35|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
    
        if (r12 != r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f6, code lost:
    
        if (r12 != r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0109, code lost:
    
        if (r12 != r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0043, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0114, code lost:
    
        r0.d = null;
        r0.c = 5;
        r12 = r2.d(r12, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011d, code lost:
    
        if (r12 != r1) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087 A[Catch: Exception -> 0x0043, TRY_ENTER, TryCatch #0 {Exception -> 0x0043, blocks: (B:21:0x003e, B:22:0x010b, B:25:0x0048, B:26:0x00f8, B:29:0x004f, B:30:0x00e5, B:34:0x007d, B:37:0x0087, B:39:0x00ac, B:41:0x00b0, B:43:0x00d5, B:45:0x00d9, B:48:0x00e8, B:50:0x00ec, B:52:0x00fb, B:54:0x00ff, B:56:0x010e, B:57:0x0113), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:21:0x003e, B:22:0x010b, B:25:0x0048, B:26:0x00f8, B:29:0x004f, B:30:0x00e5, B:34:0x007d, B:37:0x0087, B:39:0x00ac, B:41:0x00b0, B:43:0x00d5, B:45:0x00d9, B:48:0x00e8, B:50:0x00ec, B:52:0x00fb, B:54:0x00ff, B:56:0x010e, B:57:0x0113), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [cccu, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cccu.f(ffgu):java.lang.Object");
    }
}
