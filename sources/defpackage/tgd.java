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
import com.google.android.apps.messaging.R;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.ekkz;
import java.util.Locale;
import tgk.a;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgd extends tis implements ekhu, fbas, ekhq, ekkk, elar {
    private tgk aj;
    private Context ak;
    private final lkv al = new lkv(this);
    private final ekxu an = new ekxu(this);
    private boolean ao;

    @Deprecated
    public tgd() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return tgk.class;
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
    public final tgk H() {
        tgk tgkVar = this.aj;
        if (tgkVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return tgkVar;
    }

    @Override // defpackage.tis
    protected final /* bridge */ /* synthetic */ ekky aV() {
        return new ekkt(this, true);
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

    @Override // defpackage.tis, defpackage.efad, defpackage.ea
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

    @Override // defpackage.ea
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        emxf.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
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

    @Override // defpackage.tis, defpackage.ea
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
                    akis akisVar = ((akgo) aX).a;
                    Bundle a = ((akgo) aX).a();
                    eyfc eyfcVar = (eyfc) akisVar.b.gz.b();
                    emxf.b(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    eyga eygaVar = (eyga) ProtoParsers.f(a, "TIKTOK_FRAGMENT_ARGUMENT", eyga.a, eyfcVar);
                    eygaVar.getClass();
                    ea eaVar = (ea) ((fbbb) ((akgo) aX).e).a;
                    if (!(eaVar instanceof tgd)) {
                        throw new IllegalStateException(a.J(eaVar, tgk.class));
                    }
                    tgd tgdVar = (tgd) eaVar;
                    eisx eisxVar = (eisx) ((akgo) aX).b.b.b();
                    elhk elhkVar = (elhk) ((akgo) aX).i.b();
                    tfw tfwVar = (tfw) ((akgo) aX).b.p.b();
                    fbbf fbbfVar = ((akgo) aX).a.a.Px;
                    akhy akhyVar = ((akgo) aX).b;
                    fbbf fbbfVar2 = akhyVar.ob;
                    elbx elbxVar = (elbx) akhyVar.ap.b();
                    ejwl ejwlVar = (ejwl) ((akgo) aX).g.b();
                    akis akisVar2 = ((akgo) aX).a;
                    akkp akkpVar = akisVar2.a;
                    this.aj = new tgk(eygaVar, tgdVar, eisxVar, elhkVar, tfwVar, fbbfVar, fbbfVar2, elbxVar, ejwlVar, akkpVar.CE, akkpVar.wi, ((akgo) aX).f, akisVar2.b.af(), (arep) akkpVar.pL.b());
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
            LayoutInflater cloneInContext = aO.cloneInContext(new ekkz.a(aO, this));
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
            tgk H = H();
            ((ejlq) H.m.b()).k(H.n);
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
        final tgk H = H();
        H.d.gi(R.xml.fi_account_preferences);
        H.d.b().ag();
        tgd tgdVar = H.d;
        Preference a = tgdVar.a(tgdVar.Y(R.string.fi_account_login_pref_key));
        a.getClass();
        H.q = a;
        H.q.o = new elhj(H.f, "FiSettingsFragmentPeer:clickDownloadOverWifiPreference", new oni() { // from class: tge
            @Override // defpackage.oni
            public final boolean a(Preference preference) {
                ellj.f(new tiq(), tgk.this.d);
                return false;
            }
        });
        if (H.e.a() != -1) {
            if (!H.o.a()) {
                H.q.G(false);
            }
            ejwl ejwlVar = H.j;
            final tfw tfwVar = H.g;
            ejwlVar.b(new ejuy(tfwVar.d, new eros() { // from class: tfu
                @Override // defpackage.eros
                public final erph a(erpc erpcVar) {
                    return new erph(tfw.this.c());
                }
            }, "FI_ACCOUNT_DATA_SERVICE"), H.new a());
            if (!H.p.a() && H.o.a()) {
                H.d();
            }
        }
        tgd tgdVar2 = H.d;
        Preference a2 = tgdVar2.a(tgdVar2.Y(R.string.fi_account_learn_more_pref_key));
        a2.getClass();
        a2.N(true);
        tgd tgdVar3 = H.d;
        a2.M(ddyi.c(tgdVar3.z(), H.h, H.i, R.string.fi_account_login_learn_more, null, null));
        a2.o = new oni() { // from class: tgf
            @Override // defpackage.oni
            public final boolean a(Preference preference) {
                tgk tgkVar = tgk.this;
                ((akvg) tgkVar.h.b()).y(tgkVar.d.G(), (String) tgk.b.e());
                return true;
            }
        };
    }

    @Override // defpackage.tis, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
