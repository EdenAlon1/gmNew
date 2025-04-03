package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdkp implements cdkg {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsLocalMediaRestoreDelegateImpl");
    public final cdkq b;
    public final cdks c;
    public final cdkv d;
    public final cdku e;
    public final cdkr f;
    public final cdkt g;
    public final cevh h;
    private final axkm i;
    private final ffsk j;
    private final ffhd k;
    private final asyg l;
    private final cbwj m;

    public cdkp(cdkq cdkqVar, cdks cdksVar, cdkv cdkvVar, cdku cdkuVar, cdkr cdkrVar, cdkt cdktVar, axkm axkmVar, cbwj cbwjVar, ffsk ffskVar, ffhd ffhdVar, cevh cevhVar, asyg asygVar) {
        axkmVar.getClass();
        cbwjVar.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        cevhVar.getClass();
        this.b = cdkqVar;
        this.c = cdksVar;
        this.d = cdkvVar;
        this.e = cdkuVar;
        this.f = cdkrVar;
        this.g = cdktVar;
        this.i = axkmVar;
        this.m = cbwjVar;
        this.j = ffskVar;
        this.k = ffhdVar;
        this.h = cevhVar;
        this.l = asygVar;
    }

    @Override // defpackage.cdkg
    public final elfl a(String str, int i) {
        elfl c;
        str.getClass();
        c = axol.c(this.j, ffhe.a, ffsm.a, new cdkn(this, str, i, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.cdkg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(final boolean r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cdko
            if (r0 == 0) goto L13
            r0 = r7
            cdko r0 = (defpackage.cdko) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cdko r0 = new cdko
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            java.lang.String r3 = "resetQueuesForWifiSettingChange"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            boolean r6 = r0.a
            defpackage.ffci.b(r7)
            goto L4f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.ffci.b(r7)
            cbwj r7 = r5.m
            cdkh r2 = new cdkh
            r2.<init>()
            elfl r7 = r7.a(r3, r2)
            r7.getClass()
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = defpackage.fgfz.c(r7, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            java.lang.Integer r7 = (java.lang.Integer) r7
            enru r0 = defpackage.cdkp.a
            ensk r0 = r0.h()
            ensn r1 = defpackage.ente.a
            java.lang.String r2 = "BugleCmsMediaRestore"
            r0.Y(r1, r2)
            java.lang.String r1 = "com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsLocalMediaRestoreDelegateImpl"
            r2 = 173(0xad, float:2.42E-43)
            java.lang.String r4 = "CmsLocalMediaRestoreDelegateImpl.kt"
            ensk r0 = r0.h(r1, r3, r2, r4)
            enrr r0 = (defpackage.enrr) r0
            r7.getClass()
            java.lang.String r1 = "Re-enqueued media restore for %d parts. requireWifi=%s"
            int r7 = r7.intValue()
            r0.x(r1, r7, r6)
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdkp.b(boolean, ffgu):java.lang.Object");
    }

    @Override // defpackage.cdkg
    public final void c() {
        ((cevh) this.b.a.b()).f("cms_local_media_restore");
        ((cevh) this.c.a.b()).f("cms_local_media_restore_requiring_charging");
        ((cevh) this.d.a.b()).f("cms_local_media_restore_requiring_wifi");
        ((cevh) this.e.a.b()).f("cms_local_media_restore_requiring_wifi_and_charging");
        ((cevh) this.f.a.b()).f("cms_local_media_restore_requiring_battery_not_low");
        ((cevh) this.g.a.b()).f("cms_local_media_restore_requiring_wifi_and_battery_not_low");
        ensk h = a.h();
        h.Y(ente.a, "BugleCmsMediaRestore");
        ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsLocalMediaRestoreDelegateImpl", "cancelAllPending", 192, "CmsLocalMediaRestoreDelegateImpl.kt")).q("Cancelled all queued media restores.");
    }

    @Override // defpackage.cdkg
    public final void d(String str, int i, boolean z, boolean z2) {
        str.getClass();
        cejc cejcVar = (cejc) cejh.a.createBuilder();
        cejcVar.getClass();
        cefd.b(i, cejcVar);
        cefd.c(str, cejcVar);
        this.h.a(h(cefd.a(cejcVar), z, z2, str));
    }

    @Override // defpackage.cdkg
    public final elfl e(String str, int i) {
        elfl c;
        str.getClass();
        c = axol.c(this.j, ffhe.a, ffsm.a, new cdkl(this, str, i, null));
        return c;
    }

    @Override // defpackage.cdkg
    public final void f(List list, int i, boolean z) {
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            cejc cejcVar = (cejc) cejh.a.createBuilder();
            cejcVar.getClass();
            cefd.b(i, cejcVar);
            cefd.c(str, cejcVar);
            arrayList.add(h(cefd.a(cejcVar), z, true, str));
        }
        this.h.d(engq.a(arrayList));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x018c, code lost:
    
        if (defpackage.ffra.a(r2, r9, r3) != r4) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.cdkg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r17, defpackage.eyja r18, int r19, boolean r20, int r21, defpackage.ffgu r22) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdkp.g(int, eyja, int, boolean, int, ffgu):java.lang.Object");
    }

    public final ceyr h(cejh cejhVar, boolean z, boolean z2, String str) {
        cetp cetpVar = new cetp();
        if (str != null) {
            cetpVar.b = str;
        }
        return (z && z2) ? ceyr.h("cms_local_media_restore_requiring_wifi_and_battery_not_low", cejhVar, cetpVar.a()) : z ? ceyr.h("cms_local_media_restore_requiring_wifi", cejhVar, cetpVar.a()) : z2 ? ceyr.h("cms_local_media_restore_requiring_battery_not_low", cejhVar, cetpVar.a()) : ceyr.h("cms_local_media_restore", cejhVar, cetpVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r15, int r16, boolean r17, defpackage.ffgu r18) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdkp.i(java.lang.String, int, boolean, ffgu):java.lang.Object");
    }
}
