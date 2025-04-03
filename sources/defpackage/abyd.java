package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abyd extends abzp {
    private final int a;

    public abyd(int i) {
        this.a = i;
    }

    @Override // defpackage.abzp
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof abzp) && this.a == ((abzp) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return a.a(Integer.toString(this.a - 1), "EndActivityEvent{status=", "}");
    }
}
