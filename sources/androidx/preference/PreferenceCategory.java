package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.kpq;
import defpackage.ooi;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, kpq.b(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), 0);
    }

    @Override // androidx.preference.Preference
    public final boolean T() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void a(ooi ooiVar) {
        super.a(ooiVar);
        if (Build.VERSION.SDK_INT >= 28) {
            ooiVar.a.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return !super.T();
    }
}
