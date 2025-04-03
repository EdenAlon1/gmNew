package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cimw extends cinr {
    public final Size a;
    private final Size b;

    public cimw(Size size, Size size2) {
        this.b = size;
        this.a = size2;
    }

    @Override // defpackage.cinr
    public final Size a() {
        return this.a;
    }

    @Override // defpackage.cinr
    public final Size b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cinr) {
            cinr cinrVar = (cinr) obj;
            if (this.b.equals(cinrVar.b()) && this.a.equals(cinrVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        Size size = this.a;
        return "ResourceDimensions{imageSize=" + this.b.toString() + ", iconSize=" + size.toString() + "}";
    }
}
