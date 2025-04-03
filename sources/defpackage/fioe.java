package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fioe extends fiqt {
    private final fipw a;
    private boolean b;
    private int c;

    public fioe(fipw fipwVar) {
        this.a = fipwVar;
    }

    public static boolean i(CharSequence charSequence, int i) {
        char charAt;
        return i >= charSequence.length() || (charAt = charSequence.charAt(i)) == '\t' || charAt == ' ';
    }

    @Override // defpackage.fiqw
    public final fipf b() {
        return this.a;
    }

    @Override // defpackage.fiqw
    public final fiqv c(fiqz fiqzVar) {
        finn finnVar = (finn) fiqzVar;
        if (finnVar.h) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return new fine(finnVar.d, -1, false);
    }

    @Override // defpackage.fiqt, defpackage.fiqw
    public final boolean g() {
        return true;
    }

    @Override // defpackage.fiqt, defpackage.fiqw
    public final boolean j(fipf fipfVar) {
        if (!(fipfVar instanceof fipx)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.b = false;
        }
        return true;
    }
}
