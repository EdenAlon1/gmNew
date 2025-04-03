package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fitv extends fitz {
    public fitv(firf firfVar, int i) {
        super(firfVar, i, false, i);
    }

    @Override // defpackage.fity, defpackage.fiuo
    public final int c(fiuk fiukVar, CharSequence charSequence, int i) {
        int i2;
        char charAt;
        int c = super.c(fiukVar, charSequence, i);
        if (c < 0 || c == (i2 = this.b + i)) {
            return c;
        }
        if (this.c && ((charAt = charSequence.charAt(i)) == '-' || charAt == '+')) {
            i2++;
        }
        return c > i2 ? ~(i2 + 1) : c < i2 ? ~c : c;
    }
}
