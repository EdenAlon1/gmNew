package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvem {
    public final String a;
    public final long b;

    public cvem(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvem)) {
            return false;
        }
        cvem cvemVar = (cvem) obj;
        return ffkj.e(this.a, cvemVar.a) && this.b == cvemVar.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "CallLogEntry(destination=" + this.a + ", timestampMillis=" + this.b + ")";
    }
}
