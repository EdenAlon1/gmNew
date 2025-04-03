package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.kpq;
import defpackage.ood;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public boolean e;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, kpq.b(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.e = true;
    }

    @Override // androidx.preference.PreferenceGroup
    public final boolean ad() {
        return false;
    }

    public final void ag() {
        if (((PreferenceGroup) this).c) {
            throw new IllegalStateException("Cannot change the usage of generated IDs while attached to the preference hierarchy");
        }
        this.e = false;
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        ood oodVar;
        if (this.t != null || this.u != null || k() == 0 || (oodVar = this.k.e) == null) {
            return;
        }
        oodVar.aT();
    }
}
