package defpackage;

import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.messaging.ui.appsettings.RcsSimStatusPreference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwuf extends cxcj {
    public final TwoStatePreference a;
    public final Preference b;
    public final TwoStatePreference c;
    public final Preference d;
    public final Preference e;
    public final Preference f;
    public final TwoStatePreference g;
    public final RcsSimStatusPreference h;

    public cwuf(TwoStatePreference twoStatePreference, Preference preference, TwoStatePreference twoStatePreference2, Preference preference2, Preference preference3, Preference preference4, TwoStatePreference twoStatePreference3, RcsSimStatusPreference rcsSimStatusPreference) {
        this.a = twoStatePreference;
        this.b = preference;
        this.c = twoStatePreference2;
        this.d = preference2;
        this.e = preference3;
        this.f = preference4;
        this.g = twoStatePreference3;
        this.h = rcsSimStatusPreference;
    }

    @Override // defpackage.cxcj
    public final Preference a() {
        return this.e;
    }

    @Override // defpackage.cxcj
    public final Preference b() {
        return this.f;
    }

    @Override // defpackage.cxcj
    public final Preference c() {
        return this.d;
    }

    @Override // defpackage.cxcj
    public final Preference d() {
        return this.b;
    }

    @Override // defpackage.cxcj
    public final TwoStatePreference e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxcj) {
            cxcj cxcjVar = (cxcj) obj;
            if (this.a.equals(cxcjVar.g()) && this.b.equals(cxcjVar.d()) && this.c.equals(cxcjVar.e()) && this.d.equals(cxcjVar.c()) && this.e.equals(cxcjVar.a()) && this.f.equals(cxcjVar.b()) && this.g.equals(cxcjVar.f()) && this.h.equals(cxcjVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cxcj
    public final TwoStatePreference f() {
        return this.g;
    }

    @Override // defpackage.cxcj
    public final TwoStatePreference g() {
        return this.a;
    }

    @Override // defpackage.cxcj
    public final RcsSimStatusPreference h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        RcsSimStatusPreference rcsSimStatusPreference = this.h;
        TwoStatePreference twoStatePreference = this.g;
        Preference preference = this.f;
        Preference preference2 = this.e;
        Preference preference3 = this.d;
        TwoStatePreference twoStatePreference2 = this.c;
        Preference preference4 = this.b;
        return "RcsSettingsPreferences{rcsEnabled=" + this.a.toString() + ", rcsFallback=" + preference4.toString() + ", autoRcsFallbackEnabled=" + twoStatePreference2.toString() + ", mobileDataAutoDownloadLimit=" + preference3.toString() + ", defaultSharingMethod=" + preference2.toString() + ", learnMore=" + preference.toString() + ", mobileDataAutoDownloadInRoamingEnabled=" + twoStatePreference.toString() + ", rcsSimStatusList=" + rcsSimStatusPreference.toString() + "}";
    }
}
