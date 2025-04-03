package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum epdw implements eyge {
    UNSPECIFIED_BACKUP_TYPE(0),
    MESSAGE_BACKUP(1),
    CONVERSATION_BACKUP(2),
    PARTICIPANT_BACKUP(3),
    KEY_BACKUP(4),
    PARTS_UPDATE(5),
    PARTS_RARE_UPDATE(6),
    PARTS_FREQ_UPDATE(7),
    PARTS_CUSTOM_PART_FLAG_URI_UPDATE(8),
    MESSAGE_UPDATE(9),
    CONVERSATION_FREQ_UPDATE(10),
    CONVERSATION_RARE_UPDATE(11),
    PARTICIPANT_RARE_UPDATE(12),
    MESSAGE_DELETE(13),
    CONVERSATION_DELETE(14),
    PARTICIPANT_DELETE(15),
    PARTS_DELETE(16),
    KEY_DELETE(17),
    SELF_PARTICIPANT_BACKUP(18),
    MEDIA_FULL_SIZE_BACKUP(19),
    MEDIA_COMPRESSED_SIZE_BACKUP(20),
    MEDIA_PROFILE_PHOTO_BACKUP(21);

    public final int w;

    epdw(int i) {
        this.w = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.w;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.w);
    }
}
