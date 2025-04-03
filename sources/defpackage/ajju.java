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
import androidx.preference.TwoStatePreference;
import com.google.android.apps.messaging.R;
import defpackage.fbal;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajju extends ajkg implements ekhu, fbas, ekhq, ekkk, elar {
    private ajka aj;
    private Context ak;
    private final lkv al = new lkv(this);
    private final ekxu an = new ekxu(this);
    private boolean ao;

    @Deprecated
    public ajju() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return ajka.class;
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

    @Override // defpackage.ekhu
    /* renamed from: aU, reason: merged with bridge method [inline-methods] */
    public final ajka H() {
        ajka ajkaVar = this.aj;
        if (ajkaVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ajkaVar;
    }

    @Override // defpackage.ajkg
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

    @Override // defpackage.ajkg, defpackage.efad, defpackage.ea
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
        H();
        return false;
    }

    @Override // defpackage.ajkg, defpackage.ea
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
                    if (!(eaVar instanceof ajju)) {
                        throw new IllegalStateException(a.J(eaVar, ajka.class));
                    }
                    ajju ajjuVar = (ajju) eaVar;
                    akis akisVar = ((akgt) aX).a;
                    this.aj = new ajka(ajjuVar, akisVar.lz, ((akgt) aX).k, ((akgt) aX).l, ((akgt) aX).am, akisVar.mB);
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
            ajka H = H();
            ((ejlq) H.d.b()).k(H.j);
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
        final ajka H = H();
        H.b.gi(R.xml.etouffee_toggle_preferences);
        ajju ajjuVar = H.b;
        H.h = Optional.ofNullable((TwoStatePreference) ajjuVar.a(ajjuVar.Y(R.string.user_etouffee_toggle_pref_key)));
        ((ejwl) H.c.b()).c(((bzqi) H.g.b()).b(), ejwa.FEW_SECONDS, H.i);
        H.h.ifPresent(new Consumer() { // from class: ajjv
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                TwoStatePreference twoStatePreference = (TwoStatePreference) obj;
                twoStatePreference.N(false);
                final ajka ajkaVar = ajka.this;
                twoStatePreference.M(ajkaVar.b.Y(R.string.user_toggle_for_etouffee_title));
                twoStatePreference.n = new elhi((elhk) ajkaVar.e.b(), "Enable Etouffee Setting Changed", new onh() { // from class: ajjw
                    @Override // defpackage.onh
                    public final boolean a(Preference preference, Object obj2) {
                        boolean equals = Boolean.TRUE.equals(obj2);
                        ajka ajkaVar2 = ajka.this;
                        ((ejlq) ajkaVar2.d.b()).i(ejlp.b(((bzqi) ajkaVar2.g.b()).f(equals)), new ejlm(Boolean.valueOf(equals)), ajkaVar2.j);
                        return false;
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ajkg, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
