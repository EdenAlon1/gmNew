package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cotl extends cous {
    public final String a;
    public final byte[] b;

    public cotl(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // defpackage.cous
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cous
    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cous) {
            cous cousVar = (cous) obj;
            if (this.a.equals(cousVar.a())) {
                if (Arrays.equals(this.b, cousVar instanceof cotl ? ((cotl) cousVar).b : cousVar.b())) {
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
        return "CustomRcsReport{mimeType=" + this.a + ", customReport=" + Arrays.toString(this.b) + "}";
    }
}
