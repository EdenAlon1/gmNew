package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwbw {
    public final int a;
    public final int b;

    public cwbw(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwbw)) {
            return false;
        }
        cwbw cwbwVar = (cwbw) obj;
        return this.a == cwbwVar.a && this.b == cwbwVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "GroupLimitExcludingSelf(mmsGroupLimit=" + this.a + ", rcsGroupLimit=" + this.b + ")";
    }

    public cwbw() {
        this(Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY);
    }
}
