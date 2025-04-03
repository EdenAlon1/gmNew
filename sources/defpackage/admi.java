package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class admi {
    public final boolean a;
    public final admj b;

    public admi(boolean z, admj admjVar) {
        admjVar.getClass();
        this.a = z;
        this.b = admjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof admi)) {
            return false;
        }
        admi admiVar = (admi) obj;
        return this.a == admiVar.a && this.b == admiVar.b;
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "EsiCheckResult(needToLaunchEsi=" + this.a + ", esiFlow=" + this.b + ")";
    }
}
