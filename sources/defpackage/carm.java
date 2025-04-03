package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class carm extends caux {
    public final Thread a;
    public final dtui b;
    public final long c;

    public carm(Thread thread, dtui dtuiVar, long j) {
        this.a = thread;
        this.b = dtuiVar;
        this.c = j;
    }

    @Override // defpackage.caux
    public final long a() {
        return this.c;
    }

    @Override // defpackage.caux
    public final dtui b() {
        return this.b;
    }

    @Override // defpackage.caux
    public final Thread c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof caux) {
            caux cauxVar = (caux) obj;
            if (this.a.equals(cauxVar.c()) && this.b.equals(cauxVar.b()) && this.c == cauxVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.c;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        dtui dtuiVar = this.b;
        return "WriteLockHolder{thread=" + this.a.toString() + ", loggingTag=" + dtuiVar.toString() + ", startTime=" + this.c + "}";
    }
}
