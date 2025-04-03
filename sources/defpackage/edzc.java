package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edzc extends edze {
    private final eyee a;
    private final int b;

    public edzc(eyee eyeeVar, int i) {
        if (eyeeVar == null) {
            throw new NullPointerException("Null content");
        }
        this.a = eyeeVar;
        this.b = i;
    }

    @Override // defpackage.edze
    public final int a() {
        return this.b;
    }

    @Override // defpackage.edze
    public final eyee b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edze) {
            edze edzeVar = (edze) obj;
            if (this.a.equals(edzeVar.b()) && this.b == edzeVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "ByteStringContent{content=" + this.a.toString() + ", contentLength=" + this.b + "}";
    }
}
