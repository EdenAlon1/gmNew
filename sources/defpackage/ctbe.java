package defpackage;

import android.content.Context;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctbe {
    public static final cfup a = cfvl.h(cfvl.b, "google_global_privacy_policy", "https://www.google.com/policies/privacy/");
    public static final cfup b = cfvl.h(cfvl.b, "google_regional_privacy_policy_pattern", "https://www.google.com/intl/%1$s_%2$s/policies/privacy/");
    public final Context c;

    public ctbe(Context context) {
        this.c = context;
    }

    public final String a() {
        Locale c = ctid.c(this.c);
        String country = c.getCountry();
        return Locale.US.getCountry().equals(country) ? (String) a.e() : String.format(Locale.US, (String) b.e(), c.getLanguage(), country);
    }

    public final String b() {
        Locale c = ctid.c(this.c);
        String country = c.getCountry();
        return Locale.US.getCountry().equals(country) ? "https://www.google.com/policies/terms/" : String.format(Locale.US, "https://www.google.com/intl/%1$s_%2$s/policies/terms/regional.html", c.getLanguage(), country);
    }
}
