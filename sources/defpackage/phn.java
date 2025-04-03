package defpackage;

import android.graphics.Color;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phn extends php {
    private final int b;

    public phn(int i) {
        this.b = i;
        if (Color.alpha(i) != 255) {
            throw new IllegalArgumentException("Background color must be opaque");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof phn) && this.b == ((phn) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return "ColorBackground{color:" + Integer.toHexString(this.b) + '}';
    }
}
