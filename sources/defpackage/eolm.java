package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eolm implements eyge {
    UNKNOWN_BUGLE_DEVICE_TYPE(0),
    PHONE(1),
    WEARABLE(2),
    WEB(3),
    TABLET(4);

    public final int f;

    eolm(int i) {
        this.f = i;
    }

    public static eolm b(int i) {
        if (i == 0) {
            return UNKNOWN_BUGLE_DEVICE_TYPE;
        }
        if (i == 1) {
            return PHONE;
        }
        if (i == 2) {
            return WEARABLE;
        }
        if (i == 3) {
            return WEB;
        }
        if (i != 4) {
            return null;
        }
        return TABLET;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
