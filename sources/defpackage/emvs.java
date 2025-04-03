package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emvs extends emvt {
    public static final emvz a = new emvs();

    private emvs() {
        super("CharMatcher.javaIsoControl()");
    }

    @Override // defpackage.emvz
    public final boolean c(char c) {
        if (c > 31) {
            return c >= 127 && c <= 159;
        }
        return true;
    }
}
