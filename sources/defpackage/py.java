package defpackage;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class py implements Comparable {
    public final ResolveInfo a;
    public float b;

    public py(ResolveInfo resolveInfo) {
        this.a = resolveInfo;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Float.floatToIntBits(((py) obj).b) - Float.floatToIntBits(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Float.floatToIntBits(this.b) == Float.floatToIntBits(((py) obj).b);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + 31;
    }

    public final String toString() {
        return "[resolveInfo:" + this.a.toString() + "; weight:" + new BigDecimal(this.b) + "]";
    }
}
