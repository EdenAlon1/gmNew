package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.apps.messaging.ui.appsettings.SuggestionExamplePreference;
import defpackage.fbal;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxgb extends cwwt implements ekhu, fbas, ekhq, ekkk, elar {
    private cxgq aj;
    private Context ak;
    private final lkv al = new lkv(this);
    private final ekxu an = new ekxu(this);
    private boolean ao;

    @Deprecated
    public cxgb() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return cxgq.class;
    }

    @Override // defpackage.efad, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.an.k();
        try {
            View M = super.M(layoutInflater, viewGroup, bundle);
            ekyf.q();
            return M;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.al;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.efad, defpackage.ea
    public final boolean aM(MenuItem menuItem) {
        elav j = this.an.j();
        try {
            boolean aM = super.aM(menuItem);
            j.close();
            return aM;
        } catch (Throwable th) {
            try {
                j.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ea
    public final void aR(int i, int i2) {
        this.an.h(i, i2);
        ekyf.q();
    }

    @Override // defpackage.cwwt
    protected final /* synthetic */ fbae aV() {
        return new ekku(this);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.ak == null) {
            this.ak = new ekkn(this, super.z());
        }
        return this.ak;
    }

    @Override // defpackage.efad, defpackage.ea
    public final void ae(Bundle bundle) {
        this.an.k();
        try {
            super.ae(bundle);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efad, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        elav f = this.an.f();
        try {
            super.af(i, i2, intent);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cwwt, defpackage.efad, defpackage.ea
    public final void ag(Activity activity) {
        this.an.k();
        try {
            super.ag(activity);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efad, defpackage.ea
    public final void ai() {
        elav b = this.an.b();
        try {
            super.ai();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efad, defpackage.ea
    public final void am() {
        this.an.k();
        try {
            super.am();
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efad, defpackage.ea
    public final void ao() {
        elav b = this.an.b();
        try {
            super.ao();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.akuc, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.an.k();
        try {
            super.ap(view, bundle);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekhu
    /* renamed from: ba, reason: merged with bridge method [inline-methods] */
    public final cxgq H() {
        cxgq cxgqVar = this.aj;
        if (cxgqVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cxgqVar;
    }

    @Override // defpackage.elar
    public final elds bb() {
        return this.an.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.an.e(eldsVar, z);
    }

    @Override // defpackage.elar
    public final void be(elds eldsVar) {
        this.an.b = eldsVar;
    }

    @Override // defpackage.akuc
    protected final boolean bf() {
        return true;
    }

    @Override // defpackage.cwwt, defpackage.ea
    public final void g(Context context) {
        this.an.k();
        try {
            if (this.ao) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.aj == null) {
                try {
                    Object aX = aX();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof cxgb)) {
                        throw new IllegalStateException(a.J(eaVar, cxgq.class));
                    }
                    this.aj = new cxgq((cxgb) eaVar, (akvg) ((akgt) aX).a.a.Px.b(), (ctml) ((akgt) aX).a.a.ni.b(), ((akgt) aX).aG);
                    this.Z.c(new ekkg(this.an, this.al));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            lkr lkrVar = this.E;
            if (lkrVar instanceof elar) {
                ekxu ekxuVar = this.an;
                if (ekxuVar.a == null) {
                    ekxuVar.e(((elar) lkrVar).bb(), true);
                }
            }
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.an.k();
        try {
            LayoutInflater aO = aO();
            LayoutInflater cloneInContext = aO.cloneInContext(new fbal.a(aO, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new ekkn(this, cloneInContext));
            ekyf.q();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efad, defpackage.ont, defpackage.ea
    public final void h(Bundle bundle) {
        this.an.k();
        try {
            super.h(bundle);
            cxgq H = H();
            if (ctjd.c()) {
                cxhl cxhlVar = H.a;
                cxhlVar.getClass();
                cxhlVar.e();
            }
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efad, defpackage.ont, defpackage.ea
    public final void i() {
        elav b = this.an.b();
        try {
            super.i();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efad, defpackage.ea
    public final void j() {
        elav a = this.an.a();
        try {
            super.j();
            this.ao = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efad, defpackage.ea
    public final void k(Bundle bundle) {
        this.an.k();
        try {
            super.k(bundle);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efad, defpackage.ont, defpackage.ea
    public final void l() {
        this.an.k();
        try {
            super.l();
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efad, defpackage.ont, defpackage.ea
    public final void m() {
        this.an.k();
        try {
            super.m();
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ont
    public final void t(Bundle bundle) {
        final cxgq H = H();
        if (ctjd.c()) {
            cxhl cxhlVar = H.a;
            cxhlVar.getClass();
            cxhlVar.f();
            return;
        }
        H.b.b.f("bugle");
        H.b.gi(R.xml.smarts_preferences);
        H.b.b().ag();
        Optional c = H.c(R.string.suggested_stickers_enabled_pref_key);
        if (!((Boolean) ctjd.q.e()).booleanValue()) {
            final PreferenceScreen b = H.b.b();
            b.getClass();
            c.ifPresent(new Consumer() { // from class: cxgi
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    PreferenceScreen.this.af((Preference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        Optional c2 = H.c(R.string.mc_enabled_pref_key);
        final PreferenceScreen b2 = H.b.b();
        b2.getClass();
        c2.ifPresent(new Consumer() { // from class: cxgi
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                PreferenceScreen.this.af((Preference) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Optional c3 = H.c(R.string.experiment_badge_pref_key);
        final PreferenceScreen b3 = H.b.b();
        b3.getClass();
        c3.ifPresent(new Consumer() { // from class: cxgi
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                PreferenceScreen.this.af((Preference) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Optional c4 = H.c(R.string.smart_action_example_key);
        Optional c5 = H.c(R.string.smart_reply_suggestion_example_key);
        Optional c6 = H.c(R.string.smart_action_settings_parent_pref);
        Optional c7 = H.c(R.string.smart_actions_enabled_pref_key);
        if (((Boolean) ((cfup) cwlj.a.get()).e()).booleanValue()) {
            final PreferenceScreen b4 = H.b.b();
            b4.getClass();
            c7.ifPresent(new Consumer() { // from class: cxgi
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    PreferenceScreen.this.af((Preference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            final PreferenceScreen b5 = H.b.b();
            b5.getClass();
            c4.ifPresent(new Consumer() { // from class: cxge
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    PreferenceScreen.this.af((SuggestionExamplePreference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            c6.ifPresent(new Consumer() { // from class: cxgf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    PreferenceScreen preferenceScreen = (PreferenceScreen) obj;
                    preferenceScreen.t = cxgq.this.c.e(preferenceScreen.j);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            final PreferenceScreen b6 = H.b.b();
            b6.getClass();
            c6.ifPresent(new Consumer() { // from class: cxgk
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    PreferenceScreen.this.af((PreferenceScreen) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        Resources B = H.b.B();
        if (((Boolean) ((cfup) cwlj.b.get()).e()).booleanValue()) {
            final PreferenceScreen b7 = H.b.b();
            b7.getClass();
            c4.ifPresent(new Consumer() { // from class: cxge
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    PreferenceScreen.this.af((SuggestionExamplePreference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            final PreferenceScreen b8 = H.b.b();
            b8.getClass();
            c5.ifPresent(new Consumer() { // from class: cxge
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    PreferenceScreen.this.af((SuggestionExamplePreference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            int i = engw.d;
            final engr engrVar = new engr();
            if (H.d.d()) {
                fbwz fbwzVar = (fbwz) fbxa.a.createBuilder();
                fbsh fbshVar = fbsh.a;
                fbwzVar.copyOnWrite();
                fbxa fbxaVar = (fbxa) fbwzVar.instance;
                fbshVar.getClass();
                fbxaVar.d = fbshVar;
                fbxaVar.c = 19;
                fbwx fbwxVar = (fbwx) fbwy.b.createBuilder();
                fbri fbriVar = fbri.CALENDAR;
                fbwxVar.copyOnWrite();
                ((fbwy) fbwxVar.instance).l = fbriVar.a();
                fbwzVar.copyOnWrite();
                fbxa fbxaVar2 = (fbxa) fbwzVar.instance;
                fbwy fbwyVar = (fbwy) fbwxVar.build();
                fbwyVar.getClass();
                fbxaVar2.e = fbwyVar;
                fbxaVar2.b |= 1;
                engrVar.h(new SmartSuggestionItemSuggestionData((fbxa) fbwzVar.build()));
            }
            if (H.d.i()) {
                fbwz fbwzVar2 = (fbwz) fbxa.a.createBuilder();
                fbwn fbwnVar = fbwn.a;
                fbwzVar2.copyOnWrite();
                fbxa fbxaVar3 = (fbxa) fbwzVar2.instance;
                fbwnVar.getClass();
                fbxaVar3.d = fbwnVar;
                fbxaVar3.c = 17;
                fbwx fbwxVar2 = (fbwx) fbwy.b.createBuilder();
                fbri fbriVar2 = fbri.RECENT_IMAGE;
                fbwxVar2.copyOnWrite();
                ((fbwy) fbwxVar2.instance).l = fbriVar2.a();
                fbwzVar2.copyOnWrite();
                fbxa fbxaVar4 = (fbxa) fbwzVar2.instance;
                fbwy fbwyVar2 = (fbwy) fbwxVar2.build();
                fbwyVar2.getClass();
                fbxaVar4.e = fbwyVar2;
                fbxaVar4.b |= 1;
                engrVar.h(new SmartSuggestionItemSuggestionData((fbxa) fbwzVar2.build()));
            }
            if (H.d.e()) {
                fbwz fbwzVar3 = (fbwz) fbxa.a.createBuilder();
                fbth fbthVar = fbth.a;
                fbwzVar3.copyOnWrite();
                fbxa fbxaVar5 = (fbxa) fbwzVar3.instance;
                fbthVar.getClass();
                fbxaVar5.d = fbthVar;
                fbxaVar5.c = 14;
                fbwx fbwxVar3 = (fbwx) fbwy.b.createBuilder();
                fbri fbriVar3 = fbri.DUO_CALL;
                fbwxVar3.copyOnWrite();
                ((fbwy) fbwxVar3.instance).l = fbriVar3.a();
                fbwzVar3.copyOnWrite();
                fbxa fbxaVar6 = (fbxa) fbwzVar3.instance;
                fbwy fbwyVar3 = (fbwy) fbwxVar3.build();
                fbwyVar3.getClass();
                fbxaVar6.e = fbwyVar3;
                fbxaVar6.b |= 1;
                engrVar.h(new SmartSuggestionItemSuggestionData((fbxa) fbwzVar3.build()));
            }
            if (H.d.h()) {
                fbwz fbwzVar4 = (fbwz) fbxa.a.createBuilder();
                fbwp fbwpVar = fbwp.a;
                fbwzVar4.copyOnWrite();
                fbxa fbxaVar7 = (fbxa) fbwzVar4.instance;
                fbwpVar.getClass();
                fbxaVar7.d = fbwpVar;
                fbxaVar7.c = 3;
                fbwx fbwxVar4 = (fbwx) fbwy.b.createBuilder();
                fbri fbriVar4 = fbri.LOCATION;
                fbwxVar4.copyOnWrite();
                ((fbwy) fbwxVar4.instance).l = fbriVar4.a();
                fbwzVar4.copyOnWrite();
                fbxa fbxaVar8 = (fbxa) fbwzVar4.instance;
                fbwy fbwyVar4 = (fbwy) fbwxVar4.build();
                fbwyVar4.getClass();
                fbxaVar8.e = fbwyVar4;
                fbxaVar8.b |= 1;
                engrVar.h(new SmartSuggestionItemSuggestionData((fbxa) fbwzVar4.build()));
            }
            if (H.d.g()) {
                String string = B.getString(R.string.example_gif_search_action_text);
                fbwz fbwzVar5 = (fbwz) fbxa.a.createBuilder();
                fbtv fbtvVar = (fbtv) fbtw.a.createBuilder();
                fbtvVar.copyOnWrite();
                fbtw fbtwVar = (fbtw) fbtvVar.instance;
                string.getClass();
                fbtwVar.b = string;
                fbwzVar5.copyOnWrite();
                fbxa fbxaVar9 = (fbxa) fbwzVar5.instance;
                fbtw fbtwVar2 = (fbtw) fbtvVar.build();
                fbtwVar2.getClass();
                fbxaVar9.d = fbtwVar2;
                fbxaVar9.c = 5;
                fbwx fbwxVar5 = (fbwx) fbwy.b.createBuilder();
                fbri fbriVar5 = fbri.GIF;
                fbwxVar5.copyOnWrite();
                ((fbwy) fbwxVar5.instance).l = fbriVar5.a();
                fbwzVar5.copyOnWrite();
                fbxa fbxaVar10 = (fbxa) fbwzVar5.instance;
                fbwy fbwyVar5 = (fbwy) fbwxVar5.build();
                fbwyVar5.getClass();
                fbxaVar10.e = fbwyVar5;
                fbxaVar10.b |= 1;
                engrVar.h(new SmartSuggestionItemSuggestionData((fbxa) fbwzVar5.build()));
            }
            c4.ifPresent(new Consumer() { // from class: cxgg
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((SuggestionExamplePreference) obj).a = engr.this.g();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            final engr engrVar2 = new engr();
            engrVar2.h(cxgq.b(B.getString(R.string.example_smart_reply_text1)));
            engrVar2.h(cxgq.b(B.getString(R.string.example_smart_reply_text2)));
            engrVar2.h(cxgq.b(B.getString(R.string.example_smart_reply_text3)));
            engrVar2.h(cxgq.b(B.getString(R.string.example_smart_reply_text4)));
            c5.ifPresent(new Consumer() { // from class: cxgj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((SuggestionExamplePreference) obj).a = engr.this.g();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        H.e = H.c(R.string.nudge_settings_parent_pref);
        if (ctjd.f()) {
            H.e.ifPresent(new Consumer() { // from class: cxgh
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cxgq cxgqVar = cxgq.this;
                    ((PreferenceScreen) obj).t = cxgqVar.c.d(cxgqVar.b.b().j);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            Optional optional = H.e;
            final PreferenceScreen b9 = H.b.b();
            b9.getClass();
            optional.ifPresent(new Consumer() { // from class: cxgk
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    PreferenceScreen.this.af((PreferenceScreen) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (((Boolean) ((cfup) cwlj.b.get()).e()).booleanValue()) {
            H.c(R.string.assistant_enabled_pref_key).ifPresent(new Consumer() { // from class: cxgl
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    Preference preference = (Preference) obj;
                    preference.H(cxgq.this.a(R.drawable.assistant_logo));
                    preference.J(R.string.assistant_preference_summary);
                    preference.I(8);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            H.c(R.string.p2p_conversation_suggestions_enabled_pref_key).ifPresent(new Consumer() { // from class: cxgm
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    Preference preference = (Preference) obj;
                    preference.H(cxgq.this.a(R.drawable.quantum_gm_ic_chat_vd_theme_24));
                    preference.J(R.string.smart_reply_preference_summary);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            c.ifPresent(new Consumer() { // from class: cxgn
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    Preference preference = (Preference) obj;
                    preference.H(cxgq.this.a(R.drawable.quantum_gm_ic_sticker_vd_theme_24));
                    preference.I(7);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            H.e.ifPresent(new Consumer() { // from class: cxgo
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((PreferenceScreen) obj).H(cxgq.this.a(R.drawable.quantum_ic_alarm_vd_theme_24));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (((Boolean) ((cfup) cwlj.a.get()).e()).booleanValue()) {
                c6.ifPresent(new Consumer() { // from class: cxgp
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ((PreferenceScreen) obj).H(cxgq.this.a(R.drawable.quantum_gm_ic_calendar_add_on_gm_grey_24));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else {
                c7.ifPresent(new Consumer() { // from class: cxgd
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ((Preference) obj).H(cxgq.this.a(R.drawable.quantum_gm_ic_calendar_add_on_gm_grey_24));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
        Optional c8 = H.c(R.string.smarts_learn_more_pref_key);
        if (c8.isEmpty()) {
            return;
        }
        ((Preference) c8.get()).o = new oni() { // from class: cxgc
            @Override // defpackage.oni
            public final boolean a(Preference preference) {
                cxgq cxgqVar = cxgq.this;
                cxgqVar.c.y(cxgqVar.b.G(), (String) ctjd.t.e());
                return true;
            }
        };
        Preference preference = (Preference) c8.get();
        cxgb cxgbVar = H.b;
        String Y = cxgbVar.Y(R.string.smarts_learn_more);
        preference.M(ddyi.f(H.b.G(), Html.fromHtml(cxgbVar.Z(R.string.smarts_preference_info_text, Y)).toString(), Y));
    }

    @Override // defpackage.cwwt, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
