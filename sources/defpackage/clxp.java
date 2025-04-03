package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clxp extends cman {
    private final String a;
    private final clze b;

    public clxp(String str, clze clzeVar) {
        if (str == null) {
            throw new NullPointerException("Null simId");
        }
        this.a = str;
        if (clzeVar == null) {
            throw new NullPointerException("Null uiVariant");
        }
        this.b = clzeVar;
    }

    @Override // defpackage.cman
    public final clze a() {
        return this.b;
    }

    @Override // defpackage.cman
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cman) {
            cman cmanVar = (cman) obj;
            if (this.a.equals(cmanVar.b()) && this.b.equals(cmanVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "PhoneNumberInputRequest{simId=" + this.a + ", uiVariant=" + this.b.toString() + "}";
    }
}
