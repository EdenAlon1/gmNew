package defpackage;

import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlce implements dlau {
    private final dlcl a;
    private final dlaj b;
    private final dlpw c;
    private final dlib d;
    private final ffly e;

    public dlce(dlcl dlclVar, dlaj dlajVar, dlpw dlpwVar, dlib dlibVar) {
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

    private static final ppw h(dlgg dlggVar, pot potVar, long j) {
        ppv ppvVar = new ppv(PersephoneDownloadWorker.class);
        ppvVar.j(potVar);
        poh pohVar = new poh();
        pohVar.a = dlggVar.d;
        int a = dlgm.a(dlggVar.c);
        if (a == 0) {
            a = 1;
        }
        pohVar.c(dlav.d(a));
        pohVar.b = dlggVar.e;
        ppvVar.g(pohVar.a());
        ppvVar.h(j, TimeUnit.MILLISECONDS);
        ppvVar.e(TimeUnit.DAYS);
        return (ppw) ppvVar.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (r1.a(r8, r3, r4, true, r6) != r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.dlau
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dlgb r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dlca
            if (r0 == 0) goto L13
            r0 = r9
            dlca r0 = (defpackage.dlca) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dlca r0 = new dlca
            r0.<init>(r7, r9)
        L18:
            r6 = r0
            java.lang.Object r9 = r6.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            defpackage.ffci.b(r9)
            goto L80
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            dlgb r8 = r6.e
            dlce r1 = r6.d
            defpackage.ffci.b(r9)
            goto L4b
        L3b:
            defpackage.ffci.b(r9)
            r6.d = r7
            r6.e = r8
            r6.c = r3
            java.lang.Object r9 = r7.f(r8, r6)
            if (r9 == r0) goto L83
            r1 = r7
        L4b:
            dlaj r9 = r1.b
            java.lang.String r3 = r8.b
            dlgo r9 = r9.b(r3)
            pot r3 = defpackage.dlav.a(r8)
            dlcl r1 = r1.a
            java.lang.String r4 = "moirai_persephone_sync"
            java.lang.String r8 = defpackage.dlav.c(r4, r8)
            dlgg r9 = r9.c
            if (r9 != 0) goto L65
            dlgg r9 = defpackage.dlgg.a
        L65:
            r9.getClass()
            r4 = 0
            ppw r3 = h(r9, r3, r4)
            ppa r4 = defpackage.ppa.REPLACE
            r9 = 0
            r6.d = r9
            r6.e = r9
            r6.c = r2
            r5 = 1
            r2 = r8
            java.lang.Object r8 = r1.a(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L80
            goto L83
        L80:
            ffcu r8 = defpackage.ffcu.a
            return r8
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlce.a(dlgb, ffgu):java.lang.Object");
    }

    @Override // defpackage.dlau
    public final Object b(dlgb dlgbVar, ffgu ffguVar) {
        return ffcu.a;
    }

    @Override // defpackage.dlau
    public final Object c(dlgb dlgbVar, ffgu ffguVar) {
        Object g = g(dlgbVar, ffguVar);
        return g == ffhh.a ? g : ffcu.a;
    }

    @Override // defpackage.dlau
    public final Object d(dlgb dlgbVar, ffgu ffguVar) {
        return ffcu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r2.g(r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.dlau
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.dlgb r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dlcd
            if (r0 == 0) goto L13
            r0 = r7
            dlcd r0 = (defpackage.dlcd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dlcd r0 = new dlcd
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
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            dlgb r6 = r0.e
            dlce r2 = r0.d
            defpackage.ffci.b(r7)
            goto L4a
        L3a:
            defpackage.ffci.b(r7)
            r0.d = r5
            r0.e = r6
            r0.c = r4
            java.lang.Object r7 = r5.f(r6, r0)
            if (r7 == r1) goto L5b
            r2 = r5
        L4a:
            r7 = 0
            r0.d = r7
            r0.e = r7
            r0.c = r3
            java.lang.Object r6 = r2.g(r6, r0)
            if (r6 != r1) goto L58
            goto L5b
        L58:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlce.e(dlgb, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r8.b(r7) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.dlgb r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dlcb
            if (r0 == 0) goto L13
            r0 = r8
            dlcb r0 = (defpackage.dlcb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dlcb r0 = new dlcb
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "moirai_persephone_scheduled_sync"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            defpackage.ffci.b(r8)
            goto L62
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            dlgb r7 = r0.e
            dlce r2 = r0.d
            defpackage.ffci.b(r8)
            goto L4e
        L3c:
            defpackage.ffci.b(r8)
            dlcl r8 = r6.a
            r0.d = r6
            r0.e = r7
            r0.c = r5
            java.lang.Object r8 = r8.b(r3)
            if (r8 == r1) goto L65
            r2 = r6
        L4e:
            dlcl r8 = r2.a
            java.lang.String r7 = defpackage.dlav.c(r3, r7)
            r2 = 0
            r0.d = r2
            r0.e = r2
            r0.c = r4
            java.lang.Object r7 = r8.b(r7)
            if (r7 != r1) goto L62
            goto L65
        L62:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlce.f(dlgb, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e2, code lost:
    
        if (r6.a(r1, r2, r7, false, r9) != r3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.dlgb r19, defpackage.ffgu r20) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlce.g(dlgb, ffgu):java.lang.Object");
    }
}
