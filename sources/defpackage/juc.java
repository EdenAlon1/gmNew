package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class juc implements juk {
    public final int a;
    private final jlm b;

    public juc(jlm jlmVar, int i) {
        this.b = jlmVar;
        this.a = i;
    }

    @Override // defpackage.juk
    public final void a(juo juoVar) {
        if (juoVar.k()) {
            juoVar.h(juoVar.c, juoVar.d, b());
        } else {
            juoVar.h(juoVar.a, juoVar.b, b());
        }
        int b = juoVar.b();
        int i = this.a;
        int i2 = b + i;
        int i3 = ffmk.i(i > 0 ? i2 - 1 : i2 - b().length(), 0, juoVar.c());
        juoVar.j(i3, i3);
    }

    public final String b() {
        return this.b.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof juc)) {
            return false;
        }
        juc jucVar = (juc) obj;
        return ffkj.e(b(), jucVar.b()) && this.a == jucVar.a;
    }

    public final int hashCode() {
        return (b().hashCode() * 31) + this.a;
    }

    public final String toString() {
        return "CommitTextCommand(text='" + b() + "', newCursorPosition=" + this.a + ')';
    }

    public juc(String str, int i) {
        this(new jlm(str), i);
    }
}
