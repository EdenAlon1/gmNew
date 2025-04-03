package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fith extends firl implements Serializable {
    public static final firl a = new fith();
    private static final long serialVersionUID = 2656707858124633367L;

    private fith() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.firl
    public final long a(long j, int i) {
        return fite.b(j, i);
    }

    @Override // defpackage.firl
    public final long b(long j, long j2) {
        return fite.b(j, j2);
    }

    @Override // defpackage.firl
    public final long c() {
        return 1L;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long c = ((firl) obj).c();
        if (c == 1) {
            return 0;
        }
        return c > 1 ? -1 : 1;
    }

    @Override // defpackage.firl
    public final firn d() {
        return firn.l;
    }

    @Override // defpackage.firl
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fith)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.firl
    public final boolean f() {
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "DurationField[millis]";
    }
}
