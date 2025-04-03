package j$.time.format;

/* renamed from: j$.time.format.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0034d implements InterfaceC0036f {
    private final char a;

    C0034d(char c) {
        this.a = c;
    }

    @Override // j$.time.format.InterfaceC0036f
    public final boolean o(y yVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    public final String toString() {
        char c = this.a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }

    @Override // j$.time.format.InterfaceC0036f
    public final int u(w wVar, CharSequence charSequence, int i) {
        if (i == charSequence.length()) {
            return ~i;
        }
        char charAt = charSequence.charAt(i);
        char c = this.a;
        return (charAt == c || (!wVar.k() && (Character.toUpperCase(charAt) == Character.toUpperCase(c) || Character.toLowerCase(charAt) == Character.toLowerCase(c)))) ? i + 1 : ~i;
    }
}
