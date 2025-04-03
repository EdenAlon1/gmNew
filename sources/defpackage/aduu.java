package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aduu extends adva {
    public final int a;
    public final int b;
    public final adyb c;

    public aduu(int i, int i2, adyb adybVar) {
        this.a = i;
        this.b = i2;
        this.c = adybVar;
    }

    @Override // defpackage.adva
    public final int a() {
        return this.a;
    }

    @Override // defpackage.adva
    public final int b() {
        return this.b;
    }

    @Override // defpackage.adva
    public final adyb c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adva) {
            adva advaVar = (adva) obj;
            if (this.a == advaVar.a() && this.b == advaVar.b() && equals(advaVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ hashCode();
    }

    public final String toString() {
        return "ProblematicConversationDataRequest{maxConversationCount=" + this.a + ", maxMessageCount=" + this.b + ", converter=" + String.valueOf(this.c) + "}";
    }
}
