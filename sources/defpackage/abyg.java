package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abyg extends acad {
    private final boolean a;

    public abyg(boolean z) {
        this.a = z;
    }

    @Override // defpackage.acad
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof acad) && this.a == ((acad) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "UpdateUiDuringDonationEvent{donating=" + this.a + "}";
    }
}
