package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcxs {
    public static final cfup a = cfvl.h(cfvl.b, "rcs_help_center_link_pattern", "https://support.google.com/messages/answer/7189714?hl=%1$s");
    public static final cfup b = cfvl.h(cfvl.b, "jibe_regional_term_of_service_pattern", "https://jibe.google.com/intl/%1s_%2s/policies/terms/");
    public static final cskc c = cskc.g("Bugle", "ProvisioningHelper");
    public final Context d;
    public final akzt e;
    public final ctyx f;
    public final epgt g;
    public final fazb h;
    public final ctbe i;
    public final cmne j;
    public final ffbr k;
    public final elbx l;
    public final errm m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final ffbr q;
    public final int r;
    private final cuah s;
    private final cqoh t;
    private final djuo u;

    public dcxs(Context context, ctyx ctyxVar, fazb fazbVar, akzt akztVar, ctbe ctbeVar, cuah cuahVar, cmne cmneVar, djuo djuoVar, cqoh cqohVar, ffbr ffbrVar, elbx elbxVar, errm errmVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, epgt epgtVar, int i) {
        this.d = context;
        this.e = akztVar;
        this.r = i;
        this.f = ctyxVar;
        this.g = epgtVar;
        this.h = fazbVar;
        this.i = ctbeVar;
        this.s = cuahVar;
        this.j = cmneVar;
        this.u = djuoVar;
        this.t = cqohVar;
        this.k = ffbrVar;
        this.n = ffbrVar2;
        this.o = ffbrVar3;
        this.p = ffbrVar4;
        this.q = ffbrVar5;
        this.l = elbxVar;
        this.m = errmVar;
    }

    public static String b(Locale locale) {
        String country = locale.getCountry();
        return Locale.US.getCountry().equals(country) ? (String) cful.n.e() : String.format(locale, (String) b.e(), locale.getLanguage(), country);
    }

    private final void l() {
        axnw.h(elfo.f(new Runnable() { // from class: dcxm
            @Override // java.lang.Runnable
            public final void run() {
                dcxs dcxsVar = dcxs.this;
                dcxsVar.f.h("boew_promo_complete", true);
                dcxsVar.i(clxt.GOOGLE_TOS_CONSENTED);
                ((dkcp) dcxsVar.k.b()).E();
                dcxsVar.j.j(eqws.COMPLETE_GOOGLE_TOS);
            }
        }, this.m));
    }

    public final cmem a() {
        cmem b2 = cmem.b(((dkcp) this.k.b()).e().h);
        return b2 == null ? cmem.UNRECOGNIZED : b2;
    }

    public final void c(Context context, SpannableStringBuilder spannableStringBuilder) {
        String string = context.getResources().getString(R.string.fast_track_privacy_policy);
        int indexOf = TextUtils.indexOf(spannableStringBuilder, string);
        if (indexOf == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new elbs(this.l, "ProvisioningHelper#addPrivacyPolicySpan", new dcxp(this)), indexOf, string.length() + indexOf, 17);
    }

    public final void d(Context context, SpannableStringBuilder spannableStringBuilder) {
        String string = context.getResources().getString(R.string.rcs_chats_terms_of_service);
        int indexOf = TextUtils.indexOf(spannableStringBuilder, string);
        if (indexOf == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new elbs(this.l, "ProvisioningHelper#addTermsOfServiceSpan", new dcxo(this)), indexOf, string.length() + indexOf, 17);
    }

    public final void e() {
        csjb c2 = c.c();
        c2.I("Completing Legal FYI flow.");
        c2.r();
        elfo.f(new Runnable() { // from class: dcxn
            @Override // java.lang.Runnable
            public final void run() {
                final dcxs dcxsVar = dcxs.this;
                dcxsVar.j(cmem.LEGAL_FYI_SEEN);
                if (((asqs) dcxsVar.q.b()).a() && djai.z() && djai.ac()) {
                    ((cort) dcxsVar.n.b()).c().h(new emwl() { // from class: dcxk
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            for (djrm djrmVar : (Set) obj) {
                                dcxs dcxsVar2 = dcxs.this;
                                ewht c3 = ((cguo) dcxsVar2.o.b()).c(djrn.a(djrmVar).a);
                                if (c3.t && c3.n) {
                                    ((cmnf) dcxsVar2.p.b()).e(djrmVar, eyxa.TRIGGER_UNKNOWN, eqws.LEGAL_FYI_SEEN);
                                }
                            }
                            return null;
                        }
                    }, dcxsVar.m).k(axnw.b(), erpp.a);
                } else {
                    dcxsVar.j.j(eqws.LEGAL_FYI_SEEN);
                }
            }
        }, this.m).k(axnw.b(), erpp.a);
    }

    @Deprecated
    public final void f(final boolean z) {
        if (djai.G()) {
            axnw.h(elfo.f(new Runnable() { // from class: dcxi
                @Override // java.lang.Runnable
                public final void run() {
                    dcxs dcxsVar = dcxs.this;
                    if (djai.M()) {
                        cmem b2 = cmem.b(((dkcp) dcxsVar.k.b()).e().h);
                        if (b2 == null) {
                            b2 = cmem.UNRECOGNIZED;
                        }
                        dcxsVar.j(b2);
                    } else {
                        dcxsVar.j(cmem.LEGAL_FYI_SEEN);
                    }
                    boolean z2 = z;
                    csjb c2 = dcxs.c.c();
                    c2.I("RCS Default On, enableMoSmsNumberDiscovery:");
                    c2.J(z2);
                    c2.r();
                }
            }, this.m));
        } else {
            axnw.h(elfo.f(new Runnable() { // from class: dcxj
                @Override // java.lang.Runnable
                public final void run() {
                    dcxs dcxsVar = dcxs.this;
                    dcxsVar.i(clxt.GOOGLE_TOS_CONSENTED);
                    csjb c2 = dcxs.c.c();
                    c2.I("enableMoSmsNumberDiscovery:");
                    c2.J(z);
                    c2.r();
                    ((dkcp) dcxsVar.k.b()).E();
                }
            }, this.m));
        }
    }

    public final void g() {
        f(true);
    }

    final void h() {
        String str;
        int i = this.r - 1;
        if (i == 0) {
            str = "Bugle.FastTrack.ConversationList.Prompt.Term.Clicked";
        } else if (i == 1) {
            str = "Bugle.FastTrack.Settings.Dialog.Term.Clicked";
        } else {
            if (i != 2) {
                if (i == 3) {
                    throw new IllegalStateException("There is no 'Terms of Service' UMA metric for the PhoneNumberInput UI.");
                }
                throw new IllegalStateException("There is no ToS user action for the Legal FYI UI.");
            }
            str = "Bugle.Welcome.TermsOfService.Clicked";
        }
        this.e.c(str);
        ((altk) this.h.b()).U(epgr.RCS_PROVISIONING_PROMPT_TERMS_AND_CONDITION_CLICKED, this.g);
    }

    public final void i(clxt clxtVar) {
        if (djai.I() || djai.N()) {
            Locale c2 = ctid.c(this.d);
            cmep cmepVar = (cmep) ((dkcp) this.k.b()).k().map(new Function() { // from class: dcxl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cfup cfupVar = dcxs.a;
                    return (cmep) ((cmeq) obj).toBuilder();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse((cmep) cmeq.a.createBuilder());
            djuo djuoVar = this.u;
            cmepVar.copyOnWrite();
            ((cmeq) cmepVar.instance).c = clxtVar.a();
            String b2 = b(c2);
            cmepVar.copyOnWrite();
            cmeq cmeqVar = (cmeq) cmepVar.instance;
            b2.getClass();
            cmeqVar.d = b2;
            String locale = c2.toString();
            cmepVar.copyOnWrite();
            cmeq cmeqVar2 = (cmeq) cmepVar.instance;
            locale.getClass();
            cmeqVar2.e = locale;
            eyja b3 = eykj.b(this.t.f());
            cmepVar.copyOnWrite();
            cmeq cmeqVar3 = (cmeq) cmepVar.instance;
            b3.getClass();
            cmeqVar3.f = b3;
            cmeqVar3.b |= 1;
            djuoVar.c((cmeq) cmepVar.build());
        }
    }

    public final void j(cmem cmemVar) {
        cmep cmepVar = (djai.M() || ((Boolean) djai.t().a.au.a()).booleanValue()) ? (cmep) ((dkcp) this.k.b()).e().toBuilder() : (cmep) cmeq.a.createBuilder();
        dkcp dkcpVar = (dkcp) this.k.b();
        cmepVar.copyOnWrite();
        ((cmeq) cmepVar.instance).h = cmemVar.a();
        eyja b2 = eykj.b(this.t.f());
        cmepVar.copyOnWrite();
        cmeq cmeqVar = (cmeq) cmepVar.instance;
        b2.getClass();
        cmeqVar.f = b2;
        cmeqVar.b |= 1;
        dkcpVar.v((cmeq) cmepVar.build());
    }

    public final void k(Activity activity, boolean z) {
        if (((ckge) this.s.c.a()).d() == eqwf.AVAILABLE) {
            csjb c2 = c.c();
            c2.I("Migration, only send CONSENT_GRANTED");
            c2.r();
            if (z) {
                e();
                return;
            } else {
                l();
                return;
            }
        }
        boolean a2 = this.s.a();
        if (z) {
            e();
            return;
        }
        l();
        ((altk) this.h.b()).aL(51);
        if (a2) {
            aens.b(activity, activity.getResources().getString(R.string.fast_track_popup_accepted_snack_bar_text_v2));
        }
    }
}
