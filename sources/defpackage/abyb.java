package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abyb extends abyh {
    private final boolean a;

    public abyb(boolean z) {
        this.a = z;
    }

    @Override // defpackage.abyh
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof abyh) && this.a == ((abyh) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "ChangeAllSelectionEvent{selected=" + this.a + "}";
    }
}
