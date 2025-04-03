package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.settingspage.SettingsPageView;
import defpackage.ekkz;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahmb extends ahmz implements ekhu, fbas, ekhq, ekkk, elar {
    private ahmc a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public ahmb() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return ahmc.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            H();
            View inflate = layoutInflater.inflate(R.layout.lighter_conversation_settings_fragment, viewGroup, false);
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
    public final ahmc H() {
        ahmc ahmcVar = this.a;
        if (ahmcVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ahmcVar;
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

    @Override // defpackage.ahmz, defpackage.efaf, defpackage.ea
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
    public final void ap(View view, Bundle bundle) {
        this.c.k();
        try {
            bm(view, bundle);
            ahmc H = H();
            H.l = ((dygx) H.b.b()).l();
            if (H.k == null && H.l != null) {
                ahmb ahmbVar = H.d;
                ahmbVar.getClass();
                H.k = new ahmh(H, (SettingsPageView) ahmbVar.N().findViewById(R.id.settings_page), H.l);
            }
            if (H.k == null) {
                dyhr.a("LIGHTER_SETTINGS_FRAGMENT", "settingsPagePresenter is null");
            } else if (H.l == null) {
                dyhr.a("LIGHTER_SETTINGS_FRAGMENT", "userPropertiesController is null");
            } else {
                ahmb ahmbVar2 = H.d;
                ahmbVar2.getClass();
                ((Switch) ahmbVar2.N().findViewById(R.id.read_receipt_switch_button)).setClickable(false);
            }
            ((Toolbar) view.findViewById(R.id.toolbar)).t(new ahmg(H));
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

    @Override // defpackage.ahmz
    protected final /* bridge */ /* synthetic */ ekky b() {
        return new ekkt(this, false);
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

    @Override // defpackage.ahmz, defpackage.ekkd, defpackage.ea
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
                    ea eaVar = (ea) ((fbbb) ((akgo) aX).e).a;
                    if (!(eaVar instanceof ahmb)) {
                        throw new IllegalStateException(a.J(eaVar, ahmc.class));
                    }
                    this.a = new ahmc((ahmb) eaVar, ((akgo) aX).a.a.KS, (ejlq) ((akgo) aX).f.b(), (ejxn) ((akgo) aX).n.b(), (errl) ((akgo) aX).a.t.b());
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
            ahmc H = H();
            Bundle bundle2 = H.d.m;
            bundle2.getClass();
            dzja dzjaVar = (dzja) bundle2.getSerializable("account_context");
            if (dzjaVar == null) {
                ahmc.a.m("Unable to get the account context.");
                H.d.fe().finish();
            } else {
                dzpt dzptVar = (dzpt) bundle2.getParcelable("conversation_id");
                if (dzptVar == null) {
                    ahmc.a.r("Unable to get the conversation id.");
                    H.d.fe().finish();
                } else {
                    H.e = dzjaVar;
                    H.f = dzptVar;
                    H.g.k(H.i);
                    H.h.g(R.id.initialize_read_receipt_setting_value_local_subscription, new ahmf(H, dzjaVar, dzptVar), H.j);
                }
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

    @Override // defpackage.ahmz, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
