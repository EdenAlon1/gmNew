package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwto extends cwua implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final cskc a = cskc.g("Bugle", "ApplicationSettingsFragmentPeer");
    public static final cskc b = cskc.g("BugleCms", "ApplicationSettingsFragmentPeer");
    public static final entd c = entd.c("BugleSettings");
    public final ffbr A;
    public final fazb B;
    public final ffbr C;
    public final Optional E;
    public final Optional F;
    public final ffbr G;
    public final fjft H;
    public final ffbr I;
    public final ffbr J;
    public final ffbr K;
    public final ffbr L;
    public final Optional M;
    public final Optional N;
    public final atcy O;
    public ejlr P;
    public ejlr Q;
    public String R;
    public Optional S;
    public String T;
    public Optional U;
    public Optional V;
    public Optional W;
    public Optional X;
    public Optional Y;
    public Optional Z;
    public Optional aa;
    public Optional ab;
    public Optional ac;
    public Optional ad;
    public Optional ae;
    public Optional af;
    public Optional ag;
    public Optional ah;
    public Optional ai;
    public Optional aj;
    public Optional ak;
    private final ctvi am;
    private final ctvb an;
    public final eisx d;
    public final cwrw f;
    public final ffbr g;
    public final ctyx h;
    public final cthp i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final cuye m;
    public final Optional n;
    public final csrv o;
    public final ffbr p;
    public final ejwl q;
    public final ejxn r;
    public final ejvb s;
    public final ejlq t;
    public final Optional u;
    public final Optional v;
    public final elhk w;
    public final ctxt x;
    public final ffbr y;
    public final ffbr z;
    public final crlv e = new crlv("enableConversationScaleSetting", new ffix() { // from class: cwsn
        @Override // defpackage.ffix
        public final Object invoke() {
            cskc cskcVar = cwto.a;
            return (Boolean) ((cfup) cymy.a.get()).e();
        }
    });
    public final b D = new b();

    /* compiled from: PG */
    final class b implements ejwd<cymp> {
        public b() {
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            cwto.this.ae.ifPresent(new Consumer() { // from class: cwtr
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj;
                    switchPreferenceCompat.G(true);
                    switchPreferenceCompat.N(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ((ensz) ((ensz) cwto.c.j()).h("com/google/android/apps/messaging/ui/appsettings/ApplicationSettingsFragmentPeer$LoadPinchZoomCallback", "onError", 1336, "ApplicationSettingsFragmentPeer.java")).q("Failed to load pinch to zoom");
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            final cymp cympVar = (cymp) obj;
            cwto.this.ae.ifPresent(new Consumer() { // from class: cwtp
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj2;
                    switchPreferenceCompat.k(cymp.this.d);
                    switchPreferenceCompat.G(true);
                    switchPreferenceCompat.N(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.ejwd
        public final void hB() {
            cwto.this.ae.ifPresent(new Consumer() { // from class: cwtq
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((SwitchPreferenceCompat) obj).G(false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    /* compiled from: PG */
    final class c implements ejwd<Boolean> {
        public c() {
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            cwto.this.ac.ifPresent(new Consumer() { // from class: cwtv
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((TwoStatePreference) obj).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cwto.a.n("Failed to load reminder setting data");
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            final Boolean bool = (Boolean) obj;
            cwto.this.ac.ifPresent(new Consumer() { // from class: cwtt
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    TwoStatePreference twoStatePreference = (TwoStatePreference) obj2;
                    twoStatePreference.G(true);
                    twoStatePreference.k(bool.booleanValue());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cwto.this.S.ifPresent(new Consumer() { // from class: cwtu
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    Preference preference = (Preference) obj2;
                    if (bool.booleanValue() && cwto.f()) {
                        preference.J(R.string.notifications_pref_summary);
                    } else {
                        preference.n("");
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.ejwd
        public final void hB() {
            cwto.this.ac.ifPresent(new Consumer() { // from class: cwts
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((TwoStatePreference) obj).G(false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    /* compiled from: PG */
    final class d implements ejlr<Boolean, Void> {
        public d() {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            cwto.this.ac.ifPresent(new Consumer() { // from class: cwtw
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    ((TwoStatePreference) obj2).G(false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            cwto.this.ac.ifPresent(new Consumer() { // from class: cwtx
                @Override // java.util.function.Consumer
                public final void accept(Object obj3) {
                    ((TwoStatePreference) obj3).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            final Boolean bool = (Boolean) obj;
            cwto.this.ac.ifPresent(new Consumer() { // from class: cwty
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    ((TwoStatePreference) obj2).k(!bool.booleanValue());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cwto.this.ac.ifPresent(new Consumer() { // from class: cwtz
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    ((TwoStatePreference) obj2).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cwto.a.n("Failed to save reminder action setting");
        }
    }

    public cwto(eisx eisxVar, cwrw cwrwVar, ffbr ffbrVar, ctyx ctyxVar, cthp cthpVar, ffbr ffbrVar2, ctvi ctviVar, ctvb ctvbVar, ffbr ffbrVar3, ffbr ffbrVar4, cuye cuyeVar, Optional optional, csrv csrvVar, ffbr ffbrVar5, ejwl ejwlVar, ejxn ejxnVar, ejvb ejvbVar, ejlq ejlqVar, Optional optional2, Optional optional3, elhk elhkVar, ctxt ctxtVar, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, fazb fazbVar, ffbr ffbrVar9, Optional optional4, Optional optional5, fjft fjftVar, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, Optional optional6, Optional optional7, atcy atcyVar) {
        this.d = eisxVar;
        this.f = cwrwVar;
        this.g = ffbrVar;
        this.h = ctyxVar;
        this.i = cthpVar;
        this.j = ffbrVar2;
        this.am = ctviVar;
        this.an = ctvbVar;
        this.k = ffbrVar3;
        this.l = ffbrVar4;
        this.m = cuyeVar;
        this.n = optional;
        this.o = csrvVar;
        this.p = ffbrVar5;
        this.q = ejwlVar;
        this.r = ejxnVar;
        this.s = ejvbVar;
        this.t = ejlqVar;
        this.u = optional2;
        this.v = optional3;
        this.w = elhkVar;
        this.x = ctxtVar;
        this.y = ffbrVar6;
        this.z = ffbrVar7;
        this.A = ffbrVar8;
        this.B = fazbVar;
        this.C = ffbrVar9;
        this.E = optional4;
        this.F = optional5;
        this.G = ffbrVar10;
        this.H = fjftVar;
        this.I = ffbrVar11;
        this.J = ffbrVar12;
        this.K = ffbrVar13;
        this.L = ffbrVar14;
        this.M = optional6;
        this.N = optional7;
        this.O = atcyVar;
    }

    static boolean f() {
        return ((Boolean) cirh.a.e()).booleanValue();
    }

    final Optional a(int i) {
        cwrw cwrwVar = this.f;
        return Optional.ofNullable(cwrwVar.a(cwrwVar.Y(i)));
    }

    final Optional b(String str) {
        return Optional.ofNullable(this.f.a(str));
    }

    final void c() {
        String displayCountry;
        String a2 = this.x.a();
        eg G = this.f.G();
        if (ctxu.a(a2)) {
            String c2 = this.am.c();
            displayCountry = !TextUtils.isEmpty(c2) ? this.f.Z(R.string.auto_selected_country_summary, new Locale("", c2).getDisplayCountry(kqt.a(G.getResources().getConfiguration()).f(0))) : null;
        } else {
            displayCountry = new Locale("", a2).getDisplayCountry(kqt.a(G.getResources().getConfiguration()).f(0));
        }
        if (this.V.isPresent()) {
            ((Preference) this.V.get()).n(emxe.b(displayCountry));
        } else {
            a.p("currentCountryPreference was not found");
        }
    }

    final void d() {
        Optional optional = this.S;
        if (optional == null || optional.isEmpty()) {
            a.p("notificationsPreference was not found");
        } else {
            ((Preference) this.S.get()).G(this.an.G());
        }
    }

    final void e(SharedPreferences sharedPreferences) {
        Optional optional = this.U;
        if (optional == null || optional.isEmpty()) {
            a.p("ringtonePreference was not found");
            return;
        }
        String string = ((Preference) this.U.get()).j.getString(R.string.silent_ringtone);
        String string2 = sharedPreferences.getString(this.T, null);
        if (string2 == null) {
            string2 = Settings.System.DEFAULT_NOTIFICATION_URI.toString();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(this.T, string2);
            edit.apply();
        }
        if (!TextUtils.isEmpty(string2)) {
            try {
                Ringtone ringtone = RingtoneManager.getRingtone(((Preference) this.U.get()).j, Uri.parse(string2));
                if (ringtone != null) {
                    string = ringtone.getTitle(((Preference) this.U.get()).j);
                }
            } catch (SecurityException unused) {
                string = this.f.Y(R.string.unknown_ringtone_pref_display_value);
            }
        }
        ((Preference) this.U.get()).n(string);
    }

    final void g() {
        if (adhu.a() && csgj.a()) {
            this.E.isPresent();
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals(this.R)) {
            d();
        } else if (str.equals(this.T)) {
            e(sharedPreferences);
        } else if (str.equals(this.x.b())) {
            c();
        }
    }

    /* compiled from: PG */
    final class a implements ejlr<Intent, eisx> {
        public a() {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            Intent intent = (Intent) obj;
            eisx eisxVar = (eisx) obj2;
            eisxVar.getClass();
            eiuy.c(intent, eisxVar);
            elhh.a(cwto.this.f, intent);
            cwto.this.ah.ifPresent(new Consumer() { // from class: cwtn
                @Override // java.util.function.Consumer
                public final void accept(Object obj3) {
                    ((Preference) ((AtomicReference) obj3).get()).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            Intent intent = (Intent) obj;
            if (th instanceof babn) {
                eisx eisxVar = cwto.this.d;
                eisxVar.getClass();
                eiuy.c(intent, eisxVar);
                elhh.a(cwto.this.f, intent);
            } else {
                csjb e = cwto.b.e();
                e.I("Failed to load linked CMS Account");
                e.s(th);
            }
            cwto.this.ah.ifPresent(new Consumer() { // from class: cwtm
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    ((Preference) ((AtomicReference) obj2).get()).G(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
