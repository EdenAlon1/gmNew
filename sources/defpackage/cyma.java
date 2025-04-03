package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyma extends cymh {
    private final boolean a;

    public cyma(boolean z) {
        this.a = z;
    }

    @Override // defpackage.cymh
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof cymh) && this.a == ((cymh) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "ConversationBottomBarData{shouldShowBar=" + this.a + "}";
    }
}
