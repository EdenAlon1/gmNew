package defpackage;

import android.net.Uri;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtgp {
    public static final enru a = enru.c("com/google/android/libraries/compose/voice/recorder/VoiceRecordingManager");
    public final dtfs b;
    public final ernh c;
    public final dtfv d;
    public final dtcg e;
    public final dqlx f;
    public final dtef g;
    public final fgjb h;
    public Instant i;
    public ffud j;
    public final fgcm k;
    public final fgdj l;
    public final fgcq m;
    private final ffsk n;
    private final ffsk o;
    private final ffhd p;

    public dtgp(dtfs dtfsVar, ffsk ffskVar, ffsk ffskVar2, ffhd ffhdVar, ernh ernhVar, dtfv dtfvVar, dtcg dtcgVar, dqlx dqlxVar, dtef dtefVar) {
        ffskVar.getClass();
        ffskVar2.getClass();
        ffhdVar.getClass();
        ernhVar.getClass();
        dtfvVar.getClass();
        dtcgVar.getClass();
        dqlxVar.getClass();
        this.b = dtfsVar;
        this.n = ffskVar;
        this.o = ffskVar2;
        this.p = ffhdVar;
        this.c = ernhVar;
        this.d = dtfvVar;
        this.e = dtcgVar;
        this.f = dqlxVar;
        this.g = dtefVar;
        this.h = new fgjf();
        fgcm a2 = fgdm.a(dtfx.a);
        this.k = a2;
        fgch fgchVar = new fgch(a2, dtcgVar.d, new dtgk(null));
        int i = fgcz.a;
        this.l = fgbn.b(fgchVar, ffskVar2, fgcy.a, dtfx.a);
        this.m = dtfsVar.a.a;
    }

    private final Object m(ffji ffjiVar, ffgu ffguVar) {
        return ffra.a(this.p, new dtgo(this, ffjiVar, null), ffguVar);
    }

    public final drng a(Uri uri) {
        String uri2 = uri.toString();
        uri2.getClass();
        Instant a2 = this.c.a();
        a2.getClass();
        dtem dtemVar = dtem.a;
        Duration b = b();
        dteg dtegVar = (dteg) dteh.a.createBuilder();
        dtegVar.getClass();
        List list = this.b.a.b;
        dteq dteqVar = null;
        if (!this.d.d || list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((dteo) it.next()).a));
            }
            dtep dtepVar = (dtep) dteq.a.createBuilder();
            dtepVar.getClass();
            DesugarCollections.unmodifiableList(((dteq) dtepVar.instance).b).getClass();
            dtepVar.a(arrayList);
            dteqVar = dter.a(dtepVar);
        }
        if (dteqVar != null) {
            dtei.b(dteqVar, dtegVar);
        }
        return new drng(((yvf) this.d.b).b, uri2, null, null, 0L, a2, dtemVar, b, dtei.a(dtegVar), 12);
    }

    public final Duration b() {
        Instant instant = this.i;
        instant.getClass();
        Duration between = Duration.between(instant, this.c.a());
        between.getClass();
        return between;
    }

    public final Object c(dteh dtehVar, ffgu ffguVar) {
        Object m = m(new dtgb(this, dtehVar, null), ffguVar);
        return m == ffhh.a ? m : ffcu.a;
    }

    public final Object d(ffgu ffguVar) {
        Object m = m(new dtgc(this, null), ffguVar);
        return m == ffhh.a ? m : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Exception r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dtge
            if (r0 == 0) goto L13
            r0 = r9
            dtge r0 = (defpackage.dtge) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dtge r0 = new dtge
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dtgp r8 = r0.d
            defpackage.ffci.b(r9)
            goto L65
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.ffci.b(r9)
            enru r9 = defpackage.dtgp.a
            ensk r9 = r9.j()
            enrr r9 = (defpackage.enrr) r9
            ensk r9 = r9.g(r8)
            java.lang.String r2 = "handleError"
            r4 = 237(0xed, float:3.32E-43)
            java.lang.String r5 = "com/google/android/libraries/compose/voice/recorder/VoiceRecordingManager"
            java.lang.String r6 = "VoiceRecordingManager.kt"
            ensk r9 = r9.h(r5, r2, r4, r6)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r2 = "Error occurred during recording."
            r9.q(r2)
            dtfv r9 = r7.d
            dtfu r9 = r9.c
            r9.e(r8)
            r0.d = r7
            r0.c = r3
            java.lang.Object r9 = r7.h(r3, r0)
            if (r9 == r1) goto L80
            r8 = r7
        L65:
            android.net.Uri r9 = (android.net.Uri) r9
            if (r9 == 0) goto L75
            ffsk r0 = r8.n
            dtgf r1 = new dtgf
            r2 = 0
            r1.<init>(r8, r9, r2)
            r9 = 3
            defpackage.ffqy.d(r0, r2, r2, r1, r9)
        L75:
            dtfv r9 = r8.d
            r9 = 2132082978(0x7f150122, float:1.9806085E38)
            r8.k(r9)
            ffcu r8 = defpackage.ffcu.a
            return r8
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtgp.e(java.lang.Exception, ffgu):java.lang.Object");
    }

    public final Object f(ffgu ffguVar) {
        return m(new dtgj(this, null), ffguVar);
    }

    public final Object g(ffgu ffguVar) {
        Object m = m(new dtgl(this, null), ffguVar);
        return m == ffhh.a ? m : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(boolean r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dtgm
            if (r0 == 0) goto L13
            r0 = r7
            dtgm r0 = (defpackage.dtgm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dtgm r0 = new dtgm
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L49
            if (r2 == r3) goto L43
            r6 = 2
            if (r2 != r6) goto L3b
            dtgp r6 = r0.d
            defpackage.ffci.b(r7)
            ffsk r7 = r6.n
            dtgn r0 = new dtgn
            r0.<init>(r6, r4)
            r1 = 3
            ffud r7 = defpackage.ffqy.d(r7, r4, r4, r0, r1)
            r6.j = r7
            return r4
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            dtgp r6 = r0.d
            defpackage.ffci.b(r7)
            goto L7c
        L49:
            defpackage.ffci.b(r7)
            dtcg r7 = r5.e
            r7.c()
            dtfv r7 = r5.d
            dtfu r7 = r7.c
            if (r6 == 0) goto L5f
            j$.time.Duration r6 = r5.b()
            r7.d(r6)
            goto L66
        L5f:
            j$.time.Duration r6 = r5.b()
            r7.f(r6)
        L66:
            dtfs r6 = r5.b
            boolean r7 = r6.f()
            if (r3 == r7) goto L6f
            r6 = r4
        L6f:
            if (r6 == 0) goto L81
            r0.d = r5
            r0.c = r3
            java.lang.Object r7 = r6.d(r0)
            if (r7 == r1) goto L80
            r6 = r5
        L7c:
            r4 = r7
            android.net.Uri r4 = (android.net.Uri) r4
            goto L82
        L80:
            return r1
        L81:
            r6 = r5
        L82:
            dtfv r6 = r6.d
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtgp.h(boolean, ffgu):java.lang.Object");
    }

    public final void i(Uri uri) {
        ffqy.d(this.n, null, null, new dtgd(this, uri, null), 3);
    }

    public final void j() {
        this.e.c();
        this.i = null;
        this.k.f(dtfx.a);
    }

    public final void k(int i) {
        this.e.c();
        this.k.f(new dtfw(i));
    }
}
