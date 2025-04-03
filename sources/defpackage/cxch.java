package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.RcsSimStatusPreference;
import com.google.android.apps.messaging.ui.appsettings.RcsSimStatusView;
import com.google.android.apps.messaging.ui.appsettings.TurnOffRcsActivity;
import com.google.android.ims.provisioning.config.UserExperienceConfiguration;
import com.google.android.rcs.client.profile.RcsProfileService;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxch implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer");
    public static final cfup b = cfvl.f(cfvl.b, "rcs_settings_retry_min_period_ms", 300000);
    public static final cfup c = cfvl.e(cfvl.b, "rcs_settings_retry_max_per_day", 5);
    public final ffbr A;
    public final ffbr B;
    public final ffbr C;
    public final ffbr D;
    public final ffbr E;
    public final ffbr F;
    public final ffbr G;
    public final ffbr H;
    public final ffbr I;
    public final ffbr J;
    public ejlr K;
    public final ffbr L;
    public final ffbr M;
    public final crlv N;
    public final crlv O;
    public final ffbr P;
    public final ffbr Q;
    public final ffbr R;
    public final ffbr S;
    public final ffbr T;
    public final ffbr U;
    public final ffbr V;
    public final ffbr W;
    public final ffbr X;
    public final ffbr Y;
    public cxcj Z;
    public final ejxk aa;
    public final ejlr ab;
    public final ejlr ac;
    public final ejwd ad;
    public final ejlr ae;
    public final ejlr af;
    public adg ag;
    private String ah;
    private String ai;
    private String aj;
    private String ak;
    private int al = 3;
    private String am;
    private final ffbr an;
    private final ffbr ao;
    private final ffbr ap;
    private final ffbr aq;
    private final ffbr ar;
    private final ffbr as;
    private final ffbr at;
    private final ffbr au;
    private final ffbr av;
    private final ffbr aw;
    private final ffbr ax;
    private final ffbr ay;
    public String d;
    public String e;
    public String f;
    public int g;
    public dcxs h;
    public boolean i;
    public boolean j;
    public boolean k;
    public engw l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final cxbg q;
    public final ffbr r;
    public final ffbr s;
    public final ffbr t;
    public final ffbr u;
    public final ffbr v;
    public final ffbr w;
    public final ffbr x;
    public final ffbr y;
    public final ffbr z;

    public cxch(cxbg cxbgVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22, ffbr ffbrVar23, ffbr ffbrVar24, ffbr ffbrVar25, ffbr ffbrVar26, ffbr ffbrVar27, ffbr ffbrVar28, ffbr ffbrVar29, ffbr ffbrVar30, ffbr ffbrVar31, ffbr ffbrVar32, ffbr ffbrVar33, ffbr ffbrVar34, ffbr ffbrVar35, ffbr ffbrVar36, ffbr ffbrVar37, ffbr ffbrVar38, ffbr ffbrVar39, ffbr ffbrVar40, ffbr ffbrVar41, ffbr ffbrVar42, ffbr ffbrVar43) {
        int i = engw.d;
        this.l = enou.a;
        this.aa = new cxce(this);
        this.ab = new cxcf(this);
        this.ac = new cxcg(this);
        this.ad = new ejwd<axez>() { // from class: cxch.1
            @Override // defpackage.ejwd
            public final void a(Throwable th) {
                ((enrr) ((enrr) ((enrr) cxch.a.j()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$4", "onError", (char) 526, "RcsSettingsFragmentV2Peer.java")).q("Error loading fi settings data");
            }

            @Override // defpackage.ejwd
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                cxch.this.i = ((axez) obj).e;
            }

            @Override // defpackage.ejwd
            public final void hB() {
            }
        };
        this.ae = new ejlr<Void, Void>() { // from class: cxch.2
            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                ((enrr) ((enrr) cxch.a.h()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$5", "onSuccess", 574, "RcsSettingsFragmentV2Peer.java")).q("Reset carrier TermsAndConditions storage.");
            }

            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
                ((enrr) ((enrr) ((enrr) cxch.a.j()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$5", "onFailure", (char) 579, "RcsSettingsFragmentV2Peer.java")).q("Failed to reset carrier TermsAndConditions storage.");
            }

            @Override // defpackage.ejlr
            public final /* synthetic */ void b(Object obj) {
            }
        };
        this.af = new ejlr<Void, Void>() { // from class: cxch.3
            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                ffbr ffbrVar44 = cxch.this.T;
                ffbrVar44.getClass();
                ((cmoc) ffbrVar44.b()).a(4);
                ((enrr) ((enrr) cxch.a.h()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$6", "onSuccess", 596, "RcsSettingsFragmentV2Peer.java")).q("Successfully cancelled all Enqueued Revoke Consent(with user_disabled=true) Work Manager tasks");
            }

            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
                ((enrr) ((enrr) ((enrr) cxch.a.j()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$6", "onFailure", (char) 603, "RcsSettingsFragmentV2Peer.java")).q("Failed to cancel Revoke Consent Work Manager tasks");
            }

            @Override // defpackage.ejlr
            public final /* synthetic */ void b(Object obj) {
            }
        };
        this.q = cxbgVar;
        this.r = ffbrVar;
        this.an = ffbrVar2;
        this.ao = ffbrVar3;
        this.ap = ffbrVar4;
        this.aq = ffbrVar5;
        this.t = ffbrVar6;
        this.u = ffbrVar7;
        this.v = ffbrVar8;
        this.w = ffbrVar9;
        this.ar = ffbrVar10;
        this.x = ffbrVar11;
        this.y = ffbrVar12;
        this.z = ffbrVar13;
        this.A = ffbrVar14;
        this.B = ffbrVar15;
        this.C = ffbrVar16;
        this.D = ffbrVar17;
        this.as = ffbrVar18;
        this.E = ffbrVar19;
        this.F = ffbrVar20;
        this.G = ffbrVar21;
        this.at = ffbrVar22;
        this.H = ffbrVar23;
        this.I = ffbrVar24;
        this.J = ffbrVar25;
        this.s = ffbrVar26;
        this.L = ffbrVar27;
        this.M = ffbrVar28;
        this.N = new crlv("enable_legal_fyi_flow", new ffix() { // from class: cxbz
            @Override // defpackage.ffix
            public final Object invoke() {
                return Boolean.valueOf(djai.G());
            }
        });
        this.O = new crlv("show_legal_fyi_banner", new ffix() { // from class: cxca
            @Override // defpackage.ffix
            public final Object invoke() {
                enru enruVar = cxch.a;
                return false;
            }
        });
        this.P = ffbrVar29;
        this.Q = ffbrVar30;
        this.R = ffbrVar31;
        this.au = ffbrVar32;
        this.av = ffbrVar33;
        this.S = ffbrVar34;
        this.aw = ffbrVar35;
        this.T = ffbrVar36;
        this.ax = ffbrVar37;
        this.U = ffbrVar38;
        this.V = ffbrVar39;
        this.ay = ffbrVar40;
        this.W = ffbrVar41;
        this.X = ffbrVar42;
        this.Y = ffbrVar43;
    }

    private final void p() {
        LinearLayout linearLayout;
        cxcj cxcjVar = this.Z;
        cxcjVar.getClass();
        RcsSimStatusPreference rcsSimStatusPreference = ((cwuf) cxcjVar).h;
        if (rcsSimStatusPreference.k() == null || (linearLayout = (LinearLayout) rcsSimStatusPreference.k().findViewById(R.id.rcs_turned_off_banner_container)) == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    private final void q(Preference preference) {
        this.q.b().af(preference);
    }

    private final void r() {
        cxcj cxcjVar = this.Z;
        cxcjVar.getClass();
        RcsSimStatusPreference rcsSimStatusPreference = ((cwuf) cxcjVar).h;
        if (rcsSimStatusPreference.k() != null) {
            LinearLayout linearLayout = (LinearLayout) rcsSimStatusPreference.k().findViewById(R.id.rcs_turned_off_banner_container);
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            } else {
                rcsSimStatusPreference.k().addView((LinearLayout) LayoutInflater.from(rcsSimStatusPreference.k().getContext()).inflate(R.layout.rcs_turn_off_fyi, (ViewGroup) null));
            }
        }
    }

    private final void s() {
        cxcj cxcjVar = this.Z;
        cxcjVar.getClass();
        int d = ((ctyx) this.x.b()).d(this.aj, this.g);
        eg G = this.q.G();
        G.getClass();
        ((cwuf) cxcjVar).e.n(G.getResources().getStringArray(R.array.rcs_default_sharing_method_options)[d]);
    }

    private final boolean t(boolean z) {
        boolean b2 = (djai.z() && djai.ac()) ? this.n : dimo.b();
        boolean z2 = ((ctyx) this.x.b()).d("rcs_tos_state", 0) == 2;
        if (z) {
            ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "shouldShowGoogleTos", 1357, "RcsSettingsFragmentV2Peer.java")).I("shouldShowGoogleTos: showGoogleTos %s, tosAccepted %s", b2, z2);
            return b2 && !z2;
        }
        boolean q = ((ctyx) this.x.b()).q("should_show_google_tos_prompt", false);
        ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "shouldShowGoogleTos", 1362, "RcsSettingsFragmentV2Peer.java")).J("shouldShowGoogleTos: showGoogleTos %s, tosRequested %s, tosAccepted %s", Boolean.valueOf(b2), Boolean.valueOf(q), Boolean.valueOf(z2));
        return b2 && q && !z2;
    }

    public final String a(eqwf eqwfVar, String str, boolean z) {
        int ordinal = eqwfVar.ordinal();
        if (ordinal != 2 && ordinal != 6 && ordinal != 26) {
            if (ordinal != 8) {
                if (ordinal == 9) {
                    return this.q.Z(R.string.rcs_not_available_desc_sim_absent, str);
                }
                if (ordinal != 11) {
                    if (ordinal != 12) {
                        if (ordinal != 14 && ordinal != 15) {
                            if (ordinal != 23) {
                                if (ordinal != 24) {
                                    return str;
                                }
                                return this.q.Z(true != z ? R.string.rcs_not_available_desc_disabled_by_it_admin_v2 : R.string.multi_sim_rcs_not_available_desc_disabled_by_it_admin, str);
                            }
                        }
                    }
                }
            }
            return this.q.Z(R.string.rcs_not_available_desc_device_not_supported, str);
        }
        return this.q.Z(R.string.rcs_not_available_desc_carrier_not_supported, str);
    }

    public final void b() {
        ((cmfb) this.P.b()).c(epgr.RCS_PROVISIONING_LEGAL_FYI_BANNER_IN_SETTINGS_SEEN);
        ((enrr) ((enrr) a.h()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "onLegalFyiSeen", 1498, "RcsSettingsFragmentV2Peer.java")).q("Legal FYI Banner shown, starting provisioning");
        ((ctyx) this.x.b()).h("should_show_rcs_default_on_prompt", true);
        cxbg cxbgVar = this.q;
        dcxs dcxsVar = this.h;
        eg G = cxbgVar.G();
        G.getClass();
        dcxsVar.k(G, true);
        if (djai.z() && djai.ac()) {
            ((cmgr) this.Q.b()).k();
        } else {
            ((ejvp) this.at.b()).a(elfo.e(null), dcyg.b);
        }
    }

    public final void c() {
        r();
        ((cxka) this.I.b()).a(3);
        j(cmip.TOGGLE_STATE_USER_DISABLED);
        csyy csyyVar = (csyy) this.ax.b();
        final Instant f = ((cqoh) this.S.b()).f();
        axnw.h(csyyVar.f(new emwl() { // from class: csyo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csym csymVar = (csym) obj;
                csyd csydVar = (csyd) csymVar.toBuilder();
                csyj csyjVar = csymVar.f;
                if (csyjVar == null) {
                    csyjVar = csyj.a;
                }
                Instant instant = Instant.this;
                csyi csyiVar = (csyi) csyjVar.toBuilder();
                eyja b2 = eykj.b(instant);
                csyiVar.copyOnWrite();
                csyj csyjVar2 = (csyj) csyiVar.instance;
                b2.getClass();
                csyjVar2.c = b2;
                csyjVar2.b |= 1;
                csydVar.copyOnWrite();
                csym csymVar2 = (csym) csydVar.instance;
                csyj csyjVar3 = (csyj) csyiVar.build();
                csyjVar3.getClass();
                csymVar2.f = csyjVar3;
                csymVar2.b |= 8;
                return (csym) csydVar.build();
            }
        }));
    }

    public final void d() {
        String string;
        UserExperienceConfiguration s;
        this.q.b.f("bugle");
        cxbg cxbgVar = this.q;
        cxbgVar.q();
        cxbgVar.r(cxbgVar.b.e(cxbgVar.A(), R.xml.rcs_preferences_per_subscription_rcs_settings_redesign_legal_fyi, null));
        this.q.b().ag();
        this.d = this.q.Y(R.string.enable_rcs_pref_key);
        this.ah = this.q.Y(R.string.rcs_fallback_type_pref_key);
        this.e = this.q.Y(R.string.rcs_auto_fallback_pref_key);
        this.aj = this.q.Y(R.string.rcs_default_sharing_method_key);
        this.ai = this.q.Y(R.string.rcs_mobile_data_auto_download_limit_pref_key);
        this.am = this.q.Y(R.string.rcs_learn_more_pref_key);
        this.f = this.q.Y(R.string.rcs_mobile_auto_download_in_roaming_pref_key);
        this.ak = this.q.Y(R.string.rcs_sim_status_pref_key);
        int i = 3;
        try {
            djtp rcsConfig = ((ckmb) this.as.b()).a.getRcsConfig();
            if (rcsConfig != null && (s = rcsConfig.s()) != null) {
                int i2 = s.mMessageFallbackDefault;
                int i3 = s.mFileTransferFallbackDefault;
                char c2 = (i2 == -1 || i3 == -1) ? (char) 65535 : (i2 == 1 || i3 == 1) ? (char) 1 : (char) 0;
                if (c2 != 65535) {
                    i = c2 != 0 ? 2 : 1;
                }
            }
        } catch (ehxg e) {
            csjy.h("Bugle", e, "RcsUtils. Error getting default configuration value for fallback setting");
        }
        this.al = i;
        TwoStatePreference twoStatePreference = (TwoStatePreference) this.q.a(this.d);
        twoStatePreference.getClass();
        Preference a2 = this.q.a(this.ah);
        a2.getClass();
        TwoStatePreference twoStatePreference2 = (TwoStatePreference) this.q.a(this.e);
        twoStatePreference2.getClass();
        Preference a3 = this.q.a(this.ai);
        a3.getClass();
        Preference a4 = this.q.a(this.aj);
        a4.getClass();
        Preference a5 = this.q.a(this.am);
        a5.getClass();
        TwoStatePreference twoStatePreference3 = (TwoStatePreference) this.q.a(this.f);
        twoStatePreference3.getClass();
        RcsSimStatusPreference rcsSimStatusPreference = (RcsSimStatusPreference) this.q.a(this.ak);
        rcsSimStatusPreference.getClass();
        cwuf cwufVar = new cwuf(twoStatePreference, a2, twoStatePreference2, a3, a4, a5, twoStatePreference3, rcsSimStatusPreference);
        this.Z = cwufVar;
        q(cwufVar.b);
        cxcj cxcjVar = this.Z;
        cxcjVar.getClass();
        cwuf cwufVar2 = (cwuf) cxcjVar;
        cwufVar2.c.n = new onh() { // from class: cxbw
            @Override // defpackage.onh
            public final boolean a(Preference preference, Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final cxch cxchVar = cxch.this;
                if (!booleanValue) {
                    ((ctyx) cxchVar.x.b()).h(cxchVar.e, false);
                    ((akzt) cxchVar.v.b()).e("Bugle.RCS.Chat.AutoFallback.Tap.Counts", 2);
                    return true;
                }
                ehft ehftVar = new ehft(cxchVar.q.z());
                ehftVar.y(cxchVar.q.Y(R.string.enable_rcs_auto_fallback_dialog_title));
                ehftVar.n(cxchVar.q.Y(R.string.enable_rcs_auto_fallback_dialog_description_v2));
                ehftVar.u(cxchVar.q.Y(R.string.confirm_rcs_auto_fallback), new elbb((elbx) cxchVar.E.b(), "RcsSettingsFragmentV2Peer#setupRcsAutoFallbackPreference", new DialogInterface.OnClickListener() { // from class: cxbx
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        cxch cxchVar2 = cxch.this;
                        ((ctyx) cxchVar2.x.b()).h(cxchVar2.e, true);
                        ((akzt) cxchVar2.v.b()).e("Bugle.RCS.Chat.AutoFallback.Tap.Counts", 1);
                    }
                }));
                ehftVar.p(cxchVar.q.Y(android.R.string.cancel), null);
                ehftVar.a();
                return false;
            }
        };
        cxcjVar.getClass();
        cwufVar2.a.G(false);
        if (!((asqs) this.R.b()).a() && (!djai.z() || !djai.ac())) {
            cwufVar2.a.n = new elhi((elhk) this.J.b(), "RcsSettingsFragmentV2Peer:rcsEnabledPreference", new onh() { // from class: cxby
                @Override // defpackage.onh
                public final boolean a(Preference preference, Object obj) {
                    int i4 = engw.d;
                    return cxch.this.o(obj, enou.a);
                }
            });
        }
        cxcj cxcjVar2 = this.Z;
        cxcjVar2.getClass();
        if (((ckds) this.r.b()).G()) {
            q(((cwuf) cxcjVar2).e);
        } else {
            int defaultSharingMethod = ((RcsProfileService) this.ao.b()).getDefaultSharingMethod();
            this.g = defaultSharingMethod;
            if (defaultSharingMethod != -1) {
                ((cwuf) cxcjVar2).e.o = new oni() { // from class: cxbk
                    @Override // defpackage.oni
                    public final boolean a(Preference preference) {
                        cxch cxchVar = cxch.this;
                        cxaw cxawVar = (cxaw) cxchVar.D.b();
                        eg G = cxchVar.q.G();
                        G.getClass();
                        ffbr ffbrVar = cxawVar.a;
                        int i4 = cxchVar.g;
                        ctyx ctyxVar = (ctyx) ffbrVar.b();
                        ctyxVar.getClass();
                        new cxav(ctyxVar, G, i4).c();
                        return true;
                    }
                };
                s();
            } else {
                q(((cwuf) cxcjVar2).e);
            }
        }
        cxcj cxcjVar3 = this.Z;
        cxcjVar3.getClass();
        h();
        ((cwuf) cxcjVar3).d.o = new oni() { // from class: cxbh
            @Override // defpackage.oni
            public final boolean a(Preference preference) {
                cwue cwueVar = (cwue) cxch.this.z.b();
                Context context = (Context) cwueVar.a.b();
                context.getClass();
                csuk csukVar = (csuk) cwueVar.b.b();
                csukVar.getClass();
                ctyx ctyxVar = (ctyx) cwueVar.c.b();
                ctyxVar.getClass();
                new cwud(context, csukVar, ctyxVar).c();
                return true;
            }
        };
        cxcj cxcjVar4 = this.Z;
        cxcjVar4.getClass();
        boolean m = m(((ckge) ((csjk) this.u.b()).a()).d());
        eg G = this.q.G();
        G.getClass();
        cwuf cwufVar3 = (cwuf) cxcjVar4;
        cwufVar3.f.M(ddyi.d(G, R.string.rcs_learn_more_title_v2));
        cwufVar3.f.o = new oni() { // from class: cxbq
            @Override // defpackage.oni
            public final boolean a(Preference preference) {
                cxch cxchVar = cxch.this;
                adtc adtcVar = (adtc) cxchVar.t.b();
                eg G2 = cxchVar.q.G();
                G2.getClass();
                adtcVar.h(G2);
                return true;
            }
        };
        if (!m && !((asqs) this.R.b()).a()) {
            this.q.b().ab();
            this.q.b().ae(cwufVar3.f);
            cwufVar3.f.L(R.string.rcs_not_available_learn_more_title_v2);
            String a6 = crmi.a(this.q.z());
            String a7 = a(((ckge) ((csjk) this.u.b()).a()).d(), a6, false);
            Preference preference = cwufVar3.f;
            eg G2 = this.q.G();
            G2.getClass();
            preference.n(ddyi.f(G2, a7, a6));
        }
        cxcj cxcjVar5 = this.Z;
        cxcjVar5.getClass();
        ((cwuf) cxcjVar5).g.n = new elhi((elhk) this.J.b(), "RcsSettingsFragmentV2Peer:enableAutoDownloadInRoaming", new onh() { // from class: cxbr
            @Override // defpackage.onh
            public final boolean a(Preference preference2, Object obj) {
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                ((enrr) ((enrr) cxch.a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "saveAutoDownloadFilesInRoamingPreference", 1584, "RcsSettingsFragmentV2Peer.java")).t("saveAutoDownloadFilesInRoamingPreference : enabled %s", bool);
                cxch cxchVar = cxch.this;
                ((ctyx) cxchVar.x.b()).h(cxchVar.f, booleanValue);
                return booleanValue;
            }
        });
        if (!djai.z() || !djai.ac()) {
            g();
        }
        Bundle bundle = this.q.m;
        if (bundle == null || (string = bundle.getString("open_setting_directly")) == null) {
            return;
        }
        cxcj cxcjVar6 = this.Z;
        cxcjVar6.getClass();
        cwuf cwufVar4 = (cwuf) cxcjVar6;
        oni oniVar = cwufVar4.e.o;
        if (!this.aj.equals(string) || oniVar == null) {
            return;
        }
        oniVar.a(cwufVar4.e);
    }

    public final void e() {
        cxcj cxcjVar = this.Z;
        cxcjVar.getClass();
        cxbg cxbgVar = this.q;
        SpannableStringBuilder e = ddyi.e(cxbgVar.z(), cxbgVar.Z(R.string.rcs_status_legal_banner_pvaas_version, cxbgVar.Y(R.string.rcs_status_about_rcs_chats)), this.q.Y(R.string.rcs_status_about_rcs_chats), new View.OnClickListener() { // from class: cxbi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cxch cxchVar = cxch.this;
                ((cmfb) cxchVar.P.b()).c(epgr.RCS_PROVISIONING_LEGAL_FYI_BANNER_IN_SETTINGS_LEARN_MORE_CLICKED);
                adtc adtcVar = (adtc) cxchVar.t.b();
                eg G = cxchVar.q.G();
                G.getClass();
                adtcVar.h(G);
            }
        });
        RcsSimStatusPreference rcsSimStatusPreference = ((cwuf) cxcjVar).h;
        rcsSimStatusPreference.ac(e);
        rcsSimStatusPreference.ad(0);
        this.O.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        cxcj cxcjVar = this.Z;
        cxcjVar.getClass();
        final String Y = this.q.Y(R.string.rcs_not_available_more_about_rcs_chats);
        if (this.l.isEmpty()) {
            ((enrr) ((enrr) a.h()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "showRcsUnavailablePreference", 1209, "RcsSettingsFragmentV2Peer.java")).q("showRcsUnavailablePreference: device has no available SIMs, removing all preferences");
            this.q.b().ab();
            cwuf cwufVar = (cwuf) cxcjVar;
            this.q.b().ae(cwufVar.f);
            cwufVar.f.L(R.string.rcs_not_available_learn_more_title_v2);
            cwufVar.f.n(ddyi.f(this.q.z(), a(eqwf.DISABLED_SIM_ABSENT, Y, false), Y));
            return;
        }
        final boolean z = this.l.size() > 1;
        engw engwVar = (engw) Collection.EL.stream(this.l).map(new Function() { // from class: cxbt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cxch cxchVar = cxch.this;
                return cxchVar.a(((ckge) ((csjk) cxchVar.u.b()).a()).e(djrn.a((djrm) obj).a), Y, z);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a);
        if (Collection.EL.stream(engwVar).distinct().count() == 1) {
            ((enrr) ((enrr) a.h()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "showRcsUnavailablePreference", 1245, "RcsSettingsFragmentV2Peer.java")).q("showRcsUnavailablePreference: one distinct RCS unavailable string, removing all preferences");
            this.q.b().ab();
            cwuf cwufVar2 = (cwuf) cxcjVar;
            this.q.b().ae(cwufVar2.f);
            cwufVar2.f.L(R.string.rcs_not_available_learn_more_title_v2);
            cwufVar2.f.n(ddyi.f(this.q.z(), (String) engwVar.get(0), Y));
            return;
        }
        ((enrr) ((enrr) a.h()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "showRcsUnavailablePreference", 1262, "RcsSettingsFragmentV2Peer.java")).q("showRcsUnavailablePreference: multiple RCS unavailable strings, displaying unavailable text in RCS sim statuses");
        this.q.b().ab();
        cwuf cwufVar3 = (cwuf) cxcjVar;
        this.q.b().ae(cwufVar3.a);
        this.q.b().ae(cwufVar3.h);
        this.q.b().ae(cwufVar3.f);
        Preference preference = cwufVar3.f;
        cxbg cxbgVar = this.q;
        preference.M(ddyi.f(cxbgVar.z(), cxbgVar.Y(R.string.rcs_status_about_rcs_chats), cxbgVar.Y(R.string.rcs_status_about_rcs_chats)));
        cwufVar3.f.o = new oni() { // from class: cxbu
            @Override // defpackage.oni
            public final boolean a(Preference preference2) {
                cxch cxchVar = cxch.this;
                adtc adtcVar = (adtc) cxchVar.t.b();
                eg G = cxchVar.q.G();
                G.getClass();
                adtcVar.h(G);
                return true;
            }
        };
        cwufVar3.a.G(false);
        cwufVar3.h.G(false);
    }

    public final void g() {
        boolean z = false;
        if (((ckby) this.an.b()).c() && n()) {
            z = true;
        }
        ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "updateMobileDataAutoDownloadInRoaming", 1451, "RcsSettingsFragmentV2Peer.java")).t("updateMobileDataAutoDownloadInRoaming, enabled %s", Boolean.valueOf(z));
        cxcj cxcjVar = this.Z;
        cxcjVar.getClass();
        ((cwuf) cxcjVar).g.k(z);
    }

    public final void h() {
        cxbg cxbgVar = this.q;
        String Y = cxbgVar.Y(R.string.rcs_mobile_data_auto_download_limit_disable_entry);
        String Y2 = cxbgVar.Y(R.string.rcs_mobile_data_auto_download_limit_default_entry);
        String f = ((ctyx) this.x.b()).f(this.ai, this.q.Y(R.string.rcs_mobile_data_auto_download_limit_default_entry));
        String Y3 = f.equals(Y) ? this.q.Y(R.string.rcs_mobile_data_auto_download_limit_disabled_summary) : f.equals(Y2) ? ((csuk) this.ap.b()).f() ? this.q.Z(R.string.rcs_mobile_data_auto_download_limit_summary_format, Formatter.formatShortFileSize(this.q.G(), cwud.b(((csuk) this.ap.b()).e()))) : this.q.Y(R.string.rcs_mobile_data_auto_download_limit_disabled_summary) : this.q.Z(R.string.rcs_mobile_data_auto_download_limit_summary_format, Formatter.formatShortFileSize(this.q.G(), Integer.parseInt(f)));
        cxcj cxcjVar = this.Z;
        cxcjVar.getClass();
        ((cwuf) cxcjVar).d.n(Y3);
    }

    public final void i() {
        LinearLayout linearLayout;
        boolean z = this.k && n();
        enru enruVar = a;
        enrr enrrVar = (enrr) ((enrr) enruVar.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "updateRcsEnabledPreference", 886, "RcsSettingsFragmentV2Peer.java");
        Boolean valueOf = Boolean.valueOf(z);
        enrrVar.J("updateRcsEnabledPreference, enabled %s, rcsEnabledGlobal %s, isReadyToEnableRcsChats %s", valueOf, Boolean.valueOf(this.k), Boolean.valueOf(n()));
        ((enrr) ((enrr) enruVar.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "setRcsEnabledPreference", 893, "RcsSettingsFragmentV2Peer.java")).t("setRcsEnabledPreference, checked %s", valueOf);
        cxcj cxcjVar = this.Z;
        cxcjVar.getClass();
        cwuf cwufVar = (cwuf) cxcjVar;
        cwufVar.a.k(z);
        if (z && ((linearLayout = cwufVar.h.a) == null || linearLayout.getVisibility() == 8)) {
            ((enrr) ((enrr) enruVar.h()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "setRcsEnabledPreference", 901, "RcsSettingsFragmentV2Peer.java")).q("showing RCS sim status preference");
            LinearLayout linearLayout2 = cwufVar.h.a;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
        }
        if (this.k) {
            p();
        } else {
            r();
        }
    }

    public final void j(cmip cmipVar) {
        ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "updateRcsGlobalToggle", 912, "RcsSettingsFragmentV2Peer.java")).t("updateRcsGlobalToggle: rcsGlobalToggleState %s", cmipVar);
        ((ejlq) this.G.b()).i(ejlp.b(((cmgr) this.Q.b()).g(cmipVar)), new ejlm(Integer.valueOf(cmipVar.e)), this.ab);
    }

    final void k() {
        cxcj cxcjVar = this.Z;
        cxcjVar.getClass();
        if (((asqs) this.R.b()).a() && l()) {
            f();
            if (this.q.a(this.d) == null) {
                return;
            }
        }
        cwuf cwufVar = (cwuf) cxcjVar;
        RcsSimStatusPreference rcsSimStatusPreference = cwufVar.h;
        ArrayList<RcsSimStatusView> arrayList = new ArrayList();
        LinearLayout linearLayout = rcsSimStatusPreference.a;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                arrayList.add((RcsSimStatusView) rcsSimStatusPreference.a.getChildAt(i));
            }
        } else if (!rcsSimStatusPreference.b.isEmpty()) {
            arrayList.addAll(rcsSimStatusPreference.b);
        }
        for (RcsSimStatusView rcsSimStatusView : arrayList) {
            djrm djrmVar = rcsSimStatusView.H().c;
            eqwf e = ((ckge) ((csjk) this.u.b()).a()).e(djrn.a(djrmVar).a);
            enru enruVar = a;
            ((enrr) ((enrr) enruVar.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "updateRcsSimStatusPreference", 1159, "RcsSettingsFragmentV2Peer.java")).D("updating RCS sim status for rcsProvisioningId: %s, rcsAvailability: %s", dktx.SIM_ID.c(djrn.a(djrmVar).a), e);
            if ((new djtc(e).d() || !n()) && !((asqs) this.R.b()).a()) {
                ((enrr) ((enrr) enruVar.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "updateRcsSimStatusPreference", 1165, "RcsSettingsFragmentV2Peer.java")).t("Hiding RCS sim status preference, availability %s", e);
                cwufVar.h.ab();
            } else {
                Set r = ((cort) this.au.b()).r(djrmVar);
                if (!r.isEmpty()) {
                    rcsSimStatusView.H().i(((djrq) r.iterator().next()).a, new djtc(e));
                }
            }
        }
    }

    public final boolean l() {
        if (!this.m) {
            ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "allRcsSimStatusesShouldNotBeDisplayed", 1184, "RcsSettingsFragmentV2Peer.java")).q("allRcsSimStatusesShouldNotBeDisplayed: RCS SIM info has not been loaded yet");
            return false;
        }
        boolean allMatch = Collection.EL.stream(this.l).allMatch(new Predicate() { // from class: cxbv
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                cxch cxchVar = cxch.this;
                return !cxchVar.m(((ckge) ((csjk) cxchVar.u.b()).a()).e(djrn.a((djrm) obj).a));
            }
        });
        ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "allRcsSimStatusesShouldNotBeDisplayed", 1198, "RcsSettingsFragmentV2Peer.java")).t("allRcsSimStatusesShouldNotBeDisplayed: %s", Boolean.valueOf(allMatch));
        return allMatch;
    }

    public final boolean m(eqwf eqwfVar) {
        int ordinal = eqwfVar.ordinal();
        if (ordinal != 3 && ordinal != 4 && ordinal != 5 && ordinal != 7 && ordinal != 10 && ordinal != 21 && ordinal != 25) {
            switch (ordinal) {
                case 16:
                case 17:
                case 18:
                    break;
                default:
                    switch (ordinal) {
                        case 29:
                            return ((aulq) this.ay.b()).a();
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "canDisplayRcsChatsStatus", 1814, "RcsSettingsFragmentV2Peer.java")).H("canDisplayRcsChatsStatus %s, Rcs availability %s", false, eqwfVar);
                            return false;
                    }
            }
        }
        ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "canDisplayRcsChatsStatus", 1807, "RcsSettingsFragmentV2Peer.java")).H("canDisplayRcsChatsStatus %s, Rcs availability %s", true, eqwfVar);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (((defpackage.ctyx) r9.x.b()).d("rcs_tos_state", 0) != 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (r0 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r9.j == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        ((defpackage.enrr) ((defpackage.enrr) defpackage.cxch.a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "isReadyToEnableRcsChatsForAllSims", 1941, "RcsSettingsFragmentV2Peer.java")).J("isReadyToEnabledRcsChatsForAllSims: %s, googleTosAccepted: %s, hasRcsDefaultOnConsent: %s", java.lang.Boolean.valueOf(r5), java.lang.Boolean.valueOf(r0), java.lang.Boolean.valueOf(r9.j));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n() {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxch.n():boolean");
    }

    public final boolean o(Object obj, List list) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean z = !((asqs) this.R.b()).a() && t(true) && booleanValue;
        boolean b2 = (djai.z() && djai.ac()) ? this.o : this.N.b();
        if (djai.M() && booleanValue) {
            ((ejlq) this.G.b()).g(ejlp.b(((cmne) this.aw.b()).b()), this.af);
        }
        enru enruVar = a;
        ((enrr) ((enrr) enruVar.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "onRcsEnablePrefUpdate", 952, "RcsSettingsFragmentV2Peer.java")).I("onRcsEnablePrefUpdate : isEnabled %s, shouldShowGoogleTos %s", booleanValue, z);
        if (z && !b2) {
            ((enrr) ((enrr) enruVar.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "onRcsEnablePrefUpdate", 956, "RcsSettingsFragmentV2Peer.java")).q("onRcsEnablePrefUpdate: showing Google ToS");
            final ddxs ddxsVar = (ddxs) this.ar.b();
            final eg G = this.q.G();
            G.getClass();
            final Runnable runnable = new Runnable() { // from class: cxbo
                @Override // java.lang.Runnable
                public final void run() {
                    ((enrr) ((enrr) cxch.a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "onGoogleTosAccepted", 1576, "RcsSettingsFragmentV2Peer.java")).q("onGoogleTosAccepted");
                    cxch cxchVar = cxch.this;
                    ((ctyx) cxchVar.x.b()).h("should_show_google_tos_prompt", false);
                    ((ctyx) cxchVar.x.b()).h("did_show_google_tos_prompt", true);
                    ((ctyx) cxchVar.x.b()).j("rcs_tos_state", 2);
                    cxchVar.j(cmip.TOGGLE_STATE_ENABLED);
                }
            };
            final dcxs a2 = ddxsVar.c.a(epgt.PROVISIONING_UI_TYPE_GOOGLE_TOS_FROM_SETTINGS, 2);
            ddxsVar.d.c("Bugle.FastTrack.Settings.Dialog.Seen");
            ((altk) ddxsVar.b.b()).U(epgr.RCS_PROVISIONING_PROMPT_SEEN, epgt.PROVISIONING_UI_TYPE_GOOGLE_TOS_FROM_SETTINGS);
            ((altk) ddxsVar.b.b()).aL(21);
            String string = G.getString(R.string.setting_fast_track_body_with_cost_v2, new Object[]{G.getString(R.string.rcs_chats_terms_of_service), crmi.a(G)});
            ehft ehftVar = new ehft(G);
            ehftVar.x(R.string.settings_fast_track_dialog_title_v2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            a2.d(G, spannableStringBuilder);
            a2.c(G, spannableStringBuilder);
            String a3 = crmi.a(G);
            int indexOf = TextUtils.indexOf(spannableStringBuilder, a3);
            if (indexOf != -1) {
                spannableStringBuilder.setSpan(new elbs(a2.l, "ProvisioningHelper#addLearnMoreSpan", new dcxq(a2)), indexOf, a3.length() + indexOf, 17);
            }
            ehftVar.n(spannableStringBuilder);
            ehftVar.j(false);
            ehftVar.o(R.string.fast_track_negative_button_text, new elbb(ddxsVar.i, "GoogleTosDialog#NegativeButtonClick", new DialogInterface.OnClickListener() { // from class: ddxn
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ddxs ddxsVar2 = ddxs.this;
                    ((altk) ddxsVar2.b.b()).U(epgr.RCS_PROVISIONING_PROMPT_DECLINED, epgt.PROVISIONING_UI_TYPE_GOOGLE_TOS_FROM_SETTINGS);
                    ddxsVar2.d.c("Bugle.FastTrack.Settings.Dialog.Declined");
                    dialogInterface.dismiss();
                }
            }));
            ehftVar.t(R.string.fast_track_positive_button_text, new elbb(ddxsVar.i, "GoogleTosDialog#PositiveButtonClick", new DialogInterface.OnClickListener() { // from class: ddxg
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    a2.k(G, false);
                    ddxs ddxsVar2 = ddxs.this;
                    ((altk) ddxsVar2.b.b()).U(epgr.RCS_PROVISIONING_PROMPT_ACCEPTED, epgt.PROVISIONING_UI_TYPE_GOOGLE_TOS_FROM_SETTINGS);
                    ddxsVar2.d.c("Bugle.FastTrack.Settings.Dialog.Accepted");
                    runnable.run();
                }
            }));
            iv create = ehftVar.create();
            create.show();
            View findViewById = create.findViewById(android.R.id.message);
            if (findViewById instanceof TextView) {
                TextView textView = (TextView) findViewById;
                egyl.b(textView);
                egyl.c(textView);
            }
            return false;
        }
        if (!booleanValue) {
            if (list.size() < 2) {
                if (this.ag != null) {
                    eg G2 = this.q.G();
                    G2.getClass();
                    this.ag.c(new Intent(G2, (Class<?>) TurnOffRcsActivity.class));
                }
                return false;
            }
            eg G3 = this.q.G();
            G3.getClass();
            ehft ehftVar2 = new ehft(G3);
            ehftVar2.y(this.q.Y(R.string.disable_rcs_warning_title_v2));
            ehftVar2.u(this.q.Y(R.string.disable_rcs_warning_accept_text), new elbb((elbx) this.E.b(), "RcsSettingsFragmentV2Peer#onRcsEnablePrefUpdate", new DialogInterface.OnClickListener() { // from class: cxbp
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    cxch.this.c();
                }
            }));
            ehftVar2.p(this.q.Y(android.R.string.cancel), null);
            if (((asqs) this.R.b()).a() && list.size() > 1) {
                if (list.size() == 2) {
                    ehftVar2.n((((cmiw) list.get(0)).e.isEmpty() || ((cmiw) list.get(1)).e.isEmpty()) ? this.q.Y(R.string.disable_rcs_warning_text_global_level_two_sims) : this.q.Z(R.string.disable_rcs_warning_text_global_level_phone_number, ((cmiw) list.get(0)).e, ((cmiw) list.get(1)).e));
                } else {
                    ehftVar2.n(this.q.Y(R.string.disable_rcs_warning_text_global_level_three_or_more_sims));
                }
            }
            ehftVar2.a();
            return false;
        }
        if (!this.i || ((arep) this.av.b()).a()) {
            ((ejlq) this.G.b()).g(ejlp.b(((cmfj) this.U.b()).d()), this.ae);
            ((cxka) this.I.b()).a(2);
            j(cmip.TOGGLE_STATE_ENABLED);
            if (((djai.z() && djai.ac()) ? this.n : dimo.b()) && b2) {
                ((enrr) ((enrr) enruVar.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "onRcsEnablePrefUpdate", 987, "RcsSettingsFragmentV2Peer.java")).q("onRcsEnablePrefUpdate: showing LegalFYI Banner");
                b();
                e();
            }
            if (list.size() < 2) {
                p();
            }
            return true;
        }
        eg G4 = this.q.G();
        G4.getClass();
        ehft ehftVar3 = new ehft(G4);
        ehftVar3.y(this.q.Y(R.string.disable_multidevice_dialog_title));
        ehftVar3.n(ddyi.c(this.q.z(), this.aq, this.t, R.string.disable_multidevice_dialog_message_v2, null, csgj.i));
        ehftVar3.u(this.q.Y(R.string.disable_multidevice_dialog_positive_button), new elbb((elbx) this.E.b(), "RcsSettingsFragmentV2Peer:enableMultideviceDialog:positive", new DialogInterface.OnClickListener() { // from class: cxbl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                boolean booleanValue2 = ((Boolean) csgj.q.e()).booleanValue();
                cxch cxchVar = cxch.this;
                if (booleanValue2) {
                    ((ejlq) cxchVar.G.b()).g(new ejlp(((babf) cxchVar.s.b()).a()), cxchVar.K);
                    return;
                }
                cxbg cxbgVar = cxchVar.q;
                elhh.a(cxbgVar, tcn.c(cxchVar.q.z()));
                dialogInterface.dismiss();
            }
        }));
        ehftVar3.p(this.q.Y(android.R.string.cancel), new elbb((elbx) this.E.b(), "RcsSettingsFragmentV2Peer:enableMultideviceDialog:negative", new DialogInterface.OnClickListener() { // from class: cxbm
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                enru enruVar2 = cxch.a;
                dialogInterface.dismiss();
            }
        }));
        final iv create2 = ehftVar3.create();
        create2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: cxbn
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                enru enruVar2 = cxch.a;
                TextView textView2 = (TextView) iv.this.findViewById(android.R.id.message);
                textView2.getClass();
                egyl.b(textView2);
                egyl.c(textView2);
            }
        });
        create2.show();
        return false;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "onSharedPreferenceChanged", 1844, "RcsSettingsFragmentV2Peer.java")).t("onSharedPreferenceChanged : key = %s", str);
        if (str.equals(this.ah)) {
            int d = ((ctyx) this.x.b()).d(this.ah, this.al);
            int i = this.g;
            eg G = this.q.G();
            G.getClass();
            String[] stringArray = G.getResources().getStringArray(i == 1 ? R.array.rcs_fallback_to_sms_dialog_options : R.array.rcs_fallback_to_xms_dialog_options);
            cxcj cxcjVar = this.Z;
            cxcjVar.getClass();
            ((cwuf) cxcjVar).b.n(stringArray[d]);
            return;
        }
        if (str.equals(this.e)) {
            boolean q = ((ctyx) this.x.b()).q(this.e, false);
            cxcj cxcjVar2 = this.Z;
            cxcjVar2.getClass();
            ((cwuf) cxcjVar2).c.k(q);
            return;
        }
        if (str.equals(this.ai)) {
            h();
        } else if (str.equals(this.aj)) {
            s();
        } else if (this.f.equals(str)) {
            g();
        }
    }

    /* compiled from: PG */
    final class a implements ejlr<Void, eisx> {
        public a() {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            tcm tcmVar = (tcm) ((Optional) ((fbbb) cxch.this.L).a).get();
            Context context = cxch.this.q.b().j;
            Intent a = tcmVar.a();
            eiuy.c(a, (eisx) obj2);
            elhh.a(cxch.this.q, a);
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            ((enrr) ((enrr) ((enrr) cxch.a.j()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$LinkedAccountCallback", "onFailure", (char) 1973, "RcsSettingsFragmentV2Peer.java")).q("Failed to load linked CMS Account");
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
