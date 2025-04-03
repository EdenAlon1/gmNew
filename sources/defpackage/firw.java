package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class firw implements firt {
    protected firw() {
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        firt firtVar = (firt) obj;
        if (this == firtVar) {
            return 0;
        }
        long millis = firtVar.getMillis();
        long millis2 = getMillis();
        if (millis2 == millis) {
            return 0;
        }
        return millis2 < millis ? -1 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof firt)) {
            return false;
        }
        firt firtVar = (firt) obj;
        return getMillis() == firtVar.getMillis() && fite.d(a(), firtVar.a());
    }

    public final int hashCode() {
        return ((int) (getMillis() ^ (getMillis() >>> 32))) + a().hashCode();
    }

    public final String toString() {
        return fiun.a.a(this);
    }
}
