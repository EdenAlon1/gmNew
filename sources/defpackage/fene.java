package defpackage;

import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fene {
    final int a;
    final long b;
    final Set c;

    public fene(int i, long j, Set set) {
        this.a = i;
        this.b = j;
        this.c = enip.o(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fene feneVar = (fene) obj;
            if (this.a == feneVar.a && this.b == feneVar.b && emxb.a(this.c, feneVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.f("maxAttempts", this.a);
        b.g("hedgingDelayNanos", this.b);
        b.b("nonFatalStatusCodes", this.c);
        return b.toString();
    }
}
