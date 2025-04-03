package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azlc extends azvt {
    private final String a;
    private final azsu b;

    public azlc(String str, azsu azsuVar) {
        if (str == null) {
            throw new NullPointerException("Null rowId");
        }
        this.a = str;
        if (azsuVar == null) {
            throw new NullPointerException("Null token");
        }
        this.b = azsuVar;
    }

    @Override // defpackage.azvt
    public final azsu a() {
        return this.b;
    }

    @Override // defpackage.azvt
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof azvt) {
            azvt azvtVar = (azvt) obj;
            if (this.a.equals(azvtVar.b()) && this.b.equals(azvtVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "RowIdAndTokenPair{rowId=" + this.a + ", token=" + this.b.toString() + "}";
    }
}
