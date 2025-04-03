package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ast extends atn {
    private final atm a;
    private final int b;

    public ast(int i, atm atmVar) {
        this.b = i;
        this.a = atmVar;
    }

    @Override // defpackage.atn
    public final atm a() {
        return this.a;
    }

    @Override // defpackage.atn
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        atm atmVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof atn) {
            atn atnVar = (atn) obj;
            if (this.b == atnVar.b() && ((atmVar = this.a) != null ? atmVar.equals(atnVar.a()) : atnVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        atm atmVar = this.a;
        return (atmVar == null ? 0 : atmVar.hashCode()) ^ ((this.b ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraState{type=");
        int i = this.b;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "CLOSED" : "CLOSING" : "OPEN" : "OPENING" : "PENDING_OPEN"));
        sb.append(", error=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
