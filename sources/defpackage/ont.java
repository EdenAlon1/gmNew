package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ont extends ea implements ooe, ooc, ood, omm {
    public final onp a = new onp(this);
    public int ag = R.layout.preference_list_fragment;
    public final Handler ah = new onn(this, Looper.getMainLooper());
    public final Runnable ai = new ono(this);
    public oof b;
    public RecyclerView c;
    public boolean d;
    public boolean e;

    @Override // defpackage.omm
    public final Preference a(CharSequence charSequence) {
        oof oofVar = this.b;
        if (oofVar == null) {
            return null;
        }
        return oofVar.d(charSequence);
    }

    @Override // defpackage.ood
    public final void aT() {
        boolean z = false;
        for (ea eaVar = this; !z && eaVar != null; eaVar = eaVar.E) {
            if (eaVar instanceof ons) {
                z = ((ons) eaVar).a();
            }
        }
        if (!z && (z() instanceof ons)) {
            z = ((ons) z()).a();
        }
        if (z || !(G() instanceof ons)) {
            return;
        }
        ((ons) G()).a();
    }

    public final PreferenceScreen b() {
        oof oofVar = this.b;
        if (oofVar == null) {
            return null;
        }
        return oofVar.b;
    }

    public final void gi(int i) {
        q();
        r(this.b.e(A(), i, b()));
    }

    public final void gj() {
        PreferenceScreen b = b();
        if (b != null) {
            this.c.am(new ooa(b));
            b.B();
        }
    }

    @Override // defpackage.ea
    public void h(Bundle bundle) {
        super.h(bundle);
        TypedValue typedValue = new TypedValue();
        A().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        A().getTheme().applyStyle(i, false);
        oof oofVar = new oof(A());
        this.b = oofVar;
        oofVar.e = this;
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        t(bundle);
    }

    @Override // defpackage.ea
    public void i() {
        this.ah.removeCallbacks(this.ai);
        this.ah.removeMessages(1);
        if (this.d) {
            this.c.am(null);
            PreferenceScreen b = b();
            if (b != null) {
                b.D();
            }
        }
        this.c = null;
        super.i();
    }

    @Override // defpackage.ea
    public void l() {
        super.l();
        oof oofVar = this.b;
        oofVar.c = this;
        oofVar.d = this;
    }

    @Override // defpackage.ea
    public void m() {
        super.m();
        oof oofVar = this.b;
        oofVar.c = null;
        oofVar.d = null;
    }

    @Override // defpackage.ooc
    public final void p(Preference preference) {
        dn oncVar;
        boolean z = false;
        for (ea eaVar = this; !z && eaVar != null; eaVar = eaVar.E) {
            if (eaVar instanceof onq) {
                z = ((onq) eaVar).a();
            }
        }
        if (!z && (z() instanceof onq)) {
            z = ((onq) z()).a();
        }
        if (z) {
            return;
        }
        if (!((G() instanceof onq) && ((onq) G()).a()) && J().h("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                String str = preference.s;
                oncVar = new oms();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                oncVar.at(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.s;
                oncVar = new omy();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                oncVar.at(bundle2);
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                String str3 = preference.s;
                oncVar = new onc();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                oncVar.at(bundle3);
            }
            oncVar.aP(this);
            oncVar.s(J(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    public final void q() {
        if (this.b == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    public void r(PreferenceScreen preferenceScreen) {
        throw null;
    }

    public boolean s(Preference preference) {
        boolean z = false;
        if (preference.u == null) {
            return false;
        }
        for (ea eaVar = this; !z && eaVar != null; eaVar = eaVar.E) {
            if (eaVar instanceof onr) {
                z = ((onr) eaVar).a();
            }
        }
        if (!z && (z() instanceof onr)) {
            z = ((onr) z()).a();
        }
        if (z) {
            return true;
        }
        if ((G() instanceof onr) && ((onr) G()).a()) {
            return true;
        }
        Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        fr J = J();
        Bundle r = preference.r();
        em l = J.l();
        fe().getClassLoader();
        ea b = l.b(preference.u);
        b.at(r);
        b.aP(this);
        cg cgVar = new cg(J);
        cgVar.E(((View) N().getParent()).getId(), b);
        cgVar.v(null);
        cgVar.j();
        return true;
    }

    public abstract void t(Bundle bundle);
}
