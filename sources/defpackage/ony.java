package defpackage;

import androidx.car.app.model.Alert;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ony implements oni {
    final /* synthetic */ PreferenceGroup a;
    final /* synthetic */ ooa b;

    public ony(ooa ooaVar, PreferenceGroup preferenceGroup) {
        this.b = ooaVar;
        this.a = preferenceGroup;
    }

    @Override // defpackage.oni
    public final boolean a(Preference preference) {
        this.a.ac(Alert.DURATION_SHOW_INDEFINITELY);
        this.b.b();
        return true;
    }
}
