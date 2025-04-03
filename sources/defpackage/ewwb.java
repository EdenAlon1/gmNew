package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewwb extends exad {
    private final Locale a;
    private final float b;

    public ewwb(Locale locale, float f) {
        this.a = locale;
        this.b = f;
    }

    @Override // defpackage.exad
    public final float a() {
        return this.b;
    }

    @Override // defpackage.exad
    public final Locale b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof exad) {
            exad exadVar = (exad) obj;
            if (this.a.equals(exadVar.b()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(exadVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "LocaleConfidence{locale=" + this.a.toString() + ", confidence=" + this.b + "}";
    }
}
