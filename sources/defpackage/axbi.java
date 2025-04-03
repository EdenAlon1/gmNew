package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axbi extends axbq {
    public final awui a;

    public axbi(awui awuiVar) {
        awuiVar.getClass();
        this.a = awuiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof axbi) && ffkj.e(this.a, ((axbi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InvalidateCapabilitiesCacheData(destination=" + this.a + ")";
    }
}
