package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum cdju implements eyge {
    UNSPECIFIED_STEP(0),
    GENERATE_KEY(1),
    SYNC_BACKUP_KEY(2),
    SYNC_ENCRYPTION_KEY(3),
    SYNC_HMAC_KEY(4),
    COMPLETE_KEY_SYNC(5);

    public final int g;

    cdju(int i) {
        this.g = i;
    }

    public static cdju b(int i) {
        if (i == 0) {
            return UNSPECIFIED_STEP;
        }
        if (i == 1) {
            return GENERATE_KEY;
        }
        if (i == 2) {
            return SYNC_BACKUP_KEY;
        }
        if (i == 3) {
            return SYNC_ENCRYPTION_KEY;
        }
        if (i == 4) {
            return SYNC_HMAC_KEY;
        }
        if (i != 5) {
            return null;
        }
        return COMPLETE_KEY_SYNC;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
