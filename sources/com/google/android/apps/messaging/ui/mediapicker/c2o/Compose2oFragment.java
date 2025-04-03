package com.google.android.apps.messaging.ui.mediapicker.c2o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.akgt;
import defpackage.akis;
import defpackage.akvg;
import defpackage.akzt;
import defpackage.axul;
import defpackage.cqoh;
import defpackage.crjx;
import defpackage.cuxz;
import defpackage.cxqz;
import defpackage.dbxn;
import defpackage.dbxo;
import defpackage.dbxp;
import defpackage.dbxv;
import defpackage.dcfa;
import defpackage.dcgl;
import defpackage.ddzb;
import defpackage.dede;
import defpackage.ea;
import defpackage.efbd;
import defpackage.ekhq;
import defpackage.ekht;
import defpackage.ekhu;
import defpackage.ekkg;
import defpackage.ekkj;
import defpackage.ekkk;
import defpackage.ekkn;
import defpackage.ekku;
import defpackage.ekyf;
import defpackage.elar;
import defpackage.elav;
import defpackage.eldl;
import defpackage.elds;
import defpackage.fbae;
import defpackage.fbal;
import defpackage.fbas;
import defpackage.fbbb;
import defpackage.lkk;
import defpackage.lkv;
import defpackage.loo;
import defpackage.tam;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Compose2oFragment extends dbxv implements ekhu, fbas, ekhq, ekkk, elar {
    public final lkv a = new lkv(this);
    private boolean ag;
    private dbxp d;
    private Context e;

    @Deprecated
    public Compose2oFragment() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return dbxp.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final dbxp H = H();
            H.a = (CoordinatorLayout) layoutInflater.inflate(R.layout.compose2o_grid_view_m2, viewGroup, false);
            H.b = H.a.findViewById(R.id.compose2o_shadow);
            H.e = (ContentGridView) H.a.findViewById(R.id.c2o_content_grid);
            H.e.z(new dbxn(H));
            H.w.z();
            H.e.ap(new ContentGridLayoutManager());
            H.e.aR(H.d);
            H.g();
            Compose2oFragment compose2oFragment = H.w;
            H.g = new dcfa(compose2oFragment);
            dbxo dbxoVar = H.c;
            if (dbxoVar != null) {
                ContentGridView contentGridView = H.e;
                loo.a(compose2oFragment);
                dbxoVar.m(contentGridView);
                H.b();
            } else {
                H.a.setVisibility(8);
                H.n = true;
            }
            H.a.setSystemUiVisibility(1280);
            H.a.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: dbxl
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    view.setPadding(0, 0, 0, 0);
                    return windowInsets;
                }
            });
            H.e.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: dbxm
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    dbxp.this.h(view, windowInsets);
                    return windowInsets;
                }
            });
            CoordinatorLayout coordinatorLayout = H.a;
            ekyf.q();
            return coordinatorLayout;
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
        return this.a;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dbxp H() {
        dbxp dbxpVar = this.d;
        if (dbxpVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return dbxpVar;
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

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.e == null) {
            this.e = new ekkn(this, super.z());
        }
        return this.e;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        elav f = this.c.f();
        try {
            aV(i, i2, intent);
            dbxp H = H();
            H.f = new cxqz(i, i2, intent);
            dbxo dbxoVar = H.c;
            if (dbxoVar == null) {
                H.p = true;
            } else {
                dbxoVar.b(H.f);
            }
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

    @Override // defpackage.dbxv, defpackage.efaf, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ai() {
        elav b = this.c.b();
        try {
            ba();
            dbxp H = H();
            dbxo dbxoVar = H.c;
            if (dbxoVar == null) {
                H.u = true;
            } else {
                H.u = false;
                dbxoVar.e();
            }
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void am() {
        this.c.k();
        try {
            bh();
            dbxp H = H();
            dbxo dbxoVar = H.c;
            if (dbxoVar == null) {
                H.u = true;
            } else {
                H.u = false;
                dbxoVar.g();
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ao() {
        elav b = this.c.b();
        try {
            bi();
            dbxp H = H();
            H.u = false;
            dbxo dbxoVar = H.c;
            if (dbxoVar == null) {
                H.t = true;
                H.o = true;
            } else {
                H.t = false;
                dbxoVar.h();
                if (((Boolean) H.D.b()).booleanValue()) {
                    final dbxo dbxoVar2 = H.c;
                    dbxoVar2.getClass();
                    efbd.e(new Runnable() { // from class: dbxj
                        @Override // java.lang.Runnable
                        public final void run() {
                            dbxo.this.l();
                        }
                    });
                } else {
                    H.c.l();
                }
            }
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

    @Override // defpackage.dbxv
    protected final /* synthetic */ fbae b() {
        return new ekku(this);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final elds bb() {
        return this.c.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.c.e(eldsVar, z);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void be(elds eldsVar) {
        this.c.b = eldsVar;
    }

    @Override // defpackage.dbxv, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.d == null) {
                try {
                    Object aX = aX();
                    Optional of = Optional.of((Class) ((akgt) aX).a.b.pA.b());
                    Optional optional = (Optional) ((akgt) aX).a.jz.b();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof Compose2oFragment)) {
                        throw new IllegalStateException(a.J(eaVar, dbxp.class));
                    }
                    Compose2oFragment compose2oFragment = (Compose2oFragment) eaVar;
                    akzt akztVar = (akzt) ((akgt) aX).a.a.f.b();
                    crjx crjxVar = (crjx) ((akgt) aX).a.a.r.b();
                    dcgl dcglVar = (dcgl) ((akgt) aX).bC.b();
                    akis akisVar = ((akgt) aX).a;
                    this.d = new dbxp(of, optional, compose2oFragment, akztVar, crjxVar, dcglVar, akisVar.b.hw, (cuxz) akisVar.kf.b(), (dede) ((akgt) aX).a.b.iq.b(), (akvg) ((akgt) aX).a.a.Px.b(), (axul) ((akgt) aX).a.b.id.b(), (cqoh) ((akgt) aX).a.cz.b(), (tam) ((akgt) aX).c.m.b(), (ddzb) ((akgt) aX).a.a.nk.b(), ((akgt) aX).a.b.hM);
                    this.Z.c(new ekkg(this.c, this.a));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.c.k();
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aY(bundle);
            dbxp H = H();
            H.u = false;
            dbxo dbxoVar = H.c;
            if (dbxoVar != null && H.e != null) {
                H.q = false;
                dbxoVar.d(bundle);
                ekyf.q();
            }
            H.q = true;
            H.r = bundle;
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

    @Override // defpackage.efaf, defpackage.ea
    public final void j() {
        elav a = this.c.a();
        try {
            bg();
            this.ag = true;
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void k(Bundle bundle) {
        this.c.k();
        try {
            bj(bundle);
            dbxo dbxoVar = H().c;
            if (dbxoVar != null) {
                dbxoVar.i(bundle);
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void l() {
        this.c.k();
        try {
            bk();
            dbxp H = H();
            H.u = false;
            dbxo dbxoVar = H.c;
            if (dbxoVar == null) {
                H.s = true;
            } else {
                H.s = false;
                dbxoVar.j();
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void m() {
        this.c.k();
        try {
            bl();
            dbxp H = H();
            dbxo dbxoVar = H.c;
            if (dbxoVar == null) {
                H.u = true;
            } else {
                H.u = false;
                dbxoVar.k();
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

    @Override // defpackage.efaf, defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dbxp H = H();
        if ((H.m && configuration.orientation == 1) || (!H.m && configuration.orientation == 2)) {
            H.g();
        }
        dbxo dbxoVar = H.c;
        if (dbxoVar != null) {
            dbxoVar.c(configuration);
        }
    }

    @Override // defpackage.efaf, defpackage.ea, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        dbxo dbxoVar = H().c;
        if (dbxoVar != null) {
            dbxoVar.f();
        }
    }

    @Override // defpackage.dbxv, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
