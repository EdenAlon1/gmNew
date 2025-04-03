package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class finr extends fiqt {
    private final fipp a = new fipp();
    private final fiqs b;

    public finr(fiqs fiqsVar) {
        this.b = fiqsVar;
    }

    public static boolean i(CharSequence charSequence, int i, char c) {
        return fipd.d(charSequence, fipd.c(c, charSequence, i, charSequence.length()), charSequence.length()) >= charSequence.length();
    }

    @Override // defpackage.fiqw
    public final fipf b() {
        return this.a;
    }

    @Override // defpackage.fiqw
    public final fiqv c(fiqz fiqzVar) {
        return null;
    }

    @Override // defpackage.fiqt, defpackage.fiqw
    public final void e(fiql fiqlVar) {
        fiqlVar.a(this.b, this.a);
    }
}
