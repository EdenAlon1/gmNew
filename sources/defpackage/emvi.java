package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emvi extends emvt {
    static final emvz a = new emvi();

    private emvi() {
        super("CharMatcher.any()");
    }

    @Override // defpackage.emvz
    public final boolean c(char c) {
        return true;
    }

    @Override // defpackage.emvz
    public final int d(CharSequence charSequence) {
        return charSequence.length() == 0 ? -1 : 0;
    }

    @Override // defpackage.emvz
    public final int e(CharSequence charSequence, int i) {
        int length = charSequence.length();
        emxf.x(i, length);
        if (i == length) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.emvn, defpackage.emvz
    public final emvz f() {
        return emvw.a;
    }

    @Override // defpackage.emvz
    public final boolean h(CharSequence charSequence) {
        charSequence.getClass();
        return true;
    }

    @Override // defpackage.emvz
    public final boolean i(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    @Override // defpackage.emvz
    public final emvz g(emvz emvzVar) {
        return this;
    }
}
