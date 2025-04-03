package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum cejo implements eyge {
    NONE(0),
    BACKUP_KEY(1),
    ENCRYPTION_KEYS(2),
    PARTICIPANTS(3),
    CONVERSATIONS(4),
    MESSAGES(5);

    public final int g;

    cejo(int i) {
        this.g = i;
    }

    public static cejo b(int i) {
        if (i == 0) {
            return NONE;
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
