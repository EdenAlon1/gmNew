package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uwt extends uwz {
    private final bcse a;
    private final boolean b;
    private final boolean c;
    private final int d;

    public uwt(bcse bcseVar, int i, boolean z, boolean z2) {
        if (bcseVar == null) {
            throw new NullPointerException("Null data");
        }
        this.a = bcseVar;
        this.d = i;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.uwz
    public final bcse a() {
        return this.a;
    }

    @Override // defpackage.uwz
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.uwz
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.uwz
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uwz) {
            uwz uwzVar = (uwz) obj;
            if (this.a.equals(uwzVar.a()) && this.d == uwzVar.d() && this.b == uwzVar.b() && this.c == uwzVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.d) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        int i = this.d;
        return "MessageTapArgs{data=" + this.a.toString() + ", area=" + (i != 1 ? i != 2 ? "UNKNOWN" : "ON_MESSAGE_ROW" : "ON_BUBBLE_VIEW") + ", is1On1Conversation=" + this.b + ", isMessageOutgoingFailed=" + this.c + "}";
    }
}
