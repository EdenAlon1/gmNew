package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcsf extends dcsn {
    private final Rect a;

    public dcsf(Rect rect) {
        this.a = rect;
    }

    @Override // defpackage.dcsn
    public final Rect a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dcsn) {
            return this.a.equals(((dcsn) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "MediaDrawableChangedEvent{drawableBounds=" + this.a.toString() + "}";
    }
}
