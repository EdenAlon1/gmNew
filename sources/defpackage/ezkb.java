package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ezkb implements eyge {
    RCS_TRANSPORT_TYPE_UNKNOWN(0),
    RCS_TRANSPORT_TYPE_DUAL_REGISTRATION(1),
    RCS_TRANSPORT_TYPE_SINGLE_REGISTRATION(2);

    public final int d;

    ezkb(int i) {
        this.d = i;
    }

    public static ezkb b(int i) {
        if (i == 0) {
            return RCS_TRANSPORT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return RCS_TRANSPORT_TYPE_DUAL_REGISTRATION;
        }
        if (i != 2) {
            return null;
        }
        return RCS_TRANSPORT_TYPE_SINGLE_REGISTRATION;
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
