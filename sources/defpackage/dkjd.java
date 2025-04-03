package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkjd extends dkkt {
    private final int a;
    private final int b;

    public dkjd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.dkkt
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dkkt
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dkkt) {
            dkkt dkktVar = (dkkt) obj;
            if (this.a == dkktVar.a() && this.b == dkktVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "InstantMessagingTech{messagingTech=" + this.a + ", messagingMethod=" + dkks.a(this.b) + "}";
    }
}
