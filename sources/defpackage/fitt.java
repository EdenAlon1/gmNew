package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fitt implements fiuq, fiuo {
    private final char a;

    public fitt(char c) {
        this.a = c;
    }

    @Override // defpackage.fiuo
    public final int a() {
        return 1;
    }

    @Override // defpackage.fiuq
    public final int b() {
        return 1;
    }

    @Override // defpackage.fiuo
    public final int c(fiuk fiukVar, CharSequence charSequence, int i) {
        char upperCase;
        char upperCase2;
        if (i >= charSequence.length()) {
            return ~i;
        }
        char charAt = charSequence.charAt(i);
        char c = this.a;
        return (charAt == c || (upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(c)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i + 1 : ~i;
    }

    @Override // defpackage.fiuq
    public final void d(Appendable appendable, long j, firb firbVar, int i, firk firkVar, Locale locale) {
        appendable.append(this.a);
    }
}
