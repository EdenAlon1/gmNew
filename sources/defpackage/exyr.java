package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum exyr implements eyge {
    CONNECTIVITY_STATE_UNSPECIFIED(0),
    OFFLINE(1),
    ONLINE(2);

    private final int e;

    exyr(int i) {
        this.e = i;
    }

    public static exyr b(int i) {
        if (i == 0) {
            return CONNECTIVITY_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return OFFLINE;
        }
        if (i != 2) {
            return null;
        }
        return ONLINE;
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
