package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowInsets;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class akuc extends efad {
    private static void aU(Preference preference) {
        preference.Z();
        preference.x = true;
        preference.y = false;
        if (preference instanceof PreferenceGroup) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
            for (int i = 0; i < preferenceGroup.k(); i++) {
                aU(preferenceGroup.o(i));
            }
        }
    }

    @Override // defpackage.ea
    public void ap(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen b;
        this.am.k(bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (b = b()) != null) {
            b.x(bundle2);
        }
        if (this.d) {
            gj();
        }
        this.e = true;
        RecyclerView recyclerView = this.c;
        recyclerView.setImportantForAccessibility(2);
        recyclerView.z(new akub());
        if (bf()) {
            recyclerView.setOnApplyWindowInsetsListener(new ddxu(new ddxt() { // from class: akua
                @Override // defpackage.ddxt
                public final void a(View view2, WindowInsets windowInsets) {
                    view2.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                }
            }));
        }
    }

    protected boolean bf() {
        return true;
    }

    @Override // defpackage.ont
    public final void r(PreferenceScreen preferenceScreen) {
        oof oofVar;
        PreferenceScreen preferenceScreen2;
        if (preferenceScreen != null) {
            aU(preferenceScreen);
        }
        if (preferenceScreen == null || preferenceScreen == (preferenceScreen2 = (oofVar = this.b).b)) {
            return;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.D();
        }
        oofVar.b = preferenceScreen;
        this.d = true;
        if (!this.e || this.ah.hasMessages(1)) {
            return;
        }
        this.ah.obtainMessage(1).sendToTarget();
    }
}
