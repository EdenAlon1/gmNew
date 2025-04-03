package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class carl extends caup {
    private final dtui a;
    private final long b;
    private final long c;
    private final boolean d;

    public carl(dtui dtuiVar, long j, long j2, boolean z) {
        this.a = dtuiVar;
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    @Override // defpackage.caup
    public final long a() {
        return this.b;
    }

    @Override // defpackage.caup
    public final long b() {
        return this.c;
    }

    @Override // defpackage.caup
    public final dtui c() {
        return this.a;
    }

    @Override // defpackage.caup
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof caup) {
            caup caupVar = (caup) obj;
            if (this.a.equals(caupVar.c()) && this.b == caupVar.a() && this.c == caupVar.b() && this.d == caupVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        int i = true != this.d ? 1237 : 1231;
        long j = this.b;
        long j2 = this.c;
        return (((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ i;
    }

    public final String toString() {
        return "HistoryLogItem{loggingTag=" + this.a.toString() + ", threadId=" + this.b + ", timeStamp=" + this.c + ", enter=" + this.d + "}";
    }
}
