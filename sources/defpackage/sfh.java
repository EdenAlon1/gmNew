package defpackage;

import androidx.preference.Preference;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfh implements ejxk {
    final /* synthetic */ Preference a;
    final /* synthetic */ Preference b;
    final /* synthetic */ Preference c;
    final /* synthetic */ sfk d;
    final /* synthetic */ ont e;

    public sfh(Preference preference, Preference preference2, Preference preference3, sfk sfkVar, ont ontVar) {
        this.a = preference;
        this.b = preference2;
        this.c = preference3;
        this.d = sfkVar;
        this.e = ontVar;
    }

    private final void c(Preference preference) {
        if (preference != null) {
            this.e.b().af(preference);
        }
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
        c(this.a);
        c(this.b);
        c(this.c);
    }

    @Override // defpackage.ejxk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (!ffkj.e((Boolean) obj, true)) {
            Preference preference = this.a;
            if (preference != null) {
                preference.n(this.e.Y(R.string.device_logging_consent_settings_summary_on_error));
                preference.N(true);
                return;
            }
            return;
        }
        Preference preference2 = this.a;
        if (preference2 != null) {
            final sfk sfkVar = this.d;
            preference2.o = new oni() { // from class: sff
                @Override // defpackage.oni
                public final boolean a(Preference preference3) {
                    sfk sfkVar2 = sfk.this;
                    axol.k(sfkVar2.g, null, new sfg(sfkVar2, null), 3);
                    return true;
                }
            };
            preference2.J(R.string.device_logging_consent_settings_summary);
            Preference preference3 = this.a;
            preference3.B = R.layout.logging_consent_preference_icon;
            preference3.N(true);
        }
        Preference preference4 = this.b;
        if (preference4 != null) {
            preference4.N(true);
        }
        Preference preference5 = this.c;
        if (preference5 != null) {
            preference5.N(true);
        }
    }
}
