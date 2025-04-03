package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cjtw implements eyge {
    SHARE_TO_UNKNOWN(0),
    SHARE_TO_EVERYONE(1),
    SHARE_TO_CONTACTS_ONLY(2),
    SHARE_TO_NO_ONE(3);

    public final int e;

    cjtw(int i) {
        this.e = i;
    }

    public static cjtw b(int i) {
        if (i == 0) {
            return SHARE_TO_UNKNOWN;
        }
        if (i == 1) {
            return SHARE_TO_EVERYONE;
        }
        if (i == 2) {
            return SHARE_TO_CONTACTS_ONLY;
        }
        if (i != 3) {
            return null;
        }
        return SHARE_TO_NO_ONE;
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
