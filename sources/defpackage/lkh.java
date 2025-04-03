package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lkh {
    public static final lki a(lkj lkjVar) {
        lkjVar.getClass();
        int ordinal = lkjVar.ordinal();
        if (ordinal == 2) {
            return lki.ON_DESTROY;
        }
        if (ordinal == 3) {
            return lki.ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return lki.ON_PAUSE;
    }

    public static final lki b(lkj lkjVar) {
        lkjVar.getClass();
        int ordinal = lkjVar.ordinal();
        if (ordinal == 1) {
            return lki.ON_CREATE;
        }
        if (ordinal == 2) {
            return lki.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return lki.ON_RESUME;
    }

    public static final lki c(lkj lkjVar) {
        lkjVar.getClass();
        int ordinal = lkjVar.ordinal();
        if (ordinal == 2) {
            return lki.ON_CREATE;
        }
        if (ordinal == 3) {
            return lki.ON_START;
        }
        if (ordinal != 4) {
            return null;
        }
        return lki.ON_RESUME;
    }
}
