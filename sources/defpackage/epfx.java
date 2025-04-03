package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum epfx implements eyge {
    UNSPECIFIED_STAGE(0),
    RESTORE(1),
    RESTORE_BACKUP_KEY(2),
    RESTORE_ENCRYPTION_KEY(3),
    RESTORE_PARTICIPANT(4),
    RESTORE_CONVERSATION(5),
    RESTORE_MESSAGE(6),
    BLOCK_ON_INITIAL_BACKUP_PRECONDITIONS(8),
    BACKUP(7),
    OPTIMIZED_RESTORE(9),
    OPTIMIZED_RESTORE_BACKUP_KEY(10),
    OPTIMIZED_RESTORE_ENCRYPTION_KEY(11),
    OPTIMIZED_RESTORE_PARTICIPANT(12),
    OPTIMIZED_RESTORE_CONVERSATION(13),
    OPTIMIZED_RESTORE_MESSAGE(14),
    OPTIMIZED_BACKUP(17),
    MEDIA_BACKUP(15),
    MEDIA_RESTORE(16);

    public final int s;

    epfx(int i) {
        this.s = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.s;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.s);
    }
}
