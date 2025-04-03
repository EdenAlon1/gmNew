package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddbf implements aeev {
    public final eg a;
    public final cmao b;
    public final ffbr c;
    public final ddbg d;
    public final ffbr e;
    private final clzh f;
    private final errl g;
    private String h;

    public ddbf(eg egVar, clzh clzhVar, cmao cmaoVar, ffbr ffbrVar, errl errlVar, ddbg ddbgVar, ffbr ffbrVar2) {
        this.a = egVar;
        this.f = clzhVar;
        this.b = cmaoVar;
        this.c = ffbrVar;
        this.g = errlVar;
        this.d = ddbgVar;
        this.e = ffbrVar2;
    }

    @Override // defpackage.aeev
    public final elfl a() {
        final String str = (String) this.b.h().orElseThrow(new Supplier() { // from class: ddbc
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalStateException("repromptingSimId is empty");
            }
        });
        this.h = str;
        aeey l = aefb.l();
        aees aeesVar = (aees) l;
        aeesVar.a = "phone_number_promo_banner";
        l.c(R.drawable.gs_android_messages_vd_theme_24);
        aeesVar.b = this.a.getString(R.string.phone_number_promo_banner_title_text);
        aeesVar.c = this.a.getString(R.string.phone_number_promo_banner_body_text);
        aeesVar.d = this.a.getString(R.string.phone_number_promo_banner_positive_button_text);
        l.e(this.a.getString(R.string.phone_number_promo_banner_negative_button_text));
        aeesVar.f = new aefa() { // from class: ddba
            @Override // defpackage.aefa
            public final void a(ejlq ejlqVar, View view) {
                ddbf ddbfVar = ddbf.this;
                ((dday) ddbfVar.e.b()).a(str, epgr.RCS_PROVISIONING_PHONE_NUMBER_PROMO_ACCEPTED);
                ddbfVar.d.a(ejlqVar, view);
            }
        };
        aeesVar.e = new aefa() { // from class: ddbb
            @Override // defpackage.aefa
            public final void a(ejlq ejlqVar, View view) {
                final ddbf ddbfVar = ddbf.this;
                String str2 = str;
                ddbfVar.e(str2, 9);
                ((dday) ddbfVar.e.b()).a(str2, epgr.RCS_PROVISIONING_PHONE_NUMBER_PROMO_DISMISSED);
                final eg egVar = ddbfVar.a;
                aens.a(egVar, egVar.getString(R.string.phone_number_ui_dismissed_snackbar_text_v2), egVar.getString(R.string.phone_number_ui_dismissed_snackbar_action_text), new View.OnClickListener() { // from class: ddbd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        akvg akvgVar = (akvg) ddbf.this.c.b();
                        Activity activity = egVar;
                        eldl.p(activity, akvgVar.o(activity));
                    }
                });
                ddbfVar.b.k();
            }
        };
        l.d(new ddbe(this, str));
        return elfo.e(l.a());
    }

    @Override // defpackage.aeev
    public final elfl b() {
        final cmao cmaoVar = this.b;
        final String str = this.h;
        return cmaoVar.e().h(new emwl() { // from class: cmad
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cman cmanVar = (cman) ((Optional) obj).orElse(null);
                if (cmanVar == null) {
                    ((enrr) ((enrr) cmao.a.e()).h("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter", "shouldPromptPromoBannerForAnySim", 297, "PhoneNumberInputUIPresenter.java")).q("shouldPromptPromoBannerForAnySim: phoneNumberInputRequest is empty");
                    return false;
                }
                String b = cmanVar.b();
                clze a = cmanVar.a();
                if (b.isEmpty() || !a.equals(clze.PROMO_BANNER)) {
                    ((enrr) ((enrr) cmao.a.e()).h("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter", "shouldPromptPromoBannerForAnySim", 305, "PhoneNumberInputUIPresenter.java")).D("shouldPromptPromoBannerForAnySim: simId empty or uiVariant not banner. simId: %s, uiVariant: %s: ", dktx.SIM_ID.c(b), a);
                    return false;
                }
                String str2 = str;
                if (str2 != null && !b.equals(str2)) {
                    ((enrr) ((enrr) cmao.a.e()).h("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter", "shouldPromptPromoBannerForAnySim", 314, "PhoneNumberInputUIPresenter.java")).D("shouldPromptPromoBannerForAnySim: suppressing banner request for requestedSimId: %s. Banner has already been shown for previousSimId: %s", dktx.SIM_ID.c(b), dktx.SIM_ID.c(str2));
                    return false;
                }
                cmao cmaoVar2 = cmao.this;
                ((enrr) ((enrr) cmao.a.e()).h("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter", "shouldPromptPromoBannerForAnySim", 322, "PhoneNumberInputUIPresenter.java")).t("shouldPromptPromoBannerForAnySim: eligible to reprompt banner for simId: %s", dktx.SIM_ID.c(b));
                cmaoVar2.l(b);
                return true;
            }
        }, cmaoVar.i);
    }

    @Override // defpackage.aeev
    public final /* synthetic */ Set c() {
        return new enpx(cgix.HOME);
    }

    @Override // defpackage.aeev
    public final int d() {
        return 3;
    }

    public final void e(String str, int i) {
        clza b = this.f.b(3, i);
        clze clzeVar = clze.PROMO_BANNER;
        b.copyOnWrite();
        clzf clzfVar = (clzf) b.instance;
        clzf clzfVar2 = clzf.a;
        clzfVar.h = clzeVar.a();
        clzfVar.b |= 64;
        this.f.a(str, b.build()).k(axnw.b(), this.g);
    }
}
