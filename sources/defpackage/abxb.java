package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abxb implements CharSequence {
    public final int a;
    private final String b;
    private final int c;
    private int d;

    public abxb(String str, int i, int i2) {
        emxf.b(i2 >= i, "end must be greater than start");
        this.b = str;
        this.c = Math.max(0, i);
        this.a = Math.min(str.length(), i2);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.b.charAt(this.c + i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abxb)) {
            return false;
        }
        abxb abxbVar = (abxb) obj;
        if (this == abxbVar) {
            return true;
        }
        if (abxbVar.length() != length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (this.b.charAt(this.c + i) != abxbVar.b.charAt(abxbVar.c + i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        if (length() > 0) {
            for (int i3 = this.c; i3 < this.a; i3++) {
                i2 = (i2 * 31) + this.b.charAt(i3);
            }
            this.d = i2;
        }
        return i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.a - this.c;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3 = this.c;
        return new abxb(this.b, Math.max(i3, Math.min(this.a, i + i3)), Math.min(this.a, this.c + i2));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b.substring(this.c, this.a);
    }
}
