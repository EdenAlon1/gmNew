package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.PhoneNumberPreference;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwzu implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final cfva a = cfvl.r(181632590, "hide_fi_settings_when_satellite_enabled");
    public static final cfva b = cfvl.r(187729732, "go_fi_settings_when_acct_linked_nothing_is_on");
    public static final cfva c = cfvl.r(169244616, "enableXmsConfigsChangedCallback");
    public static final entd d = entd.c("BugleSettings");
    public static final cskc e = cskc.g("BugleCms", "PerSubscriptionSettingsFragmentPeer");
    public String A;
    public String B;
    public String C;
    public String D;
    public final cpdl E;
    public final cpbz F;
    public final Optional G;
    public final Optional H;
    public final akzt I;
    public final cpbs J;
    public final ctwb K;
    public final ctvb L;
    public final errl M;
    public final akvg N;
    public final cwqc O;
    public final ffbr P;
    public final cwvo Q;
    public final cwza R;
    public final ejwl S;
    public final ejvp T;
    public final ffbr U;
    public final ejlq V;
    public final elhk W;
    public final ddzb X;
    public final Optional Y;
    public final Optional Z;
    public final ffbr aa;
    public final Optional ab;
    public final ffbr ac;
    public final ffbr ad;
    public final Optional ae;
    public final tgc af;
    public final ffbr ag;
    public final asjt ah;
    public final eisx ai;
    public final babf aj;
    public g ak;
    public ejlr al;
    public final ffbr am;
    public final ffbr an;
    public final asxo ao;
    public final akuc ap;
    public final ffbr aq;
    public final bavz ar;
    public final ctyw as;
    private final cxao at;
    private final ffbr au;
    private final ffbr av;
    private final ffbr aw;
    private final Object ax = new Object();
    private cxan ay;
    public PreferenceScreen f;
    public PhoneNumberPreference g;
    public PhoneNumberPreference h;
    public PhoneNumberPreference i;
    public Preference j;
    public Preference k;
    public String l;
    public String m;
    public int n;
    public cpbn o;
    public String p;
    public ctyx q;
    public boolean r;
    public cwzz s;
    public Optional t;
    public cwvn u;
    public ejlr v;
    public ejlr w;
    public String x;
    public String y;
    public String z;

    public cwzu(Optional optional, Optional optional2, akzt akztVar, cpdl cpdlVar, bavz bavzVar, cpbz cpbzVar, cpbs cpbsVar, ctwb ctwbVar, ctvb ctvbVar, ctyw ctywVar, errl errlVar, akvg akvgVar, cwqc cwqcVar, ffbr ffbrVar, cwvo cwvoVar, cwza cwzaVar, ejwl ejwlVar, ejlq ejlqVar, cxao cxaoVar, elhk elhkVar, ffbr ffbrVar2, ddzb ddzbVar, ejvp ejvpVar, Optional optional3, Optional optional4, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, Optional optional5, ffbr ffbrVar7, ffbr ffbrVar8, Optional optional6, tgc tgcVar, asjt asjtVar, ffbr ffbrVar9, eisx eisxVar, cwzb cwzbVar, babf babfVar, ffbr ffbrVar10, ffbr ffbrVar11, asxo asxoVar, ffbr ffbrVar12) {
        this.ai = eisxVar;
        this.ap = cwzbVar;
        this.G = optional;
        this.H = optional2;
        this.I = akztVar;
        this.E = cpdlVar;
        this.ar = bavzVar;
        this.F = cpbzVar;
        this.J = cpbsVar;
        this.K = ctwbVar;
        this.L = ctvbVar;
        this.as = ctywVar;
        this.M = errlVar;
        this.N = akvgVar;
        this.O = cwqcVar;
        this.P = ffbrVar;
        this.Q = cwvoVar;
        this.R = cwzaVar;
        this.S = ejwlVar;
        this.T = ejvpVar;
        this.U = ffbrVar5;
        this.V = ejlqVar;
        this.at = cxaoVar;
        this.W = elhkVar;
        this.au = ffbrVar2;
        this.X = ddzbVar;
        this.Y = optional3;
        this.Z = optional4;
        this.av = ffbrVar3;
        this.aw = ffbrVar4;
        this.aa = ffbrVar6;
        this.ab = optional5;
        this.ac = ffbrVar7;
        this.ad = ffbrVar8;
        this.ae = optional6;
        this.af = tgcVar;
        this.ah = asjtVar;
        this.ag = ffbrVar9;
        this.aj = babfVar;
        this.am = ffbrVar10;
        this.an = ffbrVar11;
        this.ao = asxoVar;
        if (asxoVar.a()) {
            this.t = Optional.empty();
        }
        this.aq = ffbrVar12;
    }

    public final SwitchPreferenceCompat a(String str) {
        Preference a2 = this.ap.a(str);
        a2.getClass();
        return (SwitchPreferenceCompat) a2;
    }

    public final cxan b() {
        cxan cxanVar;
        synchronized (this.ax) {
            if (this.ay == null) {
                this.ay = this.at.a(this.n);
            }
            cxanVar = this.ay;
        }
        return cxanVar;
    }

    public final PhoneNumberPreference c(String str) {
        Preference a2 = this.ap.a(str);
        a2.getClass();
        return (PhoneNumberPreference) a2;
    }

    public final void d(String str) {
        Preference a2 = this.ap.a(str);
        if (a2 != null) {
            a2.G(false);
        }
    }

    public final void e(String str, boolean z, onh onhVar) {
        SwitchPreferenceCompat a2 = a(str);
        a2.k(z);
        a2.n = new elhi(this.W, "PerSubscriptionSettingsFragmentPeer:changeBooleanPreference", onhVar);
    }

    public final void f() {
        akuc akucVar = this.ap;
        Optional ofNullable = Optional.ofNullable((PreferenceScreen) akucVar.a(akucVar.Y(R.string.etouffee_pref_key)));
        if (ofNullable.isEmpty()) {
            return;
        }
        if (!this.Z.isPresent() || !((bzqa) this.av.b()).t()) {
            ((PreferenceScreen) ofNullable.get()).N(false);
            ((PreferenceScreen) ofNullable.get()).o = null;
            return;
        }
        final eg G = this.ap.G();
        G.getClass();
        oni oniVar = new oni() { // from class: cwzm
            @Override // defpackage.oni
            public final boolean a(Preference preference) {
                ajjp ajjpVar = (ajjp) cwzu.this.Z.get();
                eg egVar = G;
                eldl.p(egVar, ajjpVar.d(egVar));
                return true;
            }
        };
        PreferenceScreen preferenceScreen = (PreferenceScreen) ofNullable.get();
        preferenceScreen.L(R.string.user_toggle_for_etouffee);
        ((PreferenceScreen) ofNullable.get()).o = oniVar;
        ((PreferenceScreen) ofNullable.get()).N(true);
    }

    public final void g() {
        akuc akucVar = this.ap;
        Optional ofNullable = Optional.ofNullable((PreferenceScreen) akucVar.a(akucVar.Y(R.string.security_pref_key)));
        if (ofNullable.isEmpty()) {
            return;
        }
        if (!this.Z.isPresent() || !((bzqa) this.av.b()).o()) {
            ((PreferenceScreen) ofNullable.get()).N(false);
            ((PreferenceScreen) ofNullable.get()).o = null;
            return;
        }
        final eg G = this.ap.G();
        G.getClass();
        oni oniVar = new oni() { // from class: cwzl
            @Override // defpackage.oni
            public final boolean a(Preference preference) {
                ajjp ajjpVar = (ajjp) cwzu.this.Z.get();
                eg egVar = G;
                eldl.p(egVar, ajjpVar.c(egVar));
                return true;
            }
        };
        PreferenceScreen preferenceScreen = (PreferenceScreen) ofNullable.get();
        preferenceScreen.L(R.string.etouffee_to_telephony_setting);
        ((PreferenceScreen) ofNullable.get()).o = oniVar;
        ((PreferenceScreen) ofNullable.get()).N(true);
    }

    public final void h(int i) {
        this.I.e("Bugle.Cms.Fi.Entry.Flow.Count", i);
    }

    public final void i(String str) {
        Preference a2 = this.ap.a(str);
        if (a2 != null) {
            a2.N(true);
        }
    }

    public final void j(PhoneNumberPreference phoneNumberPreference, String str) {
        phoneNumberPreference.o(((aolr) this.ag.b()).u(str, this.n));
    }

    public final void k(PhoneNumberPreference phoneNumberPreference, int i) {
        phoneNumberPreference.e = ((aolr) this.ag.b()).n(this.ap.B().getString(i));
    }

    public final void l(PhoneNumberPreference phoneNumberPreference) {
        phoneNumberPreference.c = this.ap.B().getString(R.string.smsc_number_pref_summary);
        final elbx elbxVar = (elbx) this.au.b();
        final onh onhVar = new onh() { // from class: cwzq
            @Override // defpackage.onh
            public final boolean a(Preference preference, Object obj) {
                final String obj2 = obj.toString();
                final cwzu cwzuVar = cwzu.this;
                cwzuVar.V.i(new ejlp(elfr.h(new Callable() { // from class: cwzh
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        cwzu cwzuVar2 = cwzu.this;
                        return Boolean.valueOf(cwzuVar2.F.d(cwzuVar2.n, obj2));
                    }
                }, cwzuVar.M)), new ejlm(obj2), cwzuVar.ak);
                return true;
            }
        };
        phoneNumberPreference.n = new onh() { // from class: elex
            @Override // defpackage.onh
            public final boolean a(Preference preference, Object obj) {
                onh onhVar2 = onh.this;
                if (ekyf.v()) {
                    onhVar2.a(preference, obj);
                    return true;
                }
                ekzm b2 = elbxVar.b("PerSubscriptionSettingsFragmentPeer:changeSmscPreference");
                try {
                    onhVar2.a(preference, obj);
                    b2.close();
                    return true;
                } catch (Throwable th) {
                    try {
                        b2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        };
        phoneNumberPreference.o = new oni() { // from class: cwzd
            @Override // defpackage.oni
            public final boolean a(Preference preference) {
                cwzu.this.I.c("Bugle.Preference.Smsc.Editor.Open");
                return false;
            }
        };
        phoneNumberPreference.h = new cwze(this);
        phoneNumberPreference.g = true;
    }

    public final void m() {
        cwzz cwzzVar = this.s;
        this.j.J(true != ((cwzzVar.b & 64) != 0 ? cwzzVar.i : this.o.n()) ? R.string.disable_group_mms : R.string.enable_group_mms);
    }

    public final boolean n(String str) {
        return this.ap.a(str) instanceof SwitchPreferenceCompat;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals(this.l)) {
            m();
        } else if (str.equals(this.m)) {
            this.g.k();
            this.T.a(elfo.e(null), "SIM_SELECTION_SETTINGS_DATASERVICE_KEY");
            this.ar.b().K();
        }
    }

    /* compiled from: PG */
    final class b implements ejwd<Boolean> {
        public b() {
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            csjy.n("BugleCms", "Error getting Fi setting status");
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
        
            if (((defpackage.acio) ((j$.util.Optional) r0.b()).get()).m() != false) goto L14;
         */
        @Override // defpackage.ejwd
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* bridge */ /* synthetic */ void b(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                cwzu r0 = defpackage.cwzu.this
                j$.util.Optional r0 = r0.G
                boolean r0 = r0.isPresent()
                if (r0 == 0) goto L5f
                cwzu r0 = defpackage.cwzu.this
                cfva r1 = defpackage.cwzu.a
                java.lang.Object r1 = r1.e()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L3c
                ffbr r0 = r0.aa
                java.lang.Object r1 = r0.b()
                j$.util.Optional r1 = (j$.util.Optional) r1
                boolean r1 = r1.isPresent()
                if (r1 == 0) goto L3c
                java.lang.Object r0 = r0.b()
                j$.util.Optional r0 = (j$.util.Optional) r0
                java.lang.Object r0 = r0.get()
                acio r0 = (defpackage.acio) r0
                boolean r0 = r0.m()
                if (r0 != 0) goto L5f
            L3c:
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L5f
                cwzu r5 = defpackage.cwzu.this
                androidx.preference.PreferenceScreen r5 = r5.f
                r0 = 1
                r5.N(r0)
                cwzu r5 = defpackage.cwzu.this
                androidx.preference.PreferenceScreen r0 = r5.f
                cwzn r1 = new cwzn
                r1.<init>()
                elhj r2 = new elhj
                elhk r5 = r5.W
                java.lang.String r3 = "Fi Entry clicked"
                r2.<init>(r5, r3, r1)
                r0.o = r2
                return
            L5f:
                cwzu r5 = defpackage.cwzu.this
                akuc r0 = r5.ap
                androidx.preference.PreferenceScreen r0 = r0.b()
                androidx.preference.PreferenceScreen r5 = r5.f
                r0.af(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cwzu.b.b(java.lang.Object):void");
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void hB() {
        }
    }

    /* compiled from: PG */
    final class e implements ejwd<cwzz> {
        public e() {
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            csjy.g("Bugle", "Error getting per subscription settings for subId(%s)", Integer.valueOf(cwzu.this.n));
        }

        /* JADX WARN: Type inference failed for: r8v54, types: [cmso, java.lang.Object] */
        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            final cwzu cwzuVar = cwzu.this;
            cwzuVar.s = (cwzz) obj;
            int i = cwzuVar.s.b & 8;
            Preference a = cwzuVar.ap.a(cwzuVar.x);
            a.getClass();
            if (i != 0) {
                a.N(true);
            }
            if (a.w) {
                cwzz cwzzVar = cwzuVar.s;
                cwzuVar.e(cwzuVar.x, (cwzzVar.b & 8) != 0 ? cwzzVar.f : cwzuVar.o.u(), new onh() { // from class: cwzf
                    @Override // defpackage.onh
                    public final boolean a(Preference preference, Object obj2) {
                        preference.G(false);
                        final boolean equals = Boolean.TRUE.equals(obj2);
                        cwzu cwzuVar2 = cwzu.this;
                        cxan b = cwzuVar2.b();
                        elfl j = b.b.j(new emwl() { // from class: cxaj
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                cwzz cwzzVar2 = (cwzz) obj3;
                                int i2 = cxan.d;
                                cwzzVar2.getClass();
                                cwzy builder = cwzzVar2.toBuilder();
                                builder.copyOnWrite();
                                cwzz cwzzVar3 = (cwzz) builder.instance;
                                cwzzVar3.b |= 8;
                                cwzzVar3.f = equals;
                                return builder.build();
                            }
                        });
                        b.j(j);
                        cwzuVar2.V.i(ejlp.b(j), new ejlm(cwzuVar2.x), cwzuVar2.v);
                        return true;
                    }
                });
                if (!cwzuVar.r) {
                    cwzuVar.d(cwzuVar.x);
                }
            }
            Preference a2 = cwzuVar.ap.a(cwzuVar.y);
            a2.getClass();
            if (a2.w) {
                cwzz cwzzVar2 = cwzuVar.s;
                cwzuVar.e(cwzuVar.y, (cwzzVar2.b & 1) != 0 ? cwzzVar2.c : cwzuVar.o.p(), new onh() { // from class: cwzp
                    @Override // defpackage.onh
                    public final boolean a(Preference preference, Object obj2) {
                        preference.G(false);
                        final boolean equals = Boolean.TRUE.equals(obj2);
                        cwzu cwzuVar2 = cwzu.this;
                        cxan b = cwzuVar2.b();
                        elfl j = b.b.j(new emwl() { // from class: cxak
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                cwzz cwzzVar3 = (cwzz) obj3;
                                int i2 = cxan.d;
                                cwzzVar3.getClass();
                                cwzy builder = cwzzVar3.toBuilder();
                                builder.copyOnWrite();
                                cwzz cwzzVar4 = (cwzz) builder.instance;
                                cwzzVar4.b |= 1;
                                cwzzVar4.c = equals;
                                return builder.build();
                            }
                        });
                        b.j(j);
                        cwzuVar2.V.i(ejlp.b(j), new ejlm(cwzuVar2.y), cwzuVar2.v);
                        return true;
                    }
                });
                if (!cwzuVar.r) {
                    cwzuVar.d(cwzuVar.y);
                }
            }
            boolean z = cwzuVar.o.r() && (cwzuVar.o.l() || (cwzuVar.s.b & 2) != 0) && ((cgst) cwzuVar.ad.b()).a();
            Preference a3 = cwzuVar.ap.a(cwzuVar.z);
            a3.getClass();
            if (z) {
                a3.N(true);
            }
            if (a3.w) {
                cwzz cwzzVar3 = cwzuVar.s;
                cwzuVar.e(cwzuVar.z, (cwzzVar3.b & 2) != 0 ? cwzzVar3.d : cwzuVar.o.q(), new onh() { // from class: cwzg
                    @Override // defpackage.onh
                    public final boolean a(Preference preference, Object obj2) {
                        preference.G(false);
                        final boolean equals = Boolean.TRUE.equals(obj2);
                        cwzu cwzuVar2 = cwzu.this;
                        cxan b = cwzuVar2.b();
                        elfl j = b.b.j(new emwl() { // from class: cxab
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                cwzz cwzzVar4 = (cwzz) obj3;
                                int i2 = cxan.d;
                                cwzzVar4.getClass();
                                cwzy builder = cwzzVar4.toBuilder();
                                builder.copyOnWrite();
                                cwzz cwzzVar5 = (cwzz) builder.instance;
                                cwzzVar5.b |= 2;
                                cwzzVar5.d = equals;
                                return builder.build();
                            }
                        });
                        b.j(j);
                        cwzuVar2.V.i(ejlp.b(j), new ejlm(cwzuVar2.z), cwzuVar2.v);
                        return true;
                    }
                });
            }
            Preference a4 = cwzuVar.ap.a(cwzuVar.A);
            a4.getClass();
            if (a4.w) {
                cwzz cwzzVar4 = cwzuVar.s;
                cwzuVar.e(cwzuVar.A, (cwzzVar4.b & 4) != 0 ? cwzzVar4.e : cwzuVar.o.w(), new onh() { // from class: cwzc
                    @Override // defpackage.onh
                    public final boolean a(Preference preference, Object obj2) {
                        preference.G(false);
                        final boolean equals = Boolean.TRUE.equals(obj2);
                        cwzu cwzuVar2 = cwzu.this;
                        cxan b = cwzuVar2.b();
                        elfl j = b.b.j(new emwl() { // from class: cxal
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                cwzz cwzzVar5 = (cwzz) obj3;
                                int i2 = cxan.d;
                                cwzzVar5.getClass();
                                cwzy builder = cwzzVar5.toBuilder();
                                builder.copyOnWrite();
                                cwzz cwzzVar6 = (cwzz) builder.instance;
                                cwzzVar6.b |= 4;
                                cwzzVar6.e = equals;
                                return builder.build();
                            }
                        });
                        b.j(j);
                        cwzuVar2.V.i(ejlp.b(j), new ejlm(cwzuVar2.A), cwzuVar2.v);
                        return true;
                    }
                });
                if (!cwzuVar.r) {
                    cwzuVar.d(cwzuVar.A);
                }
            }
            Preference a5 = cwzuVar.ap.a(cwzuVar.B);
            a5.getClass();
            if (a5.w) {
                cwzz cwzzVar5 = cwzuVar.s;
                cwzuVar.e(cwzuVar.B, (cwzzVar5.b & 16) != 0 ? cwzzVar5.g : cwzuVar.o.m(), new onh() { // from class: cwzk
                    @Override // defpackage.onh
                    public final boolean a(Preference preference, Object obj2) {
                        preference.G(false);
                        final boolean equals = Boolean.TRUE.equals(obj2);
                        cwzu cwzuVar2 = cwzu.this;
                        cxan b = cwzuVar2.b();
                        elfl j = b.b.j(new emwl() { // from class: cxaa
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                cwzz cwzzVar6 = (cwzz) obj3;
                                int i2 = cxan.d;
                                cwzzVar6.getClass();
                                cwzy builder = cwzzVar6.toBuilder();
                                builder.copyOnWrite();
                                cwzz cwzzVar7 = (cwzz) builder.instance;
                                cwzzVar7.b |= 16;
                                cwzzVar7.g = equals;
                                return builder.build();
                            }
                        });
                        b.j(j);
                        cwzuVar2.V.i(ejlp.b(j), new ejlm(cwzuVar2.B), cwzuVar2.v);
                        if (!equals) {
                            return true;
                        }
                        csjy.n("Bugle", "WAP Push SI enabled but no permission to receive. Requesting.");
                        ((ctuk) cwzuVar2.P.b()).i(new cwzt(cwzuVar2));
                        return true;
                    }
                });
                if (!cwzuVar.r) {
                    cwzuVar.d(cwzuVar.B);
                }
            }
            cwzuVar.m = cwzuVar.ap.Y(R.string.mms_phone_number_pref_key);
            PhoneNumberPreference phoneNumberPreference = (PhoneNumberPreference) cwzuVar.ap.a(cwzuVar.m);
            phoneNumberPreference.getClass();
            cwzuVar.g = phoneNumberPreference;
            cwzuVar.t = cwzuVar.K.h(cwzuVar.n).i(false);
            if (cwzuVar.ao.a()) {
                Optional optional = cwzuVar.t;
                final PhoneNumberPreference phoneNumberPreference2 = cwzuVar.g;
                phoneNumberPreference2.getClass();
                optional.ifPresent(new Consumer() { // from class: cwzi
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        PhoneNumberPreference.this.o((aoku) obj2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else {
                cwzuVar.j(cwzuVar.g, null);
            }
            if (((Boolean) cwzuVar.am.b()).booleanValue()) {
                cwzuVar.g.G(false);
            }
            cwzuVar.g.f = true;
            cwzz cwzzVar6 = cwzuVar.s;
            cwzuVar.g.b = new cxjm(Optional.of(((aolr) cwzuVar.ag.b()).u((cwzzVar6.b & 32) != 0 ? cwzzVar6.h : null, cwzuVar.n)), new cwzv(cwzuVar));
            cwzuVar.g.ab();
            Preference a6 = cwzuVar.ap.a(cwzuVar.l);
            a6.getClass();
            cwzuVar.j = a6;
            if (cwzuVar.j.w) {
                cwvo cwvoVar = cwzuVar.Q;
                int i2 = cwzuVar.n;
                ((ctyw) cwvoVar.a.b()).getClass();
                cpbs cpbsVar = (cpbs) cwvoVar.b.b();
                cpbsVar.getClass();
                Context context = (Context) cwvoVar.c.b();
                cxao cxaoVar = (cxao) cwvoVar.d.b();
                cxaoVar.getClass();
                cwzuVar.u = new cwvn(cpbsVar, context, cxaoVar, cwzuVar, i2);
                cwzuVar.j.o = new cwzr(cwzuVar);
                cwzuVar.m();
                if (!cwzuVar.r) {
                    cwzuVar.j.G(false);
                }
            }
            if (cwzuVar.ae.isEmpty()) {
                Preference a7 = cwzuVar.ap.a(cwzuVar.D);
                if (a7 != null) {
                    cwzuVar.ap.b().af(a7);
                    return;
                }
                return;
            }
            Preference a8 = cwzuVar.ap.a(cwzuVar.D);
            a8.getClass();
            cwzuVar.ae.get();
            a8.L(R.string.ios_reaction_classification_pref_title);
            if (a8.w) {
                cwzuVar.e(cwzuVar.D, cwzuVar.ae.get().b(), new onh() { // from class: cwzj
                    /* JADX WARN: Type inference failed for: r0v2, types: [cmso, java.lang.Object] */
                    @Override // defpackage.onh
                    public final boolean a(Preference preference, Object obj2) {
                        preference.G(false);
                        boolean equals = Boolean.TRUE.equals(obj2);
                        cwzu cwzuVar2 = cwzu.this;
                        cwzuVar2.V.i(ejlp.b(cwzuVar2.ae.get().a(equals)), new ejlm(cwzuVar2.D), cwzuVar2.v);
                        return true;
                    }
                });
            }
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void hB() {
        }
    }

    /* compiled from: PG */
    final class f implements ejwd<String> {
        public f() {
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            csjy.d("Bugle", "Error getting SMSC for subId(%s)", Integer.valueOf(cwzu.this.n));
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            cwzu cwzuVar = cwzu.this;
            String str = (String) obj;
            if (cwzuVar.F.c(cwzuVar.n) || ctid.d) {
                if (!ctid.d) {
                    cwzu cwzuVar2 = cwzu.this;
                    cwzuVar2.j(cwzuVar2.h, str);
                    cwzu.this.h.ab();
                } else if (emxe.c(str)) {
                    cwzu cwzuVar3 = cwzu.this;
                    ctwb ctwbVar = cwzuVar3.K;
                    PhoneNumberPreference phoneNumberPreference = cwzuVar3.i;
                    String x = ctwbVar.h(cwzuVar3.n).x();
                    cwzuVar3.j(phoneNumberPreference, x);
                    phoneNumberPreference.ab();
                    cwzuVar3.p = x;
                } else {
                    cwzu cwzuVar4 = cwzu.this;
                    cwzuVar4.j(cwzuVar4.i, str);
                    cwzu.this.i.ab();
                }
                cwzu.this.p = str;
            }
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void hB() {
        }
    }

    /* compiled from: PG */
    final class a implements ejlr<Void, eyjv<tgn>> {
        public a() {
        }

        private final void d() {
            cwzu.e.m("Fi Entry point launching Fi Account activity");
            Context z = cwzu.this.ap.z();
            z.getClass();
            Intent a = tcn.a(cwzu.this.ap.b().j);
            a.putExtra("entry_point", 1);
            eldl.p(z, a);
        }

        private final void e() {
            cwzu.e.m("Fi Entry point launching Fi Settings activity");
            Context z = cwzu.this.ap.z();
            z.getClass();
            Intent c = tcn.c(z);
            c.putExtra("entry_point", 1);
            eldl.p(z, c);
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            int i;
            switch (((tgn) ((eyjv) obj2).a(tgn.a, eyfc.a())).c) {
                case 0:
                    i = 2;
                    break;
                case 1:
                    i = 3;
                    break;
                case 2:
                    i = 4;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 6;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    i = 8;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i == 0) {
                i = 1;
            }
            switch (i - 2) {
                case 1:
                    d();
                    return;
                case 2:
                    cwzu.this.h(1);
                    cwzu.e.r("User tries to turn on MD when B&R is ON from existing Fi entry point in Advanced Settings while on a non-B&R build, launching the Fi Account Activity");
                    d();
                    return;
                case 3:
                    cwzu.this.h(0);
                    e();
                    return;
                case 4:
                    cwzu.this.h(2);
                    if (((Boolean) cwzu.b.e()).booleanValue()) {
                        e();
                        return;
                    } else {
                        cwzu.e.r("User encounters ACCT_LINKED_NOTHING_IS_ON");
                        throw new IllegalStateException("Cms account linked, but nothing is on");
                    }
                case 5:
                    cwzu.this.h(3);
                    e();
                    return;
                case 6:
                    if (((Boolean) csgj.q.e()).booleanValue()) {
                        cwzu.e.m("Fi Entry point launching Fi Settings redirect activity");
                        cwzu cwzuVar = cwzu.this;
                        cwzuVar.V.g(new ejlp(cwzuVar.aj.a()), cwzu.this.al);
                        return;
                    }
                    break;
            }
            cwzu.this.h(4);
            if (cwzu.this.ah.a()) {
                crze.a("FLOW_UNSPECIFIED: Not expected to happen");
            } else {
                ((cfyt) cwzu.this.ac.b()).b(new IllegalStateException("FLOW_UNSPECIFIED: Not expected to happen")).k(axnw.b(), erpp.a);
            }
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            cwzu.this.h(5);
            ((cfyt) cwzu.this.ac.b()).b(th).k(axnw.b(), erpp.a);
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* compiled from: PG */
    final class c implements ejlr<String, Void> {
        public c() {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            String str = (String) obj;
            if (cwzu.this.n(str)) {
                cwzu.this.a(str).G(true);
            } else if (str.equals(cwzu.this.m)) {
                cwzu.this.T.a(elfo.e(null), "SIM_SELECTION_SETTINGS_DATASERVICE_KEY");
                cwzu.this.c(str).G(true);
                cwzu.this.ar.b().K();
            } else if (str.equals(cwzu.this.l)) {
                cwzu.this.m();
            } else {
                csjy.o("Bugle", "handlePreferenceChangedCallback.onSuccess called for unexpected preference key %s", str);
            }
            final cwzu cwzuVar = cwzu.this;
            if (((Boolean) cwzu.c.e()).booleanValue()) {
                cwzuVar.Y.ifPresent(new Consumer() { // from class: cwzo
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj3) {
                        ((aknl) obj3).a(cwzu.this.n);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }

        /* JADX WARN: Type inference failed for: r1v18, types: [cmso, java.lang.Object] */
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            Optional optional;
            String str = (String) obj;
            cwzu.this.X.k(R.string.error_failed_to_save_setting);
            boolean z = false;
            csjy.g("Bugle", "Error saving per subscription settings for subId(%s), preference key(%s), error: %s", Integer.valueOf(cwzu.this.n), str, th.getMessage());
            if (!cwzu.this.n(str)) {
                if (!str.equals(cwzu.this.m)) {
                    if (str.equals(cwzu.this.l)) {
                        cwzu.this.m();
                        return;
                    } else {
                        csjy.o("Bugle", "handlePreferenceChangedCallback.onFailure called for unexpected preference key %s", str);
                        return;
                    }
                }
                PhoneNumberPreference c = cwzu.this.c(str);
                cwzu cwzuVar = cwzu.this;
                if ((cwzuVar.s.b & 32) != 0) {
                    aolr aolrVar = (aolr) cwzuVar.ag.b();
                    cwzu cwzuVar2 = cwzu.this;
                    optional = Optional.of(aolrVar.u(cwzuVar2.s.h, cwzuVar2.n));
                } else {
                    optional = cwzuVar.t;
                }
                cxjm cxjmVar = c.b;
                if (cxjmVar == null) {
                    c.b = cxjm.a(optional);
                } else {
                    cxjmVar.b(optional);
                }
                cwzu.this.c(str).G(true);
                return;
            }
            cwzu cwzuVar3 = cwzu.this;
            cxan b = cwzuVar3.b();
            if (str.equals(cwzuVar3.x)) {
                z = ((Boolean) b.f().orElse(Boolean.valueOf(cwzuVar3.o.v()))).booleanValue();
            } else if (str.equals(cwzuVar3.A)) {
                z = ((Boolean) b.i().orElse(Boolean.valueOf(cwzuVar3.o.w()))).booleanValue();
            } else if (str.equals(cwzuVar3.y)) {
                z = ((Boolean) b.c().orElse(Boolean.valueOf(cwzuVar3.o.p()))).booleanValue();
            } else if (str.equals(cwzuVar3.z)) {
                z = ((Boolean) b.d().orElse(Boolean.valueOf(cwzuVar3.o.q()))).booleanValue();
            } else if (str.equals(cwzuVar3.B)) {
                z = ((Boolean) b.g().orElse(Boolean.valueOf(cwzuVar3.o.m()))).booleanValue();
            } else {
                if (!str.equals(cwzuVar3.D)) {
                    throw new IllegalArgumentException("handleBooleanPreferenceChangeOnFailure called for unexpected preference key ".concat(String.valueOf(str)));
                }
                if (cwzuVar3.ae.isEmpty() || cwzuVar3.ae.get().b()) {
                    z = true;
                }
            }
            SwitchPreferenceCompat a = cwzuVar3.a(str);
            a.k(z);
            a.G(true);
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* compiled from: PG */
    final class d implements ejlr<Void, eisx> {
        public d() {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            eisx eisxVar = (eisx) obj2;
            Context z = cwzu.this.ap.z();
            z.getClass();
            if (cwzu.this.G.isPresent()) {
                Intent d = tcn.d(z);
                eiuy.c(d, eisxVar);
                eldl.p(z, d);
            }
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            if (!(th instanceof babn)) {
                csjb e = cwzu.e.e();
                e.I("Failed to load linked CMS Account");
                e.s(th);
            } else if (cwzu.this.G.isPresent()) {
                Context z = cwzu.this.ap.z();
                z.getClass();
                cwzu cwzuVar = cwzu.this;
                Intent d = tcn.d(z);
                eiuy.c(d, cwzuVar.ai);
                eldl.p(z, d);
            }
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }

    /* compiled from: PG */
    final class g implements ejlr<String, Boolean> {
        public g() {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            String str = (String) obj;
            csjy.i("Bugle", "Successfully set SMSC address");
            cwzu cwzuVar = cwzu.this;
            cwzuVar.I.c(Objects.equals(cwzuVar.p, str) ? "Bugle.Preference.Smsc.Editor.Closed.Unmodified" : str == null ? "Bugle.Preference.Smsc.Editor.Closed.Clear" : "Bugle.Preference.Smsc.Editor.Closed.Modified");
            cwzu.this.p = str;
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            csjy.p("Bugle", th, "Error setting SMSC address");
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
