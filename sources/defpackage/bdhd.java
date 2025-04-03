package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdhd {
    public final long a;

    public bdhd(long j) {
        this.a = j;
    }

    public final boolean a(cgye cgyeVar) {
        return (this.a & cgyeVar.a()) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof bdhd) && this.a == ((bdhd) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }
}
