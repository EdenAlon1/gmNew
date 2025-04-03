package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahgj extends ahgk {
    public final int a;
    public final int b;

    public ahgj(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ahgk
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ahgk
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahgk) {
            ahgk ahgkVar = (ahgk) obj;
            if (this.a == ahgkVar.b() && this.b == ahgkVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "DeleteConversationDialogInfo{title=" + this.a + ", body=" + this.b + "}";
    }
}
