package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aide implements aiex {
    public final dngx a;
    private final String b;
    private final aide c = this;

    public aide(String str, dngx dngxVar) {
        this.b = str;
        this.a = dngxVar;
    }

    @Override // defpackage.aiex
    public final aide a() {
        return this.c;
    }

    @Override // defpackage.aiex
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aide)) {
            return false;
        }
        aide aideVar = (aide) obj;
        return ffkj.e(this.b, aideVar.b) && ffkj.e(this.a, aideVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "BasicSuggestionsRowUiData(key=" + this.b + ", itemUiData=" + this.a + ")";
    }
}
