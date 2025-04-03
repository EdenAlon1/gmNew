package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fing extends fiqt {
    private final fipg a = new fipg();

    public static boolean h(fiqz fiqzVar, int i) {
        finn finnVar = (finn) fiqzVar;
        CharSequence charSequence = finnVar.c.a;
        return finnVar.g < 4 && i < charSequence.length() && charSequence.charAt(i) == '>';
    }

    @Override // defpackage.fiqw
    public final /* synthetic */ fipf b() {
        return this.a;
    }

    @Override // defpackage.fiqw
    public final fiqv c(fiqz fiqzVar) {
        finn finnVar = (finn) fiqzVar;
        int i = finnVar.f;
        if (!h(fiqzVar, i)) {
            return null;
        }
        int i2 = finnVar.e + finnVar.g;
        boolean h = fipd.h(finnVar.c.a, i + 1);
        int i3 = i2 + 1;
        if (h) {
            i3 = i2 + 2;
        }
        return new fine(-1, i3, false);
    }

    @Override // defpackage.fiqt, defpackage.fiqw
    public final boolean g() {
        return true;
    }

    @Override // defpackage.fiqt, defpackage.fiqw
    public final boolean j(fipf fipfVar) {
        return true;
    }
}
