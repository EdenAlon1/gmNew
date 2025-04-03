package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aibb {
    public final String a;
    public final dngx b;

    public aibb(String str, dngx dngxVar) {
        this.a = str;
        this.b = dngxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aibb)) {
            return false;
        }
        aibb aibbVar = (aibb) obj;
        return ffkj.e(this.a, aibbVar.a) && ffkj.e(this.b, aibbVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ConversationEntry(id=" + this.a + ", itemUiData=" + this.b + ")";
    }
}
