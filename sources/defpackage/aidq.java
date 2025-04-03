package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aidq implements aiex {
    private final String a;
    private final ffix b;
    private final ffbz c;

    public aidq(String str, ffix ffixVar) {
        this.a = str;
        this.b = ffixVar;
        this.c = ffca.b(3, ffixVar);
    }

    @Override // defpackage.aiex
    public final aide a() {
        return (aide) this.c.a();
    }

    @Override // defpackage.aiex
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aidq)) {
            return false;
        }
        aidq aidqVar = (aidq) obj;
        return ffkj.e(this.a, aidqVar.a) && ffkj.e(this.b, aidqVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LazySuggestionsRowUiData(key=" + this.a + ", initializer=" + this.b + ")";
    }
}
