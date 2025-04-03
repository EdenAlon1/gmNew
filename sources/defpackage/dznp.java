package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dznp extends dzqj {
    public final String a;
    public final byte[] b;

    public dznp(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // defpackage.dzqj
    public final String a() {
        return this.a;
    }

    @Override // defpackage.dzqj
    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzqj) {
            dzqj dzqjVar = (dzqj) obj;
            if (this.a.equals(dzqjVar.a())) {
                if (Arrays.equals(this.b, dzqjVar instanceof dznp ? ((dznp) dzqjVar).b : dzqjVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "CustomMessage{type=" + this.a + ", content=" + Arrays.toString(this.b) + "}";
    }
}
