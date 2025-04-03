package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bczg extends bczx {
    private final int a;
    private final boolean b;

    public bczg(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.bczx
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bczx
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bczx) {
            bczx bczxVar = (bczx) obj;
            if (this.a == bczxVar.a() && this.b == bczxVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ConversationTypeInfo{type=" + this.a + ", hasRbmRecipient=" + this.b + "}";
    }
}
