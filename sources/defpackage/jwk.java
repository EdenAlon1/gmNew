package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jwk {
    public final jlm a;
    public final jvj b;

    public jwk(jlm jlmVar, jvj jvjVar) {
        this.a = jlmVar;
        this.b = jvjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwk)) {
            return false;
        }
        jwk jwkVar = (jwk) obj;
        return ffkj.e(this.a, jwkVar.a) && ffkj.e(this.b, jwkVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
