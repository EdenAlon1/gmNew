package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.apps.messaging.R;
import defpackage.ekkz;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uft extends ugz implements ekhu, fbas, ekhq, ekkk, elar {
    private ufz a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public uft() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return ufz.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            ufz H = H();
            View inflate = layoutInflater.inflate(R.layout.inputs_layout, viewGroup, false);
            inflate.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ufw
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    entd entdVar = ufz.a;
                    return windowInsets.consumeSystemWindowInsets();
                }
            });
            if (!((Boolean) ufz.b.e()).booleanValue()) {
                H.e(inflate);
            }
            ekyf.q();
            return inflate;
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
        return this.e;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ufz H() {
        ufz ufzVar = this.a;
        if (ufzVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ufzVar;
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
        if (this.d == null) {
            this.d = new ekkn(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.ugz, defpackage.efaf, defpackage.ea
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
            ufz H = H();
            ((ugd) H.c.b()).g();
            if (((Boolean) ufz.b.e()).booleanValue()) {
                ukv ukvVar = H.f;
                if (ukvVar != null) {
                    ukvVar.k();
                }
            } else {
                ukv ukvVar2 = H.f;
                ukvVar2.getClass();
                ukvVar2.k();
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
            H().e = false;
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
            ufz H = H();
            boolean z = true;
            H.e = true;
            ugb ugbVar = H.g;
            if (ugbVar != null) {
                uhb uhbVar = ugbVar.b;
                if (((Boolean) ((cfup) uhbVar.h.get()).e()).booleanValue()) {
                    View view = uhbVar.c;
                    int i = 8;
                    if (view != null) {
                        uhbVar.a.a(uhbVar.d);
                        view.setTranslationY(uhbVar.f);
                        if (true == uhbVar.e) {
                            i = 0;
                        }
                        view.setVisibility(i);
                        view.setAlpha(uhbVar.g);
                        if (uhbVar.g != 1.0f) {
                            z = false;
                        }
                        uhbVar.c(z);
                    } else {
                        View view2 = uhbVar.b;
                        if (view2 != null) {
                            uhbVar.a.a(uhbVar.d);
                            view2.setTranslationY(uhbVar.f);
                            if (true == uhbVar.e) {
                                i = 0;
                            }
                            view2.setVisibility(i);
                            view2.setAlpha(uhbVar.g);
                        }
                    }
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ap(View view, final Bundle bundle) {
        ugo ugoVar;
        this.c.k();
        try {
            bm(view, bundle);
            ufz H = H();
            if (((Boolean) ufz.b.e()).booleanValue()) {
                H.e(view);
            }
            if (bundle != null) {
                if (bundle.containsKey("visible_input_type")) {
                    ugo[] values = ugo.values();
                    int i = bundle.getInt("visible_input_type");
                    if (i >= 0 && i < values.length && (ugoVar = values[i]) != ugo.IME) {
                        H.i = ugoVar;
                        uge b = H.b(true);
                        if (b != null) {
                            H.o(b);
                        }
                        ugm a = ugn.a(ugoVar);
                        ugb ugbVar = H.g;
                        ugbVar.getClass();
                        ugbVar.c(a);
                    }
                }
                if (H.i == null && ((ugd) H.c.b()).e()) {
                    H.r(ugo.IME, false, false);
                }
                ukv ukvVar = H.f;
                ukvVar.getClass();
                ukvVar.j(true, new ffji() { // from class: uka
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        dsfg dsfgVar = (dsfg) obj;
                        ffbz ffbzVar = ukv.a;
                        dsfgVar.getClass();
                        dsfgVar.i(bundle);
                        return ffcu.a;
                    }
                });
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

    @Override // defpackage.ugz
    protected final /* bridge */ /* synthetic */ ekky b() {
        return new ekkt(this, true);
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

    @Override // defpackage.ugz, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    Object aX = aX();
                    String aa = ((akgo) aX).aa();
                    ea eaVar = (ea) ((fbbb) ((akgo) aX).e).a;
                    if (!(eaVar instanceof uft)) {
                        throw new IllegalStateException(a.J(eaVar, ufz.class));
                    }
                    uft uftVar = (uft) eaVar;
                    fbbf fbbfVar = ((akgo) aX).aC;
                    fbbf fbbfVar2 = ((akgo) aX).aD;
                    fbbf fbbfVar3 = ((akgo) aX).d.n;
                    enhk m = enhk.m(ugm.C2O_FRAGMENT, new uhe(), ugm.CAMERA_GALLERY_FRAGMENT, new uhy());
                    akis akisVar = ((akgo) aX).a;
                    akko akkoVar = akisVar.b;
                    fbbf fbbfVar4 = akkoVar.hP;
                    fbbf fbbfVar5 = akisVar.a.ej;
                    fbbf fbbfVar6 = akkoVar.hM;
                    adgn adgnVar = (adgn) ((akgo) aX).aF.b();
                    ((ulv) ((fbas) ((ekki) ((akgo) aX).d.j.b()).a).aX()).e().getClass();
                    this.a = new ufz(aa, uftVar, fbbfVar, fbbfVar2, fbbfVar3, m, fbbfVar4, fbbfVar5, fbbfVar6, adgnVar, (eisx) ((akgo) aX).b.b.b(), ((akgo) aX).a.b.hK);
                    this.Z.c(new ekkg(this.c, this.e));
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aY(bundle);
            ufz H = H();
            H.e = true;
            ugd ugdVar = (ugd) H.c.b();
            ufz a = H.a();
            ugdVar.g();
            ugdVar.c = a;
            ugdVar.b.k(a);
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
    public final void k(final Bundle bundle) {
        this.c.k();
        try {
            bj(bundle);
            ufz H = H();
            ugo ugoVar = H.i;
            if (ugoVar != null) {
                bundle.putInt("visible_input_type", ugoVar.ordinal());
            }
            ukv ukvVar = H.f;
            if (ukvVar != null) {
                ukv.m(ukvVar, new ffji() { // from class: ukb
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        dsfg dsfgVar = (dsfg) obj;
                        ffbz ffbzVar = ukv.a;
                        dsfgVar.getClass();
                        dsfgVar.j(bundle);
                        return ffcu.a;
                    }
                });
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
        ufz H = H();
        ugb ugbVar = H.g;
        ugbVar.getClass();
        ugbVar.f = ugb.a(ugbVar.a);
        uga ugaVar = ugbVar.g;
        if (ugaVar != null) {
            ugbVar.d(ugaVar);
        }
        ukv ukvVar = H.f;
        ukvVar.getClass();
        ukv.m(ukvVar, new ffji() { // from class: uko
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dsfg dsfgVar = (dsfg) obj;
                ffbz ffbzVar = ukv.a;
                dsfgVar.getClass();
                dsfgVar.g();
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.ugz, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
