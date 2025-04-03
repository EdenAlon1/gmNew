package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekeg {
    public final String a;
    public final eyee b;
    public final long c;
    public final ecwu d;

    public ekeg(String str, eyee eyeeVar, long j, ecwu ecwuVar) {
        this.a = str;
        this.b = eyeeVar;
        this.c = j;
        this.d = ecwuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekeg)) {
            return false;
        }
        ekeg ekegVar = (ekeg) obj;
        return ffkj.e(this.a, ekegVar.a) && ffkj.e(this.b, ekegVar.b) && this.c == ekegVar.c && ffkj.e(this.d, ekegVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        eyee eyeeVar = this.b;
        int hashCode2 = (hashCode + (eyeeVar == null ? 0 : eyeeVar.hashCode())) * 31;
        long j = this.c;
        return ((hashCode2 + ((int) (j ^ (j >>> 32)))) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Metadata(serverToken=" + this.a + ", experimentToken=" + this.b + ", lastUpdateEpochMillis=" + this.c + ", commitProperties=" + this.d + ")";
    }
}
