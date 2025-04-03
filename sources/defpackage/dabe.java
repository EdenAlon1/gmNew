package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dabe implements ajhy, daax {
    private static final cskc e = cskc.g("Bugle", "GoogleTosPopupPresenter");
    daaq a;
    public final ffbr b;
    public TextView c;
    public TextView d;
    private ajid f;
    private emyl g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final cwll k;
    private final fr l;
    private final dcxx m;
    private final ffbr n;
    private final ffbr o;
    private final AtomicReference p = new AtomicReference(Optional.empty());
    private LottieAnimationView q;

    public dabe(ea eaVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, cwll cwllVar, dcxx dcxxVar, ffbr ffbrVar5, ffbr ffbrVar6) {
        this.l = eaVar.I();
        this.i = ffbrVar;
        this.h = ffbrVar2;
        this.j = ffbrVar3;
        this.b = ffbrVar4;
        this.k = cwllVar;
        this.m = dcxxVar;
        this.n = ffbrVar5;
        this.o = ffbrVar6;
    }

    @Override // defpackage.ajhy
    public final elfl b() {
        clyt clytVar = (clyt) this.n.b();
        return clytVar.d().h(new emwl() { // from class: clyo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                cskc cskcVar = clyt.a;
                if (optional.isPresent() && ((clxx) optional.get()).equals(clxx.BOTTOMSHEET)) {
                    clyt.a.m("shouldShowBottomsheet: decided true, bottomsheet was requested");
                    return true;
                }
                clyt.a.m("shouldShowBottomsheet: decided false");
                return false;
            }
        }, clytVar.d);
    }

    @Override // defpackage.ajhy
    public final void c(ajid ajidVar, ViewGroup viewGroup) {
        this.f = ajidVar;
        this.g = emys.a(new emyl() { // from class: daaz
            @Override // defpackage.emyl
            public final Object get() {
                return ((dcxt) dabe.this.b.b()).a(epgt.PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_WITH_COST, 1);
            }
        });
    }

    @Override // defpackage.ajhy
    public final void d() {
        daaq daaqVar = this.a;
        if (daaqVar != null && daaqVar.aF()) {
            daaqVar.hw();
        }
        this.a = null;
        this.f.b();
    }

    @Override // defpackage.ajhy
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        if (((Boolean) daap.b.e()).booleanValue()) {
            e.m("ToS prompt counterfactual is enabled.");
            ((altk) this.i.b()).U(epgr.RCS_PROVISIONING_PROMPT_COUNTERFACTUAL_APPLIED, epgt.PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_WITH_COST);
            return false;
        }
        ((clya) this.o.b()).f(4);
        if (this.a == null) {
            daaq daaqVar = (daaq) this.l.h("bottomSheetFragmentTag");
            this.a = daaqVar;
            if (daaqVar == null) {
                this.a = new daaq();
            }
        }
        if (this.a.aF()) {
            this.a.H().a(this);
            daaq daaqVar2 = this.a;
            daaqVar2.getClass();
            m(daaqVar2);
            return true;
        }
        this.a.t(this.l, "bottomSheetFragmentTag");
        this.a.H().a(this);
        daaq daaqVar3 = this.a;
        daaqVar3.getClass();
        m(daaqVar3);
        ((akzt) this.h.b()).c("Bugle.FastTrack.ConversationList.Prompt.Seen");
        ((altk) this.i.b()).U(epgr.RCS_PROVISIONING_PROMPT_SEEN, epgt.PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_WITH_COST);
        ((altk) this.i.b()).aL(11);
        return true;
    }

    @Override // defpackage.ajhy
    public final int f() {
        return 2;
    }

    @Override // defpackage.daax
    public final void h() {
        LottieAnimationView lottieAnimationView = this.q;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.daax
    public final void i(Activity activity) {
        ((clya) this.o.b()).f(6);
        ((clya) this.o.b()).d(epgr.RCS_PROVISIONING_PROMPT_DECLINED, (Optional) this.p.get());
        cwll cwllVar = this.k;
        cwlk cwlkVar = cwllVar.a;
        epgt epgtVar = epgt.PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_WITH_COST;
        cwlkVar.a(false);
        ((akzt) cwlkVar.a.b()).c("Bugle.FastTrack.ConversationList.Prompt.Declined");
        ((altk) cwlkVar.b.b()).U(epgr.RCS_PROVISIONING_PROMPT_DECLINED, epgtVar);
        ctyx ctyxVar = (ctyx) cwllVar.b.b();
        ctyxVar.h("fast_track_prompt_dismissed", true);
        ctyxVar.h("did_show_google_tos_prompt", true);
        if (activity == 0) {
            return;
        }
        dcxs dcxsVar = (dcxs) this.g.get();
        eqws eqwsVar = eqws.DECLINED_GOOGLE_TOS;
        dcxsVar.i(clxt.GOOGLE_TOS_DECLINED);
        if (djai.I()) {
            dcxsVar.j.l(false, eqwsVar);
        }
        d();
        String string = activity.getResources().getString(R.string.fast_track_popup_declined_snack_bar_text_v2);
        if ((activity instanceof ddwh ? ((ddwh) activity).l() : null) == null) {
            int i = engw.d;
            engw engwVar = enou.a;
        }
        aens.b(activity, string);
    }

    @Override // defpackage.daax
    public final void j(Activity activity) {
        ((clya) this.o.b()).f(5);
        ((clya) this.o.b()).d(epgr.RCS_PROVISIONING_PROMPT_ACCEPTED, (Optional) this.p.get());
        cwll cwllVar = this.k;
        cwlk cwlkVar = cwllVar.a;
        epgt epgtVar = epgt.PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_WITH_COST;
        cwlkVar.a(true);
        ((akzt) cwlkVar.a.b()).c("Bugle.FastTrack.ConversationList.Prompt.Accepted");
        ((altk) cwlkVar.b.b()).U(epgr.RCS_PROVISIONING_PROMPT_ACCEPTED, epgtVar);
        ctyx ctyxVar = (ctyx) cwllVar.b.b();
        ctyxVar.j("rcs_tos_state", 2);
        ctyxVar.h("fast_track_prompt_dismissed", true);
        ctyxVar.h("should_show_google_tos_prompt", false);
        ctyxVar.h("did_show_google_tos_prompt", true);
        if (activity == null) {
            return;
        }
        ((dcxs) this.g.get()).k(activity, false);
        d();
    }

    @Override // defpackage.daax
    public final void k(Optional optional) {
        this.p.set(optional);
    }

    @Override // defpackage.daax
    public final void l() {
        LottieAnimationView lottieAnimationView = this.q;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(0);
        }
    }

    final void m(final ea eaVar) {
        View N = eaVar.N();
        this.c = (TextView) N.findViewById(R.id.google_tos_popup_multisim_text);
        if (((ctwb) this.j.b()).a() >= 2) {
            this.m.c(eaVar.z(), this.c);
            this.c.setOnClickListener(new View.OnClickListener() { // from class: daba
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dabe dabeVar = dabe.this;
                    Context z = eaVar.z();
                    dcxx.d(z, dabeVar.c, dcxx.b(z), z.getResources().getDimensionPixelSize(R.dimen.multisim_tooltip_bottom_margin));
                }
            });
        } else {
            this.c.setVisibility(8);
        }
        this.q = (LottieAnimationView) N.findViewById(R.id.google_tos_popup_animation);
        if (eaVar.B().getConfiguration().orientation == 2) {
            h();
        } else {
            l();
        }
        TextView textView = (TextView) N.findViewById(R.id.google_tos_popup_text_paragraph);
        this.d = textView;
        Context z = eaVar.z();
        Resources resources = z.getResources();
        String string = resources.getString(R.string.rcs_chats_terms_of_service);
        String string2 = resources.getString(R.string.rcs_chats);
        String string3 = resources.getString(R.string.terms_summary);
        String string4 = ((ctwb) this.j.b()).a() >= 2 ? ((Boolean) daap.a.e()).booleanValue() ? resources.getString(R.string.google_tos_legal_text_multi_sim_with_terms_summary_v2, string2, string, string3) : resources.getString(R.string.google_tos_legal_text_multi_sim_v2, string2, string) : ((Boolean) daap.a.e()).booleanValue() ? resources.getString(R.string.google_tos_legal_text_single_sim_with_terms_summary_v2, string2, string, string3) : resources.getString(R.string.google_tos_legal_text_single_sim_v2, string2, string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string4);
        String string5 = z.getString(R.string.rcs_chats);
        int indexOf = string4.indexOf(string5);
        if (indexOf != -1) {
            spannableStringBuilder.setSpan(new dabd(this, z), indexOf, string5.length() + indexOf, 17);
        }
        if (((Boolean) daap.a.e()).booleanValue()) {
            dcxs dcxsVar = (dcxs) this.g.get();
            String string6 = z.getResources().getString(R.string.terms_summary);
            dcxsVar.d(z, spannableStringBuilder);
            dcxsVar.c(z, spannableStringBuilder);
            int indexOf2 = TextUtils.indexOf(spannableStringBuilder, string6);
            if (indexOf2 != -1) {
                spannableStringBuilder.setSpan(new elbs(dcxsVar.l, "ProvisioningHelper#addTermsSummarySpan", new dcxr(dcxsVar)), indexOf2, string6.length() + indexOf2, 17);
            }
        } else {
            dcxs dcxsVar2 = (dcxs) this.g.get();
            dcxsVar2.d(z, spannableStringBuilder);
            dcxsVar2.c(z, spannableStringBuilder);
        }
        textView.setText(spannableStringBuilder);
        TextView textView2 = this.d;
        egyl.b(textView2);
        egyl.c(textView2);
        ((Button) N.findViewById(R.id.conversation_list_google_tos_popup_positive_button)).setOnClickListener(new View.OnClickListener() { // from class: dabb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dabe.this.j(eaVar.G());
            }
        });
        ((TextView) N.findViewById(R.id.conversation_list_google_tos_popup_negative_button)).setOnClickListener(new View.OnClickListener() { // from class: dabc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dabe.this.i(eaVar.G());
            }
        });
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ int n() {
        return ajhx.a();
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ void g() {
    }
}
