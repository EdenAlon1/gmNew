package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.accessibility.AccessibilityManager;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpif implements dplc {
    public static final enru a = enru.c("com/google/android/libraries/compose/cameragallery/popupcamera/PopupCameraController");
    private static final dpgl m = dpgl.c;
    public final ffsk b;
    public final ffsk c;
    public final dqlx d;
    public final dpgu e;
    public final dtef f;
    public final fgcm g;
    public final dtcg h;
    public final ffxx i;
    public drnn j;
    public boolean k;
    public final yqr l;
    private final Context n;
    private final ffbz o;
    private ffud p;

    public dpif(Context context, final ffbr ffbrVar, ffsk ffskVar, ffsk ffskVar2, ffbr ffbrVar2, dqlx dqlxVar, dpgu dpguVar, Optional optional, dtef dtefVar) {
        context.getClass();
        ffbrVar.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        dqlxVar.getClass();
        this.n = context;
        this.b = ffskVar;
        this.c = ffskVar2;
        this.d = dqlxVar;
        this.e = dpguVar;
        this.f = dtefVar;
        this.l = (yqr) fflm.b(optional);
        fgcm a2 = fgdm.a(dpgw.a);
        this.g = a2;
        Object b = ffbrVar2.b();
        b.getClass();
        dtcg dtcgVar = (dtcg) b;
        this.h = dtcgVar;
        this.i = new fgch(a2, dtcgVar.d, new dpie(this, null));
        this.o = ffca.a(new ffix() { // from class: dpgv
            @Override // defpackage.ffix
            public final Object invoke() {
                Object b2 = ffbr.this.b();
                b2.getClass();
                return (dpqm) b2;
            }
        });
    }

    private final void m() {
        if (this.j != null) {
            ffqy.d(this.c, null, null, new dphf(this, null), 3);
        }
        this.k = false;
    }

    private final void n() {
        drnn drnnVar = this.j;
        if (drnnVar == null) {
            this.k = true;
            return;
        }
        if (!(drnnVar instanceof drni)) {
            ((enrr) a.j().h("com/google/android/libraries/compose/cameragallery/popupcamera/PopupCameraController", "sendMedia", 182, "PopupCameraController.kt")).q("Captured media is not the expected type");
            l(0);
            return;
        }
        this.d.e((drni) drnnVar);
        yqr yqrVar = this.l;
        if (yqrVar != null) {
            yqrVar.a();
        }
        this.j = null;
        g();
    }

    public final dpqm a() {
        return (dpqm) this.o.a();
    }

    public final Object b(lkr lkrVar, ixm ixmVar, ffgu ffguVar) {
        Object c = a().c(lkrVar, ixmVar, ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }

    public final Object c(ffgu ffguVar) {
        g();
        Object d = a().d(ffguVar);
        return d == ffhh.a ? d : ffcu.a;
    }

    @Override // defpackage.dplc
    public final Object d(ffgu ffguVar) {
        m();
        h();
        yqr yqrVar = this.l;
        if (yqrVar != null) {
            ((akzt) yqrVar.a.b()).c("Bugle.SelfieGif.Recording.Restarted.Count");
        }
        this.g.f(dpha.a);
        Object d = a().d(ffguVar);
        return d == ffhh.a ? d : ffcu.a;
    }

    @Override // defpackage.dplc
    public final Object e(ffgu ffguVar) {
        this.h.c();
        if (this.p == null) {
            this.p = ffqy.d(this.b, null, null, new dphk(this, null), 3);
        }
        int intValue = ((Number) this.e.b.invoke()).intValue();
        ((enrr) a.h().h("com/google/android/libraries/compose/cameragallery/popupcamera/PopupCameraController", "startRecording", 135, "PopupCameraController.kt")).r("Starting popup camera recording with size %d", intValue);
        Object r = a().r(m, new drcy(intValue), ffguVar);
        return r == ffhh.a ? r : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.dplc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dphl
            if (r0 == 0) goto L13
            r0 = r5
            dphl r0 = (defpackage.dphl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dphl r0 = new dphl
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dpif r0 = r0.d
            defpackage.ffci.b(r5)
            goto L59
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            fgcm r5 = r4.g
            java.lang.Object r5 = r5.c()
            dphb r5 = (defpackage.dphb) r5
            boolean r2 = r5 instanceof defpackage.dpgx
            if (r2 == 0) goto L44
            r4.n()
            goto L7a
        L44:
            boolean r5 = r5 instanceof defpackage.dpgz
            if (r5 == 0) goto L5e
            dpqm r5 = r4.a()
            dpgl r2 = defpackage.dpif.m
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r5.i(r2, r0)
            if (r5 == r1) goto L5d
            r0 = r4
        L59:
            r0.n()
            goto L7a
        L5d:
            return r1
        L5e:
            enru r5 = defpackage.dpif.a
            ensk r5 = r5.j()
            java.lang.String r0 = "submit"
            r1 = 159(0x9f, float:2.23E-43)
            java.lang.String r2 = "com/google/android/libraries/compose/cameragallery/popupcamera/PopupCameraController"
            java.lang.String r3 = "PopupCameraController.kt"
            ensk r5 = r5.h(r2, r0, r1, r3)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r0 = "Attempted to send popup camera gif in invalid state."
            r5.q(r0)
            k(r4)
        L7a:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpif.f(ffgu):java.lang.Object");
    }

    public final void g() {
        h();
        m();
        this.g.f(dpgw.a);
    }

    public final void h() {
        this.h.c();
        this.h.a();
    }

    public final void i(lkr lkrVar) {
        a().q(lkrVar);
    }

    public final void j(long j, int i) {
        VibrationEffect createOneShot;
        Context context = this.n;
        if (((AudioManager) context.getSystemService(AudioManager.class)).getRingerMode() != 0 || ((AccessibilityManager) context.getSystemService(AccessibilityManager.class)).isEnabled()) {
            Vibrator vibrator = (Vibrator) context.getSystemService(Vibrator.class);
            createOneShot = VibrationEffect.createOneShot(j, i);
            vibrator.vibrate(createOneShot);
        }
    }

    public final void l(int i) {
        m();
        h();
        yqr yqrVar = this.l;
        if (yqrVar != null && i != 0) {
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            eoluVar.getClass();
            eogy.g(eolt.SELFIE_GIF_EVENT, eoluVar);
            eqzx eqzxVar = (eqzx) erab.a.createBuilder();
            eqzxVar.getClass();
            eqzy eqzyVar = (eqzy) eraa.a.createBuilder();
            eqzyVar.getClass();
            int i2 = i - 1;
            int i3 = i2 != 0 ? i2 != 1 ? 4 : 3 : 2;
            eqzyVar.copyOnWrite();
            eraa eraaVar = (eraa) eqzyVar.instance;
            eraaVar.c = i3 - 1;
            eraaVar.b |= 1;
            eyfy build = eqzyVar.build();
            build.getClass();
            eqzxVar.copyOnWrite();
            erab erabVar = (erab) eqzxVar.instance;
            erabVar.c = (eraa) build;
            erabVar.b = 1;
            eyfy build2 = eqzxVar.build();
            build2.getClass();
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            eolvVar.cl = (erab) build2;
            eolvVar.h |= 16384;
            eyfq builder = eogy.a(eoluVar).toBuilder();
            builder.getClass();
            ((akyb) yqrVar.b.b()).a().j((eolu) builder, alal.LOG_SPEC_SELFIE_GIF_EVENTS);
        }
        ffqy.d(this.b, null, null, new dphi(this, null), 3);
    }
}
