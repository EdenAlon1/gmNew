package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsme extends dsmg {
    public final dsmr a;

    public dsme(dsmr dsmrVar) {
        this.a = dsmrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dsme) && ffkj.e(this.a, ((dsme) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Attached(detector=" + this.a + ")";
    }
}
