package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzgs extends dzgt {
    private final String a;
    private final dzhb b;

    public dzgs(String str, dzhb dzhbVar) {
        this.a = str;
        this.b = dzhbVar;
    }

    @Override // defpackage.dzgt
    public final dzhb a() {
        return this.b;
    }

    @Override // defpackage.dzgt
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzgt) {
            dzgt dzgtVar = (dzgt) obj;
            if (this.a.equals(dzgtVar.b()) && this.b.equals(dzgtVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "GetDecorationResult{messageId=" + this.a + ", linkPreview=" + this.b.toString() + "}";
    }
}
