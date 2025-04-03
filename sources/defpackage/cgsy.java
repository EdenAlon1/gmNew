package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgsy extends cgtb {
    public final String a;
    public final enip b;

    public cgsy(String str, enip enipVar) {
        this.a = str;
        if (enipVar == null) {
            throw new NullPointerException("Null cc");
        }
        this.b = enipVar;
    }

    @Override // defpackage.cgtb
    public final enip a() {
        return this.b;
    }

    @Override // defpackage.cgtb
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgtb) {
            cgtb cgtbVar = (cgtb) obj;
            String str = this.a;
            if (str != null ? str.equals(cgtbVar.b()) : cgtbVar.b() == null) {
                if (this.b.equals(cgtbVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "IncomingMessageRecipients{to=" + this.a + ", cc=" + this.b.toString() + "}";
    }
}
