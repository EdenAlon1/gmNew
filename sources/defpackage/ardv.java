package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ardv {
    public final Locale a;
    public final int b;
    private final int c;

    public ardv(Locale locale, int i, int i2) {
        locale.getClass();
        this.a = locale;
        this.c = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ardv)) {
            return false;
        }
        ardv ardvVar = (ardv) obj;
        return ffkj.e(this.a, ardvVar.a) && this.c == ardvVar.c && this.b == ardvVar.b;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c) * 31) + this.b;
    }

    public final String toString() {
        return "LanguagePackInfo(locale=" + this.a + ", version=" + this.c + ", availability=" + ((Object) ardu.a(this.b)) + ")";
    }
}
