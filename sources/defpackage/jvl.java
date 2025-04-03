package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvl implements jwn {
    private final char a = 8226;

    @Override // defpackage.jwn
    public final jwk a(jlm jlmVar) {
        jlm jlmVar2 = new jlm(ffpc.i("•", jlmVar.b.length()));
        int i = jvj.b;
        return new jwk(jlmVar2, jvi.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvl)) {
            return false;
        }
        char c = ((jvl) obj).a;
        return true;
    }

    public final int hashCode() {
        return 8226;
    }
}
