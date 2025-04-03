package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes6.dex */
public final class ffcp implements Comparable<ffcp> {
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ffcp ffcpVar) {
        return ffkj.b(Long.MIN_VALUE ^ this.a, ffcpVar.a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ffcp) && this.a == ((ffcp) obj).a;
    }

    public final int hashCode() {
        return ffco.a(this.a);
    }

    public final String toString() {
        return ffcw.b(this.a, 10);
    }
}
