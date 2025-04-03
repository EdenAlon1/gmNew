package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum axew implements eyge {
    UNSPECIFIED_STAGE(0),
    BACKUP_KEY(1),
    ENCRYPTION_KEYS(2),
    PARTICIPANTS(3),
    CONVERSATIONS(4),
    MESSAGES(5);

    public final int g;

    axew(int i) {
        this.g = i;
    }

    public static axew b(int i) {
        if (i == 0) {
            return UNSPECIFIED_STAGE;
        }
        if (i == 1) {
            return BACKUP_KEY;
        }
        if (i == 2) {
            return ENCRYPTION_KEYS;
        }
        if (i == 3) {
            return PARTICIPANTS;
        }
        if (i == 4) {
            return CONVERSATIONS;
        }
        if (i != 5) {
            return null;
        }
        return MESSAGES;
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
