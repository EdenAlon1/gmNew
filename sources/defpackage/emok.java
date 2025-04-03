package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emok extends emol {
    public final engw a;
    public final int b;
    public final int c;

    public emok(engw engwVar, int i, int i2) {
        this.a = engwVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.emol
    public final int a() {
        return this.c;
    }

    @Override // defpackage.emol
    public final int b() {
        return this.b;
    }

    @Override // defpackage.emol
    public final engw c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof emol) {
            emol emolVar = (emol) obj;
            if (enkr.h(this.a, emolVar.c()) && this.b == emolVar.b() && this.c == emolVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "ConversationStarterProviderParsedConfig{conversationStarters=" + this.a.toString() + ", maxSuggestionItems=" + this.b + ", maxStickerItems=" + this.c + "}";
    }
}
