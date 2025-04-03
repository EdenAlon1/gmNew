package defpackage;

import j$.time.Duration;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eofu extends eofx {
    private final eofx a;
    private final eofx b;
    private final int c;

    public eofu(eofx eofxVar, eofx eofxVar2) {
        this.a = eofxVar;
        this.b = eofxVar2;
        this.c = ((eofv) eofxVar).a;
    }

    @Override // defpackage.eofx
    public final Duration a(int i) {
        int i2 = this.c;
        return i < i2 ? this.a.a(i) : this.b.a((i + 1) - i2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eofu) {
            eofu eofuVar = (eofu) obj;
            if (this.a.equals(eofuVar.a) && this.b.equals(eofuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
