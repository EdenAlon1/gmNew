package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class juj implements juk {
    private final int a;
    private final int b;

    public juj(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0 || i2 < 0) {
            jwo.b("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
        }
    }

    @Override // defpackage.juk
    public final void a(juo juoVar) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = juoVar.a;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = jul.a(juoVar.a((i5 - i4) + (-1)), juoVar.a(juoVar.a - i4)) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int i6 = this.b;
        int i7 = 0;
        while (true) {
            if (i >= i6) {
                break;
            }
            int i8 = i7 + 1;
            if (juoVar.b + i8 >= juoVar.c()) {
                i7 = juoVar.c() - juoVar.b;
                break;
            } else {
                i7 = jul.a(juoVar.a((juoVar.b + i8) + (-1)), juoVar.a(juoVar.b + i8)) ? i7 + 2 : i8;
                i++;
            }
        }
        int i9 = juoVar.b;
        juoVar.g(i9, i7 + i9);
        int i10 = juoVar.a;
        juoVar.g(i10 - i3, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof juj)) {
            return false;
        }
        juj jujVar = (juj) obj;
        return this.a == jujVar.a && this.b == jujVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.a + ", lengthAfterCursor=" + this.b + ')';
    }
}
