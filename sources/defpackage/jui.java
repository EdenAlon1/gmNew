package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jui implements juk {
    private final int a;
    private final int b;

    public jui(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0 || i2 < 0) {
            jwo.b("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
        }
    }

    @Override // defpackage.juk
    public final void a(juo juoVar) {
        int i = juoVar.b;
        int i2 = this.b;
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) < 0) {
            i3 = juoVar.c();
        }
        juoVar.g(juoVar.b, Math.min(i3, juoVar.c()));
        int i4 = juoVar.a;
        int i5 = this.a;
        int i6 = i4 - i5;
        if (((i4 ^ i6) & (i5 ^ i4)) < 0) {
            i6 = 0;
        }
        juoVar.g(Math.max(0, i6), juoVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jui)) {
            return false;
        }
        jui juiVar = (jui) obj;
        return this.a == juiVar.a && this.b == juiVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.a + ", lengthAfterCursor=" + this.b + ')';
    }
}
