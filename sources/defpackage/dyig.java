package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyig extends dyir {
    private final int a;

    public dyig(int i) {
        this.a = i;
    }

    @Override // defpackage.dyir
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof dyir) && this.a == ((dyir) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return a.a(this.a != 1 ? "FAILURE" : "SUCCESS", "UnregisterResult{status=", "}");
    }
}
