package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
enum enan {
    STRONG,
    SOFT,
    WEAK;

    final emwj a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return emwg.a;
        }
        if (ordinal == 1 || ordinal == 2) {
            return emwh.a;
        }
        throw null;
    }
}
