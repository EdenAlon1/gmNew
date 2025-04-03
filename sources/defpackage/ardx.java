package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ardx implements ardy {
    public final Locale a;
    public final int b;

    public ardx(Locale locale, int i) {
        this.a = locale;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ardx)) {
            return false;
        }
        ardx ardxVar = (ardx) obj;
        return ffkj.e(this.a, ardxVar.a) && this.b == ardxVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "LanguagePackUnavailable(locale=" + this.a + ", availability=" + ((Object) ardu.a(this.b)) + ")";
    }
}
