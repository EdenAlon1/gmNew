package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqo {
    final OutputConfiguration a;
    String b;
    long c = 1;

    public aqo(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aqo)) {
            return false;
        }
        aqo aqoVar = (aqo) obj;
        return Objects.equals(this.a, aqoVar.a) && this.c == aqoVar.c && Objects.equals(this.b, aqoVar.b);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.a.hashCode();
        int i = hashCode ^ 31;
        String str = this.b;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.c;
        int i2 = ((i << 5) - i) ^ hashCode2;
        return ((int) (j ^ (j >>> 32))) ^ ((i2 << 5) - i2);
    }
}
