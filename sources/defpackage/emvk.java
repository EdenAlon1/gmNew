package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emvk extends emvt {
    public static final emvz a = new emvk();

    public emvk() {
        super("CharMatcher.ascii()");
    }

    @Override // defpackage.emvz
    public final boolean c(char c) {
        return c <= 127;
    }
}
