package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnvi {
    public final dlti a;

    public dnvi(dlti dltiVar) {
        this.a = dltiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnvi) && ffkj.e(this.a, ((dnvi) obj).a);
    }

    public final int hashCode() {
        dlti dltiVar = this.a;
        if (dltiVar == null) {
            return 0;
        }
        return dltiVar.hashCode();
    }

    public final String toString() {
        return "LastReadMarker(initialCompositionElement=" + this.a + ")";
    }

    public dnvi() {
        this(null);
    }
}
