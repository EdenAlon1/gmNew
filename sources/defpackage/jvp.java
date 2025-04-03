package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvp implements juk {
    private final int a;
    private final int b;

    public jvp(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.juk
    public final void a(juo juoVar) {
        if (juoVar.k()) {
            juoVar.f();
        }
        int i = ffmk.i(this.a, 0, juoVar.c());
        int i2 = ffmk.i(this.b, 0, juoVar.c());
        if (i != i2) {
            if (i < i2) {
                juoVar.i(i, i2);
            } else {
                juoVar.i(i2, i);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvp)) {
            return false;
        }
        jvp jvpVar = (jvp) obj;
        return this.a == jvpVar.a && this.b == jvpVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "SetComposingRegionCommand(start=" + this.a + ", end=" + this.b + ')';
    }
}
