package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum cgix {
    HOME(0),
    ARCHIVED(1),
    SPAM_FOLDER(2);

    public final int d;

    cgix(int i) {
        this.d = i;
    }

    public final bfkr a() {
        bfkr n = bfks.n();
        int ordinal = ordinal();
        if (ordinal == 1) {
            ((becl) n).a = true;
            return n;
        }
        if (ordinal != 2) {
            ((becl) n).b = true;
            return n;
        }
        ((becl) n).c = true;
        return n;
    }

    public final boolean b() {
        return this == HOME;
    }
}
