package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlew extends dlex {
    public final String a;
    public final ByteBuffer b;

    public dlew(String str, ByteBuffer byteBuffer) {
        this.a = str;
        this.b = byteBuffer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlew)) {
            return false;
        }
        dlew dlewVar = (dlew) obj;
        return ffkj.e(this.a, dlewVar.a) && ffkj.e(this.b, dlewVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
