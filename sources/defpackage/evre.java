package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evre {
    private final CharSequence a;
    private int b = 0;

    public evre(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final int a() {
        int i = this.b;
        if (i < 0 || i >= this.a.length()) {
            throw new IndexOutOfBoundsException("index '" + this.b + "' out of bounds for input: " + String.valueOf(this.a));
        }
        char charAt = this.a.charAt(this.b);
        if (charAt >= '0' && charAt <= '9') {
            this.b++;
            return charAt - '0';
        }
        throw new IllegalArgumentException("non-digit character '" + charAt + "' [" + ((int) charAt) + "] at index " + this.b + " in: " + String.valueOf(this.a));
    }

    public final boolean b() {
        return this.b < this.a.length();
    }
}
