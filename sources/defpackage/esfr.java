package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esfr extends esft {
    private final CharSequence a;
    private final String b;

    public esfr(CharSequence charSequence, String str) {
        if (charSequence == null) {
            throw new NullPointerException("Null input");
        }
        this.a = charSequence;
        this.b = str;
    }

    @Override // defpackage.esft
    public final CharSequence a() {
        return this.a;
    }

    @Override // defpackage.esft
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof esft) {
            esft esftVar = (esft) obj;
            if (this.a.equals(esftVar.a()) && ((str = this.b) != null ? str.equals(esftVar.b()) : esftVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (hashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ParseParameters{input=" + ((String) this.a) + ", country=" + this.b + "}";
    }
}
