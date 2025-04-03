package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvq implements juk {
    public final int a;
    private final jlm b;

    public jvq(String str, int i) {
        this.b = new jlm(str);
        this.a = i;
    }

    @Override // defpackage.juk
    public final void a(juo juoVar) {
        if (juoVar.k()) {
            int i = juoVar.c;
            juoVar.h(i, juoVar.d, b());
            if (b().length() > 0) {
                juoVar.i(i, b().length() + i);
            }
        } else {
            int i2 = juoVar.a;
            juoVar.h(i2, juoVar.b, b());
            if (b().length() > 0) {
                juoVar.i(i2, b().length() + i2);
            }
        }
        int b = juoVar.b();
        int i3 = this.a;
        int i4 = b + i3;
        int i5 = ffmk.i(i3 > 0 ? i4 - 1 : i4 - b().length(), 0, juoVar.c());
        juoVar.j(i5, i5);
    }

    public final String b() {
        return this.b.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvq)) {
            return false;
        }
        jvq jvqVar = (jvq) obj;
        return ffkj.e(b(), jvqVar.b()) && this.a == jvqVar.a;
    }

    public final int hashCode() {
        return (b().hashCode() * 31) + this.a;
    }

    public final String toString() {
        return "SetComposingTextCommand(text='" + b() + "', newCursorPosition=" + this.a + ')';
    }
}
