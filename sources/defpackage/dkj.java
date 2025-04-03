package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkj extends dkk {
    public final long a;

    public dkj(long j) {
        this.a = j;
        if ((j & 9223372034707292159L) != 9205357640488583168L) {
            return;
        }
        dwv.d("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dkj) {
            return iak.i(this.a, ((dkj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return iaj.a(this.a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) iak.h(this.a)) + ')';
    }
}
