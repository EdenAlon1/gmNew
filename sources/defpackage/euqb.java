package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euqb {
    public final boolean a;
    private final euqq b;

    public euqb(euqq euqqVar, boolean z) {
        this.b = euqqVar;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof euqb) {
            euqb euqbVar = (euqb) obj;
            if (euqbVar.b.equals(this.b) && euqbVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.a).hashCode();
    }
}
