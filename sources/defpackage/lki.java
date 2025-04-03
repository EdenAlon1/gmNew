package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lki {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static final lkh Companion = new lkh();

    public final lkj a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return lkj.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return lkj.DESTROYED;
                        }
                        toString();
                        throw new IllegalArgumentException(toString().concat(" has no target state"));
                    }
                }
            }
            return lkj.STARTED;
        }
        return lkj.CREATED;
    }
}
