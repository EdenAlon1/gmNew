package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import defpackage.fbal;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwyb extends cwwb implements ekhu, fbas, ekhq, ekkk, elar {
    private cwyp aj;
    private Context ak;
    private final lkv al = new lkv(this);
    private final ekxu an = new ekxu(this);
    private boolean ao;

    @Deprecated
    public cwyb() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return cwyp.class;
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

    @Override // defpackage.cwwb
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

    @Override // defpackage.cwwb, defpackage.efad, defpackage.ea
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
    public final cwyp H() {
        cwyp cwypVar = this.aj;
        if (cwypVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cwypVar;
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

    @Override // defpackage.cwwb, defpackage.ea
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
                    fbbf fbbfVar = ((akgt) aX).av;
                    fbbf fbbfVar2 = ((akgt) aX).k;
                    fbbf fbbfVar3 = ((akgt) aX).l;
                    akkp akkpVar = ((akgt) aX).a.a;
                    this.aj = new cwyp(fbbfVar, fbbfVar2, fbbfVar3, akkpVar.wC, akkpVar.Px);
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
        } finally {
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
            cwyp H = H();
            ((ejlq) H.c.b()).k(H.i);
            if (cwyp.b()) {
                ((ejlq) H.c.b()).k(H.j);
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
        final cwyp H = H();
        if (((Optional) H.d.b()).isEmpty()) {
            return;
        }
        ((cwyb) H.a.b()).b.f("bugle");
        ((cwyb) H.a.b()).gi(R.xml.nudge_preferences);
        ((cwyb) H.a.b()).b().ag();
        H.f = H.a(R.string.nudge_reply_enabled_pref_key);
        H.g = H.a(R.string.birthday_nudge_enabled_pref_key);
        if (!cwyp.b()) {
            Optional optional = H.g;
            final PreferenceScreen b = ((cwyb) H.a.b()).b();
            b.getClass();
            optional.ifPresent(new Consumer() { // from class: cwye
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    PreferenceScreen.this.af((SwitchPreferenceCompat) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            H.g = Optional.empty();
        }
        H.f.ifPresent(new Consumer() { // from class: cwyf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cwyp cwypVar = cwyp.this;
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj;
                switchPreferenceCompat.M(((cwyb) cwypVar.a.b()).B().getString(R.string.nudge_enabled_pref_title));
                switchPreferenceCompat.n(((cwyb) cwypVar.a.b()).B().getString(R.string.nudge_enabled_pref_summary));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((ejwl) H.b.b()).c(((ctta) ((Optional) H.d.b()).get()).a(), ejwa.FEW_SECONDS, H.h);
        H.f.ifPresent(new Consumer() { // from class: cwyh
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final cwyp cwypVar = cwyp.this;
                ((SwitchPreferenceCompat) obj).n = new onh() { // from class: cwyd
                    @Override // defpackage.onh
                    public final boolean a(Preference preference, Object obj2) {
                        boolean equals = Boolean.TRUE.equals(obj2);
                        cwyp cwypVar2 = cwyp.this;
                        ((ejlq) cwypVar2.c.b()).i(ejlp.b(((ctta) ((Optional) cwypVar2.d.b()).get()).d(equals)), new ejlm(Boolean.valueOf(equals)), cwypVar2.i);
                        return false;
                    }
                };
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        H.g.ifPresent(new Consumer() { // from class: cwyi
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final cwyp cwypVar = cwyp.this;
                ((SwitchPreferenceCompat) obj).n = new onh() { // from class: cwyg
                    @Override // defpackage.onh
                    public final boolean a(Preference preference, Object obj2) {
                        boolean equals = Boolean.TRUE.equals(obj2);
                        cwyp cwypVar2 = cwyp.this;
                        ((ejlq) cwypVar2.c.b()).i(ejlp.b(((ctta) ((Optional) cwypVar2.d.b()).get()).c(equals)), new ejlm(Boolean.valueOf(equals)), cwypVar2.j);
                        return false;
                    }
                };
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Optional a = H.a(R.string.nudge_learn_more_pref_key);
        if (a.isEmpty()) {
            return;
        }
        ((Preference) a.get()).o = new oni() { // from class: cwyc
            @Override // defpackage.oni
            public final boolean a(Preference preference) {
                cwyp cwypVar = cwyp.this;
                ((akvg) cwypVar.e.b()).y(((cwyb) cwypVar.a.b()).fe(), (String) ctjd.u.e());
                return true;
            }
        };
        Preference preference = (Preference) a.get();
        String Y = ((cwyb) H.a.b()).Y(R.string.nudge_learn_more_info_text);
        preference.M(ddyi.f(((cwyb) H.a.b()).fe(), Y, Y));
    }

    @Override // defpackage.cwwb, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
