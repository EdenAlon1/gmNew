package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fane extends fanj {
    public final long a;

    public fane(long j) {
        this.a = j;
    }

    @Override // defpackage.fanj
    protected final int a() {
        return c(this.a >= 0 ? (byte) 0 : (byte) 32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        fanj fanjVar = (fanj) obj;
        return a() != fanjVar.a() ? a() - fanjVar.a() : Long.compare(Math.abs(this.a), Math.abs(((fane) fanjVar).a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((fane) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Long.valueOf(this.a)});
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}
