package defpackage;

/* compiled from: PG */
@ffbs
/* loaded from: classes4.dex */
public final class doia {
    public final doib a;

    public doia(doib doibVar) {
        this.a = doibVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof doia) && ffkj.e(this.a, ((doia) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SimBarUiData(simChipUiData=" + this.a + ")";
    }
}
