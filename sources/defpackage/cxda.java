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
import com.google.common.util.concurrent.ListenableFuture;
import cxdy.a;
import cxdy.b;
import cxdy.c;
import cxdy.d;
import defpackage.ekkz;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxda extends cxiw implements ekhu, fbas, ekhq, ekkk, elar {
    private cxdy aj;
    private Context ak;
    private final lkv al = new lkv(this);
    private final ekxu an = new ekxu(this);
    private boolean ao;

    @Deprecated
    public cxda() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return cxdy.class;
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
    public final cxdy H() {
        cxdy cxdyVar = this.aj;
        if (cxdyVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cxdyVar;
    }

    @Override // defpackage.cxiw
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

    @Override // defpackage.cxiw, defpackage.efad, defpackage.ea
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
        H();
        return false;
    }

    @Override // defpackage.cxiw, defpackage.ea
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
                    ea eaVar = (ea) ((fbbb) ((akgo) aX).e).a;
                    if (!(eaVar instanceof cxda)) {
                        throw new IllegalStateException(a.J(eaVar, cxdy.class));
                    }
                    this.aj = new cxdy((cxda) eaVar, ((akgo) aX).eM, (eisx) ((akgo) aX).b.b.b(), ((akgo) aX).g, ((akgo) aX).f);
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
            cxdy H = H();
            H.b = H.new c();
            ((ejlq) H.k.b()).k(H.b);
            H.c = H.new b();
            ((ejlq) H.k.b()).k(H.c);
            H.d = H.new d();
            ((ejlq) H.k.b()).k(H.d);
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
        final cxdy H = H();
        H.e.b.f("bugle");
        H.e.gi(R.xml.rich_cards_preferences);
        H.e.b().ag();
        ont ontVar = H.e;
        H.g = Optional.ofNullable((TwoStatePreference) ontVar.a(ontVar.Y(R.string.link_preview_enabled_pref_key)));
        ont ontVar2 = H.e;
        H.i = Optional.ofNullable((TwoStatePreference) ontVar2.a(ontVar2.Y(R.string.rich_cards_settings_enable_all_pref_key)));
        ont ontVar3 = H.e;
        H.h = Optional.ofNullable((TwoStatePreference) ontVar3.a(ontVar3.Y(R.string.link_preview_wifi_only_pref_key)));
        ((TwoStatePreference) H.g.get()).N(false);
        ((TwoStatePreference) H.i.get()).N(false);
        ((TwoStatePreference) H.h.get()).N(false);
        ejwl ejwlVar = (ejwl) H.j.b();
        final ahoq ahoqVar = (ahoq) H.f.b();
        final eisx eisxVar = H.a;
        ejwlVar.c(new ejuy(ahoqVar.c, new eros() { // from class: ahob
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                final ahoq ahoqVar2 = ahoq.this;
                final elfl b = ahoqVar2.g.b(eisxVar);
                final elfl g = elfo.g(new Callable() { // from class: ahoa
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(ahoq.this.e.g());
                    }
                }, ahoqVar2.d);
                final elfl g2 = elfo.g(new Callable() { // from class: ahof
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(ahoq.this.e.l());
                    }
                }, ahoqVar2.d);
                return new erph(elfo.m(b, g, g2).a(new Callable() { // from class: ahog
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ahnq ahnqVar = new ahnq();
                        ahnqVar.b(false);
                        ahnqVar.a(false);
                        ahnqVar.c(false);
                        ahnqVar.b(((Boolean) erqt.q(ListenableFuture.this)).booleanValue());
                        ahnqVar.a(((Boolean) erqt.q(g)).booleanValue());
                        ahnqVar.c(((Boolean) erqt.q(g2)).booleanValue());
                        if (ahnqVar.d == 7) {
                            return new ahnr(ahnqVar.a, ahnqVar.b, ahnqVar.c);
                        }
                        StringBuilder sb = new StringBuilder();
                        if ((ahnqVar.d & 1) == 0) {
                            sb.append(" linkPreviewEnabled");
                        }
                        if ((ahnqVar.d & 2) == 0) {
                            sb.append(" allRichCardsEnabled");
                        }
                        if ((ahnqVar.d & 4) == 0) {
                            sb.append(" richCardsWifiOnly");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                }, ahoqVar2.f));
            }
        }, "richcardsettings"), ejwa.FEW_SECONDS, H.new a());
        H.g.ifPresent(new Consumer() { // from class: cxdc
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final cxdy cxdyVar = cxdy.this;
                ((TwoStatePreference) obj).n = new onh() { // from class: cxdg
                    @Override // defpackage.onh
                    public final boolean a(Preference preference, Object obj2) {
                        final boolean equals = Boolean.TRUE.equals(obj2);
                        cxdy cxdyVar2 = cxdy.this;
                        ejlq ejlqVar = (ejlq) cxdyVar2.k.b();
                        final ahoq ahoqVar2 = (ahoq) cxdyVar2.f.b();
                        ejlqVar.i(ejlp.b(elfo.f(new Runnable() { // from class: ahoc
                            @Override // java.lang.Runnable
                            public final void run() {
                                ahoq ahoqVar3 = ahoq.this;
                                ahoqVar3.a.g(ahoqVar3.b.getString(R.string.link_preview_enabled_pref_key), equals);
                            }
                        }, ahoqVar2.d).h(new emwl() { // from class: ahod
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                ahoq.this.b();
                                return null;
                            }
                        }, ahoqVar2.f).i(new eroh() { // from class: ahon
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                return !equals ? ahoq.this.a(false) : elfo.e(null);
                            }
                        }, ahoqVar2.f)), new ejlm(Boolean.valueOf(equals)), cxdyVar2.b);
                        return false;
                    }
                };
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        H.i.ifPresent(new Consumer() { // from class: cxdd
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final cxdy cxdyVar = cxdy.this;
                ((TwoStatePreference) obj).n = new onh() { // from class: cxdf
                    @Override // defpackage.onh
                    public final boolean a(Preference preference, Object obj2) {
                        boolean equals = Boolean.TRUE.equals(obj2);
                        cxdy cxdyVar2 = cxdy.this;
                        ((ejlq) cxdyVar2.k.b()).i(ejlp.b(((ahoq) cxdyVar2.f.b()).a(equals)), new ejlm(Boolean.valueOf(equals)), cxdyVar2.c);
                        return false;
                    }
                };
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        H.h.ifPresent(new Consumer() { // from class: cxde
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final cxdy cxdyVar = cxdy.this;
                ((TwoStatePreference) obj).n = new onh() { // from class: cxdb
                    @Override // defpackage.onh
                    public final boolean a(Preference preference, Object obj2) {
                        final boolean equals = Boolean.TRUE.equals(obj2);
                        cxdy cxdyVar2 = cxdy.this;
                        ejlq ejlqVar = (ejlq) cxdyVar2.k.b();
                        final ahoq ahoqVar2 = (ahoq) cxdyVar2.f.b();
                        ejlqVar.i(ejlp.b(elfo.f(new Runnable() { // from class: ahol
                            @Override // java.lang.Runnable
                            public final void run() {
                                ahoq ahoqVar3 = ahoq.this;
                                ahoqVar3.a.g(ahoqVar3.b.getString(R.string.link_preview_wifi_only_pref_key), equals);
                            }
                        }, ahoqVar2.d).h(new emwl() { // from class: ahom
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                ahoq.this.b();
                                return null;
                            }
                        }, ahoqVar2.f)), new ejlm(Boolean.valueOf(equals)), cxdyVar2.d);
                        return false;
                    }
                };
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.cxiw, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
