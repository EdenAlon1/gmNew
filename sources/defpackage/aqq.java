package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqq {
    final OutputConfiguration a;
    long b = 1;

    public aqq(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aqq)) {
            return false;
        }
        aqq aqqVar = (aqq) obj;
        return Objects.equals(this.a, aqqVar.a) && this.b == aqqVar.b;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.a.hashCode();
        int i = hashCode ^ 31;
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((i << 5) - i);
    }
}
