package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.welcome.v1.viewmodel.AccountWelcomeViewModel;
import defpackage.ekkz;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adoq extends adpo implements ekhu, fbas, ekhq, ekkk, elar {
    public final lkv a = new lkv(this);
    private boolean ag;
    private adpj d;
    private Context e;

    @Deprecated
    public adoq() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return adpj.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            adpj H = H();
            layoutInflater.getClass();
            eisx a = H.a();
            if (a != null) {
                ((ejwl) H.h.b()).b(((eixo) H.i.b()).b(), new ados(H, a));
            }
            deoa a2 = ((AccountWelcomeViewModel) H.l.a()).a(cvjl.WELCOME_FLOW_ACCOUNT_SWITCH);
            axol.k(H.j, null, new adov(H, a2, null), 3);
            ComposeView composeView = new ComposeView(((adoq) H.b.b()).A(), null, 0, 6, null);
            composeView.setFitsSystemWindows(true);
            composeView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ador
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    view.getClass();
                    windowInsets.getClass();
                    return windowInsets;
                }
            });
            composeView.a(new hpw(859972479, true, new adoy(H, a2)));
            ekyf.q();
            return composeView;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.a;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final adpj H() {
        adpj adpjVar = this.d;
        if (adpjVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return adpjVar;
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

    @Override // defpackage.adpo, defpackage.efaf, defpackage.ea
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
            Window window = ((adoq) H().b.b()).fe().getWindow();
            if (window != null) {
                kwg.a(window, true);
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

    @Override // defpackage.adpo
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

    @Override // defpackage.adpo, defpackage.ekkd, defpackage.ea
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
                    akis akisVar = ((akgo) aX).a;
                    akfy akfyVar = ((akgo) aX).c;
                    akfv akfvVar = ((akgo) aX).d;
                    this.d = new adpj(((akgo) aX).cA, akfvVar.i, akfvVar.N, ((akgo) aX).az, ((akgo) aX).cz, akfyVar.r, ((akgo) aX).g, akisVar.a.as, (ffsk) akfvVar.D.b());
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
            adpj H = H();
            kwg.a(((adoq) H.b.b()).fe().getWindow(), false);
            aiha aihaVar = (aiha) H.d.b();
            aihaVar.a();
            aihaVar.b(ainr.a, true);
            aihaVar.b(aijc.a, true);
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

    @Override // defpackage.adpo, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
