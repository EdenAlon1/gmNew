package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlkr {
    public final ByteBuffer a;
    public final int b;

    public dlkr(ByteBuffer byteBuffer, int i) {
        this.a = byteBuffer;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlkr)) {
            return false;
        }
        dlkr dlkrVar = (dlkr) obj;
        return ffkj.e(this.a, dlkrVar.a) && this.b == dlkrVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
