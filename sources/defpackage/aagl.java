package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagl {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/progress/ProgressBarOverlayUiAdapter");
    public final ffsk b;
    public final alye c;
    public final ffji d;
    private final Context e;
    private final cnpd f;
    private final atte g;
    private final attd h;
    private final ffxx i;

    public aagl(ffsk ffskVar, Context context, alye alyeVar, cnpd cnpdVar, atte atteVar, attd attdVar, ffxx ffxxVar) {
        ffji a2;
        ffskVar.getClass();
        context.getClass();
        alyeVar.getClass();
        cnpdVar.getClass();
        atteVar.getClass();
        attdVar.getClass();
        this.b = ffskVar;
        this.e = context;
        this.c = alyeVar;
        this.f = cnpdVar;
        this.g = atteVar;
        this.h = attdVar;
        this.i = ffxxVar;
        a2 = axqa.a(new aagk(this), 1000L, ffskVar);
        this.d = a2;
    }

    private static final int h(alxr alxrVar) {
        if ((alxrVar.g() instanceof apqd) && zsr.q(alxrVar)) {
            return 3;
        }
        return zsr.r(alxrVar) ? 2 : 1;
    }

    public final axrc a(apra apraVar, ffsk ffskVar, aafr aafrVar) {
        return axrg.b(new aage(aqfn.a(apraVar.a(), ffskVar).a(), this, aafrVar), null);
    }

    public final axrc b(ffsk ffskVar, final aafr aafrVar) {
        apra fk;
        apra fk2;
        apra fk3;
        apra fk4;
        if (!this.g.a() && !this.h.a()) {
            appj g = aafrVar.a.g();
            boolean z = g instanceof apmq;
            if (z && !(g instanceof apqd)) {
                return null;
            }
            if (z && (fk4 = ((apmq) g).fk()) != null && fk4.b()) {
                return null;
            }
            alxr alxrVar = aafrVar.a;
            if (alxrVar instanceof alyv) {
                return null;
            }
            aqcm j = alxrVar.j();
            if ((j != null && j.b() == 2) || ((cnpk) this.f.h().c()).a()) {
                return null;
            }
            apmq apmqVar = z ? (apmq) g : null;
            if (apmqVar == null || (fk3 = apmqVar.fk()) == null) {
                return null;
            }
            if (fk3.f()) {
                if (dksg.a(this.e)) {
                    return axrg.b(new aagj(aqfn.a(fk3.a(), ffskVar).a(), this, aafrVar), null);
                }
                ((enrr) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/progress/ProgressBarOverlayUiAdapter", "createWithoutOverlayForSatellite", 114, "ProgressBarOverlayUiAdapter.kt")).t("No network is available for messageId=%s", aafrVar.a.b());
                return new axqd(new ffix() { // from class: aafw
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return aagl.this.e(aafrVar);
                    }
                });
            }
            ((enrr) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/progress/ProgressBarOverlayUiAdapter", "createWithoutOverlayForSatellite", 105, "ProgressBarOverlayUiAdapter.kt")).t("Not transferring for messageId=%s", aafrVar.a.b());
            if (zsr.q(aafrVar.a)) {
                return new axqd(new ffix() { // from class: aafv
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dnuo c;
                        c = aagl.this.c(aafrVar, null, null);
                        return c;
                    }
                });
            }
            return null;
        }
        appj g2 = aafrVar.a.g();
        boolean z2 = g2 instanceof apmq;
        if (z2 && !(g2 instanceof apqd)) {
            return null;
        }
        if (z2 && (fk2 = ((apmq) g2).fk()) != null && fk2.b()) {
            return null;
        }
        alxr alxrVar2 = aafrVar.a;
        if (alxrVar2 instanceof alyv) {
            return null;
        }
        aqcm j2 = alxrVar2.j();
        if (j2 != null && j2.b() == 2) {
            return null;
        }
        apmq apmqVar2 = z2 ? (apmq) g2 : null;
        if (apmqVar2 == null || (fk = apmqVar2.fk()) == null) {
            return null;
        }
        if (!dksg.a(this.e)) {
            ((enrr) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/progress/ProgressBarOverlayUiAdapter", "createWithOverlayForSatellite", 166, "ProgressBarOverlayUiAdapter.kt")).t("No network is available for messageId=%s", aafrVar.a.b());
            return new axqd(new ffix() { // from class: aaft
                @Override // defpackage.ffix
                public final Object invoke() {
                    return aagl.this.e(aafrVar);
                }
            });
        }
        if (((cnpk) this.f.h().c()).b()) {
            ffxx ffxxVar = this.i;
            aagf aagfVar = new aagf(null, fk, this, ffskVar, aafrVar);
            int i = fgau.a;
            return axrg.b(new fgen(aagfVar, ffxxVar), null);
        }
        if (fk.f()) {
            return a(fk, ffskVar, aafrVar);
        }
        ((enrr) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/progress/ProgressBarOverlayUiAdapter", "createWithOverlayForSatellite", 172, "ProgressBarOverlayUiAdapter.kt")).t("Not transferring for messageId=%s", aafrVar.a.b());
        if (zsr.q(aafrVar.a)) {
            return new axqd(new ffix() { // from class: aafu
                @Override // defpackage.ffix
                public final Object invoke() {
                    dnuo c;
                    c = aagl.this.c(aafrVar, null, null);
                    return c;
                }
            });
        }
        return null;
    }

    public final dnuo c(final aafr aafrVar, String str, final ffix ffixVar) {
        int h = h(aafrVar.a);
        if (str == null) {
            str = this.e.getString(R.string.message_bubble_manual_download);
            str.getClass();
        }
        return new dnuo(h, new dnus(str, new ffix() { // from class: aafx
            @Override // defpackage.ffix
            public final Object invoke() {
                aafr aafrVar2 = aafrVar;
                aagl aaglVar = aagl.this;
                axol.k(aaglVar.b, null, new aafz(ffixVar, aafrVar2, aaglVar, null), 3);
                return ffcu.a;
            }
        }));
    }

    public final dnuo d(final aafr aafrVar, float f) {
        return new dnuo(h(aafrVar.a), new dnuw(Float.valueOf(f), new ffix() { // from class: aafy
            @Override // defpackage.ffix
            public final Object invoke() {
                aagl aaglVar = aagl.this;
                axol.k(aaglVar.b, null, new aaga(aaglVar, aafrVar, null), 3);
                return ffcu.a;
            }
        }));
    }

    public final dnuo e(final aafr aafrVar) {
        return new dnuo(h(aafrVar.a), new dnuu(new ffix() { // from class: aafs
            @Override // defpackage.ffix
            public final Object invoke() {
                aagl aaglVar = aagl.this;
                axol.k(aaglVar.b, null, new aagb(aaglVar, aafrVar, null), 3);
                return ffcu.a;
            }
        }));
    }

    public final void f(alxr alxrVar, apqy apqyVar) {
        if (!zsr.q(alxrVar) || zsr.k(alxrVar)) {
            return;
        }
        if (!((apmq) alxrVar.g()).fp()) {
            this.c.J(alxrVar, 3);
        }
        if (apqyVar.c()) {
            this.c.J(alxrVar, 5);
        } else {
            this.c.J(alxrVar, 4);
        }
    }
}
