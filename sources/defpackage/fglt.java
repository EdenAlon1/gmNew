package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fglt implements eyge {
    UNKNOWN_CLOUD_SYNC_STATUS(0),
    NOT_ENABLED(1),
    ENABLED(2),
    IN_INITIAL_SYNC(3),
    FI_ENABLED(4),
    FI_INITIAL_SYNC_IN_PROGRESS(5),
    BNR_ENABLED(6),
    BNR_INITIAL_SYNC_IN_PROGRESS(7);

    public final int i;

    fglt(int i) {
        this.i = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
