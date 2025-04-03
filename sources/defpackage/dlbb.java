package defpackage;

import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;
import com.google.android.libraries.abuse.hades.moirai.download.PersephoneSchedulerWorker;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlbb implements dlau {
    private final dlcl a;
    private final dlaj b;
    private final dlpw c;
    private final dlib d;
    private final ffly e;

    public dlbb(dlcl dlclVar, dlaj dlajVar, dlpw dlpwVar, dlib dlibVar) {
        dlpwVar.getClass();
        dlibVar.getClass();
        fflx fflxVar = ffly.a;
        fflxVar.getClass();
        this.a = dlclVar;
        this.b = dlajVar;
        this.c = dlpwVar;
        this.d = dlibVar;
        this.e = fflxVar;
    }

    static /* synthetic */ ppw g(dlgb dlgbVar, dlgg dlggVar, pot potVar, boolean z, long j, int i) {
        boolean z2 = z & ((i & 8) == 0);
        ppv ppvVar = new ppv(z2 ? PersephoneDownloadWorker.class : PersephoneSchedulerWorker.class);
        ppvVar.j(potVar);
        if (!z2) {
            ppvVar.d(dlav.c("moirai_persephone_scheduled_sync", dlgbVar));
        }
        poh pohVar = new poh();
        pohVar.a = dlggVar.d;
        int a = dlgm.a(dlggVar.c);
        int i2 = a != 0 ? a : 1;
        if ((i & 16) != 0) {
            j = 0;
        }
        pohVar.c(dlav.d(i2));
        pohVar.b = dlggVar.e;
        ppvVar.g(pohVar.a());
        ppvVar.h(j, TimeUnit.MILLISECONDS);
        ppvVar.e(TimeUnit.DAYS);
        return (ppw) ppvVar.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        if (r4.a(r2, r6, r7, true, r9) != r3) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.dlau
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dlgb r18, defpackage.ffgu r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof defpackage.dlay
            if (r3 == 0) goto L19
            r3 = r2
            dlay r3 = (defpackage.dlay) r3
            int r4 = r3.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.c = r4
            goto L1e
        L19:
            dlay r3 = new dlay
            r3.<init>(r0, r2)
        L1e:
            r9 = r3
            java.lang.Object r2 = r9.a
            ffhh r3 = defpackage.ffhh.a
            int r4 = r9.c
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L41
            if (r4 == r6) goto L39
            if (r4 != r5) goto L31
            defpackage.ffci.b(r2)
            goto L8b
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            dlgb r1 = r9.e
            dlbb r4 = r9.d
            defpackage.ffci.b(r2)
            goto L51
        L41:
            defpackage.ffci.b(r2)
            r9.d = r0
            r9.e = r1
            r9.c = r6
            java.lang.Object r2 = r0.f(r1, r9)
            if (r2 == r3) goto L8e
            r4 = r0
        L51:
            r10 = r1
            pot r12 = defpackage.dlav.a(r10)
            dlaj r1 = r4.b
            java.lang.String r2 = r10.b
            dlgo r1 = r1.b(r2)
            dlcl r4 = r4.a
            java.lang.String r2 = "moirai_persephone_sync"
            java.lang.String r2 = defpackage.dlav.c(r2, r10)
            dlgg r1 = r1.c
            if (r1 != 0) goto L6c
            dlgg r1 = defpackage.dlgg.a
        L6c:
            r11 = r1
            r11.getClass()
            r14 = 0
            r16 = 16
            r13 = 1
            ppw r6 = g(r10, r11, r12, r13, r14, r16)
            ppa r7 = defpackage.ppa.REPLACE
            r1 = 0
            r9.d = r1
            r9.e = r1
            r9.c = r5
            r8 = 1
            r5 = r2
            java.lang.Object r1 = r4.a(r5, r6, r7, r8, r9)
            if (r1 != r3) goto L8b
            goto L8e
        L8b:
            ffcu r1 = defpackage.ffcu.a
            return r1
        L8e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlbb.a(dlgb, ffgu):java.lang.Object");
    }

    @Override // defpackage.dlau
    public final Object b(dlgb dlgbVar, ffgu ffguVar) {
        ppv ppvVar = new ppv(PersephoneDownloadWorker.class);
        ppvVar.j(dlav.a(dlgbVar));
        ppvVar.e(TimeUnit.DAYS);
        Object a = this.a.a(dlav.c("moirai_persephone_sync", dlgbVar), (ppw) ppvVar.b(), ppa.KEEP, false, ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    @Override // defpackage.dlau
    public final Object c(dlgb dlgbVar, ffgu ffguVar) {
        Object e = e(dlgbVar, ffguVar);
        return e == ffhh.a ? e : ffcu.a;
    }

    @Override // defpackage.dlau
    public final Object d(dlgb dlgbVar, ffgu ffguVar) {
        Object f = f(dlgbVar, ffguVar);
        return f == ffhh.a ? f : ffcu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0146, code lost:
    
        if (((defpackage.dlao) r2).a.e(r1) == r4) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d3 -> B:18:0x00dd). Please report as a decompilation issue!!! */
    @Override // defpackage.dlau
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.dlgb r21, defpackage.ffgu r22) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlbb.e(dlgb, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        if (((defpackage.dlao) r9).a.a(r8) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r9.b(r5) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.dlgb r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dlaz
            if (r0 == 0) goto L13
            r0 = r9
            dlaz r0 = (defpackage.dlaz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dlaz r0 = new dlaz
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            java.lang.String r6 = "moirai_persephone_scheduled_sync"
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            defpackage.ffci.b(r9)
            goto L83
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            dlgb r8 = r0.e
            dlbb r2 = r0.d
            defpackage.ffci.b(r9)
            goto L6b
        L3f:
            dlgb r8 = r0.e
            dlbb r2 = r0.d
            defpackage.ffci.b(r9)
            goto L59
        L47:
            defpackage.ffci.b(r9)
            dlcl r9 = r7.a
            r0.d = r7
            r0.e = r8
            r0.c = r5
            java.lang.Object r9 = r9.b(r6)
            if (r9 == r1) goto L86
            r2 = r7
        L59:
            dlcl r9 = r2.a
            java.lang.String r5 = defpackage.dlav.c(r6, r8)
            r0.d = r2
            r0.e = r8
            r0.c = r4
            java.lang.Object r9 = r9.b(r5)
            if (r9 == r1) goto L86
        L6b:
            dlcl r9 = r2.a
            java.lang.String r8 = defpackage.dlav.c(r6, r8)
            r2 = 0
            r0.d = r2
            r0.e = r2
            r0.c = r3
            dlao r9 = (defpackage.dlao) r9
            pqs r9 = r9.a
            pqb r8 = r9.a(r8)
            if (r8 != r1) goto L83
            goto L86
        L83:
            ffcu r8 = defpackage.ffcu.a
            return r8
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlbb.f(dlgb, ffgu):java.lang.Object");
    }
}
