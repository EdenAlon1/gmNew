package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abye extends acab {
    private final int a;
    private final int b;

    public abye(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.acab
    public final int a() {
        return this.b;
    }

    @Override // defpackage.acab
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acab) {
            acab acabVar = (acab) obj;
            if (this.a == acabVar.b() && this.b == acabVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "UpdateActionBarEvent{selectedCount=" + this.a + ", messageCount=" + this.b + "}";
    }
}
