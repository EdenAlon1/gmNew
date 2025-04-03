package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abyf extends acac {
    private final boolean a;

    public abyf(boolean z) {
        this.a = z;
    }

    @Override // defpackage.acac
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof acac) && this.a == ((acac) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "UpdateConfirmButtonEvent{anySelected=" + this.a + "}";
    }
}
