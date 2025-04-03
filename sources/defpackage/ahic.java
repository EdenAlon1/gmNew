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
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import defpackage.ahhd;
import defpackage.ahih;
import defpackage.fbal;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahic extends ahhj implements ekhu, fbas, ekhq, ekkk, elar {
    private ahih aj;
    private Context ak;
    private final lkv al = new lkv(this);
    private final ekxu an = new ekxu(this);
    private boolean ao;

    @Deprecated
    public ahic() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return ahih.class;
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

    @Override // defpackage.ahhj
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

    @Override // defpackage.ahhj, defpackage.efad, defpackage.ea
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
    public final ahih H() {
        ahih ahihVar = this.aj;
        if (ahihVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ahihVar;
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

    @Override // defpackage.ahhj, defpackage.ea
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
                    if (!(eaVar instanceof ahic)) {
                        throw new IllegalStateException(a.J(eaVar, ahih.class));
                    }
                    this.aj = new ahih((ahic) eaVar, (elhk) ((akgt) aX).am.b(), (ejwl) ((akgt) aX).k.b(), (ejlq) ((akgt) aX).l.b(), new tbn(((akgt) aX).b.a.a.cc), (ahhq) ((akgt) aX).c.cN.b(), new ahhd((Context) ((akgt) aX).c.d.b(), (ejwl) ((akgt) aX).k.b(), (ejlq) ((akgt) aX).l.b(), (ahik) ((akgt) aX).a.a.dG.b()));
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
            ahih H = H();
            H.e.k(H.n);
            H.e.k(H.o);
            H.d.b(H.g.a(), H.m);
            final ahhd ahhdVar = H.h;
            ahhdVar.g = H.l;
            ahhdVar.h = new ahhd.a(new Consumer() { // from class: ahhc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ahhd ahhdVar2 = ahhd.this;
                    ahhdVar2.l = Math.max(ahhdVar2.c.indexOf((SuperSortLabel) obj), 0);
                    ahhdVar2.g.n(ahhdVar2.k[ahhdVar2.l]);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ahhdVar.d.b(ahhdVar.f.a(), new ahhd.b(new Consumer() { // from class: ahhc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ahhd ahhdVar2 = ahhd.this;
                    ahhdVar2.l = Math.max(ahhdVar2.c.indexOf((SuperSortLabel) obj), 0);
                    ahhdVar2.g.n(ahhdVar2.k[ahhdVar2.l]);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }));
            ahhdVar.e.k(ahhdVar.h);
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
            H().i.a(bundle);
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
        final ahih H = H();
        H.i.c(bundle);
        H.b.gi(R.xml.super_sort_preferences);
        ahic ahicVar = H.b;
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) ahicVar.a(ahicVar.Y(R.string.auto_delete_otps_key));
        switchPreferenceCompat.getClass();
        H.j = switchPreferenceCompat;
        ahic ahicVar2 = H.b;
        SwitchPreferenceCompat switchPreferenceCompat2 = (SwitchPreferenceCompat) ahicVar2.a(ahicVar2.Y(R.string.sort_messages_key));
        switchPreferenceCompat2.getClass();
        H.k = switchPreferenceCompat2;
        ahic ahicVar3 = H.b;
        Preference a = ahicVar3.a(ahicVar3.Y(R.string.default_label_key));
        a.getClass();
        H.l = a;
        H.m = new ahih.c(H.j, H.k, H.l, H.i.b());
        SwitchPreferenceCompat switchPreferenceCompat3 = H.j;
        H.n = new ahih.a(switchPreferenceCompat3);
        H.o = new ahih.b(switchPreferenceCompat3, H.k, H.l);
        switchPreferenceCompat3.G(false);
        H.j.N(false);
        H.j.n = new elhi(H.c, "SuperSortSettingsFragmentPeer:toggleOtpDeletionEnabled", new onh() { // from class: ahid
            @Override // defpackage.onh
            public final boolean a(Preference preference, Object obj) {
                Boolean bool = Boolean.TRUE;
                ahih ahihVar = ahih.this;
                ahhq ahhqVar = ahihVar.g;
                boolean equals = bool.equals(obj);
                ahihVar.e.i(ejlp.b(ahhqVar.b(equals)), new ejlm(Boolean.valueOf(equals)), ahihVar.n);
                return false;
            }
        });
        H.k.G(false);
        H.k.N(false);
        SwitchPreferenceCompat switchPreferenceCompat4 = H.k;
        boolean g = aewg.g(SuperSortLabel.PROMOTION);
        int i = R.string.sort_messages_summary;
        if (g && !aewg.g(SuperSortLabel.BUSINESS_UPDATE)) {
            i = R.string.sort_messages_summary_business;
        }
        switchPreferenceCompat4.J(i);
        H.k.n = new elhi(H.c, "SuperSortSettingsFragmentPeer:toggleSuperSortEnabled", new onh() { // from class: ahie
            @Override // defpackage.onh
            public final boolean a(Preference preference, Object obj) {
                Boolean bool = Boolean.TRUE;
                ahih ahihVar = ahih.this;
                ahhq ahhqVar = ahihVar.g;
                boolean equals = bool.equals(obj);
                ahihVar.e.i(ejlp.b(ahhqVar.c(equals)), new ejlm(Boolean.valueOf(equals)), ahihVar.o);
                if (!equals) {
                    return false;
                }
                ahihVar.f.a();
                return false;
            }
        });
        H.l.G(false);
        H.l.N(false);
        H.l.o = new elhj(H.c, "SuperSortSettingsFragmentPeer:toggleDefaultLabel", new oni() { // from class: ahif
            @Override // defpackage.oni
            public final boolean a(Preference preference) {
                ahih.this.h.b();
                return true;
            }
        });
    }

    @Override // defpackage.ahhj, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
