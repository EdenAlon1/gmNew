package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dczm implements ajhy, dczk {
    private static final enru b = enru.c("com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosPopupPresenter");
    dcze a;
    private ajid c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final fr h;
    private LottieAnimationView i;

    public dczm(ea eaVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.h = eaVar.I();
        this.d = ffbrVar;
        this.f = ffbrVar2;
        this.e = ffbrVar3;
        this.g = ffbrVar4;
    }

    @Override // defpackage.ajhy
    public final elfl b() {
        final dczd dczdVar = (dczd) this.d.b();
        return ((cmfj) dczdVar.c.b()).b().h(new emwl() { // from class: dczc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                String str = (String) ((Optional) obj).orElse(null);
                if (str == null) {
                    ensk e = dczd.a.e();
                    e.Y(ente.a, "BugleRcs");
                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosBackgroundUtil", "hasUnseenTermsAndConditions", 53, "CarrierTosBackgroundUtil.java")).q("hasUnseenTermsAndConditions: simId is empty");
                    return false;
                }
                dczd dczdVar2 = dczd.this;
                ensk e2 = dczd.a.e();
                e2.Y(ente.a, "BugleRcs");
                ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosBackgroundUtil", "hasUnseenTermsAndConditions", 56, "CarrierTosBackgroundUtil.java")).t("hasUnseenTermsAndConditions: setting terms and conditions request for simId:  %s", dktx.SIM_ID.c(str));
                dczdVar2.d.set(Optional.of(str));
                return true;
            }
        }, dczdVar.b);
    }

    @Override // defpackage.ajhy
    public final void c(ajid ajidVar, ViewGroup viewGroup) {
        this.c = ajidVar;
    }

    @Override // defpackage.ajhy
    public final void d() {
        dcze dczeVar = this.a;
        if (dczeVar != null && dczeVar.aF()) {
            dczeVar.hw();
        }
        this.a = null;
        this.c.b();
    }

    @Override // defpackage.ajhy
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        String str = (String) ((Optional) ((dczd) this.d.b()).d.get()).orElse(null);
        if (str == null) {
            ensk e = b.e();
            e.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/ui/rcs/setup/carriertos/CarrierTosPopupPresenter", "show", 108, "CarrierTosPopupPresenter.java")).q("show: simId is empty");
            return false;
        }
        if (this.a == null) {
            dcze dczeVar = (dcze) this.h.h("carrierTosBottomSheetFragmentTag");
            this.a = dczeVar;
            if (dczeVar == null) {
                dcze dczeVar2 = new dcze();
                fbae.e(dczeVar2);
                ekku.b(dczeVar2, str);
                this.a = dczeVar2;
            }
        }
        if (this.a.aF()) {
            this.a.H().b = this;
            dcze dczeVar3 = this.a;
            dczeVar3.getClass();
            j(dczeVar3);
            return true;
        }
        this.a.t(this.h, "carrierTosBottomSheetFragmentTag");
        this.a.H().b = this;
        dcze dczeVar4 = this.a;
        dczeVar4.getClass();
        j(dczeVar4);
        ((akzt) this.e.b()).c("Bugle.FastTrack.ConversationList.Prompt.Seen");
        ((cmfb) this.g.b()).e(str, epgr.RCS_PROVISIONING_PROMPT_SEEN);
        ((altk) this.f.b()).aL(11);
        return true;
    }

    @Override // defpackage.ajhy
    public final int f() {
        return 7;
    }

    @Override // defpackage.dczk
    public final void h() {
        LottieAnimationView lottieAnimationView = this.i;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
    }

    @Override // defpackage.dczk
    public final void i() {
        LottieAnimationView lottieAnimationView = this.i;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(0);
        }
    }

    final void j(ea eaVar) {
        this.i = (LottieAnimationView) eaVar.N().findViewById(R.id.carrier_tos_popup_animation);
        if (eaVar.B().getConfiguration().orientation == 2) {
            h();
        } else {
            i();
        }
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ int n() {
        return ajhx.a();
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ void g() {
    }
}
