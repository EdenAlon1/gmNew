package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayh extends azr {
    public final Size a;
    public final int b;

    public ayh(Size size, int i) {
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        this.a = size;
        this.b = i;
    }

    @Override // defpackage.azr
    public final int a() {
        return this.b;
    }

    @Override // defpackage.azr
    public final Size b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof azr) {
            azr azrVar = (azr) obj;
            if (this.a.equals(azrVar.b()) && this.b == azrVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "PostviewSettings{resolution=" + this.a + ", inputFormat=" + this.b + "}";
    }
}
