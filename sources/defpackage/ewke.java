package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ewke implements eyge {
    MESSAGE_UNDEFINED(0),
    NO_MESSAGE(1),
    ENTERPRISE_CONTACT_ADMIN(2);

    private final int e;

    ewke(int i) {
        this.e = i;
    }

    public static ewke b(int i) {
        if (i == 0) {
            return MESSAGE_UNDEFINED;
        }
        if (i == 1) {
            return NO_MESSAGE;
        }
        if (i != 2) {
            return null;
        }
        return ENTERPRISE_CONTACT_ADMIN;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
