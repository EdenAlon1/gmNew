package defpackage;

import android.content.ComponentName;
import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qa {
    public final ComponentName a;
    public final long b;
    public final float c;

    public qa(ComponentName componentName, long j, float f) {
        this.a = componentName;
        this.b = j;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        qa qaVar = (qa) obj;
        ComponentName componentName = this.a;
        if (componentName == null) {
            if (qaVar.a != null) {
                return false;
            }
        } else if (!componentName.equals(qaVar.a)) {
            return false;
        }
        if (this.b != qaVar.b) {
            return false;
        }
        return Float.floatToIntBits(this.c) == Float.floatToIntBits(qaVar.c);
    }

    public final int hashCode() {
        ComponentName componentName = this.a;
        int hashCode = componentName == null ? 0 : componentName.hashCode();
        long j = this.b;
        return ((((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "[; activity:" + this.a + "; time:" + this.b + "; weight:" + new BigDecimal(this.c) + "]";
    }
}
