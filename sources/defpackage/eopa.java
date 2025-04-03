package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public enum eopa implements eyge {
    UNKNOWN_IS_IMS(0),
    IMS(1),
    NOT_IMS(2);

    public final int d;

    eopa(int i) {
        this.d = i;
    }

    public static eopa b(int i) {
        if (i == 0) {
            return UNKNOWN_IS_IMS;
        }
        if (i == 1) {
            return IMS;
        }
        if (i != 2) {
            return null;
        }
        return NOT_IMS;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
