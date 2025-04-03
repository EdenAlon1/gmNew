package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Html;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.apps.messaging.ui.appsettings.SuggestionExamplePreference;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxhl {
    public final akuc a;
    public final akvg b;
    public final ejwl c;
    public final elhk d;
    public final Optional e;
    public final Optional f;
    public final ffbr g;
    public final Optional h;
    private final ctml i;
    private final Optional j;
    private Optional k;

    public cxhl(akuc akucVar, akvg akvgVar, ejwl ejwlVar, ctml ctmlVar, elhk elhkVar, Optional optional, Optional optional2, Optional optional3, ffbr ffbrVar, Optional optional4) {
        this.a = akucVar;
        this.b = akvgVar;
        this.c = ejwlVar;
        this.i = ctmlVar;
        this.d = elhkVar;
        this.e = optional;
        this.f = optional2;
        this.j = optional3;
        this.g = ffbrVar;
        this.h = optional4;
    }

    private static SmartSuggestionData g(String str) {
        fbwz fbwzVar = (fbwz) fbxa.a.createBuilder();
        fbxb fbxbVar = (fbxb) fbxc.a.createBuilder();
        fbxbVar.copyOnWrite();
        fbxc fbxcVar = (fbxc) fbxbVar.instance;
        str.getClass();
        fbxcVar.c = str;
        fbwzVar.copyOnWrite();
        fbxa fbxaVar = (fbxa) fbwzVar.instance;
        fbxc fbxcVar2 = (fbxc) fbxbVar.build();
        fbxcVar2.getClass();
        fbxaVar.d = fbxcVar2;
        fbxaVar.c = 2;
        fbwx fbwxVar = (fbwx) fbwy.b.createBuilder();
        fbri fbriVar = fbri.FULL_MESSAGE;
        fbwxVar.copyOnWrite();
        ((fbwy) fbwxVar.instance).l = fbriVar.a();
        fbwzVar.copyOnWrite();
        fbxa fbxaVar2 = (fbxa) fbwzVar.instance;
        fbwy fbwyVar = (fbwy) fbwxVar.build();
        fbwyVar.getClass();
        fbxaVar2.e = fbwyVar;
        fbxaVar2.b |= 1;
        return new SmartSuggestionItemSuggestionData((fbxa) fbwzVar.build());
    }

    private final void h(int i, Preference preference) {
        String Y = this.a.Y(R.string.smarts_learn_more);
        preference.M(ddyi.f(this.a.G(), Html.fromHtml(this.a.Z(i, Y)).toString(), Y));
    }

    public final Drawable a(int i) {
        Context z = this.a.z();
        z.getClass();
        Context z2 = this.a.z();
        z2.getClass();
        return ctap.i(z, i, ehdr.d(z2, R.attr.colorOnSurface, "SmartsSettingsFragmentPeer: failed to get color R.attr.colorOnSurfaceVariant"));
    }

    public final Optional b(int i) {
        akuc akucVar = this.a;
        return Optional.ofNullable(akucVar.a(akucVar.Y(i)));
    }

    public final void c(Preference preference, boolean z) {
        if (z) {
            preference.J(true != ((asuf) ((wlu) this.e.get()).a.b()).a() ? R.string.magic_compose_setting_summary : R.string.magic_compose_setting_summary_rewrite_only);
        } else {
            preference.J(true != ((asuf) ((wlu) this.e.get()).a.b()).a() ? R.string.magic_compose_setting_disabled_summary : R.string.magic_compose_setting_disabled_summary_rewrite_only);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (((defpackage.asuf) ((defpackage.wlu) r1).a.b()).a() == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r4 = this;
            r0 = 2132087547(0x7f1512fb, float:1.9815352E38)
            j$.util.Optional r0 = r4.b(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Le
            return
        Le:
            java.lang.Object r1 = r0.get()
            androidx.preference.Preference r1 = (androidx.preference.Preference) r1
            cxhd r2 = new cxhd
            r2.<init>()
            r1.o = r2
            boolean r1 = defpackage.ctjd.c()
            if (r1 == 0) goto L8f
            j$.util.Optional r1 = r4.e
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L8f
            r1 = 2132085371(0x7f150a7b, float:1.9810939E38)
            j$.util.Optional r1 = r4.b(r1)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L37
            goto L8f
        L37:
            j$.util.Optional r1 = r4.e
            java.lang.Object r1 = r1.get()
            cfup r2 = defpackage.ctjd.bd
            java.lang.Object r2 = r2.e()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L6e
            cfup r2 = defpackage.ctjd.bg
            java.lang.Object r2 = r2.e()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 2132088751(0x7f1517af, float:1.9817794E38)
            if (r2 != 0) goto L85
            r2 = r1
            wlu r2 = (defpackage.wlu) r2
            ffbr r2 = r2.a
            java.lang.Object r2 = r2.b()
            asuf r2 = (defpackage.asuf) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L6e
            goto L85
        L6e:
            wlu r1 = (defpackage.wlu) r1
            ffbr r1 = r1.a
            java.lang.Object r1 = r1.b()
            asuf r1 = (defpackage.asuf) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L82
            r3 = 2132088752(0x7f1517b0, float:1.9817796E38)
            goto L85
        L82:
            r3 = 2132088750(0x7f1517ae, float:1.9817792E38)
        L85:
            java.lang.Object r0 = r0.get()
            androidx.preference.Preference r0 = (androidx.preference.Preference) r0
            r4.h(r3, r0)
            return
        L8f:
            java.lang.Object r0 = r0.get()
            androidx.preference.Preference r0 = (androidx.preference.Preference) r0
            r1 = 2132087548(0x7f1512fc, float:1.9815354E38)
            r4.h(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxhl.d():void");
    }

    public final void e() {
        if (ctjd.c()) {
            this.j.ifPresent(new Consumer() { // from class: cxhc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ejuh a = ((wgw) obj).a();
                    final cxhl cxhlVar = cxhl.this;
                    cxhlVar.c.b(a, new ejwd<aixr>() { // from class: cxhl.1
                        @Override // defpackage.ejwd
                        public final void a(Throwable th) {
                            cxhl cxhlVar2 = cxhl.this;
                            Optional b = cxhlVar2.b(R.string.mc_enabled_pref_key);
                            PreferenceScreen b2 = cxhlVar2.a.b();
                            b2.getClass();
                            b.ifPresent(new cxhk(b2));
                            cxhl cxhlVar3 = cxhl.this;
                            Optional b3 = cxhlVar3.b(R.string.experiment_badge_pref_key);
                            PreferenceScreen b4 = cxhlVar3.a.b();
                            b4.getClass();
                            b3.ifPresent(new cxhk(b4));
                        }

                        @Override // defpackage.ejwd
                        public final /* bridge */ /* synthetic */ void b(Object obj2) {
                            boolean z = ((aixr) obj2).a;
                            Optional b = cxhl.this.b(R.string.mc_enabled_pref_key);
                            if (!z) {
                                PreferenceScreen b2 = cxhl.this.a.b();
                                b2.getClass();
                                b.ifPresent(new cxhk(b2));
                                cxhl cxhlVar2 = cxhl.this;
                                akuc akucVar = cxhlVar2.a;
                                Optional b3 = cxhlVar2.b(R.string.experiment_badge_pref_key);
                                PreferenceScreen b4 = akucVar.b();
                                b4.getClass();
                                b3.ifPresent(new cxhk(b4));
                            }
                            cxhl.this.d();
                        }

                        @Override // defpackage.ejwd
                        public final /* synthetic */ void hB() {
                        }
                    });
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    public final void f() {
        this.a.b.f("bugle");
        this.a.gi(R.xml.smarts_preferences);
        this.a.b().ag();
        Optional b = b(R.string.suggested_stickers_enabled_pref_key);
        if (!((Boolean) ctjd.q.e()).booleanValue()) {
            final PreferenceScreen b2 = this.a.b();
            b2.getClass();
            b.ifPresent(new Consumer() { // from class: cxhf
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
        if (!ctjd.c() || this.e.isEmpty() || this.j.isEmpty()) {
            Optional b3 = b(R.string.mc_enabled_pref_key);
            final PreferenceScreen b4 = this.a.b();
            b4.getClass();
            b3.ifPresent(new Consumer() { // from class: cxhf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    PreferenceScreen.this.af((Preference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            Optional b5 = b(R.string.experiment_badge_pref_key);
            final PreferenceScreen b6 = this.a.b();
            b6.getClass();
            b5.ifPresent(new Consumer() { // from class: cxhf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    PreferenceScreen.this.af((Preference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            b(R.string.mc_enabled_pref_key).ifPresent(new Consumer() { // from class: cxgy
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    final cxhl cxhlVar = cxhl.this;
                    final SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj;
                    cxhlVar.e.get();
                    switchPreferenceCompat.L(R.string.magic_compose_setting_title);
                    cxhlVar.c(switchPreferenceCompat, ((TwoStatePreference) switchPreferenceCompat).a);
                    switchPreferenceCompat.n = new elhi(cxhlVar.d, "SmartsSettingsFragmentPeer:togglePantherEnabled", new onh() { // from class: cxgr
                        @Override // defpackage.onh
                        public final boolean a(Preference preference, Object obj2) {
                            final boolean equals = Boolean.TRUE.equals(obj2);
                            cxhl cxhlVar2 = cxhl.this;
                            cxhlVar2.c(switchPreferenceCompat, equals);
                            if (equals) {
                                ((woi) cxhlVar2.g.b()).c(false);
                                woi woiVar = (woi) cxhlVar2.g.b();
                                axol.k(woiVar.a, null, new wob(woiVar, null), 3);
                                if (((Boolean) ((cfup) ctjd.aY.get()).e()).booleanValue()) {
                                    ((woi) cxhlVar2.g.b()).b(false);
                                    woi woiVar2 = (woi) cxhlVar2.g.b();
                                    axol.k(woiVar2.a, null, new wod(woiVar2, null), 3);
                                }
                            }
                            cxhlVar2.h.ifPresent(new Consumer() { // from class: cxhb
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj3) {
                                    ((wmf) obj3).h(equals);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            return true;
                        }
                    });
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        Optional b7 = b(R.string.smart_action_example_key);
        Optional b8 = b(R.string.smart_reply_suggestion_example_key);
        Optional b9 = b(R.string.smart_action_settings_parent_pref);
        Optional b10 = b(R.string.smart_actions_enabled_pref_key);
        if (((Boolean) ((cfup) cwlj.a.get()).e()).booleanValue()) {
            final PreferenceScreen b11 = this.a.b();
            b11.getClass();
            b10.ifPresent(new Consumer() { // from class: cxhf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    PreferenceScreen.this.af((Preference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            final PreferenceScreen b12 = this.a.b();
            b12.getClass();
            b7.ifPresent(new Consumer() { // from class: cxgz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    PreferenceScreen.this.af((SuggestionExamplePreference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            b9.ifPresent(new Consumer() { // from class: cxha
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    PreferenceScreen preferenceScreen = (PreferenceScreen) obj;
                    preferenceScreen.t = cxhl.this.b.e(preferenceScreen.j);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            final PreferenceScreen b13 = this.a.b();
            b13.getClass();
            b9.ifPresent(new Consumer() { // from class: cxhi
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
        Resources B = this.a.B();
        if (((Boolean) ((cfup) cwlj.b.get()).e()).booleanValue()) {
            final PreferenceScreen b14 = this.a.b();
            b14.getClass();
            b7.ifPresent(new Consumer() { // from class: cxgz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    PreferenceScreen.this.af((SuggestionExamplePreference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            final PreferenceScreen b15 = this.a.b();
            b15.getClass();
            b8.ifPresent(new Consumer() { // from class: cxgz
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
            if (this.i.d()) {
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
            if (this.i.i()) {
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
            if (this.i.e()) {
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
            if (this.i.h()) {
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
            if (this.i.g()) {
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
            b7.ifPresent(new Consumer() { // from class: cxhg
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
            engrVar2.h(g(B.getString(R.string.example_smart_reply_text1)));
            engrVar2.h(g(B.getString(R.string.example_smart_reply_text2)));
            engrVar2.h(g(B.getString(R.string.example_smart_reply_text3)));
            engrVar2.h(g(B.getString(R.string.example_smart_reply_text4)));
            b8.ifPresent(new Consumer() { // from class: cxhh
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
        this.k = b(R.string.nudge_settings_parent_pref);
        if (ctjd.f()) {
            this.k.ifPresent(new Consumer() { // from class: cxhe
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cxhl cxhlVar = cxhl.this;
                    ((PreferenceScreen) obj).t = cxhlVar.b.d(cxhlVar.a.b().j);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            Optional optional = this.k;
            final PreferenceScreen b16 = this.a.b();
            b16.getClass();
            optional.ifPresent(new Consumer() { // from class: cxhi
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
            b(R.string.assistant_enabled_pref_key).ifPresent(new Consumer() { // from class: cxhj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    Preference preference = (Preference) obj;
                    preference.H(cxhl.this.a(R.drawable.assistant_logo));
                    preference.J(R.string.assistant_preference_summary);
                    preference.I(8);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            b(R.string.p2p_conversation_suggestions_enabled_pref_key).ifPresent(new Consumer() { // from class: cxgs
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    Preference preference = (Preference) obj;
                    preference.H(cxhl.this.a(R.drawable.quantum_gm_ic_chat_vd_theme_24));
                    preference.J(R.string.smart_reply_preference_summary);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            b.ifPresent(new Consumer() { // from class: cxgt
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    Preference preference = (Preference) obj;
                    preference.H(cxhl.this.a(R.drawable.quantum_gm_ic_sticker_vd_theme_24));
                    preference.I(7);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            this.k.ifPresent(new Consumer() { // from class: cxgu
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((PreferenceScreen) obj).H(cxhl.this.a(R.drawable.quantum_ic_alarm_vd_theme_24));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (ctjd.c() && this.f.isPresent()) {
                b(R.string.mc_enabled_pref_key).ifPresent(new Consumer() { // from class: cxgv
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        cxhl cxhlVar = cxhl.this;
                        ((Preference) obj).H(cxhlVar.a(R.drawable.messages_spark_outlined));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            if (((Boolean) ((cfup) cwlj.a.get()).e()).booleanValue()) {
                b9.ifPresent(new Consumer() { // from class: cxgw
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ((PreferenceScreen) obj).H(cxhl.this.a(R.drawable.quantum_gm_ic_calendar_add_on_gm_grey_24));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else {
                b10.ifPresent(new Consumer() { // from class: cxgx
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ((Preference) obj).H(cxhl.this.a(R.drawable.quantum_gm_ic_calendar_add_on_gm_grey_24));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
        d();
    }
}
