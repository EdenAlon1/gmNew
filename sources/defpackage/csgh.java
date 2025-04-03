package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum csgh {
    UNDEFINED(0),
    MEDIA(1),
    PROFILE_PHOTO(2),
    COMPRESSED_IMAGE(3);

    public final int e;

    csgh(int i) {
        this.e = i;
    }

    public static csgh a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? UNDEFINED : COMPRESSED_IMAGE : PROFILE_PHOTO : MEDIA;
    }

    public static epdw b(csgh csghVar) {
        int ordinal = csghVar.ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? epdw.UNSPECIFIED_BACKUP_TYPE : epdw.MEDIA_COMPRESSED_SIZE_BACKUP : epdw.MEDIA_PROFILE_PHOTO_BACKUP : epdw.MEDIA_FULL_SIZE_BACKUP;
    }

    public final String c() {
        int ordinal = ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "UNDEFINED" : "COMPRESSED_IMAGE" : "PROFILE_PHOTO" : "MEDIA";
    }
}
