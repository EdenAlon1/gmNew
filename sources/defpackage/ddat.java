package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddat implements ajhy {
    private static final enru c = enru.c("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputPopupPresenterV2");
    public final ffbr a;
    public ddas b;
    private final ffbr d;
    private final ffbr e;
    private final fr f;
    private ajid g;

    public ddat(ea eaVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.f = eaVar.I();
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.a = ffbrVar3;
    }

    private final ddas i() {
        ea h = this.f.h("phone_number_input_bottom_sheet_fragment_tag");
        if (h instanceof dczw) {
            return ((dczw) h).H();
        }
        return null;
    }

    private final void j() {
        ddas ddasVar = this.b;
        if (ddasVar != null) {
            ((ddae) ddasVar).A = new ddar(this);
        }
    }

    @Override // defpackage.ajhy
    public final elfl b() {
        final cmao cmaoVar = (cmao) this.d.b();
        return cmaoVar.e().h(new emwl() { // from class: clzt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cman cmanVar = (cman) ((Optional) obj).orElse(null);
                if (cmanVar == null) {
                    ((enrr) ((enrr) cmao.a.e()).h("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter", "shouldPromptBottomsheetForAnySim", 266, "PhoneNumberInputUIPresenter.java")).q("shouldPromptBottomsheetForAnySim: phoneNumberInputRequest is empty");
                    return false;
                }
                String b = cmanVar.b();
                clze a = cmanVar.a();
                if (b.isEmpty() || !a.equals(clze.INPUT_BOTTOMSHEET)) {
                    ((enrr) ((enrr) cmao.a.e()).h("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter", "shouldPromptBottomsheetForAnySim", 273, "PhoneNumberInputUIPresenter.java")).D("shouldPromptBottomsheetForAnySim: simId empty or uiVariant not bottomsheet. requestedSimId: %s, uiVariant: %s:", dktx.SIM_ID.c(b), a);
                    return false;
                }
                cmao cmaoVar2 = cmao.this;
                ((enrr) ((enrr) cmao.a.e()).h("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter", "shouldPromptBottomsheetForAnySim", 279, "PhoneNumberInputUIPresenter.java")).t("shouldPromptBottomsheetForAnySim: eligible to reprompt with bottomsheet for simId: %s", dktx.SIM_ID.c(b));
                cmaoVar2.l(b);
                return true;
            }
        }, cmaoVar.i);
    }

    @Override // defpackage.ajhy
    public final void c(ajid ajidVar, ViewGroup viewGroup) {
        this.g = ajidVar;
        if (this.b == null) {
            this.b = i();
        }
        j();
    }

    @Override // defpackage.ajhy
    public final void d() {
        h();
        this.g.b();
    }

    @Override // defpackage.ajhy
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        if (this.b == null) {
            this.b = i();
        }
        ddas ddasVar = this.b;
        if (ddasVar == null || !ddasVar.n()) {
            ddao ddaoVar = (ddao) ddap.a.createBuilder();
            String num = Integer.toString(1);
            ddaoVar.copyOnWrite();
            ddap ddapVar = (ddap) ddaoVar.instance;
            num.getClass();
            ddapVar.b |= 2;
            ddapVar.d = num;
            ddae ddaeVar = null;
            String str = (String) ((cmao) this.d.b()).h().orElse(null);
            if (str == null) {
                ((enrr) ((enrr) c.e()).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputPopupPresenterV2", "createAndShowBottomSheetFragment", 138, "PhoneNumberInputPopupPresenterV2.java")).q("createAndShowBottomSheetFragment: simId is null");
            } else {
                ddaoVar.copyOnWrite();
                ddap ddapVar2 = (ddap) ddaoVar.instance;
                ddapVar2.b |= 1;
                ddapVar2.c = str;
                ((clzh) this.e.b()).c(str, clze.INPUT_BOTTOMSHEET, 3);
                ((enrr) ((enrr) c.e()).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputPopupPresenterV2", "createAndShowBottomSheetFragment", 146, "PhoneNumberInputPopupPresenterV2.java")).t("createAndShowBottomSheetFragment: creating bottomsheet fragment with simId: %s", dktx.SIM_ID.c(str));
                dczw aY = dczw.aY((ddap) ddaoVar.build());
                aY.t(this.f, "phone_number_input_bottom_sheet_fragment_tag");
                ddaeVar = aY.H();
            }
            this.b = ddaeVar;
        }
        j();
        return true;
    }

    @Override // defpackage.ajhy
    public final int f() {
        return 6;
    }

    public final void h() {
        ddas ddasVar = this.b;
        if (ddasVar != null && ddasVar.n()) {
            ((ddae) ddasVar).d.hw();
        }
        ajid ajidVar = this.g;
        if (ajidVar != null) {
            ajidVar.b();
            ajid ajidVar2 = this.g;
            ajidVar2.i = -100;
            ajidVar2.f.a(elfo.e(null), "POPUP_KEY");
        }
        this.b = null;
        ((cmao) this.d.b()).k();
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ int n() {
        return ajhx.a();
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ void g() {
    }
}
