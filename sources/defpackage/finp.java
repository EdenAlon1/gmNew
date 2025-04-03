package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class finp extends fiqt {
    public final fipn a;
    private String b;
    private final StringBuilder c;

    public finp(char c, int i, int i2) {
        fipn fipnVar = new fipn();
        this.a = fipnVar;
        this.c = new StringBuilder();
        fipnVar.a = c;
        fipnVar.b = i;
        fipnVar.c = i2;
    }

    @Override // defpackage.fiqw
    public final fipf b() {
        return this.a;
    }

    @Override // defpackage.fiqw
    public final fiqv c(fiqz fiqzVar) {
        finn finnVar = (finn) fiqzVar;
        int i = finnVar.f;
        int i2 = finnVar.d;
        CharSequence charSequence = finnVar.c.a;
        if (finnVar.g < 4 && i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            fipn fipnVar = this.a;
            char c = fipnVar.a;
            if (charAt == c) {
                int i3 = fipnVar.b;
                int c2 = fipd.c(c, charSequence, i, charSequence.length()) - i;
                if (c2 >= i3 && fipd.d(charSequence, i + c2, charSequence.length()) == charSequence.length()) {
                    return new fine(-1, -1, true);
                }
            }
        }
        int length = charSequence.length();
        for (int i4 = this.a.c; i4 > 0 && i2 < length && charSequence.charAt(i2) == ' '; i4--) {
            i2++;
        }
        return new fine(i2, -1, false);
    }

    @Override // defpackage.fiqt, defpackage.fiqw
    public final void d(fiqr fiqrVar) {
        if (this.b == null) {
            this.b = fiqrVar.a.toString();
        } else {
            this.c.append(fiqrVar.a);
            this.c.append('\n');
        }
    }

    @Override // defpackage.fiqt, defpackage.fiqw
    public final void k() {
        fipa.b(this.b.trim());
        this.a.d = this.c.toString();
    }
}
