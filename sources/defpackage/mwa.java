package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwa {
    public final long a;
    public final long b;

    public mwa(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwa)) {
            return false;
        }
        mwa mwaVar = (mwa) obj;
        return this.a == mwaVar.a && this.b == mwaVar.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
