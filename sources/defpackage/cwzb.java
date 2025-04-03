package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import cwzu.a;
import cwzu.c;
import cwzu.d;
import cwzu.g;
import defpackage.ekkz;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwzb extends cxit implements ekhu, fbas, ekhq, ekkk, elar, ellr {
    private cwzu aj;
    private Context ak;
    private final lkv al = new lkv(this);
    private final ekxu an = new ekxu(this);
    private final ells ao = new ells();
    private boolean ap;

    @Deprecated
    public cwzb() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return cwzu.class;
    }

    @Override // defpackage.efad, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.an.k();
        try {
            View M = super.M(layoutInflater, viewGroup, bundle);
            if (M == null) {
                cwzx.a(this, H());
            }
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
    public final cwzu H() {
        cwzu cwzuVar = this.aj;
        if (cwzuVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ap) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cwzuVar;
    }

    @Override // defpackage.cxit
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
            H().ap.af(i, i2, intent);
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

    @Override // defpackage.cxit, defpackage.efad, defpackage.ea
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
            cwzu H = H();
            H.ap.b().q().unregisterOnSharedPreferenceChangeListener(H);
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
            cwzu H = H();
            H.ap.b().q().registerOnSharedPreferenceChangeListener(H);
            H.g();
            H.f();
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
            ellg.b(this).b = view;
            H();
            cwzx.a(this, H());
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

    @Override // defpackage.ellr
    public final elli e(ellf ellfVar) {
        return this.ao.a(ellfVar);
    }

    @Override // defpackage.ellr
    public final void f(Class cls, ellh ellhVar) {
        this.ao.b(cls, ellhVar);
    }

    @Override // defpackage.cxit, defpackage.ea
    public final void g(Context context) {
        this.an.k();
        try {
            if (this.ap) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.aj == null) {
                try {
                    Object aX = aX();
                    Optional optional = (Optional) ((akgo) aX).a.mO.b();
                    Optional of = Optional.of(((akgo) aX).a.b.Y());
                    akzt akztVar = (akzt) ((akgo) aX).a.a.f.b();
                    cpdl cpdlVar = (cpdl) ((akgo) aX).a.a.DA.b();
                    bavz bavzVar = (bavz) ((akgo) aX).a.a.fM.b();
                    cpbz cpbzVar = (cpbz) ((akgo) aX).a.a.ji.b();
                    cpbs cpbsVar = (cpbs) ((akgo) aX).a.a.ft.b();
                    ctwb ctwbVar = (ctwb) ((akgo) aX).a.a.c.b();
                    ctvb ctvbVar = (ctvb) ((akgo) aX).a.a.u.b();
                    ctyw ctywVar = (ctyw) ((akgo) aX).a.a.fu.b();
                    errl errlVar = (errl) ((akgo) aX).a.t.b();
                    akvg akvgVar = (akvg) ((akgo) aX).a.a.Px.b();
                    cwqc cwqcVar = (cwqc) ((akgo) aX).eJ.b();
                    akfv akfvVar = ((akgo) aX).d;
                    fbbf fbbfVar = akfvVar.r;
                    akkp akkpVar = ((akgo) aX).a.a;
                    cwvo cwvoVar = new cwvo(akkpVar.fu, akkpVar.ft, akfvVar.i, akkpVar.fv);
                    cpbz cpbzVar2 = (cpbz) ((akgo) aX).a.a.ji.b();
                    ejvb ejvbVar = (ejvb) ((akgo) aX).a.dy.b();
                    cwza cwzaVar = new cwza(cpbzVar2, ejvbVar, (errl) ((akgo) aX).a.t.b());
                    ejwl ejwlVar = (ejwl) ((akgo) aX).g.b();
                    ejlq ejlqVar = (ejlq) ((akgo) aX).f.b();
                    cxao cxaoVar = (cxao) ((akgo) aX).a.a.fv.b();
                    elhk elhkVar = (elhk) ((akgo) aX).i.b();
                    fbbf fbbfVar2 = ((akgo) aX).b.ap;
                    ddzb ddzbVar = (ddzb) ((akgo) aX).a.a.nk.b();
                    ejvp ejvpVar = (ejvp) ((akgo) aX).a.aR.b();
                    Optional of2 = Optional.of(((akgo) aX).a.a.aj());
                    Optional optional2 = (Optional) ((akgo) aX).d.M.b();
                    akis akisVar = ((akgo) aX).a;
                    fbbf fbbfVar3 = akisVar.cI;
                    fbbf fbbfVar4 = akisVar.lz;
                    akko akkoVar = akisVar.b;
                    fbbf fbbfVar5 = akkoVar.dQ;
                    fbbf fbbfVar6 = ((akgo) aX).d.W;
                    Optional of3 = Optional.of(new tgq((axkm) akkoVar.a.a.ck.b(), (babm) akkoVar.a.a.wl.b(), (errl) akkoVar.a.p.b()));
                    akkp akkpVar2 = ((akgo) aX).a.a;
                    fbbf fbbfVar7 = akkpVar2.cf;
                    fbbf fbbfVar8 = ((akgo) aX).b.bm;
                    Optional of4 = Optional.of((cmso) akkpVar2.us.b());
                    axkm axkmVar = (axkm) ((akgo) aX).a.a.ck.b();
                    dkpp dkppVar = (dkpp) ((akgo) aX).a.aQ.b();
                    akis akisVar2 = ((akgo) aX).a;
                    tgc tgcVar = new tgc(axkmVar, dkppVar, akisVar2.a.cf, (ejvb) akisVar2.dy.b(), (cqoh) ((akgo) aX).a.cz.b(), ((akgo) aX).a.T(), (errl) ((akgo) aX).a.p.b(), (errl) ((akgo) aX).a.t.b());
                    asjt asjtVar = (asjt) ((akgo) aX).a.a.ch.b();
                    fbbf fbbfVar9 = ((akgo) aX).a.a.Z;
                    eisx eisxVar = (eisx) ((akgo) aX).b.b.b();
                    ea eaVar = (ea) ((fbbb) ((akgo) aX).e).a;
                    if (!(eaVar instanceof cwzb)) {
                        throw new IllegalStateException(a.J(eaVar, cwzu.class));
                    }
                    cwzb cwzbVar = (cwzb) eaVar;
                    babf babfVar = (babf) ((akgo) aX).a.a.pN.b();
                    akko akkoVar2 = ((akgo) aX).a.b;
                    fbbf fbbfVar10 = akkoVar2.kS;
                    fbbf fbbfVar11 = ((akgo) aX).eL;
                    final fbbf fbbfVar12 = akkoVar2.a.a.s;
                    this.aj = new cwzu(optional, of, akztVar, cpdlVar, bavzVar, cpbzVar, cpbsVar, ctwbVar, ctvbVar, ctywVar, errlVar, akvgVar, cwqcVar, fbbfVar, cwvoVar, cwzaVar, ejwlVar, ejlqVar, cxaoVar, elhkVar, fbbfVar2, ddzbVar, ejvpVar, of2, optional2, fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, of3, fbbfVar7, fbbfVar8, of4, tgcVar, asjtVar, fbbfVar9, eisxVar, cwzbVar, babfVar, fbbfVar10, fbbfVar11, new asxo() { // from class: asxm
                        @Override // defpackage.asxo
                        public final boolean a() {
                            return ((ersq) ffbr.this.b()).a("bugle.set_default_number");
                        }
                    }, akkoVar2.kT);
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
            cwzu H = H();
            H.v = H.new c();
            H.w = H.new a();
            H.ak = H.new g();
            H.al = H.new d();
            H.V.k(H.v);
            H.V.k(H.w);
            H.V.k(H.ak);
            H.V.k(H.al);
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
            this.ap = true;
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

    /* JADX WARN: Removed duplicated region for block: B:59:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x042f  */
    @Override // defpackage.ont
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwzb.t(android.os.Bundle):void");
    }

    @Override // defpackage.cxit, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
